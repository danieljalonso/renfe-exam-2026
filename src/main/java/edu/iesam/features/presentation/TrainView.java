package edu.iesam.features.presentation;

import edu.iesam.features.data.TrainDataRepository;
import edu.iesam.features.data.TrainMemLocalDataSource;
import edu.iesam.features.domain.AddTrainUseCase;
import edu.iesam.features.domain.Train;

public class TrainView {

    public void addTrain() {
        AddTrainUseCase addTrainUseCase = new AddTrainUseCase(
                new TrainDataRepository(TrainMemLocalDataSource.newInstance()));

        Train train = new Train("MD5-001", "Red", "250", "60");
        addTrainUseCase.execute(train);
    }

}
