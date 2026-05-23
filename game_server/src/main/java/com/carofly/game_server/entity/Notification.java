////WID(17/04/2026)(Sarthak Mittal)(DegameiSign)
//package com.carofly.game_server.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.text.SimpleDateFormat;
//import java.time.format.DateTimeFormatter;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name="NOTIFCATIONS")
//public class Notification {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(unique = true,nullable = false)
//    public String msg_id;
//    @Column(unique = false,nullable = true )
//    public String msg;
//    @Column(unique = false,nullable = true )
//    public SimpleDateFormat msgdate;
//    @Column(unique = false,nullable = true )
//    public DateTimeFormatter msgtime;
//
//}
