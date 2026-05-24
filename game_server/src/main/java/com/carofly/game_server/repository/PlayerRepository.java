//WID(24/05/2026)(Sarthak Mittal)(DegamieSign)#1.1,1.1,1s.1.1.1.1.1.1/1.1.1.1.1.1.1
package com.carofly.game_server.repository;

//import com.carofly.game_server.entity.Player;
import com.carofly.game_server.entity.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface  PlayerRepository extends JpaRepository<Player,String> {
//    public List<Player> findByplayerid(String playerid);
}
//    public List<Player>findPlayeremail( String Playeremail);
//    public List<Player>saveByPlayerSerialNum(Integer playerSerialNum);
//    public List<Player>findByPlayerSerialNum(Integer playerSerialNum);
////    public Pageable saveByPlayer(@RequestBody Player player,Pageable pageable);
//    Page<Player> findByPlayers(String player, Pageable pageable);
//    public List<Player>saveByplayerloginTime(Time logintime);
//    public List<Player>updateByPlayerId(String PlayerId);
//    public List<Player>existsByPlayerName(String playerName);//chekcing PlayerName's Existence in App
//    public List<Player>updateByPlayerName(String playerName);//Updating PlayerName in  App
//    public List<Player>saveByPlayerName(String playerName);
//
//    public List<Player>existsBymodifiedDate(SimpleDateFormat modifiedDate);//Chekcing modifiedDate in App
//    public List<Player>updateBymodifiedDate(SimpleDateFormat modifiedDate);
//    public List<Player>saveBymodifieddate(SimpleDateFormat modifieddate);
//    public List<Player> findBymodifieddate(SimpleDateFormat modifieddate);
//    public List<Player> findByplayerlogoutdate(SimpleDateFormat logoutdate);
//
//    public List<Player>saveByplayerId(String playerId);
//    public List<Player>findByPlayerloginTime(LocalTime loginTime);
//    public List<Player>findBYPlayerScore(int score);
//    public List<Player>findByplayerCrtDate(SimpleDateFormat logindate);
//    public List<Player>findByPlayerName(String playerName);
//
//    List<Player> saveBylogoutDate(SimpleDateFormat logoutdate);
//
//    List<Player> saveBylogindate(SimpleDateFormat logindate);
//
//    List<Player> saveBymodifiedDate(SimpleDateFormat modifiedDate);

