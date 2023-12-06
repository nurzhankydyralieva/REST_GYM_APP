package com.epam.xstack.controller;

import com.epam.xstack.dao.traineeDAO.TraineeDAO;
import com.epam.xstack.model.dto.trainee.response.*;
import com.epam.xstack.model.dto.trainee.reuest.GetTraineeProfileRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.TraineeRegistrationRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.UpdateTraineeProfileRequestDTO;
import com.epam.xstack.model.dto.trainee.reuest.UpdateTrainee_sTrainerListRequestDTO;
import com.epam.xstack.service.trainee_service.TraineeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/trainees")
@RequiredArgsConstructor
public class TraineeController {
    private final TraineeService traineeService;
    private final TraineeDAO traineeDAO;

    @GetMapping("/{id}")
    public ResponseEntity<GetTraineeProfileResponseDTO> selectTraineeProfile(@PathVariable("id") UUID id, @RequestBody GetTraineeProfileRequestDTO requestDTO) {
        return new ResponseEntity<>(traineeService.selectTraineeProfileByUserName(id, requestDTO), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<TraineeRegistrationResponseDTO> saveTrainee(@RequestBody TraineeRegistrationRequestDTO requestDTO) {
        return new ResponseEntity<>(traineeService.saveTrainee(requestDTO), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<UpdateTraineeProfileResponseDTO> updateUser(@PathVariable("id") UUID id, @RequestBody UpdateTraineeProfileRequestDTO requestDTO) {
        return new ResponseEntity<>(traineeService.updateTraineeProfile(id, requestDTO), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DeleteResponseDTO> deleteTraineeByUserName(@PathVariable("id") UUID id, @RequestBody GetTraineeProfileRequestDTO requestDTO) {
        return new ResponseEntity<>(traineeService.deleteTraineeByUserName(id, requestDTO), HttpStatus.OK);
    }

    @PutMapping("/update/trainee_trainer_list/{id}")
    public ResponseEntity<UpdateTrainee_sTrainerListResponseDTO> updateUser(@PathVariable("id") UUID id, @RequestBody UpdateTrainee_sTrainerListRequestDTO requestDTO) {
        return new ResponseEntity<>(traineeDAO.updateTrainee_sTrainerList(id,requestDTO), HttpStatus.OK);
    }


}
