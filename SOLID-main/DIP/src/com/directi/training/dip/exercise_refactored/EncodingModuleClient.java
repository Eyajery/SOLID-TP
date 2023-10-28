package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        DataSource fileDataSource = new FileDataSource("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        DataSource networkDataSource = new NetworkDataSource("http://myfirstappwith.appspot.com/index.html");

        EncodingModule encodingModule = new EncodingModule();
        encodingModule.encode(fileDataSource);
        encodingModule.encode(networkDataSource);
    }
}
