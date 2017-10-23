/**
 * Created by Tommy on 22.10.2017.
 */

import javafx.application.*;
import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Breakout extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, 640, 480);

        //Hintergrund
        Image bgPic = new Image("BG_temp.jpg");
        ImageView imageViewer = new ImageView(bgPic);

        //Plattform creation
        Rectangle plattform = new Rectangle();
        plattform.setWidth(150);
        plattform.setHeight(30);
        plattform.setArcWidth(40d);
        plattform.setArcHeight(40d);
        plattform.setFill(Color.GREY);
        plattform.setLayoutX((plattform.getWidth() / 2) - plattform.getWidth());
        plattform.setLayoutY((plattform.getHeight() / 2) - plattform.getHeight());
        plattform.setX(scene.getWidth()/2);
        plattform.setY(scene.getHeight()*0.9);

        Light.Distant light = new Light.Distant();
        light.setAzimuth(-135.00);
        Lighting lighting = new Lighting();
        lighting.setLight(light);
        lighting.setSurfaceScale(5.0);
        plattform.setEffect(lighting);
        //DropShadow schatten = new DropShadow(50.0, 0.0, 0.0, Color.BLACK);
        //plattform.setEffect(schatten);


        //Transform Plattform


        //Brick
        Rectangle brick = new Rectangle();
        brick.setWidth(60);
        brick.setHeight(20);
        brick.setArcWidth(10d);
        brick.setArcHeight(10d);
        brick.setFill(Color.GREY);
        brick.setLayoutX((brick.getWidth() / 2) - brick.getWidth());
        brick.setLayoutY((brick.getHeight() / 2) - brick.getHeight());
        brick.setX(50);
        brick.setY(50);
        brick.setEffect(lighting);


        root.getChildren().add(imageViewer);
        root.getChildren().add(plattform);
        root.getChildren().add(brick);
        primaryStage.setTitle("BREAKOUT");
        primaryStage.setScene(scene);
        primaryStage.show();

    }




    public static void main(String[] args) {
        launch(args);
    }
}