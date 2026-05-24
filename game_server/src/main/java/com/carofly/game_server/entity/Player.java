//WID(24/05/2026)(Sarthak Mittal(DegamieSign)#1.1
package com.carofly.game_server.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Table(name="PLAYER")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="playerid",unique = true)
    public String playerId;


}
//    @Column(name="playername",unique = true)
//    public String playername;
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

