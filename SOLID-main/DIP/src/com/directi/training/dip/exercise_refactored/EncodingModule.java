package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    public void encode(DataSource dataSource) throws IOException {
        String inputData = dataSource.readData();
        String encodedData = Base64.getEncoder().encodeToString(inputData.getBytes());
        MyDatabase database = new MyDatabase();
        database.write(encodedData);
    }
}

