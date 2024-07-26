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
    protected String name;

    /**
     * token
     */
    protected String token;

    /**
     * chat-id
     */
    protected String chatId;
}
