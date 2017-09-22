package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by song on 2017/9/12.
 *  an abstract base class which represents the current mood.
 */

public abstract class Feel {
    private String mood;
    private Date date;
    public Feel(String mood ){
        this.mood= mood;
        this.date= new Date();
    }

    public Feel(String message, Date date) {
        this.mood = mood;
        this.date = date;
    }

    public abstract Boolean isHappy();

    public String getMood(){
        return this.mood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
