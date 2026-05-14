package edu.iesam.features.mock;

import edu.iesam.features.domain.Train;
import edu.iesam.features.domain.TrainRepository;

import java.util.ArrayList;
import java.util.List;

public class TrainMockRepository implements TrainRepository {

    public Integer addCountTrain = 0;
    public Integer deleteCountTrain = 0;

    @Override
    public void addTrain(Train train) {
        addCountTrain++;
    }

    @Override
    public List<Train> getTrains() {
        List<Train> trains = new ArrayList<>();
        trains.add(new Train("MD5-001", "Red", "250", "60"));
        trains.add(new Train("MD5-002", "Red", "250", "60"));
        trains.add(new Train("MD5-003", "Red", "250", "60"));
        return trains;
    }

    @Override
    public void deleteTrain(String id) {
        deleteCountTrain++;
    }
}
