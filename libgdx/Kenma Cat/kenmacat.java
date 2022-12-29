//open ../launcher.java
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
Texture fatTxt;
Texture skinnyTxt;
Texture bowlTxt;
void initialize() {
	fatTxt = new Texture("fatcat3.png");
	skinnyTxt = new Texture("skinnycat2.png");
	bowlTxt = new Texture("bowl.png");
}
	
class Cat{
	boolean isFat=false;
	boolean isMean=true;
	boolean isStupid= true;
	String name= "Default";
	boolean isBald=false;
	
	void feed(int calories) {
		if(calories>1000) {
			isFat=true;
		}
	}
	void print() {
		printf("\n is fat="+isFat);
		printf("\n is mean="+isMean);
		printf("\n is stupid="+isStupid);
		printf("\n name ="+name);
		printf("\n is bald="+isBald);
	}

}
Cat jiji= new Cat();
printf(" Give me the number of calories you want the cat to eat ");
int c= readInt();
jiji.feed(c);
jiji.print();


void draw(ShapeRenderer shapeRenderer) {
    shapeRenderer.begin(ShapeType.Filled);
    shapeRenderer.setColor(0, 1, 0, 1);
	shapeRenderer.end();
	
	SpriteBatch batch = new SpriteBatch();
	batch.begin();
	batch.draw(bowlTxt,250,50);
	
	if(jiji.isFat==false) {
		batch.draw(skinnyTxt,10,10);			
	}else{
		batch.draw(fatTxt,10,10);		
	}
	batch.end();
}

launch();

