/**
 * This launcher creates a window with canvas and then
 * calls draw method passing GraphicsContext to it.
 *
 * To use this launcher:
 * - define draw method
 * - /open this launcher at the end of your script
 *
 */
//dependency org.openjfx:javafx-controls:11
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.canvas.*;

public class Launcher extends Application 
{
    public static void main(String[] args) 
    {
        launch(args);
    }
 
    public void start(Stage stage) 
    {
        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);

        Canvas canvas = new Canvas(600, 400);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setLineWidth(2);
        stage.show();

        ForkJoinPool.commonPool().submit(() -> draw(gc));
    }
}

// runs the application
Launcher.main(null);

