import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FryingPan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FryingPan extends Mover
{
    /**
     * Act - do whatever the FryingPan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        
    }   
    
    private void move()
    {
        if (Greenfoot.isKeyDown("Right"))
        {
            move(5);
        }
        if (Greenfoot.isKeyDown("Left"))
        {
            move(-5);
        }
    }
}
