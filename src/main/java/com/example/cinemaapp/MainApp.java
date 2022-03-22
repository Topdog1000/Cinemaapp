package com.example.cinemaapp;

//import libraries
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    static ObservableList<Movies> listOfMovies = FXCollections.observableArrayList();

    @Override
    public void start(Stage stage) throws IOException {
        //Add movies in list
        listOfMovies.add(new Movies("Jokker", "Karl Kermes", "Maris Savik","13-12-2021","20"));
        listOfMovies.add(new Movies("Spider Man", "Peter Parker", "Jamie Foxx","26-05-2005","15"));
        listOfMovies.add(new Movies("Romeo and Juliet", "Baz Luhrmann", "Gabriella Martin","27-10-1996","10"));
        listOfMovies.add(new Movies("Titanic", "James Cameron", "Jon Landau","01-11-1997","13"));
        listOfMovies.add(new Movies("No Time to Die", "James Bond", "Michael Wilson","30-09-2021","25"));
        listOfMovies.add(new Movies("Harry Potter", "Terrence Bayler", "Maggie Smith","16-11-2001","12"));
        listOfMovies.add(new Movies("Avengers: End Game", "Tony Stark", "Samuel L. Jackson","24-04-2019","17"));
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("CinemaApp.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("List Of Movies");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}