/*
 * Copyright (c) 2017. For Team 10.
 * Created by yiding 27/9/2017
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Happy extends the class feel
 */
public class Happy extends Feel {
    /**
     * set the mood
     * @param mood
     */
    public Happy(String mood) {
        super(mood);
    }

    /**
     * set the date and message pairs
     * @param message
     * @param date
     */
    public Happy(String message, Date date) {
        super(message, date);
    }

    /**
     * always return happy
     * @return
     */
    public Boolean isHappy() {
        return Boolean.TRUE;
    }
}
