//WID(29/05/2026)(Sarthak Mittal(DegamieSign)#1.1.1
package com.carofly.game_server.entity;

import com.networknt.schema.format.TimeFormat;
import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PLAYER")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="playerid",unique = true,nullable = false)
    public String playerId;
    @Column(name="playername",unique = false,nullable=true)
    public String playername;
    @Column(name="flighttime",unique = false,nullable=true)
    public TimeFormat playerFlightTime;
}

////    @Column(name="score",unique = false)
//    public  int score;
////    @Column(name="logintime",unique = false)
//    public LocalTime  loginTime;
////    @Column(name="logoutTime",unique = false)
//    public LocalTime  logoutTime;
////    @Column(name="loginate",unique = false)
//    public SimpleDateFormat playercrdate;
////    @Column(name="logoutdate",unique = false)
//    public LocalTime  playermodifieddate;
////    @Column(name="playeremail",unique = false)
//    public LocalTime  email;

