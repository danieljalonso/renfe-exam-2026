package edu.iesam.features.domain;

import java.util.List;

public class GetTrainsUseCase {

    TrainRepository trainRepository;

    public GetTrainsUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public List<Train> execute() {
        return trainRepository.getTrains();
    }

}
