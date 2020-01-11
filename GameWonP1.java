import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWonP1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWonP1 extends World
{

    /**
     * Constructor for objects of class GameWonP1.
     * 
     */
    public GameWonP1()
    {    
        super(800, 700, 1); // Create a new world with 800x700 cells with a cell size of 1x1 pixels.
        showText("Player 1 Wins!", 400, 350); //displays that the 1st player won on the screen
        addObject(new MainMenu(), 70, 660); //adds new Actors to the current world in different locations
        addObject(new Stats(), 1, 275);
        addObject(new Rounds(), 1, 275);
    }
}
