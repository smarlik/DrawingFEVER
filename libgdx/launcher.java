// The launcher helps confingure and run libgdx and it will also call draw for every new frame.

//dependency com.badlogicgames.gdx:gdx-platform:jar:natives-desktop:1.9.14
//dependency com.badlogicgames.gdx:gdx:1.9.14
//dependency com.badlogicgames.gdx:gdx-backend-lwjgl:1.9.14

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.glutils.*;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.*;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.utils.viewport.*;
import com.badlogic.gdx.utils.*;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

void initialize() {}

public class Launcher extends ApplicationAdapter {
    ShapeRenderer shapeRenderer;

    @Override
    public void create () {
        shapeRenderer = new ShapeRenderer();
        initialize();
    }

    @Override
    public void render () {
        // Using stage for proper conversion of coordinates to the
        // window coordinates (not screen)
        var stage = new Stage(new ScreenViewport());
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glClearColor(.25f, .25f, .25f, 1);
        draw(shapeRenderer);
    }
	
    @Override
    public void dispose () {
        shapeRenderer.dispose();
    }
}

void launch() {
    LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
    new LwjglApplication(new Launcher(), config);
    printf("Press Enter to exit...\n");
    cli.waitPressEnter();
}
