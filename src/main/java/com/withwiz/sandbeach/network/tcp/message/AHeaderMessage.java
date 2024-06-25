package com.withwiz.sandbeach.network.tcp.message;

import org.apache.http.HttpStatus;

/**
 * Header message abstract class.<BR/>
 */
abstract public class AHeaderMessage implements HttpStatus, IHeaderMessage {
    /**
     * message tag: HM
     */
    public static final String TAG = "HM";
}
