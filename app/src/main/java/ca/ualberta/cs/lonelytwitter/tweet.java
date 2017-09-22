package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by song on 2017/9/12.
 */

public abstract class tweet {
    private String message;
    private Date date;
    public tweet(String message ){
        this.message= message;
        this.date= new Date();
    }

    public tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();

    public void setMessage(String message) throws TweetToolongException{
       if (message.length()>140){
            throw new TweetToolongException();

        }else {
           this.message = message;
       }
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //method used to output string
    @Override
    public String toString(){
        return date.toString()+"|"+ message;
    }
}
