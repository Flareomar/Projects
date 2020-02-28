/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids2;


import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.layout.HBox;
import static javafx.scene.paint.Color.WHITE;

/**
 *
 * @author s201120924
 */
public class JavaFXAnimation2 extends Application {

    
    private final Integer timer = 10;
    private Integer seconds = 0;
    private Label label;
    private int playerAngle = 90;
     private boolean L;
    private boolean R;
    private boolean Forward;
    
 

    public static final int SCENE_WIDTH = 1000;
    public static final int SCENE_HEIGHT = 1000;
    public static final int BALL_RADIUS = 12;

    private int numAsteroids = 20;
    private double[] deltaX = new double[numAsteroids];
    private double[] deltaY = new double[numAsteroids];
    private Circle[] Asteroids = new Circle[numAsteroids];
    private Random rand = new Random();
public double deltaX5, deltaY5, playerAngleRadians;

    @Override
    public void start(Stage primaryStage) {
        
        
        //Creates our player/ship
        Polygon player = new Polygon(25, 75, 50, 1, 75, 75, 50, 50);
        player.setFill(Color.WHITE);
        player.setStroke(Color.DIMGREY);
        Group root = new Group();
        Group root1 = new Group();
        
       
        //Creates a stage
        Stage stage1 = new Stage();
        
        //Coordinates for timer/score
        label = new Label();
        label.setFont(Font.font(23));
        label.setTextFill(WHITE);
        HBox layout = new HBox(10);
        layout.getChildren().add(label);
        doTime();
  
        
        
        //JavaFX component to display the image. 
        //can be manipulated very similarly to a rectangle. 
       
        
        //scale width and height proportionally
       
        root.getChildren().add(player);
         root.getChildren().add(layout);
        Scene scene = new Scene(root, 1000, 1000);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                
                //Moves player left
                if (event.getCode() == KeyCode.LEFT) {
                    //rotate counter-clockwise by one degree
                    
                    L = true;
                  
                    
                  //Moves player right
                } else if (event.getCode() == KeyCode.RIGHT) {
                    //rotate clockwise by one degree
                    R = true;
                
                    
                  //Moves player up
                } else if (event.getCode() == KeyCode.UP) {
                    Forward = true;

                }
            }
        });
            //Creates timeline for our player
            Timeline PlayerTimeline = new Timeline(new KeyFrame(Duration.millis(15),new EventHandler<ActionEvent>(){
             @Override
                    public void handle(ActionEvent event){
                    player.setTranslateX(player.getTranslateX() + deltaX5);
                    player.setTranslateY(player.getTranslateY() + deltaY5);    
                    playerAngleRadians = (playerAngle / 180.0) * Math.PI; 
                    
                    if (L == true){
                        player.setRotate(player.getRotate() - 3);
                        playerAngle++;
                    }
                    if (R== true){
                         player.setRotate(player.getRotate() + 3);
                        playerAngle--;
                    }
                    if(Forward == true){
                     deltaX5 = -Math.cos(3*playerAngleRadians) * 5;
                     deltaY5 = Math.sin(3*playerAngleRadians) * 5;
                    }
                       
                    }
            }));
            PlayerTimeline.setCycleCount(Timeline.INDEFINITE);
            PlayerTimeline.play();
            
            
            scene.setOnKeyReleased(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent event){
                
                //Moves the player left
                if (event.getCode() == KeyCode.LEFT) {
                    //rotate counter-clockwise by one degree
                    L = false;
                  //Moves player right
                } else if (event.getCode() == KeyCode.RIGHT) {
                  
                    R = false;
                  
                    
                  //Moves player up
                } else if (event.getCode() == KeyCode.UP) {
                    Forward = false;
                    deltaX5 = 0;
                    deltaY5 = 0;           
                
            }
    }});

        
      
        

        //Creates the Asteroids
        for (int i = 0; i < Asteroids.length; i++) {
            //randomize the starting coordinates of each ball
            int x = rand.nextInt(SCENE_WIDTH - 2 * BALL_RADIUS) + BALL_RADIUS;
            int y = rand.nextInt(SCENE_HEIGHT - 2 * BALL_RADIUS) + BALL_RADIUS;

            //Asteroids characteristics such as colour and size
            Asteroids[i] = new Circle(x, y, BALL_RADIUS);
            Asteroids[i].setFill(Color.DARKGRAY);
            Asteroids[i].setStroke(Color.GREY);
           Asteroids[i].setStrokeWidth(2);

            //randomize each Asteroid direction
            deltaX[i] = rand.nextDouble() * 4;
            deltaY[i] = rand.nextDouble() * 4;

            root.getChildren().add(Asteroids[i]);
        }

        //use a timeline to animate the Asteroid
        //the handle code gets executed every 20 milliseconds
        Timeline bouncingTimeline = new Timeline(new KeyFrame(Duration.millis(20), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                //move the Asteroids in whatever direction it's heading. 
                    for (int i = 0; i < Asteroids.length; i++) {
                    Asteroids[i].setCenterX(Asteroids[i].getCenterX() + deltaX[i]);
                    Asteroids[i].setCenterY(Asteroids[i].getCenterY() + deltaY[i]);

                    //Code executed when the asteroids colide with the player
                    if (hasCollided(Asteroids[i], player)) {
                        Text te1 = new Text("Game Over!");
                        Text te2 = new Text("Try Again!");
                        te1.setX(38);
                        te1.setY(400);
                        te2.setX(120);
                        te2.setY(620);
                        te1.setFont(new Font(180));
                        te1.setFill(Color.WHITE);
                        te2.setFont(new Font(180));
                        te2.setFill(Color.WHITE);
                        //Red colour background after you lose
                      
                        //This will remove the player/ship after it collides
                        root.getChildren().remove(Asteroids[i]);
                        root.getChildren().remove(player);
                       
                         
                         //Add text on screen
                          root.getChildren().add(te1);
                          root.getChildren().add(te2);
                          //This will close the scene automatically after 2 seconds
                         new Timer().schedule(new TimerTask() {
                         public void run () { System.exit(0); }
                            }, 2000); 

                    }

                    //if the Asteroid is on the left or right wall
                    if (Asteroids[i].getCenterX() + Asteroids[i].getRadius() >= SCENE_WIDTH || Asteroids[i].getCenterX() - Asteroids[i].getRadius() <= 0) {
                        deltaX[i] = -deltaX[i]; //bounce in the x direction
                    }
                    //if the Asteroid is on the top or bottom wall
                    if (Asteroids[i].getCenterY() + Asteroids[i].getRadius() >= SCENE_HEIGHT || Asteroids[i].getCenterY() - Asteroids[i].getRadius() <= 0) {
                        deltaY[i] = -deltaY[i];
                    }

                    //check if this Asteroid has collided with any of the other Asteroids
                    for (int j = i + 1; j < Asteroids.length; j++) {
                        if (hasCollided(Asteroids[i], Asteroids[j])) {
                            deltaX[i] = -deltaX[i];
                            deltaY[i] = -deltaY[i];
                            deltaX[j] = -deltaX[j];
                            deltaY[j] = -deltaY[j];

                        }
                    }
                }
            }
        }
        ));
        
        

        //make the code run indefinately. 
        bouncingTimeline.setCycleCount(Timeline.INDEFINITE);
        //plays the timeline
        bouncingTimeline.play();
        //Displays the stage
        primaryStage.setTitle("Asteroids Game!");
        primaryStage.setScene(scene);
        scene.setFill(Color.BLACK);
  
        primaryStage.show();
    }
    //Collision detector for asteroids
    private boolean hasCollided(Circle a, Circle b) {
        //calculate the distance between the centers
        double dist = Math.sqrt(Math.pow(a.getCenterX() - b.getCenterX(), 2) + Math.pow(a.getCenterY() - b.getCenterY(), 2));
        double rads = a.getRadius() + b.getRadius();

        //if the distance between the centers is less than the 2 radius
        //they have collided. 
        return dist < rads;
    }
    //Collision detector for asteroids and player
    private boolean hasCollided(Circle a, Polygon p) {
        //calculate the distance between the centers
        return p.getBoundsInParent().intersects(a.getBoundsInParent());

    }
    

    /**
     * @param args the command line arguments
     */
    //Code for the timer to work properly and infinitely
    public void doTime() {
        Timeline time = new Timeline();
        time.setCycleCount(Timeline.INDEFINITE);
        KeyFrame fram = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent event) {
                seconds++;
                label.setText("Timer: " + seconds);
            }
        });
    time.getKeyFrames().add(fram);
    time.playFromStart();
    
        
    }

}


