package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by song on 2017/9/12.
 */

public class Happy extends Feel {
    public Happy(String mood) {
        super(mood);
    }

    public Happy(String message, Date date) {
        super(message, date);
    }

    public Boolean isHappy() {
        return Boolean.TRUE;
    }
}
