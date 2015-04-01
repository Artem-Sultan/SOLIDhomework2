package ru.sbt.bit.ood.patterns.cw1;

import org.junit.Test;
import org.some.mega.fast.messaging.MessagingLibrary;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MessagingAppTest {

    @Test
    public void testMyApplication() throws IOException {
        // setup
        MessagingLibrary library = new MessagingLibrary();
        library.registerListener(new PrintingListener());
        // execute
        publishAllMessagesFromFolder(library, "src/test/resources/messages");
    }

    private void publishAllMessagesFromFolder(MessagingLibrary library, String msgdir) throws IOException {
        Path dir = Paths.get(msgdir);
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path entry: stream) {
                String message = new String(Files.readAllBytes(entry));
                library.sendMessage(message);
            }
        }
    }

}
