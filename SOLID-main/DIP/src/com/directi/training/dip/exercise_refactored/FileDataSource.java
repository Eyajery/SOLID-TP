package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataSource implements DataSource {
    private final String filePath;

    public FileDataSource(String filePath) {
        this.filePath = filePath;
    }

    public String readData() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder data = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line);
            }
            return data.toString();
        }
    }
}
