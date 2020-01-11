import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class How2Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class How2Play extends World
{
    /**
     * Constructor for objects of class How2Play.
     * 
     */
    public How2Play()
    {    
        super(800, 700, 1); // Create a new world with 800x700 cells with a cell size of 1x1 pixels.
        addObject(new Rounds(), 1, 275); //adds new Actors to the current world in different locations
        addObject(new MainMenu(), 393, 685);
    }
}
