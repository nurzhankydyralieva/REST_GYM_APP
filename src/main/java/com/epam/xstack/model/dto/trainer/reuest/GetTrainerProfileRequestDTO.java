package com.epam.xstack.model.dto.trainer.reuest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetTrainerProfileRequestDTO {
    private String userName;
}
