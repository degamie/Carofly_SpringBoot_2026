//WID(21/05/2026)(Sarthak Mittal(DegamieSign)#1
package com.carofly.game_server.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name="PLAYER")
public class Player {
    @Id
  @Column(name="playerid",unique = true)
    public String playerId;
    @Column(name="playername",unique = true)
    public String playername;
    @Column(name="score",unique = false)
    public  int score;
    @Column(name="logintime",unique = false)
    public LocalTime  loginTime;
    @Column(name="logoutTime",unique = false)
    public LocalTime  logoutTime;
    @Column(name="loginate",unique = false)
    public SimpleDateFormat playercrdate;
    @Column(name="logoutdate",unique = false)
    public LocalTime  playermodifieddate;
    @Column(name="playeremail",unique = false)
    public LocalTime  email;


}
