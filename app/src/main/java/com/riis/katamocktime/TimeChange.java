package com.riis.katamocktime;

/**
 * Created by Godfrey on 10/7/2015.
 */

public class TimeChange {

    private final Clock dateTime;

    public TimeChange(final Clock dateTime) {
        this.dateTime = dateTime;
    }

    public long getDoubleTime(){
        return dateTime.getDate().getTime()*2;
    }

    public long getTripleTime(){
        return dateTime.getDate().getTime()*3;
    }
}