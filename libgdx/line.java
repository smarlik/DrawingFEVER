void draw(ShapeRenderer shapeRenderer) {
    shapeRenderer.begin(ShapeType.Filled);
    shapeRenderer.setColor(0, 1, 0, 1);
    shapeRenderer.line(200, 100, 0, 0);
    shapeRenderer.end();
}

//open launcher.java