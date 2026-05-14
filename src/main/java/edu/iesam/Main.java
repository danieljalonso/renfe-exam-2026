package edu.iesam;

import edu.iesam.features.presentation.TrainView;

public class Main {
    public static void main(String[] args) {

        TrainView trainView = new TrainView();

        // Funcion 1
        System.out.println("--------------------------Funcion 1--------------------------");
        System.out.println(trainView.getTrains());
        trainView.addTrain();
        System.out.println(trainView.getTrains());

        // Funcion 2
        System.out.println("--------------------------Funcion 2--------------------------");
        System.out.println(trainView.getTrains());

        // Funcion 3
        System.out.println("--------------------------Funcion 3--------------------------");
        System.out.println(trainView.getTrains());
        trainView.deleteTrain("MD5-001");
        System.out.println(trainView.getTrains());

    }
}