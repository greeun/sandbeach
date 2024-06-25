package com.withwiz.sandbeach.scheduler;

import java.util.Map;

/**
 * scheduled job interface
 */
public interface IScheduledJob {
    /**
     * execute a job
     *
     * @param data job data
     * @throws Exception
     */
    void execute(Map data) throws Exception;
}
