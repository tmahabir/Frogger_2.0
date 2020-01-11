import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Car2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car2 extends Actor
{
    public Car2(){
       turn(-180); //turns Car2 to face the other away around while being created
    }
    /**
     * Act - do whatever the Car2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(); //calls move method
   }   
    //This method allows Car2 to move
      public void move(){
        if (this.getWorld().getClass() == Round1.class){ //if the current world is Round1 world
            setLocation(getX()-3, getY());  //sets Location of Car2 
        } else if (this.getWorld().getClass() == Round2.class){ //if the current world is Round2 world
            setLocation(getX()-4, getY());  //sets Location of Car2
        } else if (this.getWorld().getClass() == Round3.class){ //if the current world is Round3 world
            setLocation(getX()-5, getY());  //sets Location of Car2
        } else if (this.getWorld().getClass() == Round4.class){ //if the current world is Round4 world
            setLocation(getX()-6, getY());  //sets Location of Car2
        } else if (this.getWorld().getClass() == Round5.class){ //if the current world is Round5 world
            setLocation(getX()-7, getY());  //sets Location of Car2
        } else if (this.getWorld().getClass() == Players2.class){ //if the current world is Players2 world
            setLocation(getX()-3, getY());  //sets Location of Car2
        }
        if(getX()<5){ //if the X value of Car2 is less than 5, remove the specific actor
             getWorld().removeObject(this); 
        }
   }   
}
