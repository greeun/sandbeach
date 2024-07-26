package com.withwiz.sandbeach.interfaces.telegram.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class BotProperties {
    /**
     * bot list
     */
    protected List<Bot> bots;
}
