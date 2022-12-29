//open launcher.java
void draw(ShapeRenderer shapeRenderer) {
    shapeRenderer.begin(ShapeType.Filled);
    shapeRenderer.setColor(Color.YELLOW);
	shapeRenderer.triangle(300,250,150,150,320,320);
	
	shapeRenderer.setColor(Color.PINK);
	shapeRenderer.triangle(200,150,50,50,220,220);
	
	shapeRenderer.setColor(Color.GREEN);
	shapeRenderer.triangle(350,300,400,400,450,450);
	
	shapeRenderer.setColor(Color.RED);
	shapeRenderer.triangle(100,390,70,100,530,100);
	shapeRenderer.end();
}

	
launch();