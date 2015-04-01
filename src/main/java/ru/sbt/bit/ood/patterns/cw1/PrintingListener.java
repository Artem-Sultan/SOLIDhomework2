package ru.sbt.bit.ood.patterns.cw1;

import org.some.mega.fast.messaging.MessageListener;

public class PrintingListener implements MessageListener {

    @Override
    public void onMessage(String message) {
        System.out.println("Received new trade message");
        System.out.println(message);
    }

}
