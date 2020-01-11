import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvsibleUser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InvisibleUser extends Actor
{
    public static int actCount; //initialize variables
    public int imageTurn = 2;
    /**
     * Act - do whatever the InvisibleUser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     actCount++; //adds 1 to every act
     if(imageTurn % 2 == 0){ //if image turn is a multiple of 2
        if (actCount % 40 == 0){ //if actCount is a multiple of 40, set a random location and set the corresponding image 
        setLocation(Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(700));
        setImage("climb2.png");
        imageTurn++;
        }
     }else{ //if image turn is not a multiple of 2
        if (actCount % 40 == 0){ //if actCount is a multiple of 40, set a random location and set the corresponding image
        setLocation(Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(700));
        setImage("climb.png");
        imageTurn++;
        }
     }
    }    
}
