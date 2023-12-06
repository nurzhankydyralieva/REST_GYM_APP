package com.epam.xstack.dao.traineeDAO;

import com.epam.xstack.model.dto.trainee.response.*;
import com.epam.xstack.model.dto.trainee.reuest.GetTraineeProfileRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.TraineeRegistrationRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.UpdateTraineeProfileRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.UpdateTrainee_sTrainerListRequestDTO;

import java.util.UUID;

public interface TraineeDAO {
    TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO);

    GetTraineeProfileResponseDTO selectTraineeProfileByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO);

    UpdateTraineeProfileResponseDTO updateTraineeProfile(UUID id, UpdateTraineeProfileRequestDTO requestDTO);

    DeleteResponseDTO deleteTraineeByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO);
    UpdateTrainee_sTrainerListResponseDTO updateTrainee_sTrainerList(UUID id, UpdateTrainee_sTrainerListRequestDTO requestDTO);

}
