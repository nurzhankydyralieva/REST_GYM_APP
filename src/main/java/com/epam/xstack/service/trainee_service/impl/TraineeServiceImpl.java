package com.epam.xstack.service.trainee_service.impl;

import com.epam.xstack.dao.traineeDAO.TraineeDAO;
import com.epam.xstack.model.dto.trainee.response.DeleteResponseDTO;
import com.epam.xstack.model.dto.trainee.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.model.dto.trainee.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.model.dto.trainee.response.UpdateTraineeProfileResponseDTO;
import com.epam.xstack.model.dto.trainee.reuest.GetTraineeProfileRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.TraineeRegistrationRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.UpdateTraineeProfileRequestDTO;
import com.epam.xstack.service.trainee_service.TraineeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TraineeServiceImpl implements TraineeService {
    private final TraineeDAO traineeDAO;

    @Override
    public TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO) {
        return traineeDAO.saveTrainee(requestDTO);
    }

    @Override
    public GetTraineeProfileResponseDTO selectTraineeProfileByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO) {
        return traineeDAO.selectTraineeProfileByUserName(id, requestDTO);
    }

    @Override
    public UpdateTraineeProfileResponseDTO updateTraineeProfile(UUID id, UpdateTraineeProfileRequestDTO requestDTO) {
        return traineeDAO.updateTraineeProfile(id, requestDTO);
    }

    @Override
    public DeleteResponseDTO deleteTraineeByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO) {
        return traineeDAO.deleteTraineeByUserName(id, requestDTO);
    }
}
