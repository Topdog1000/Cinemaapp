package com.example.cinemaapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.time.LocalTime;
import java.util.Random;

public class MovieOverviewController {

    @FXML
    private ListView<String> lvMovies;

    @FXML
    private Label lblResult;

    @FXML
    private Button btnPrint;

    @FXML
    void btnPrint(ActionEvent event) {
        Random rand = new Random(); //instance of random class
        int upperbound = 100;
        //generate random values from 1-100
        int int_random = rand.nextInt(upperbound) + 1;
        LocalTime time = LocalTime.now();
        String selectedItem = lvMovies.getSelectionModel().getSelectedItem();
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        for (Movies movie: MainApp.listOfMovies) {
            System.out.println(movie.getTitle());
            if (movie.getTitle().contains(selectedItem)){
                a.setContentText("Title: "+movie.getTitle()+"\n Seat Number:  "+int_random+ "\n Time:\t"+ time);

            }else{
                continue;
            }
        }
        a.showAndWait();
    }
    @FXML
    void lvMovies(MouseEvent event) {
        String selectedItem = lvMovies.getSelectionModel().getSelectedItem();
        System.out.println(selectedItem);
        for (Movies movie: MainApp.listOfMovies) {
            System.out.println(movie.getTitle());
            if (movie.getTitle().contains(selectedItem)){
                lblResult.setText("Title:  "+movie.getTitle()+ "  \n Director:  "+movie.getDirector() + " \n Producer:  "+movie.getProducer() + " \n Release Date:  "+movie.getReleaseDate() + " \n Ticket Prize:  €"+movie.getTicketNumber());

            }else{
                continue;
            }
        }

    }
    @FXML
    private Button btnLoad;

    @FXML
    void btnLoad(ActionEvent event) {
        lvMovies.getItems().clear();
        for (Movies movie: MainApp.listOfMovies) {
            lvMovies.getItems().add(movie.getTitle());
            System.out.println(movie.getTitle());
        }
    }
}
