package com.oopsfeedmecode.example2.solution;

import java.io.IOException;

public class BusinessLogic {

    public void doSomething() throws IOException {

        // some business logic
        String pathSource = "path/to/source.txt";
        String pathDest = "path/to/destination.txt";
        // ...

        // Copy file
        FileOperations.copy(pathSource, pathDest,
                FileOperations.OverwriteOption.YES, FileOperations.BackupOption.DISCARD);

        // some other business logic
        // ...
        // ...
    }

    public void doSomethingMore() throws IOException {

        // some business logic
        String pathSource = "path/to/another/source.txt";
        String pathDest = "path/to/another/destination.txt";
        // ...

        // Copy file
        FileOperations.copy(pathSource, pathDest,
                FileOperations.OverwriteOption.NO, FileOperations.BackupOption.KEEP);

        // some other business logic
        // ...
        // ...
    }
}
