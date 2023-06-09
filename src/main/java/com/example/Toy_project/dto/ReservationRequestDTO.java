package com.example.Toy_project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ReservationRequestDTO {

    private Long id;
    private Long memberId;
    private String memberName;
    private String memberEmail;
    private Long reservationTrainerId;
    private String trainerName;
    private LocalDateTime reservationTime;
}
