import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Round5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Round5 extends World
{

    /**
     * Constructor for objects of class Round5.
     * 
     */
    public Round5()
    {    
        super(800, 700, 1);// Create a new world with 800x700 cells with a cell size of 1x1 pixels.
        addObject(new User(), 400, 675);//adds new Actors to the current world in different locations
        addObject(new Stats(), 1, 275);
        addObject(new Rounds(), 1, 275);
        showText("Frogger", 310,675);//displays Title on screen
        addObject(new MainMenu(), 70, 660);
        showText("Round 5 of 5", 510, 675);//displays Round number on screen
        int random = Greenfoot.getRandomNumber(100);//generates a random number between 1 and 100
        if (random < 20){ //if random is less than 20, add the Prize actor to a specific location
             addObject(new Prize(), 90, 25);   
            } else if (random >= 20 && random <40 ){ //if random is less than 20, add the Prize actor to a specific location
              addObject(new Prize(), 250, 25);  
            } else if (random >= 40 && random <60 ){//if random is between 40 and 60, add the Prize actor to a specific location
                addObject(new Prize(), 410, 25);
            } else if (random >= 60 && random <80 ){//if random is between 60 and 80, add the Prize actor to a specific location
               addObject(new Prize(), 570, 25); 
            }else if (random >= 80 && random <100 ){//if random is between 80 and 100, add the Prize actor to a specific location
               addObject(new Prize(), 710, 25); 
          }
    }
}
