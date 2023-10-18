import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Flappybird(), 100, 200);
        addObject(new Pipe(), 300, 150);
        addObject(new Pipe(), 600, 150);
        addObject(new Score(), 300, 100);
    }
}
