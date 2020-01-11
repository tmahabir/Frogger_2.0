import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(800, 700, 1); // Create a new world with 800x700 cells with a cell size of 1x1 pixels.
        addObject(new PlayerMode(), 240, 279); //adds new Actors to the current world in different locations
        addObject(new Player2Mode(), 565, 279);
        addObject(new InvisibleUser(), 400, 675);
        addObject(new Stats(), 1, 275);
        addObject(new Rounds(), 1, 275);
        addObject(new HowToPlay(), 625, 200);
    }
}
