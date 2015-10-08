package com.riis.katamocktime;

import java.util.Date;

public class ClockImpl implements Clock {
    @Override
    public Date getDate() {
        return new Date();
    }
}