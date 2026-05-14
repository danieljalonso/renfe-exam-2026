package edu.iesam.features.mock;

import edu.iesam.features.domain.Train;
import edu.iesam.features.domain.TrainRepository;

import java.util.List;

public class NullMockRepository implements TrainRepository {


    @Override
    public void addTrain(Train train) {

    }

    @Override
    public List<Train> getTrains() {
        return null;
    }

    @Override
    public void deleteTrain(String id) {

    }
}
