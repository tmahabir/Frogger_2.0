import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Invisible here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Invisible extends Actor
{
    public int actCount = 0; //intialize variables
    /**
     * Act - do whatever the Invisible wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        actCount++; //adds 1 to every act
        if(actCount % 35 == 0 ){ //every 35 acts, a random lane with cars is created
            int random = Greenfoot.getRandomNumber(100);
            if (random < 25){ //if random number is less than 25, Lane 1 is created
                createLane1();
            } else if (random >= 25 && random <50 ){ //if random number is between 25 and 50, Lane 3 is created
                createLane3();
            } else if (random >= 50 && random <75 ){ //if random number is between 50 and 75, Lane 2 is created
                createLane2();
            } else if (random >= 75 && random <100 ){ //if random number is between 75 and 100, Lane 4 is created
                createLane4();
            }
        }    
           if(actCount % 25 == 0 ){ //every 25 acts, a random pair of lanes with logs is created 
            int random = Greenfoot.getRandomNumber(10);
            if (random == 1){ //if random number is equal to 1, Log Lane 1 and 2 is created
                LogLane1();
                LogLane2();
            } else if (random == 2){ //if random number is equal to 2, Log Lane 1 and 3 is created
                LogLane1();
                LogLane3();
            } else if (random == 3){//if random number is equal to 3, Log Lane 1 and 4 is created
                LogLane1();
                LogLane4();
            } else if (random == 4 ){//if random number is equal to 4, Log Lane 2 and 3 is created
                LogLane2();
                LogLane3();
            } else if (random == 5 ){//if random number is equal to 5, Log Lane 2 and 4 is created
                LogLane2();
                LogLane4();
            }else if (random == 6 ){//if random number is equal to 6, Log Lane 3 and 4 is created
                LogLane3();
                LogLane4();
            }else if (random == 7 ){//if random number is equal to 7, Log Lane 1 and 1 is created
                LogLane1();
                LogLane1();
            }else if (random == 8 ){//if random number is equal to 8, Log Lane 2 and 2 is created
                LogLane2();
                LogLane2();
            }else if (random == 9 ){//if random number is equal to 9, Log Lane 3 and 3 is created
                LogLane3();
                LogLane3();
            } else if (random == 10 ){//if random number is equal to 10, Log Lane 4 and 4 is created
                LogLane4();
                LogLane4();
            }
        }
    }
    //This method creates Lane 1 with random Logs
    public void LogLane1(){
        int random = Greenfoot.getRandomNumber(4); //generates a random number between 1 and 4
         if (random == 1) { //if random equals 1, create the actor Log1 in a specific location
            getWorld().addObject(new Log1(), -40, 240); 
            int random1 = Greenfoot.getRandomNumber(10); //generates a random number between 1 and 10
            if (random1 <3) { //if random1 is less than 3, create the actor Bomb in a specific location
                getWorld().addObject(new Bomb(), -40, 240); 
            }
        } else if (random == 3) { //if random equals 3, create the actor SmallLog in a specific location
            getWorld().addObject(new SmallLog(), -40, 240); 
            int random1 = Greenfoot.getRandomNumber(10); //generates a random number between 1 and 10
            if (random1 <3) { //if random1 is less than 3, create the actor Bomb in a specific location
                getWorld().addObject(new Bomb(), -40, 240); 
            }
        }
    }
    //This method creates Lane 2 with random Logs
    public void LogLane2(){
        int random = Greenfoot.getRandomNumber(4); //generates a random number between 1 and 4
        if (random == 1) { //if random equals 1, create the actor Log2 in a specific location
            getWorld().addObject(new Log2(), 840, 185); 
        } else if (random == 3) { //if random equals 3, create the actor SmallLog2 in a specific location
            getWorld().addObject(new SmallLog2(), 840, 185); 
        }
    }
    //This method creates Lane 3 with random Logs
    public void LogLane3(){
        int random = Greenfoot.getRandomNumber(4); //generates a random number between 1 and 4
        if (random == 1) { //if random equals 1, create the actor Log1 in a specific location
            getWorld().addObject(new Log1(), -40, 130);
            int random1 = Greenfoot.getRandomNumber(10); //generates a random number between 1 and 10
            if (random1 <3) { //if random1 is less than 3, create the actor Bomb in a specific location
                getWorld().addObject(new Bomb(), -40, 130); 
            }
        } else if (random == 3) { //if random equals 3, create the actor SmallLog in a specific location
            getWorld().addObject(new SmallLog(), -40, 130); 
            int random1 = Greenfoot.getRandomNumber(10); //generates a random number between 1 and 10
            if (random1 <3) { //if random1 is less than 3, create the actor Bomb in a specific location
                getWorld().addObject(new Bomb(), -40, 130); 
            }
        }
    }
    //This method creates Lane 4 with random Logs
    public void LogLane4(){
        int random = Greenfoot.getRandomNumber(4); //generates a random number between 1 and 4
        if (random == 1) { //if random equals 1, create the actor Log2 in a specific location
            getWorld().addObject(new Log2(), 840, 75);
        } else if (random == 3) { //if random equals 3, create the actor SmallLog2 in a specific location
            getWorld().addObject(new SmallLog2(), 840, 75);
        }
    }
    //This method creates Lane 1 with random vehicles
    public void createLane1(){
        int random = Greenfoot.getRandomNumber(10); //generates a random number between 1 and 10
        if (random <8) { //if random is less than 8, create the actor Car1 in a specific location
            getWorld().addObject(new Car1(), -40, 600); 
        } else if (random > 7) { //if random is more than 7, create the actor Ambulance in a specific location
            getWorld().addObject(new Ambulance(), -40, 600); 
        }
    }
    //This method creates Lane 3 with random vehicles
    public void createLane3(){
         int random = Greenfoot.getRandomNumber(10); //generates a random number between 1 and 10
        if (random <8) { //if random is less than 8, create the actor Car1 in a specific location
            getWorld().addObject(new Car1(), -40, 432); 
        } else if (random >7) { //if random is more than 7, create the actor Ambulance in a specific location
            getWorld().addObject(new Ambulance(), -40, 432); 
        }
    }
    //This method creates Lane 2 with random vehicles
    public void createLane2(){
         int random = Greenfoot.getRandomNumber(10); //generates a random number between 1 and 10
        if (random <8) { //if random is less than 8, create the actor Car2 in a specific location
           getWorld().addObject(new Car2(), 840, 520);
        } else if (random >7) { //if random is more than 7, create the actor Police in a specific location
           getWorld().addObject(new Police(), 840, 520);
        }
    }
    //This method creates Lane 4 with random vehicles
    public void createLane4(){
         int random = Greenfoot.getRandomNumber(10); //generates a random number between 1 and 10
        if (random <8) { //if random is less than 8, create the actor Car2 in a specific location
           getWorld().addObject(new Car2(), 840, 352); 
        } else if (random >7){ //if random is more than 7, create the actor Police in a specific location
           getWorld().addObject(new Police(), 840, 352); 
        }
    }
}    
