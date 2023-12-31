package com.project.Restaurant.Reservation;

import com.project.Restaurant.Member.Member;
//import com.project.Restaurant.Place.Place;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Reservation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

    private LocalDateTime ReservationTime;

    private String status;

    @ManyToOne
    private Member member;


//    @ManyToOne
//    private Place place;

    private String ownerId;
    private String store;
    private String storeId;
    private String customerId;
}
