package com.mycompany.proyectospace;

import javafx.animation.KeyFrame;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.util.Duration;
import java.util.Random;



public class App extends Application {
        
        final short SCENE_TAM_X = 960;
        short scene_tam_y = 600;
        byte spacespeedY = 0;
        byte spacespeedX = 0;
        short spaceship_posx = 470;
        short spaceship_posy = 500;
        int asteroid_posx = 0;
        short asteroid_posy = -10;
        short asteroid_widht = 50;
        short asteroid_height = 50;
        short background1_y = 0;
        short background2_y = -600;
        short backgroundspeed = 2;
        short velocidad_disparo = 0;
        short disparo_posx = 470;
        short disparo_posy = 500;
 
        
    @Override
    public void start(Stage primaryStage) {
      


        // Añadir el grupo al contenedor principal
        Pane root = new Pane();
        
        // Crear y mostrar el escenario
        Scene scene = new Scene(root, SCENE_TAM_X, scene_tam_y);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // Declarar el objeto random
        Random random = new Random();
        
        // Cargar la imagen crear objeto ImageView
        Image img = new Image(getClass().getResourceAsStream("/images/backgroundSpace.jpeg"));
        ImageView imgView = new ImageView(img);
        root.getChildren().add(imgView);
        imgView.setFitWidth(SCENE_TAM_X);
        imgView.setFitHeight(scene_tam_y);
        imgView.setY(background1_y);
        
        Image img2 = new Image(getClass().getResourceAsStream("/images/backgroundSpace.jpeg"));
        ImageView imgView2 = new ImageView(img2);
        root.getChildren().add(imgView2);
        imgView2.setFitWidth(SCENE_TAM_X);
        imgView2.setFitHeight(scene_tam_y);
        imgView2.setY(background2_y);
        
        Image img3 = new Image(getClass().getResourceAsStream("/images/Asteroid Brown.png"));
        ImageView imgView3 = new ImageView(img3);
        root.getChildren().add(imgView3);
        imgView3.setFitWidth(asteroid_widht);
        imgView3.setFitHeight(asteroid_height);
        imgView3.setX(asteroid_posx);
        imgView3.setY(asteroid_posy);
         
        
        /* --- DIBUJO DE LA NAVE --- */
        // Elementos de la nave
        Rectangle rectangleCuerpoNave = new Rectangle(0, 0, 30, 60);
        Rectangle rectanglePropulsor = new Rectangle(10, -10, 10, 80);
        Rectangle rectangleMotorIzq = new Rectangle(-10, 30, 10, 20);
        Rectangle rectangleMotorIzqCentro = new Rectangle(-20, 20, 10, 40);
        Rectangle rectangleMotorIzqCentroIzq = new Rectangle(-40, 30, 20, 30);
        Rectangle rectangleMotorDer = new Rectangle(30, 30, 10, 20);
        Rectangle rectangleMotorDerCentro = new Rectangle(40, 20, 10, 40);
        Rectangle rectangleMotorDerCentroDer = new Rectangle(50, 30, 20, 30);
        Rectangle rectangleMotorIzqFuego = new Rectangle(-40, 60, 30, 10);
        Rectangle rectangleMotorIzqFuegoAmarillo = new Rectangle(-40, 70, 20, 10);
        Rectangle rectangleMotorIzqFuegoRojo = new Rectangle(-40, 80, 10, 10);
        Rectangle rectangleMotorDerFuego = new Rectangle(40, 60, 30, 10);
        Rectangle rectangleMotorDerFuegoAmarillo = new Rectangle(50, 70, 20, 10);
        Rectangle rectangleMotorDerFuegoRojo = new Rectangle(60, 80, 10, 10);
        Circle circleVentanaCohete = new Circle(15, 13, 9);
        Circle circleDisparo = new Circle (-15, 25, 5);
        Circle circleDisparo2 = new Circle (45, 25, 5);
        
        
        
        // Colorear cada elemento
        rectangleCuerpoNave.setFill(Color.WHITE);
        rectanglePropulsor.setFill(Color.WHITE);
        rectangleMotorIzq.setFill(Color.WHITE);
        rectangleMotorIzqCentro.setFill(Color.WHITE);
        rectangleMotorIzqCentroIzq.setFill(Color.WHITE);
        rectangleMotorDer.setFill(Color.WHITE);
        rectangleMotorDerCentro.setFill(Color.WHITE);
        rectangleMotorDerCentroDer.setFill(Color.WHITE);
        rectangleMotorIzqFuego.setFill(Color.ORANGE);
        rectangleMotorIzqFuegoAmarillo.setFill(Color.YELLOW);
        rectangleMotorIzqFuegoRojo.setFill(Color.RED);
        rectangleMotorDerFuego.setFill(Color.ORANGE);
        rectangleMotorDerFuegoAmarillo.setFill(Color.YELLOW);
        rectangleMotorDerFuegoRojo.setFill(Color.RED);
        circleVentanaCohete.setFill(Color.AQUA);
        circleDisparo.setFill(Color.ORANGE);
        circleDisparo2.setFill(Color.ORANGE);
        
        // Agrupar todos los elementos
        Group groupSpaceShip = new Group();
        groupSpaceShip.getChildren().add(rectangleCuerpoNave);
        groupSpaceShip.getChildren().add(rectanglePropulsor);
        groupSpaceShip.getChildren().add(rectangleMotorIzq);
        groupSpaceShip.getChildren().add(rectangleMotorIzqCentro);
        groupSpaceShip.getChildren().add(rectangleMotorIzqCentroIzq);
        groupSpaceShip.getChildren().add(rectangleMotorDer);
        groupSpaceShip.getChildren().add(rectangleMotorDerCentro);
        groupSpaceShip.getChildren().add(rectangleMotorDerCentroDer); 
        groupSpaceShip.getChildren().add(rectangleMotorIzqFuego);
        groupSpaceShip.getChildren().add(rectangleMotorIzqFuegoAmarillo);
        groupSpaceShip.getChildren().add(rectangleMotorIzqFuegoRojo);
        groupSpaceShip.getChildren().add(rectangleMotorDerFuego);
        groupSpaceShip.getChildren().add(rectangleMotorDerFuegoAmarillo);
        groupSpaceShip.getChildren().add(rectangleMotorDerFuegoRojo);
        groupSpaceShip.getChildren().add(circleVentanaCohete);
        root.getChildren().add(groupSpaceShip);
        Group groupDisparo = new Group();
        groupDisparo.getChildren().add(circleDisparo);
        groupDisparo.getChildren().add(circleDisparo2);
        root.getChildren().add(groupDisparo);
        
        
        
           
    
            scene.setOnKeyPressed((KeyEvent event) -> {
                switch(event.getCode()) {
                    case UP:
                        spacespeedY = -6;
                        break;
                    case DOWN:
                        spacespeedY = 6;
                        break;
                    case LEFT:
                        spacespeedX = -6;
                        break;
                    case RIGHT:
                        spacespeedX = 6;
                        break;
                    case SPACE:
                        velocidad_disparo = 6;
                        break;
                        
                }
            });
            scene.setOnKeyReleased((KeyEvent event) -> {
                spacespeedX = 0;
                spacespeedY = 0;
                velocidad_disparo = 0;
            });
            Timeline timeline;
            timeline = new Timeline (
                    new KeyFrame(Duration.seconds(0.017), (ActionEvent ae) -> {
                        imgView3.setY(asteroid_posy);
                        imgView3.setX(asteroid_posx);
                        asteroid_posy+=3;
                        //System.out.println(asteroid_posy);
                        if(asteroid_posy >= 600) {
                            asteroid_posy = -10;
                            asteroid_posx = random.nextInt(SCENE_TAM_X);
                            System.out.println("Posición del asteroide:" + asteroid_posx);
                        }
                        
                        spaceship_posy += spacespeedY;
                        if(spaceship_posy < 10){
                            spaceship_posy = 10;
                        } else {
                            if(spaceship_posy > 505) {
                                spaceship_posy = 505;
                            }
                        }
                        if(spaceship_posx < 45) {
                            spaceship_posx = 45;
                        } else {
                            if(spaceship_posx > 885) {
                                spaceship_posx = 885;
                            }
                        }
                        
                        background1_y += backgroundspeed;
                        imgView.setY(background1_y);
                        background2_y += backgroundspeed;
                        imgView2.setY(background2_y);
                        
                        if (background1_y == 600) {
                            background1_y = -600;
                        }
                        if (background2_y == 600) {
                            background2_y = -600;
                        }
                        
                        
                        spaceship_posx += spacespeedX;
                        groupSpaceShip.setLayoutX(spaceship_posx);
                        groupSpaceShip.setLayoutY(spaceship_posy);
                        disparo_posy -= velocidad_disparo;
                        groupDisparo.setLayoutX(disparo_posx);
                        groupDisparo.setLayoutY(disparo_posy);
                        if(disparo_posy <= -100) {
                            disparo_posy = 500;
                        }
                        
                    })
            );
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.play();
    }
    public static void main(String[] args) {
        launch();
    }
}