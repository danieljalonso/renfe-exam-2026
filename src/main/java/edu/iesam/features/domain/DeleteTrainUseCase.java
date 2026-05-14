package edu.iesam.features.domain;

public class DeleteTrainUseCase {

    TrainRepository trainRepository;

    public DeleteTrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public void execute(String id) {
        trainRepository.deleteTrain(id);
    }

}
