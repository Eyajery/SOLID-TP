package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public interface DataSource {
    String readData() throws IOException;
}
