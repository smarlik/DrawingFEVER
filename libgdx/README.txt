The launcher, stored in launcher.java, helps confingure and run libgdx and it also calls draw() for every new frame.

You can interact with libgdx ONLY in initialize() and draw(). If you do it in global space you'll get a null pointer exception. This is because libgdx doesnt exist at that time and is created only during initialize().

initialize()
You can redefine this function if you want to do something before draw's loop will start.       
The cycle is initialize, draw, draw, draw,…. 

draw()
draw runs 32 fps. All logic for drawing anything should be in draw. 

 