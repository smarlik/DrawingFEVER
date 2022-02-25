// This program draws a smile. I got the idea for this program from the new edition of beanz!S

void draw(ShapeRenderer shapeRenderer) {

	int y= rand(300);
	int x= rand(500);
	int r= rand(50);
	drawsmile (shapeRenderer,r,x,y);
	sleep(250);
}

void drawsmile(ShapeRenderer shapeRenderer ,int r, int x, int y) {
	
    shapeRenderer.begin(ShapeType.Filled);
    shapeRenderer.setColor(Color.YELLOW);
    shapeRenderer.circle(x,y,r);
	
	// ed= eye distance
	int ed= r/10 * 7;
	
	shapeRenderer.setColor(Color.BLACK);
    shapeRenderer.circle(x-ed/2,y+r*0.3F,r/8);
	
	shapeRenderer.setColor(Color.BLACK);
    shapeRenderer.circle(x+ed/2,y+r*0.3F,r/8);
	
	shapeRenderer.setColor(Color.RED);
	shapeRenderer.arc(x*0.999F, y+r*0.01F, r*0.9F, 180, 180);
	
	shapeRenderer.end();

}

//open launcher.java