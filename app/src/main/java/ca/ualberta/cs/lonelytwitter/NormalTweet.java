/*
 * Copyright (c) 2017. For Team 10.
 * Created by yiding 27/9/2017
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Nomal tweet class
 */
public class NormalTweet extends tweet{
    /**
     * sent the message
     * @param message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * sent the message with date
     * @param message
     * @param date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     *
     * @return whether is important
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
