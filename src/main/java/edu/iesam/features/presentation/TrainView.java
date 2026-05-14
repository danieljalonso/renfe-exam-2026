package edu.iesam.features.presentation;

import edu.iesam.features.data.TrainDataRepository;
import edu.iesam.features.data.TrainMemLocalDataSource;
import edu.iesam.features.domain.AddTrainUseCase;
import edu.iesam.features.domain.DeleteTrainUseCase;
import edu.iesam.features.domain.GetTrainsUseCase;
import edu.iesam.features.domain.Train;

import java.util.List;

public class TrainView {

    public void addTrain() {
        AddTrainUseCase addTrainUseCase = new AddTrainUseCase(
                new TrainDataRepository(TrainMemLocalDataSource.newInstance()));

        Train train = new Train("MD5-001", "Red", "250", "60");
        addTrainUseCase.execute(train);
    }

    public List<Train> getTrains() {
        GetTrainsUseCase getTrainsUseCase = new GetTrainsUseCase(
                new TrainDataRepository(TrainMemLocalDataSource.newInstance()));

        return getTrainsUseCase.execute();
    }

    public void deleteTrain(String id) {
        DeleteTrainUseCase deleteTrainUseCase = new DeleteTrainUseCase(
                new TrainDataRepository(TrainMemLocalDataSource.newInstance()));

        deleteTrainUseCase.execute(id);
    }

}
