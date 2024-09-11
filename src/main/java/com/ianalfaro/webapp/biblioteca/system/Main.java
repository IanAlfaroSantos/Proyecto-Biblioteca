package com.ianalfaro.webapp.biblioteca.system;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.ianalfaro.webapp.biblioteca.BibliotecaApplication;
import com.ianalfaro.webapp.biblioteca.controller.FXController.IndexController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    //Atributos
    private ConfigurableApplicationContext applicationContext;
    private Stage stage;
    private Scene scene;

    //Se ejecuta cada vez que yo instancie la clase MAIN
    @Override
    public void init(){
        this.applicationContext = new SpringApplicationBuilder(BibliotecaApplication.class).run();
    }

    //Se ejecuta al iniciar la aplicacion javaFX
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        stage.setTitle("Biblioteca Springboot");
        //carga de la ecena principal
        indexView();
        stage.show();
    }

    //Metodo para cambiar la escena del stage
    public Initializable cambiarEscena(String fxmlName, int width, int height) throws IOException {
        Initializable initializable = null;
        FXMLLoader loader = new FXMLLoader();

        loader.setControllerFactory(applicationContext::getBean);
        InputStream archivo = Main.class.getResourceAsStream("/templates/" + fxmlName);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(Main.class.getResource("/templates/" + fxmlName));

        scene = new Scene((AnchorPane)loader.load(archivo), width, height);
        stage.setScene(scene);
        stage.sizeToScene();

        initializable = (Initializable)loader.getController();

        return initializable;
    }

    //Metodo para mostrar el Main o el Index
    public void indexView(){
        try {
            IndexController indexView = (IndexController)cambiarEscena("Index.fxml", 600, 400);
            indexView.setStage(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
