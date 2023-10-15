package org.tbp.example2.problem;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperations {

    /**
     * Copies a file from source to destination with optional overwrite and backup capabilities.
     * Just to create a commit. Some more.
     *
     * @param source      Source file path.
     * @param destination Destination file path.
     * @param overwrite   If true, overwrite the existing destination file.
     * @param backup      If true, backup the existing destination file.
     * @throws IOException If file operations fail.
     */
    public static void copy(String source, String destination, boolean overwrite, boolean backup) throws IOException {
        Path sourcePath = Paths.get(source);
        Path destPath = Paths.get(destination);

        validateSourceFile(sourcePath);
        handleDestinationFile(destPath, overwrite, backup);

        Files.copy(sourcePath, destPath);
    }

    private static void validateSourceFile(Path sourcePath) throws IOException {
        if (!Files.exists(sourcePath)) {
            throw new IOException("Source file does not exist!");
        }
    }

    private static void handleDestinationFile(Path destPath, boolean overwrite, boolean backup) throws IOException {
        if (Files.exists(destPath)) {
            if (backup) {
                Path backupPath = Paths.get(destPath.toString() + ".backup");
                Files.move(destPath, backupPath);
            }

            if (!overwrite) {
                throw new FileAlreadyExistsException("Destination file already exists and overwrite is not permitted!");
            }
        }
    }
}
