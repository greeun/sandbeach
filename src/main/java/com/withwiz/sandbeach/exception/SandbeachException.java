package com.withwiz.sandbeach.exception;

/**
 * project parent exception class<BR/>
 * Created by uni4love on 2010. 3. 30..
 */
public class SandbeachException extends Exception
{
    /**
     * constructor
     *
     * @param message
     *            exception message
     */
    public SandbeachException(String message)
    {
        super(message);
    }

    /**
     * constructor
     *
     * @param throwable
     *            throwable instance
     */
    public SandbeachException(Throwable throwable)
    {
        super(throwable);
    }
}
