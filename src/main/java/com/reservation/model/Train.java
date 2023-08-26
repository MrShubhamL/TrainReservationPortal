package com.reservation.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long trainNo;
    private String trainName;
    private String fromStation;
    private String toStation;
    private Integer seats;
    private Double fare;
}
