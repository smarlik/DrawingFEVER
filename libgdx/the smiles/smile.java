// This program draws a smile. I got the idea for this program from the new edition of beanz!S
//open ../launcher.java
void draw(ShapeRenderer shapeRenderer) {
drawsmile(shapeRenderer);

}


void drawsmile(ShapeRenderer shapeRenderer) {
	
    shapeRenderer.begin(ShapeType.Filled);
    shapeRenderer.setColor(Color.YELLOW);
    shapeRenderer.circle(400,300,150);
	
	shapeRenderer.setColor(Color.BLACK);
    shapeRenderer.circle(330,300,25);
	
	shapeRenderer.setColor(Color.BLACK);
    shapeRenderer.circle(470,300,25);
	
	shapeRenderer.setColor(Color.RED);
	shapeRenderer.arc(400, 250, 75, 180, 180);
	
	
	shapeRenderer.end();

}

launch();