package com.tequila.track.com.tequila.track.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ETL_trakingdata")
@Setter
@Getter
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Tracks {

    @Id
    private Long id;
    private int bus_id;
    private int bus_number;
    private int employee_id;
    private String employee_name;
    private int brand_id;
    private String brand;


    @Temporal(TemporalType.DATE)
    @Column(name = "departure", nullable = true)
    private Date departure;

    @Temporal(TemporalType.DATE)
    @Column(name = "arrival", nullable = true)
    private Date arrival;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_departure", nullable = true)
    private Date date_departure;

    @Temporal(TemporalType.DATE)
    @Column(name = "hour_departure", nullable = true)
    private Date hour_departure;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_arrival", nullable = true)
    private Date date_arrival;

    @Temporal(TemporalType.DATE)
    @Column(name = "hour_arrival", nullable = true)
    private Date hour_arrival;

    // @Column(name = "route_id", nullable = true)
    private int route_id;

    private String route_name;
    private int kms;
    private String type;

    //@Column(name = "status", nullable = true)
    private String status;
    private int user_id;
    private String username;
    private String user_fullname;
    private int active;

    @Temporal(TemporalType.DATE)
    private Date creation;
    private int year;

}
