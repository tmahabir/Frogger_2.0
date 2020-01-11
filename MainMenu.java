import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends Actor
{
    /**
     * Act - do whatever the MainMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (Greenfoot.mouseClicked(this)){ //if this actor is clicked, play button sound, set actCount in Rounds to 25 and set MyWorld World
             Greenfoot.playSound("Button-SoundBible.com-1420500901.mp3");
             Rounds.actCount = 25;
             Greenfoot.setWorld(new MyWorld());
         }
    }    
}
