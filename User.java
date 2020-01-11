import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User extends Actor
{
    public int actCount; //intialize variables
    public int lives = 5;
    public boolean isRightDown;
    public boolean isLeftDown;
    public boolean isUpDown;
    public boolean isDownDown;
    public boolean isTouching;
    public boolean onLog;
    public int imageTurn = 2;
    /**
     * Act - do whatever the User wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().setPaintOrder(User.class); //sets user in front of every actor and image
        actCount++; //adds 1 to every act
        move(); //calls move method
        getWorld().showText("Lives: " +lives,50,689); //displays lives count on screen
        getWorld().showText("Score: " +Stats.score,742,689); //displays score count on screen
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
        achieve(); //calls achieve method
        crash(); //calls crash method
        checkLives(); //calls checkLives method
        onLog(); //calls onLog method
        checkScore(); //calls checkScore method
    }    
    //This method allows the user to move 
    public void move(){
           if (Greenfoot.isKeyDown("Right")){ //if the Right key is pressed
               if (isRightDown == false){ //if the boolean is false, move 20 pixels right and make the boolean true
                  isRightDown = true;
                  setLocation(getX()+20, getY());
                   if(imageTurn % 2 == 0){ //if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                     setImage("climb2.png");
                     Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                   }else{ //if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                      setImage("climb.png");
                      Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                  }
               } 
           } else { //if the Right key is not pressed, set the boolean to false
               isRightDown = false;
           }
           if (Greenfoot.isKeyDown("Left")){ //if the Left key is pressed
               if (isLeftDown == false){ //if the boolean is false, move 20 pixels left and make the boolean true
                  isLeftDown = true;
                  setLocation(getX()-20, getY());
                   if(imageTurn % 2 == 0){ //if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                     setImage("climb2.png");
                     Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                   }else{ //if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                      setImage("climb.png");
                      Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                  }
               } 
           } else {//if the Left key is not pressed, set the boolean to false
               isLeftDown = false;
           }
           if (Greenfoot.isKeyDown("Up")){ //if the Up key is pressed
               if (isUpDown == false){ //if the boolean is false, make the boolean true
                  isUpDown = true;
                  if(getY() < 242 ){ //if Y value is lower than 242, move up the screen 55 pixels
                      setLocation(getX(), getY()-55);
                      if(imageTurn % 2 == 0){//if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                            setImage("climb2.png");
                            Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                            imageTurn++;
                      }else{//if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                              setImage("climb.png");
                              Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                              imageTurn++;
                      }
                 } else if (getY()<282){ //if Y value lower than 282, move up the screen 40 pixels
                    setLocation(getX(), getY()-40);
                     if(imageTurn % 2 == 0){//if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                     setImage("climb2.png");
                     Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++; 
                   }else{//if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                      setImage("climb.png");
                      Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                  }
                 } else { //if Y value higher than 282, move up the screen 20 pixels
                   setLocation(getX(), getY()-20);
                   if(imageTurn % 2 == 0){//if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                     setImage("climb2.png");
                     Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                   }else{//if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                      setImage("climb.png");
                      Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                  }
                }
               } 
           } else {//if the Up key is not pressed, set the boolean to false
               isUpDown = false;
           }
           if (Greenfoot.isKeyDown("Down")){ //if the Up key is pressed
               if (isDownDown == false){ //if the boolean is false, make the boolean true
                  isDownDown = true;
                  if(getY() < 242 ){ //if Y value lower than 242, move up the screen 55 pixels
                      setLocation(getX(), getY()+55);
                      if(imageTurn % 2 == 0){//if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                            setImage("climb2.png");
                            Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                            imageTurn++;
                      }else{//if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                              setImage("climb.png");
                              Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                              imageTurn++;
                      }
                 } else if (getY()<282){ //if Y value lower than 282, move up the screen 40 pixels
                    setLocation(getX(), getY()+40);
                     if(imageTurn % 2 == 0){//if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                     setImage("climb2.png");
                     Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                   }else{//if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                      setImage("climb.png");
                      Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                  }
                 } else { //if higher than 282, move up the screen 20 pixels
                   setLocation(getX(), getY()+20);
                   if(imageTurn % 2 == 0){//if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                     setImage("climb2.png");
                     Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                   }else{//if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                      setImage("climb.png");
                      Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                  }
                }
               } 
           } else {//if the Up key is not pressed, set the boolean to false
               isDownDown = false;
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
    //This method is for when the user reaches the burger
    public void achieve(){
      if(isTouching(Prize.class)){ //if the user is touching the burger
        Actor thing = getOneIntersectingObject(Prize.class);
        Greenfoot.playSound("glass_ping-Go445-1207030150.mp3"); //plays Ping sound
        setLocation(400, 675); //resets location of user
        thing.setImage("pop.png"); //displays burger exploding for 5 milliseconds
        Greenfoot.delay(5);
        getWorld().removeObject(thing); //removes burger from world
        Stats.score++; //adds 1 to score variable
         int random = Greenfoot.getRandomNumber(100);//generates a random number between 1 and 100
        if (random < 20){ //if random is less than 20, add the Prize actor to a specific location
             getWorld().addObject(new Prize(), 90, 25);   
            } else if (random >= 20 && random <40 ){ //if random is less than 20, add the Prize actor to a specific location
              getWorld().addObject(new Prize(), 250, 25);  
            } else if (random >= 40 && random <60 ){//if random is between 40 and 60, add the Prize actor to a specific location
                getWorld().addObject(new Prize(), 410, 25);
            } else if (random >= 60 && random <80 ){//if random is between 60 and 80, add the Prize actor to a specific location
               getWorld().addObject(new Prize(), 570, 25); 
            }else if (random >= 80 && random <100 ){//if random is between 80 and 100, add the Prize actor to a specific location
               getWorld().addObject(new Prize(), 710, 25); 
          }
        } 
    }
    //This method is for when the user crashes into an object
    public void crash(){
      getWorld().showText("Lives: " +lives,50,689); //displays lives count on screen
      if(isTouching(Car1.class)){ //if the user is touching the actor Car1, play splat sound, remove the specific actor Car1, reset the location of the user and subtract a live from the lives vairable    
        Actor thing = getOneIntersectingObject(Car1.class);
        Greenfoot.playSound("Spit_Splat-Mike_Koenig-1170500447.mp3");
        getWorld().removeObject(thing);
        setLocation(400, 675);
        lives--;
       }else if (isTouching(Car2.class)){ //if the user is touching the actor Car2, play splat sound, remove the specific actor Car2, reset the location of the user and subtract a live from the lives vairable
        Actor thing = getOneIntersectingObject(Car2.class);
        Greenfoot.playSound("Spit_Splat-Mike_Koenig-1170500447.mp3");
        getWorld().removeObject(thing);
        setLocation(400, 675);
        lives--;
       }else if (isTouching(Ambulance.class)){ //if the user is touching the actor Ambulance, play splat sound, remove the specific actor Ambulance, reset the location of the user and subtract a live from the lives vairable
        Actor thing = getOneIntersectingObject(Ambulance.class);
        Greenfoot.playSound("Spit_Splat-Mike_Koenig-1170500447.mp3");
        getWorld().removeObject(thing);
        setLocation(400, 675);
        lives--;
       }else if (isTouching(Police.class)){ //if the user is touching the actor Police, play splat sound, remove the specific actor Police, reset the location of the user and subtract a live from the lives vairable
        Actor thing = getOneIntersectingObject(Police.class);
        Greenfoot.playSound("Spit_Splat-Mike_Koenig-1170500447.mp3");
        getWorld().removeObject(thing);
        setLocation(400, 675);
        lives--;
       }else if (isTouching(Bomb.class)){ //if the user is touching the actor Bomb
        if (getY()<245){ //if the Y value of the user is less than 245
           if(isTouching(Log1.class) || (isTouching(Log2.class)) || (isTouching(SmallLog.class)) || (isTouching(SmallLog2.class)) ){   //if the user is on any of the log types, play explosion sound, displays bomb exploding for 5 milliseconds, remove the specific actor Police, reset the location of the user and subtract a live from the lives vairable
           Actor thing = getOneIntersectingObject(Bomb.class);
           Greenfoot.playSound("50_sniper_shot-Liam-2028603980.mp3");
           setLocation(400, 675);
           thing.setImage("pop.png");
           Greenfoot.delay(5);
           getWorld().removeObject(thing);
           lives--;
        }
      }
        }
    }
    //This method is for when the user is on any log
    public void onLog(){
       if (getY()<242){ //if the Y value of the user is less than 242
             if(isTouching(Log1.class)){ //if touching the actor Log 1, move the user at the same Y as the specific log and move the user at the same X depending on which round it is
                 Actor thing = getOneIntersectingObject(Log1.class);
                 if (this.getWorld().getClass() == Round1.class){
                       setLocation(getX()+3, thing.getY());
                 } else if (this.getWorld().getClass() == Round2.class){
                       setLocation(getX()+4, thing.getY());
                 } else if (this.getWorld().getClass() == Round3.class){
                       setLocation(getX()+5, thing.getY());
                 } else if (this.getWorld().getClass() == Round4.class){
                       setLocation(getX()+6, thing.getY());
                 } else if (this.getWorld().getClass() == Round5.class){
                       setLocation(getX()+7, thing.getY());
                 }
              }else if (isTouching(Log2.class)){ //if touching the actor Log 2, move the user at the same Y as the specific log and move the user at the same X depending on which round it is
                 Actor thing = getOneIntersectingObject(Log2.class);
                 if (this.getWorld().getClass() == Round1.class){
                       setLocation(getX()-3, thing.getY());
                 } else if (this.getWorld().getClass() == Round2.class){
                       setLocation(getX()-4, thing.getY());
                 } else if (this.getWorld().getClass() == Round3.class){
                       setLocation(getX()-5, thing.getY());
                 } else if (this.getWorld().getClass() == Round4.class){
                       setLocation(getX()-6, thing.getY());
                 } else if (this.getWorld().getClass() == Round5.class){
                       setLocation(getX()-7, thing.getY());
                 }
              }else if (isTouching(SmallLog.class)){ //if touching the actor SmallLog, move the user at the same Y as the specific log and move the user at the same X depending on which round it is
                 Actor thing = getOneIntersectingObject(SmallLog.class);
                 if (this.getWorld().getClass() == Round1.class){
                       setLocation(getX()+3, thing.getY());
                 } else if (this.getWorld().getClass() == Round2.class){
                       setLocation(getX()+4, thing.getY());
                 } else if (this.getWorld().getClass() == Round3.class){
                       setLocation(getX()+5, thing.getY());
                 } else if (this.getWorld().getClass() == Round4.class){
                       setLocation(getX()+6, thing.getY());
                 } else if (this.getWorld().getClass() == Round5.class){
                       setLocation(getX()+7, thing.getY());
                 }
              }else if (isTouching(SmallLog2.class)){ //if touching the actor SmallLog2, move the user at the same Y as the specific log and move the user at the same X depending on which round it is
                 Actor thing = getOneIntersectingObject(SmallLog2.class);
                 if (this.getWorld().getClass() == Round1.class){
                       setLocation(getX()-3, thing.getY());
                 } else if (this.getWorld().getClass() == Round2.class){
                       setLocation(getX()-4, thing.getY());
                 } else if (this.getWorld().getClass() == Round3.class){
                       setLocation(getX()-5, thing.getY());
                 } else if (this.getWorld().getClass() == Round4.class){
                       setLocation(getX()-6, thing.getY());
                 } else if (this.getWorld().getClass() == Round5.class){
                       setLocation(getX()-7, thing.getY());
                 }
              } else { //if the user is not touching any of the logs, play the splash sound, reset the location of the user and subtract a live from the lives vairable 
              Greenfoot.playSound("Video_Game_Splash-Ploor-699235037.mp3");
              setLocation(400, 675);
              lives--;  
              }
            }
     }
    //This method checks for when the user loses all its lives
     public void checkLives(){
       if (lives == -1){ //if lives equals -1, set the GameOver world
           Greenfoot.setWorld(new GameOver());
       }
    }
    //This method checks for when the user earns enough points to go to the next round or when they won the game
     public void checkScore(){
        if ((Stats.score != 0) && (Stats.score % 3 == 0)){ //if the score doesn't equal zero AND if the score is a multiple of 3
             if ((Stats.score == 3) && (Rounds.round == 0)) { //if the score equals 3 and the round equals 0, set the Round2 world and add to the round counter
           Greenfoot.setWorld(new Round2());
           Rounds.round++;
        } else if ((Stats.score == 6) && (Rounds.round == 1)){ //if the score equals 6 and the round equals 1, set the Round3 world and add to the round counter
           Greenfoot.setWorld(new Round3());
           Rounds.round++;
        } else if ((Stats.score == 9) && (Rounds.round == 2)){ //if the score equals 9 and the round equals 2, set the Round4 world and add to the round counter
           Greenfoot.setWorld(new Round4());
           Rounds.round++;
        }else if ((Stats.score == 12) && (Rounds.round == 3)){//if the score equals 12 and the round equals 3, set the Round5 world and add to the round counter
           Greenfoot.setWorld(new Round5());
           Rounds.round++;
        }else if ((Stats.score == 15) && (Rounds.round == 4)){//if the score equals 15 and the round equals 4, set the GameWon world and add to the round counter
           Greenfoot.setWorld(new GameWon());
           Rounds.round++;
        }
      }
    } 
 }  