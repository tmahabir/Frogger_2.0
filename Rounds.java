import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rounds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rounds extends Actor
{
      public static int round; //initialize variables
      public static int actCount;
      public  static boolean playOnce = true;
      public static GreenfootSound sound1 = new GreenfootSound("Frogger Main Song Theme (loop).mp3");
    /**
     * Act - do whatever the Rounds wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    if (actCount %25 == 0){ //if actCount is a multiple of 25, set boolean playOnce to true
       playOnce = true;
    }
    actCount++; //adds 1 to every act
    if (playOnce == true){ //if boolean playOnce is true
        sound1.play(); //play the theme song
        playOnce = false; //make the boolean playOnce false
    }
    if (this.getWorld().getClass() != MyWorld.class){ //if the current world is not MyWorld
        sound1.stop(); //stop playing the theme song
     }
    if (this.getWorld().getClass() == MyWorld.class){ //if the current world is not MyWorld
        Rounds.round = 0; //set the round variable to 0
    }
}
}
