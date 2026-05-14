package edu.iesam.features.mock;

import edu.iesam.features.domain.Train;
import edu.iesam.features.domain.TrainRepository;

import java.util.ArrayList;
import java.util.List;

public class EmptyMockRepository implements TrainRepository {


    @Override
    public void addTrain(Train train) {

    }

    @Override
    public List<Train> getTrains() {
        List<Train> trains = new ArrayList<>();
        return trains;
    }

    @Override
    public void deleteTrain(String id) {

    }
}
