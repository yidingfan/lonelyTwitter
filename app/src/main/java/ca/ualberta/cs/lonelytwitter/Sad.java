package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by song on 2017/9/12.
 */

public class Sad extends Feel {
    public Sad(String mood) {
        super(mood);
    }

    public Sad(String message, Date date) {
        super(message, date);
    }

    public Boolean isHappy() {
        return Boolean.FALSE;
    }

}
