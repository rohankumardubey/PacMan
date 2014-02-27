package edu.ucsb.cs56.projects.games.pacman;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;
/**
* Stores information about the game that has just been played
* @author Kateryna Fomenko
* @author Deanna Hartsook
* @version CS56, Winter 2014
 */

public class GamePlayed implements Serializable{
    private String name;
    private Date d;
    private int score;
    
    /**
    * Constructor to create a GamePlayed object
    * @param name Player's name
    * @param score Player's score
     */
    public GamePlayed(String name, Date date, int score){
        this.name = name;
        this.d = date;
        this.score = score;
    }
    
    /**
    * ToString method for GamePlayed Class
     */
    @Override
    public String toString(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = dateFormat.format(this.d);

		String result = String.format("%15s %5d (%10s)", this.name, this.score, date);
		return result;
	}
    
    
    /**
     * Getter that returns the name for this GamePlayed instance
     * @return String name of player
     */
    public String getName() {
        return this.name;
        //~ return "stub";
    }
    
    /**
     * Getter that returns the date for this GamePlayed instance
     * @return Date when this GamePlayed instance was created
     */
    public Date getDate() {
        return this.d;
        //~ Date d = new Date();
        //~ return d;
    }
    
    /**
    * Getter that returns the score for this GamePlayed instance
    * @return int score
    */
    public int getScore() {
        return this.score;
        //~ return -128349;
    }
    

}
