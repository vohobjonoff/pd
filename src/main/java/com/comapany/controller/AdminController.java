package com.comapany.controller;

import com.comapany.container.Container;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;


public class AdminController {
    public static void handleMessage(Message message) {
        System.out.println(message.getChatId());
        if (message.hasText()) {
            handleText(message, message.getText());
        }
    }

    private static void handleText(Message message, String text) {
        String chatId = String.valueOf(message.getChatId());
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        if (text.equals("/start")) {


            Container.MyBot.sendMsg(sendMessage);
        }


    }
}
