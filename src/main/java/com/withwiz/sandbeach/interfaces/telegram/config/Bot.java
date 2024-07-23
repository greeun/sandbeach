package com.withwiz.sandbeach.interfaces.telegram.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Bot {
    /**
     * name
     */
    String name;

    /**
     * token
     */
    String token;

    /**
     * chat-id
     */
    String chatId;
}
