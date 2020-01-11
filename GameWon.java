import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWon extends World
{

    /**
     * Constructor for objects of class GameWon.
     * 
     */
    public GameWon()
    {    
        super(800, 700, 1);// Create a new world with 800x700 cells with a cell size of 1x1 pixels.
        showText("You Won!", 400, 350); //displays "You Won!" on the screen
        addObject(new MainMenu(), 70, 660); //adds new Actors to the current world in different locations
        addObject(new Stats(), 1, 275);
        addObject(new Rounds(), 1, 275);
    }
}
