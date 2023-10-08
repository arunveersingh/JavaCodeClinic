package org.tbp.example2.solution;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperations {

    enum OverwriteOption {
        YES(true), NO(false);
        private final boolean value;

        OverwriteOption(boolean value){
            this.value = value;
        }
    }
    enum BackupOption {

        KEEP(true), DISCARD(false);

        private final boolean value;

        BackupOption(boolean value){
            this.value = value;
        }
    }

    /**
     * Copies a file from source to destination with optional overwrite and backup capabilities.
     *
     * @param source      Source file path.
     * @param destination Destination file path.
     * @param overwrite   If true, overwrite the existing destination file.
     * @param backup      If true, backup the existing destination file.
     * @throws IOException If file operations fail.
     */
    public static void copy(String source, String destination, OverwriteOption overwrite, BackupOption backup) throws IOException {
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

    private static void handleDestinationFile(Path destPath, OverwriteOption overwrite, BackupOption backup) throws IOException {
        if (Files.exists(destPath)) {
            if (backup.value) {
                Path backupPath = Paths.get(destPath.toString() + ".backup");
                Files.move(destPath, backupPath);
            }

            if (!overwrite.value) {
                throw new FileAlreadyExistsException("Destination file already exists and overwrite is not permitted!");
            }
        }
    }
}
