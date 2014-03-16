package reactive;

import java.nio.IntBuffer;
import java.util.Random;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.PixelFormat;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import reactive.Core;

/*
 * Have thread updating an image (WritablePixelFormat?).
 * Have render loop draw the latest image at 60 FPS
 * Synchronization without starvation?
 * Possible to pause image updates until the new frame has rendered?
 * JavaFX event for frame complete?
 * 
 * Idea:  Have the thread updating the image do a wait() on a monitor
 * (e.g. the image's).  In the lambda passed to Platform.runLater(), have a 
 * notify() called on the monitor after the show()
 */
public class Reactive extends Application {
    private static final int CANVAS_X = 600;
    private static final int CANVAS_Y = 600;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Canvas canvas = new Canvas(CANVAS_X, CANVAS_Y);
        GraphicsContext canvasGC = canvas.getGraphicsContext2D();
        
        primaryStage.setTitle("Reactive");
        root.getChildren().add(canvas);
        
        canvasGC.fillText("Hello java", 20, 20);
        canvasGC.fillText(Core.hello(), 20, 40);
        
        primaryStage.setScene(new Scene(root));
        
        primaryStage.show();
    }
}