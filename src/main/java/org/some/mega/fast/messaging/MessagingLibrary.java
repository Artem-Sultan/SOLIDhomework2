package org.some.mega.fast.messaging;

public class MessagingLibrary {

    private MessageListener listener;

    public void sendMessage(String message) {
        listener.onMessage(message);
    }

    public void registerListener(MessageListener listener) {
        this.listener = listener;
    }

}
