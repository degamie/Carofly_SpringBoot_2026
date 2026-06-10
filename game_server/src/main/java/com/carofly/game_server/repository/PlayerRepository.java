//WID(07/06/2026)(Sarthak Mittal)(DegamieSign)(Repository(Carofly (SB))\
package com.carofly.game_server.repository;

//import com.carofly.game_server.entity.Player;
import com.carofly.game_server.entity.Player;
import com.networknt.schema.format.DateTimeFormat;
import com.networknt.schema.format.TimeFormat;
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
    public List<Player>findBYplayer(Player player);
    public  List<Player> saveByplayername(String playername);
    public List<Player>findByplayerloginTime(DateTimeFormat loginTime);
    public List<Player>saveByplayerloginTime(DateTimeFormat loginTime);//saving player's updated Flight Time in Game App
    public  List<Player> findByplayerscore(int playerscore);
    public List<Player> findByplayerVelocity(Integer velocity);
    public List<Player>saveByPlayerVelocity(Integer velocity);

    public List<Player> saveByplayerid(String playerId);
    public List<Player> findByplayerid(String playerId);

    public List<Player>saveByplayerflightTime(TimeFormat playerFlightTime);//saving player's updated Flight Time in Game App
    public List<Player>findBycarVelocity(Integer velocity);
    public List<Player>findByplayerflightTime(TimeFormat playerFlightTime);
    public List<Player>findByplayername(String playername);
    public List<Player> findByplaayerspeedaccuracy(Integer plaayerspeedaccuracy);


}


//        public List<Player>saveByplayerId(String playerId);

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

