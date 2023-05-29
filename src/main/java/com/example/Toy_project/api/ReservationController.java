package com.example.Toy_project.api;

import com.example.Toy_project.dto.PTSubscriptionRequestDTO;
import com.example.Toy_project.dto.ReservationRequestDTO;
import com.example.Toy_project.entity.PTSubscription;
import com.example.Toy_project.entity.Reservation;
import com.example.Toy_project.service.PTSubscriptionService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ReservationController {
    private final PTSubscriptionService ptSubscriptionService;

    public ReservationController(PTSubscriptionService ptSubscriptionService) {
        this.ptSubscriptionService = ptSubscriptionService;
    }

    @PostMapping("/reservations")
    public ReservationRequestDTO createReservation(@RequestBody ReservationRequestDTO requestDTO) {
        // 요청 바디에서 필요한 정보를 추출하고 PTSubscription과 예약 시간으로 Reservation 생성
        return ptSubscriptionService.createReservation(requestDTO);
    }

    @GetMapping("/admin/reservations")
    public List<ReservationRequestDTO> getAllReservations() {
        return ptSubscriptionService.getAllReservations();
    }

    @GetMapping("/user")
    public List<ReservationRequestDTO> getReservationByMe() {
        return ptSubscriptionService.getReservationsByMe();
    }

    @DeleteMapping
    public void cancelReservation() {
        ptSubscriptionService.cancelReservation();
    }
}