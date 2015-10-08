package com.riis.katamocktime;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import java.util.Date;

@RunWith(MockitoJUnitRunner.class)
public class MyClassTest {
        private MyClass myClassTest;

        @Before
        public void setUp() {
            final Date date = Mockito.mock(Date.class);
            Mockito.when(date.getTime()).thenReturn(30L);

            final Clock dt = Mockito.mock(Clock.class);
            Mockito.when(dt.getDate()).thenReturn(date);

            myClassTest = new MyClass(dt);
        }

        @Test
        public void someTest() {
            final long doubleTime = myClassTest.getDoubleTime();
            assertEquals(60, doubleTime);
        }
}
