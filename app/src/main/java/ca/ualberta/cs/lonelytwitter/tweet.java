/*
 * Copyright (c) 2017. For Team 10.
 * Created by yiding 27/9/2017
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * class of tweet
 */
public abstract class tweet {
    private String message;
    private Date date;

    /**
     * sent the message
     * @param message
     */
    public tweet(String message ){
        this.message= message;
        this.date= new Date();
    }

    /**
     * Constructs a Tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * whether the tweet is important
     * @return
     */
    public abstract Boolean isImportant();

    /**
     * Sets the tweet message.
     *
     * @param message
     * @throws TweetToolongException
     */
    public void setMessage(String message) throws TweetToolongException{
       if (message.length()>140){
            throw new TweetToolongException();

        }else {
           this.message = message;
       }
    }

    /**
     *get the message
     * @return message
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * get the date
     * @return
     */
    public Date getDate() {
        return date;
    }

    /**
     * set the date
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * method used to output string
     */
    @Override
    public String toString(){
        return date.toString()+"|"+ message;
    }
}
