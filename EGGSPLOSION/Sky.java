import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)


public class Sky extends World
{
    private static int frames = 0;
    
    /**
     * Create the space world with black background and stars.
     */
    public Sky() 
    {
        super(800, 600, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLUE);
        background.fill();
        
       
    }
    
    
    public void act() 
    {
        dropEgg();
        
        
        //add some frames
        frames = frames + 1;
        }
        
    private void dropEgg()
    {
        if (frames % 100 == 0) 
        {
            addObject(new Egg(), Greenfoot.getRandomNumber(800),0);
        }
    }
    }

