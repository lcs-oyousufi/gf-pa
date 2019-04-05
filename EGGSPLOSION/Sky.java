import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)


public class Sky extends World
{
    /**
     * Create the space world with black background and stars.
     */
    public Sky() 
    {
        super(800, 600, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLUE);
        background.fill();
        createStars(300);
       
    }
    
    /**
     * Create some random stars in the world
     */
    private void createStars(int number) 
    {
        GreenfootImage background = getBackground();             
        for (int i=0; i < number; i++) {            
             int x = Greenfoot.getRandomNumber( getWidth() );
             int y = Greenfoot.getRandomNumber( getHeight() );
             int color = 150 - Greenfoot.getRandomNumber(120);
             background.setColorAt(x, y, new Color(color,color,color));
        }
    }
}