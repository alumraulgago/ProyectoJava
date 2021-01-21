package com.mycompany.proyectospace;

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



public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Añadir el grupo al contenedor principal
        Pane root = new Pane();
        
        // Crear y mostrar el escenario
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // Cargar la imagen crear objeto ImageView
        Image img = new Image(getClass().getResourceAsStream("/images/Background-1.png"));
        ImageView imgView = new ImageView(img);
        root.getChildren().add(imgView);
        imgView.setFitWidth(600);
        imgView.setFitHeight(400);
        
        // Elementos del personaje
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
        
        // Posicionar el grupo en la pantalla
        groupSpaceShip.setLayoutX(270);
        groupSpaceShip.setLayoutY(300);
           
    }
    

    public static void main(String[] args) {
        launch();
    }

}