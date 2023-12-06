package com.epam.xstack.service.trainee_service;

import com.epam.xstack.model.dto.trainee.response.DeleteResponseDTO;
import com.epam.xstack.model.dto.trainee.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.model.dto.trainee.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.model.dto.trainee.response.UpdateTraineeProfileResponseDTO;
import com.epam.xstack.model.dto.trainee.reuest.GetTraineeProfileRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.TraineeRegistrationRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.UpdateTraineeProfileRequestDTO;

import java.util.UUID;

public interface TraineeService {
    TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO);
    GetTraineeProfileResponseDTO selectTraineeProfileByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO);
    UpdateTraineeProfileResponseDTO updateTraineeProfile(UUID id, UpdateTraineeProfileRequestDTO requestDTO);
    DeleteResponseDTO deleteTraineeByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO);
}
