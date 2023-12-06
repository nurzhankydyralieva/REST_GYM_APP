package com.epam.xstack.dao.trainerDAO;

import com.epam.xstack.model.dto.trainer.response.GetTrainerProfileResponseDTO;
import com.epam.xstack.model.dto.trainer.response.TrainerRegistrationResponseDTO;
import com.epam.xstack.model.dto.trainer.response.UpdateTrainerProfileResponseDTO;
import com.epam.xstack.model.dto.trainer.reuest.GetTrainerProfileRequestDTO;
import com.epam.xstack.model.dto.trainer.reuest.TrainerRegistrationRequestDTO;
import com.epam.xstack.model.dto.trainer.reuest.UpdateTrainerProfileRequestDTO;

import java.util.UUID;

public interface TrainerDAO {
    TrainerRegistrationResponseDTO saveTrainer(TrainerRegistrationRequestDTO requestDTO);
    GetTrainerProfileResponseDTO selectTrainerProfileByUserName(UUID id, GetTrainerProfileRequestDTO requestDTO);
    UpdateTrainerProfileResponseDTO updateTrainerProfile(UUID id, UpdateTrainerProfileRequestDTO requestDTO);
}
