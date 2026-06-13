//WID(12/06/2026)(DegamieSign)(Sarthak Mittal)(PlayerService)#1
package com.carofly.game_server.service;

//import com.carofly.game_server.entity.Player;
import com.carofly.game_server.entity.Player;
import com.carofly.game_server.repository.PlayerRepository;
import com.networknt.schema.format.DateTimeFormat;
import com.networknt.schema.format.TimeFormat;
import jakarta.transaction.Transaction;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.List;
//@Transactional
//@Component
@Transactional
@Service

public class PlayerService {
    @Autowired
    public final PlayerRepository playerRepository;
    @Cacheable(value = "Players", key = "#playerId")
    public List<Player> getplayerspeed(Integer speed) {
        return playerRepository.findByplayerspeed(speed);}
    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository =playerRepository;
    }
    public List<Player>getByPlayerloginTime(DateTimeFormat loginTime){return playerRepository.findByplayerloginTime(loginTime);}//Fetching PlayerLogin Time in GameApp
    public List<Player>getByplayer(Player player){return  playerRepository.findBYplayer(player);}//Fetching Player in App
    public List<Player> getByByplaayerspeedaccuracy(Integer plaayerspeedaccuracy){
          return playerRepository.findByplaayerspeedaccuracy(plaayerspeedaccuracy);
    }

    public List<Player> getByplayerscore(int  playerscore){
        return playerRepository.findByplayerscore(playerscore);
    }
    public List<Player> getByplayerVelocity(Integer velocity) {
        return playerRepository.findByplayerVelocity(velocity);
    }
    @Async("taskExecutor")
    public List<Player> getByplayername(String playername) {
        return playerRepository.findByplayername(playername);
    }

    @Cacheable(value = "Players", key = "#playerId")
    public List<Player> getplayerId(String playerId) {
        return playerRepository.findByplayerid(playerId);
    }
    @Async("taskExecutor")

    public List<Player> getByplayerflightTime(TimeFormat playerflightIime){
        return playerRepository.findByplayerflightTime(playerflightIime);
    }
    @Cacheable(value="updateByPlayer",key="#updateplayerid")
    @Transactional
    public List<Player> updateByPlayer(String playerId,Player playerdto){
        String playername=null;
        Player player=playerRepository.findByplayerid(playerId).orElseThrow(() -> new RuntimeException("PlayerId Not Found!:Pls try again! " + playerId));
        player.setPlayerId(getplayerId(playerId).toString());
        player.setPlayername(getByplayername(playername).toString());
        return (List<Player>) playerRepository.save(playerdto);
    }
//    @Cacheable(value = "Players", key = "#playername")

}


//    public PlayerRepository getPlayerRepository(PlayerRepository playerRepository) {
//        return playerRepository;
//    }
//    public List<Player> setmodifiedDate(SimpleDateFormat modifiedDate) {
//        return playerRepository.saveBymodifiedDate(modifiedDate);
//    }
//    @Async("taskExecutor")
//    public List<Player> setPlayerlogindate(SimpleDateFormat logindate) {
//        return playerRepository.saveBylogindate(logindate);
//    }
//
//    public List<Player> setByplayerlogoutdate(SimpleDateFormat logoutdate) {
//        return playerRepository.saveBylogoutDate(logoutdate);
//    }
//
//    public List<Player> getByplayerlogoutdate(SimpleDateFormat logoutdate) {
//        return playerRepository.findByplayerlogoutdate(logoutdate);
//    }
//
//    public List<Player> getByplayerloginTime(LocalTime playerlogintime) {
//        return playerRepository.findByPlayerloginTime(playerlogintime);
//    }//Fetching playerlogintime in App
//
//    public List<Player> getBymodifieddate(SimpleDateFormat modifieddate) {
//        return playerRepository.findBymodifieddate(modifieddate);
//    }
//
//    public List<Player> getplayerlogindate(SimpleDateFormat logindate) {
//        return playerRepository.findByplayerCrtDate(logindate);
//    }
//    @Cacheable(value = "Player", key = "#playerScore")
//    public List<Player> getBYPlayerScore(int score) {
//        return playerRepository.findBYPlayerScore(score);
//    }








//}

//Fetching PlayerRepository in App

//    public void updateBymodifiedDate(SimpleDateFormat modifiedDate) {
//        switch (getBymodifieddate(modifiedDate) + setmodifiedDate(modifiedDate) + 1) {
//            default ->
//                    throw new IllegalStateException("Unexpected value: " + getBymodifieddate(modifiedDate) + setmodifiedDate(modifiedDate) + 1);
//        }
//    }


