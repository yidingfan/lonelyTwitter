/*
 * Copyright (c) 2017. For Team 10.
 * Created by yiding 27/9/2017
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Important Tweet class
 */
public class ImportantTweet extends tweet implements Tweetable{
    /**
     * sent the message
     * @param message
     */
    public ImportantTweet(String message) {
        super(message);//call the constructor from tweet
    }

    /**
     * sent message with date
     * @param message
     * @param date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * always important
     * @return
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
