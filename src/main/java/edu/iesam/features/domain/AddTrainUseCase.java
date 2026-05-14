package edu.iesam.features.domain;

import edu.iesam.features.data.TrainDataRepository;

public class AddTrainUseCase {

    TrainRepository trainRepository;

    public AddTrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public void execute(Train train) {
        trainRepository.addTrain(train);
    }

}
