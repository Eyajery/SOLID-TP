package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkDataSource implements DataSource {
    private final String url;

    public NetworkDataSource(String url) {
        this.url = url;
    }

    @Override
    public String readData() throws IOException {
        URL dataUrl = new URL(url);
        InputStream in = dataUrl.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder data = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            data.append((char) c);
        }
        return data.toString();
    }
}
