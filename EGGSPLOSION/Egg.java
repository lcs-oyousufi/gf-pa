import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Egg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Egg extends Mover
{
    private int healthValue;
    private int frames;
    private boolean isRemoved;
    /**
     * Constructor 
     * 
     */
    public Egg() 
    {
        healthValue = 5;
        isRemoved = false;
    }    
    
    /**
     * Act - do whatever the Egg wants to do. 
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       moveDown();
       
      
       
    }
    
    /**
     * Act- move down
     */
    private void moveDown()
    {
        turn(90);
        turn(5);
        turn(-90);
    }
    
    private void Removal()
    {
        if (isAtEdge())
        {
            Sky world = (Sky) getWorld();
            world.removeObject(this);
        }
    }
}
