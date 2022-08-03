//open ../launcher.java
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

TextureRegion fly;
Texture flytx;

int w;
int h;

int kx=200;
float r=0;
boolean n=false;

void initialize() {
	flytx = new Texture("fly2.0.png");
	fly = new TextureRegion(flytx);
	w= fly.getRegionWidth();
	h=fly.getRegionHeight();
}

void draw(ShapeRenderer shapeRenderer) {
	SpriteBatch batch = new SpriteBatch();
	batch.begin();
	batch.draw(fly,kx,300,w/2,h/2, w, h, 1, 1, r);
	batch.end();
	if(kx==500) {
		n=true;
	}
	if(kx==60) {
		n=false;
	}
	if(n==true) {
		r=90;
		kx=kx-4;
		
	}else {
		r=0;
		kx=kx+4;
	}
	shapeRenderer.end();	
}

launch();