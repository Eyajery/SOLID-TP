package com.directi.training.isp.exercise_refactored;

import java.util.Random;

public class Sensor
{
    public void register(Sensing sensor)
    {
        while (true) {
            if (isPersonClose()) {
                sensor.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
