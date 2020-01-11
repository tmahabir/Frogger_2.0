import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Players2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players2 extends World
{
    /**
     * Constructor for objects of class Players2.
     * 
     */
    public Players2()
    {   
        super(800, 700, 1); // Create a new world with 800x700 cells with a cell size of 1x1 pixels.
        addObject(new User2(), 250, 675); //adds new Actors to the current world in different locations
        addObject(new User3(), 520, 675);
        addObject(new Rounds(), 1, 275);
        addObject(new Invisible(), 400, 675);
        addObject(new Prize(), 410, 25);
        showText("Frogger", 360,660); //displays Title on screen
        addObject(new MainMenu(), 393, 685);
        showText("1 v 1", 440, 660); //displays Player Mode on screen
   }
}
