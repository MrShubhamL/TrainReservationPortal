package com.reservation.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String reservationDate;
    private String seatNo;
    private String trainClass;
    private String trainBerth;
    private String transactionID;
    private double totalAmount;
    @OneToOne()
    private Train train;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
