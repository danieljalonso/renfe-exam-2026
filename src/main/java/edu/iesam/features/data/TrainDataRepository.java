package edu.iesam.features.data;

import edu.iesam.features.domain.Train;
import edu.iesam.features.domain.TrainRepository;

public class TrainDataRepository implements TrainRepository {

    TrainMemLocalDataSource trainMemLocalDataSource;

    public TrainDataRepository(TrainMemLocalDataSource trainMemLocalDataSource) {
        this.trainMemLocalDataSource = trainMemLocalDataSource;
    }

    @Override
    public void addTrain(Train train) {
        trainMemLocalDataSource.save(train);
    }
}
