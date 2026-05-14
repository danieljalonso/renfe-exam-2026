package edu.iesam.features.domain;

import edu.iesam.features.mock.TrainMockRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTrainUseCaseTest {

    TrainMockRepository trainMockRepository;
    AddTrainUseCase addTrainUseCase;

    @Test
    void addTrain() {
        trainMockRepository = new TrainMockRepository();
        addTrainUseCase = new AddTrainUseCase(trainMockRepository);

        Train train = new Train("MD5-001", "Red", "250", "60");

        addTrainUseCase.execute(train);

        assertEquals(1, trainMockRepository.addCountTrain);
    }
}