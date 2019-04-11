import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)


public class Sky extends World
{
    private static int frames = 0;
    private int timeRemaining;
    private FryingPan theFryingPan;
    /**
     * Create the space world with black background and stars.
     */
    public Sky() 
    {
        super(800, 600, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLUE);
        background.fill();
        
        theFryingPan = new FryingPan();
        this.addObject(theFryingPan, 400, 555);
       
    }
    
    
    public void act() 
    {
        dropEgg();
        
        
        //add some frames
        frames = frames + 1;
        }
        
    private void dropEgg()
    {
        if (frames % 20 == 0) 
        {
            addObject(new Egg(), Greenfoot.getRandomNumber(800),0);
        }
    }
    
    private void dropEggDown()
    {
       if (frames % 20 == 0) 
        {
            addObject(new Egg(), Greenfoot.getRandomNumber(800),0);
        }
    }
    private void showTimeRemaining()
    {
        if ((frames % 60) == 0)
        {
            String timeRemaining = Integer.toString(frames / 60);
            showText("time remaining:" + timeRemaining ,700,15);
            if (frames / 60 == 20)
            {
                Greenfoot.stop();
            }
        }
    }
    private void trackTime()
    {
        // Track frames (fps is about 60)
        frames += 1;

        // Every second (roughly) reduce the time left
        if (frames % 60 == 0)
        {
            timeRemaining -= 1;
            showTimeRemaining();
        }
    }
    public void start()
    {
        frames = 0;
    }
    
    public FryingPan getFryingPan()
    {
        return theFryingPan;
    }
}

