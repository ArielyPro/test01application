package com.example.arielyust.test01application.dagger2.test02;

import javax.inject.Inject;

/**
 * Created by arielyust on 01/05/2017.
 */

public class Wheel extends BaseCarClass {
    private int tireSize;

    @Inject
    public Wheel(String module, int tireSize) {
        super(module);
        this.tireSize = tireSize;
    }

    public int getTireSize() {
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }
}
