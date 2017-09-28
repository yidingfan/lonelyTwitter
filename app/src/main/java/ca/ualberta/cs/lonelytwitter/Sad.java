/*
 * Copyright (c) 2017. For Team 10.
 * Created by yiding 27/9/2017
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * sad class extends feels
 */
public class Sad extends Feel {
    /**
     * set mood to sad
     * @param mood
     */
    public Sad(String mood) {
        super(mood);
    }

    /**
     * set the mood of message
     * @param message
     * @param date
     */
    public Sad(String message, Date date) {
        super(message, date);
    }

    /**
     * always unhappy
     * @return
     */
    public Boolean isHappy() {
        return Boolean.FALSE;
    }

}
