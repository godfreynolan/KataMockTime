package com.riis.katamocktime;

/**
 * Created by Godfrey on 10/7/2015.
 */

class MyClass {

    private final Clock dateTime;
    // inject your Mock DateTime when testing other wise inject DateTimeImpl

    public MyClass(final Clock dateTime) {
        this.dateTime = dateTime;
    }

    public long getDoubleTime(){
        return dateTime.getDate().getTime()*2;
    }
}