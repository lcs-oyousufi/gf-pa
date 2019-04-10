import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 */
public class Lightning extends Mover
{
    /** A bullet looses one life each act, and will disappear when life = 0 */
    private int life = 30;
    
    /** The damage this bullet will deal */
    private int damage = 16;
    
    public Lightning()
    {
    }
    
    public Lightning(Vector speed, int rotation)
    {
        super(speed);
        setRotation(rotation);
        increaseSpeed(new Vector(rotation, 15));
        Greenfoot.playSound("EnergyGun.wav");
    }
    
    /**
     * The bullet will damage asteroids if it hits them.
     */
    public void act()
    {
        if(life <= 0) {
            getWorld().removeObject(this);
        } 
        else {
            move();
            Asteroid asteroid = (Asteroid) getOneIntersectingObject(Asteroid.class);
            if (asteroid != null) {
                getWorld().removeObject(this);
                asteroid.hit(damage);
            }
            else {
                life--;
            }
        }
    }
}