package com.withwiz.sandbeach.interfaces.telegram;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.withwiz.sandbeach.interfaces.telegram.dto.TelegramResponseSendMessage;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * telegram interface utility
 */
public class TelegramUtil {
    /**
     * URL: param: bot_token
     */
    public static String URL_PARAM_KEY_BOT_TOKEN = "bot_token";

    /**
     * URL: param: chat_id
     */
    public static String URL_PARAM_KEY_CHAT_ID = "chat_id";

    /**
     * URL: param: text
     */
    public static String URL_PARAM_KEY_TEXT = "text";

    /**
     * URL: API
     */
    public static String URL_API = "https://api.telegram.org";

    /**
     * URL: bot
     */
    public static String URL_API_BOT = "/bot" + getKeyWithSubstitution(URL_PARAM_KEY_BOT_TOKEN);

    /**
     * URL: API: sendMessage
     */
    public static String URL_API_SEND_MESSAGE = URL_API + URL_API_BOT
            + "/sendMessage?chat_id=" + getKeyWithSubstitution(URL_PARAM_KEY_CHAT_ID)
            + "&text=" + getKeyWithSubstitution(URL_PARAM_KEY_TEXT);

    /**
     * logger
     */
    private static Logger log = LoggerFactory.getLogger(TelegramUtil.class);

    /**
     * object mapper
     */
    private static ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    /**
     * send a message to telegram bot
     *
     * @param botToken bot token
     * @param chatId   chat_id
     * @param message  message(text)
     * @Return TelegramResponseSendMessage
     */
    public static TelegramResponseSendMessage publishMessageToChannel(String botToken, String chatId, String message) throws IOException {
        String url = URL_API_SEND_MESSAGE.replaceAll(getKeyWithSubstitutionForRegex(URL_PARAM_KEY_BOT_TOKEN), botToken)
                .replaceAll(getKeyWithSubstitutionForRegex(URL_PARAM_KEY_CHAT_ID), chatId)
                .replaceAll(getKeyWithSubstitutionForRegex(URL_PARAM_KEY_TEXT), message);

        log.info("send a message URL: {}", url);

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        JsonNode rootNode = objectMapper.readValue(response.body().byteStream(), JsonNode.class);
        log.debug("received from remote: {}", rootNode.toPrettyString());
        return objectMapper.convertValue(rootNode, TelegramResponseSendMessage.class);
    }

    public static String getKeyWithSubstitution(String key) {
        return "{" + key + "}";
    }

    public static String getKeyWithSubstitutionForRegex(String key) {
        return "\\{" + key + "\\}";
    }

    /**
     * get URL for bot token
     *
     * @param botToken
     * @return bot url
     */
    public static String getUrlOfBotToken(String botToken) {
        return URL_API_BOT.replace("\\{bot_token\\}", botToken);
    }

    /**
     * test main
     *
     * @param args
     */
    public static void main(String[] args) {
        // telelgram api token
        String TOKEN = "...";
        String[] chatIdList = {"..."};
        // telegram chat id: channel
        List<String> chatIDList = Arrays.asList(chatIdList);
        try {
            TelegramResponseSendMessage response = TelegramUtil.publishMessageToChannel(TOKEN,
                    chatIDList.get(0), "[Notice] new contents registered.");
            log.info("response: {}", response);
        } catch (IOException e) {
            log.error("{}", e);
        }
    }
}
