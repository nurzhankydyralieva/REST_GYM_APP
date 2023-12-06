package com.epam.xstack.model.dto.trainee.reuest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetTraineeProfileRequestDTO {
    private String userName;
}
