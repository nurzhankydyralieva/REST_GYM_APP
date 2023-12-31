package com.epam.xstack.controller;

import com.epam.xstack.model.dto.trainer.response.GetTrainerProfileResponseDTO;
import com.epam.xstack.model.dto.trainer.response.TrainerRegistrationResponseDTO;
import com.epam.xstack.model.dto.trainer.response.UpdateTrainerProfileResponseDTO;
import com.epam.xstack.model.dto.trainer.reuest.GetTrainerProfileRequestDTO;
import com.epam.xstack.model.dto.trainer.reuest.TrainerRegistrationRequestDTO;
import com.epam.xstack.model.dto.trainer.reuest.UpdateTrainerProfileRequestDTO;
import com.epam.xstack.service.trainer_service.TrainerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/trainers")
@RequiredArgsConstructor
public class TrainerController {
    private final TrainerService trainerService;
    @PostMapping("/save")
    public ResponseEntity<TrainerRegistrationResponseDTO> saveTrainee(@RequestBody TrainerRegistrationRequestDTO requestDTO) {
        return new ResponseEntity<>(trainerService.saveTrainer(requestDTO), HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    public ResponseEntity<GetTrainerProfileResponseDTO> selectTrainerProfile(@PathVariable("id") UUID id, @RequestBody GetTrainerProfileRequestDTO requestDTO) {
        return new ResponseEntity<>(trainerService.selectTrainerProfileByUserName(id, requestDTO), HttpStatus.OK);
    }



    @PutMapping("/update/{id}")
    public ResponseEntity<UpdateTrainerProfileResponseDTO> updateUser(@PathVariable("id") UUID id, @RequestBody UpdateTrainerProfileRequestDTO requestDTO) {
        return new ResponseEntity<>(trainerService.updateTrainerProfile(id, requestDTO), HttpStatus.OK);
    }

}
