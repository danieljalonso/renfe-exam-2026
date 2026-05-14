package edu.iesam.features.domain;

import edu.iesam.features.mock.EmptyMockRepository;
import edu.iesam.features.mock.NullMockRepository;
import edu.iesam.features.mock.TrainMockRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GetTrainsUseCaseTest {

    TrainMockRepository trainMockRepository;
    NullMockRepository nullMockRepository;
    EmptyMockRepository emptyMockRepository;
    GetTrainsUseCase getTrainsUseCase;

    @Test
    void getListOfTrains() {
        trainMockRepository = new TrainMockRepository();
        getTrainsUseCase = new GetTrainsUseCase(trainMockRepository);

        List<Train> trains = getTrainsUseCase.execute();

        assertEquals(3, trains.size());
        assertEquals("MD5-001", trains.get(0).getId());
    }

    @Test
    void getListEmpty() {
        emptyMockRepository = new EmptyMockRepository();
        getTrainsUseCase = new GetTrainsUseCase(emptyMockRepository);

        List<Train> trains = getTrainsUseCase.execute();

        assertEquals(0, trains.size());
    }

    @Test
    void getNull() {
        nullMockRepository = new NullMockRepository();
        getTrainsUseCase = new GetTrainsUseCase(nullMockRepository);

        List<Train> trains = getTrainsUseCase.execute();

        assertNull(trains);
    }

}