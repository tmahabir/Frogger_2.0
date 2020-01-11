import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stats here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stats extends Actor
{
    public static int score; //initialize variables
    public int actCount;
    public boolean playOnce = true;
    /**
     * Act - do whatever the Stats wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    actCount++; //adds 1 to every act
    if ((this.getWorld().getClass() == GameWon.class) || (this.getWorld().getClass() == GameWonP1.class) || (this.getWorld().getClass() == GameWonP2.class)) { //if the current world is one of the winning worlds
      if (playOnce == true){ //set boolean playOnce to true
        Greenfoot.playSound("Kids Cheering-SoundBible.com-681813822.mp3"); //play cheering sound
        playOnce = false; //set boolean playOnce to false
      }
    } else if (this.getWorld().getClass() == GameOver.class){ //if the current world is the GameOver world
      if (playOnce == true){ //set boolean playOnce to true
        Greenfoot.playSound("Crowd Boo 3-SoundBible.com-595364990.mp3"); //play booing sound
        playOnce = false; //set boolean playOnce to true
      }
    }
    
    if (actCount %125 == 0){ //if actCount is a multiple of 125
        if (this.getWorld().getClass() == GameOver.class){ //if the current world is the GameOver world
        Greenfoot.playSound("Crowd Boo 3-SoundBible.com-595364990.mp3"); //play booing sound
    } else if (this.getWorld().getClass() == GameWon.class){ //if the current world is the GameWon world
        Greenfoot.playSound("Kids Cheering-SoundBible.com-681813822.mp3"); //play cheering sound
    } else if (this.getWorld().getClass() == GameWonP1.class){ //if the current world is the GameWonP1 world
        Greenfoot.playSound("Kids Cheering-SoundBible.com-681813822.mp3"); //play cheering sound
    } else if (this.getWorld().getClass() == GameWonP2.class){ //if the current world is the GameWonP2 world
        Greenfoot.playSound("Kids Cheering-SoundBible.com-681813822.mp3"); //play cheering sound
    } 
    }
    if (this.getWorld().getClass() == MyWorld.class){ //if the current world is the MyWorld world
        Stats.score = 0; //set actCount in Stats to 0
    }
    }    
}
