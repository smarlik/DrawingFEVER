//dependency com.badlogicgames.gdx:gdx-platform:jar:natives-desktop:1.9.14
//dependency com.badlogicgames.gdx:gdx:1.9.14
//dependency com.badlogicgames.gdx:gdx-backend-lwjgl:1.9.14

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Launcher extends ApplicationAdapter {
    ShapeRenderer shapeRenderer;

    @Override
    public void create () {
        shapeRenderer = new ShapeRenderer();
    }

    @Override
    public void render () {
        Gdx.gl.glClearColor(.25f, .25f, .25f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        draw(shapeRenderer);
        shapeRenderer.end();
    }
	
    @Override
    public void dispose () {
        shapeRenderer.dispose();
    }
}

LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
new LwjglApplication(new Launcher(), config);
read();