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
public class TimeChangeTest {

        private TimeChange timeChangeTest;

        @Before
        public void setUp() {
            final Date date = Mockito.mock(Date.class);
            Mockito.when(date.getTime()).thenReturn(10L);

            final Clock dt = Mockito.mock(Clock.class);
            Mockito.when(dt.getDate()).thenReturn(date);

            timeChangeTest = new TimeChange(dt);
        }

        @Test
        public void timeTest() {
            final long doubleTime = timeChangeTest.getDoubleTime();
            final long tripleTime = timeChangeTest.getTripleTime();
            assertEquals(20, doubleTime);
            assertEquals(30, tripleTime);
        }
}
