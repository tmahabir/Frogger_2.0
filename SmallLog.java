import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallLog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallLog extends Actor
{
    /**
     * Act - do whatever the SmallLog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        move(); //calls move method
   }   
   //This method allows SmallLog to move
      public void move(){
            if (this.getWorld().getClass() == Round1.class){ //if the current world is Round1 world
            setLocation(getX()+3, getY());  //sets Location of SmallLog 
        } else if (this.getWorld().getClass() == Round2.class){ //if the current world is Round2 world
            setLocation(getX()+4, getY());  //sets Location of SmallLog   
        } else if (this.getWorld().getClass() == Round3.class){ //if the current world is Round3 world
            setLocation(getX()+5, getY());  //sets Location of SmallLog 
        } else if (this.getWorld().getClass() == Round4.class){ //if the current world is Round4 world
            setLocation(getX()+6, getY());  //sets Location of SmallLog  
        } else if (this.getWorld().getClass() == Round5.class){ //if the current world is Round5 world
            setLocation(getX()+7, getY());  //sets Location of SmallLog 
        } else if (this.getWorld().getClass() == Players2.class){ //if the current world is Players2 world
            setLocation(getX()+3, getY());  //sets Location of SmallLog  
        }
        if(getX()>795){ //if the X value of SmallLog is more than 795, remove the specific actor
             getWorld().removeObject(this); 
        }
   }
}
