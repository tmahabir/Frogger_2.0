import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class User2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User2 extends Actor
{
    public int actCount; //intialize variables
    public int lives = 5;
    public int score = 0;
    public boolean isRightDown;
    public boolean isLeftDown;
    public boolean isUpDown;
    public boolean isDownDown;
    public boolean isTouching;
    public boolean onLog;
    public int imageTurn = 2;
    /**
     * Act - do whatever the User2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().setPaintOrder(User2.class); //sets user in front of every actor and image
        actCount++;//adds 1 to every act
        move();//calls move method
        getWorld().showText("Lives (P1): " +lives,80,689); //displays lives count on screen
        getWorld().showText("Score (P1) : " +score,80,660); //displays score count on screen
        achieve(); //calls achieve method
        crash(); //calls crash method
        checkLives(); //calls checkLives method
        onLog(); //calls onLog method
        checkScore(); //calls checkScore method
    }    
    //This method allows the user to move 
    public void move(){
           if (Greenfoot.isKeyDown("D")){ //if the "D" key is pressed
               if (isRightDown == false){ //if the boolean is false, move 20 pixels right and make the boolean true
                  isRightDown = true;
                  setLocation(getX()+20, getY());
                   if(imageTurn % 2 == 0){ //if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                     setImage("2climb2.png");
                     Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                   }else{ //if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                      setImage("2climb.png");
                      Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                  }
               } 
           } else { //if the "D" key is not pressed, set the boolean to false
               isRightDown = false;
           }
           if (Greenfoot.isKeyDown("A")){ //if the "A" key is pressed
               if (isLeftDown == false){ //if the boolean is false, move 20 pixels left and make the boolean true
                  isLeftDown = true;
                  setLocation(getX()-20, getY());
                   if(imageTurn % 2 == 0){ //if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                     setImage("2climb2.png");
                     Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                   }else{ //if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                      setImage("2climb.png");
                      Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                  }
               } 
           } else {//if the "A" key is not pressed, set the boolean to false
               isLeftDown = false;
           }
           if (Greenfoot.isKeyDown("W")){ //if the "W" key is pressed
               if (isUpDown == false){ //if the boolean is false, make the boolean true
                  isUpDown = true;
                  if(getY() < 242 ){ //if Y value is lower than 242, move up the screen 55 pixels
                      setLocation(getX(), getY()-55);
                      if(imageTurn % 2 == 0){//if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                            setImage("2climb2.png");
                            Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                            imageTurn++;
                      }else{//if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                              setImage("2climb.png");
                              Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                              imageTurn++;
                      }
                 } else if (getY()<282){ //if Y value lower than 282, move up the screen 40 pixels
                    setLocation(getX(), getY()-40);
                     if(imageTurn % 2 == 0){//if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                     setImage("2climb2.png");
                     Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++; 
                   }else{//if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                      setImage("2climb.png");
                      Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                  }
                 } else { //if Y value higher than 282, move up the screen 20 pixels
                   setLocation(getX(), getY()-20);
                   if(imageTurn % 2 == 0){//if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                     setImage("2climb2.png");
                     Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                   }else{//if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                      setImage("2climb.png");
                      Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                  }
                }
               } 
           } else {//if the "W" key is not pressed, set the boolean to false
               isUpDown = false;
           }
           if (Greenfoot.isKeyDown("S")){ //if the "S" key is pressed
               if (isDownDown == false){ //if the boolean is false, make the boolean true
                  isDownDown = true;
                  if(getY() < 242 ){ //if Y value lower than 242, move up the screen 55 pixels
                      setLocation(getX(), getY()+55);
                      if(imageTurn % 2 == 0){//if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                            setImage("2climb2.png");
                            Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                            imageTurn++;
                      }else{//if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                              setImage("2climb.png");
                              Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                              imageTurn++;
                      }
                 } else if (getY()<282){ //if Y value lower than 282, move up the screen 40 pixels
                    setLocation(getX(), getY()+40);
                     if(imageTurn % 2 == 0){//if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                     setImage("2climb2.png");
                     Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                   }else{//if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                      setImage("2climb.png");
                      Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                  }
                 } else { //if higher than 282, move up the screen 20 pixels
                   setLocation(getX(), getY()+20);
                   if(imageTurn % 2 == 0){//if image turn is a multiple of 2, set the corresponding image and play the jumping sound
                     setImage("2climb2.png");
                     Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                   }else{//if image turn is not a multiple of 2, set the corresponding image and play the jumping sound
                      setImage("2climb.png");
                      Greenfoot.playSound("Jump-SoundBible.com-1007297584.mp3");
                      imageTurn++;
                  }
                }
               } 
           } else {//if the "S" key is not pressed, set the boolean to false
               isDownDown = false;
           }
     }
    public void achieve(){
      if(isTouching(Prize.class)){ //if the user is touching the burger
        Actor thing = getOneIntersectingObject(Prize.class);
        Greenfoot.playSound("glass_ping-Go445-1207030150.mp3"); //plays Ping sound
        setLocation(250, 675); //resets location of user
        thing.setImage("pop.png"); //displays burger exploding for 5 milliseconds
        Greenfoot.delay(5);
        getWorld().removeObject(thing); //removes burger from world
        score++; //adds 1 to score variable
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
    //This method is for when the 1st user crashes into an object
    public void crash(){
      getWorld().showText("Lives (P1): " +lives,80,689); //displays lives count on screen
      if(isTouching(Car1.class)){  //if the 1st user is touching the actor Car1, play splat sound, remove the specific actor Car1, reset the location of the 1st user and subtract a live from the lives vairable   
        Actor thing = getOneIntersectingObject(Car1.class);
        Greenfoot.playSound("Spit_Splat-Mike_Koenig-1170500447.mp3");
        getWorld().removeObject(thing);
        setLocation(250, 675);
        lives--;
       }else if (isTouching(Car2.class)){ //if the 1st user is touching the actor Car2, play splat sound, remove the specific actor Car2, reset the location of the 1st user and subtract a live from the lives vairable
        Actor thing = getOneIntersectingObject(Car2.class);
        Greenfoot.playSound("Spit_Splat-Mike_Koenig-1170500447.mp3");
        getWorld().removeObject(thing);
        setLocation(250, 675);
        lives--;
       }else if (isTouching(Ambulance.class)){ //if the 1st user is touching the actor Ambulance, play splat sound, remove the specific actor Ambulance, reset the location of the 1st user and subtract a live from the lives vairable
        Actor thing = getOneIntersectingObject(Ambulance.class);
        Greenfoot.playSound("Spit_Splat-Mike_Koenig-1170500447.mp3");
        getWorld().removeObject(thing);
        setLocation(250, 675);
        lives--;
       }else if (isTouching(Police.class)){ //if the 1st user is touching the actor Police, play splat sound, remove the specific actor Police, reset the location of the 1st user and subtract a live from the lives vairable
        Actor thing = getOneIntersectingObject(Police.class);
        Greenfoot.playSound("Spit_Splat-Mike_Koenig-1170500447.mp3");
        getWorld().removeObject(thing);
        setLocation(250, 675);
        lives--;
       }else if (isTouching(Bomb.class)){ //if the 1st user is touching the actor Bomb
        if (getY()<245){ //if the Y value of the 1st user is less than 245
           if(isTouching(Log1.class) || (isTouching(Log2.class)) || (isTouching(SmallLog.class)) || (isTouching(SmallLog2.class)) ){ //if the 1st user is on any of the log types, play explosion sound, displays bomb exploding for 5 milliseconds, remove the specific actor Police, reset the location of the 1st user and subtract a live from the lives vairable  
           Actor thing = getOneIntersectingObject(Bomb.class);
           Greenfoot.playSound("50_sniper_shot-Liam-2028603980.mp3");
           setLocation(250, 675);
           thing.setImage("pop.png");
           Greenfoot.delay(5);
           getWorld().removeObject(thing);
           lives--;
        }
      }
       }
    }
    //This method is for when the 1st user is on any log
    public void onLog(){
       if (getY()<242){ //if the Y value of the 1st user is less than 242
             if(isTouching(Log1.class)){ //if touching the actor Log 1, move the 1st user at the same Y and same X as the specific log
                 Actor thing = getOneIntersectingObject(Log1.class);
                 setLocation(getX()+3, thing.getY());
              }else if (isTouching(Log2.class)){ //if touching the actor Log 2, move the 1st user at the same Y and same X as the specific log
                 Actor thing = getOneIntersectingObject(Log2.class);
                 setLocation(getX()-3, thing.getY());
              }else if (isTouching(SmallLog.class)){ //if touching the actor SmallLog, move the 1st user at the same Y and same X as the specific log
                 Actor thing = getOneIntersectingObject(SmallLog.class);
                 setLocation(getX()+3, thing.getY());
              }else if (isTouching(SmallLog2.class)){ //if touching the actor SmallLog2, move the 1st user at the same Y and same X as the specific log
                 Actor thing = getOneIntersectingObject(SmallLog2.class);
                 setLocation(getX()-3, thing.getY());
              } else { //if the 1st user is not touching any of the logs, play the splash sound, reset the location of the 1st user and subtract a live from the lives vairable
              Greenfoot.playSound("Video_Game_Splash-Ploor-699235037.mp3");
              setLocation(250, 675);
              lives--;  
              }
            }
     }
     //This method checks for when the 1st user loses all its lives
     public void checkLives(){
       if (lives == -1){ //if lives equals -1, set the GameWon world for Player 2
           Greenfoot.setWorld(new GameWonP2());
       }
    }
    //This method checks for when the 1st user earns enough points to win the game
     public void checkScore(){
       if (score == 5){ //if score equals 5, set the GameWon world for Player 1
           Greenfoot.setWorld(new GameWonP1());
      }
    } 
 }  