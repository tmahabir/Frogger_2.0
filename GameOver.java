import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        super(800, 700, 1); // Create a new world with 800x700 cells with a cell size of 1x1 pixels.
        showText("Game Over", 400, 350); //displays "Game Over" on the screen
        addObject(new MainMenu(), 70, 660); //adds new Actors to the current world in different locations
        addObject(new Stats(), 1, 275);
        addObject(new Rounds(), 1, 275);
    }
}
