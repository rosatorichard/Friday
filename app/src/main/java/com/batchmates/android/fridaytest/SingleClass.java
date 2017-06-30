package com.batchmates.android.fridaytest;

import android.os.Handler;
import android.os.Looper;

/**
 * Created by Android on 6/30/2017.
 */

public class SingleClass{

    boolean isSafe;

    public SingleClass(boolean isSafe) {
        this.isSafe=isSafe;
    }

    public boolean isSafe() {
        return isSafe;
    }

    public void setSafe(boolean safe) {
        isSafe = safe;
    }


}
