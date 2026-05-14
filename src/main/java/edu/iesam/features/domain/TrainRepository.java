package edu.iesam.features.domain;

import java.util.List;

public interface TrainRepository {

    void addTrain(Train train);
    List<Train> getTrains();

}
