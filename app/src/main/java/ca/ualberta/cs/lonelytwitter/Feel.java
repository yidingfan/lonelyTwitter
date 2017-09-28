/*
 * Copyright (c) 2017. For Team 10.
 * Created by yiding 27/9/2017
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * The Feel class that contains different mood
 */
public abstract class Feel {
    private String mood;
    private Date date;

    /**
     * set the mood
     * @param mood mood of this moment :)
     */
    public Feel(String mood ){
        this.mood= mood;
        this.date= new Date();
    }

    /**
     * set the mood of this message
     * @param message
     * @param date
     */
    public Feel(String message, Date date) {
        this.mood = mood;
        this.date = date;
    }

    /**
     * abstract class for happy or not
     * @return happy or not
     */
    public abstract Boolean isHappy();

    /**
     *  get the mood
     * @return
     */
    public String getMood(){
        return this.mood;
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
     * @param date date what to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
