package com.withwiz.sandbeach.network.tcp.message;

import com.withwiz.sandbeach.network.message.IMessage;

/**
 * Header message interface.<BR/>
 */
public interface IHeaderMessage extends IMessage {
    /**
     * header field name: URI
     */
    public static final String FILED_NAME_URI = "URI";

    /**
     * header field name: MESSAGE ID
     */
    public static final String FIELD_NAME_ID = "ID";

    /**
     * header field name: STATUS_CODE
     */
    public static final String FIELD_NAME_STATUS_CODE = "STATUS_CODE";

    /**
     * header field name: CONTENT-TYPE
     */
    public static final String FILED_NAME_CONTENT_TYPE = "CONTENT-TYPE";

    /**
     * header field name: DATE
     */
    public static final String FILED_NAME_DATE = "DATE";

    /**
     * header field name: VERSION
     */
    public static final String FILED_NAME_VERSION = "VERSION";

    /**
     * header field name: TIMEOUT
     */
    public static final String FIELD_NAME_TIMEOUT = "TIMEOUT";

    /**
     * header field name: BODY-LENGTH
     */
    public static final String FILED_NAME_BODY_LENGTH = "BODY-LENGTH";

    /**
     * return a message URI.<BR/>
     *
     * @return URI
     */
    String getUri();

    /**
     * return a content type.<BR/>
     *
     * @return
     */
    String getContentType();

    /**
     * return message date.<BR/>
     *
     * @return message date
     */
    String getDate();

    /**
     * return version.<BR/>
     *
     * @return version
     */
    String getVersion();

    /**
     * return body length.<BR/>
     *
     * @return length
     */
    int getBodyLength();

    /**
     * return a TAG.<BR/>
     *
     * @return TAG
     */
    String getTag();
}
