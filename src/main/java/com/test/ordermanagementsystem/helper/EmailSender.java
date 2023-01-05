package com.test.ordermanagementsystem.helper;

import org.springframework.stereotype.Component;


@Component
public class EmailSender {
    public void sendMail() {
        System.out.println("Sent mail to customer");
    }

}
