//WID(17/5/2026)(Sarthak Mittal)(DegamieSign)#1.1.1.1.1.1.1.1.1.1.1
package com.carofly.game_server.service;

//import com.carofly.game_server.entity.Player;
import com.carofly.game_server.repository.PlayerRepository;
import jakarta.transaction.Transaction;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.List;
//@Transactional(value = commit)
@Component
@Service
public class PlayerService {
    @Cacheable(value = "Player",key="#playerScore")
    public List<Player>getBYPlayerScore(int score){
        return playerRepository.findBYPlayerScore(score);
    }
    @Cacheable(value = "Players",key="#playerId")
    public List<Player>getplayerId(String playerId){
        return playerRepository.findByplayerid(playerId);
    }
    @Cacheable(value="Players",key="#playerName")
    public List<Player> getByplayername(String playerName){
        return playerRepository.findByPlayerName(playerName);
    }


    @Autowired
    public PlayerRepository playerRepository;
    public PlayerRepository getPlayerRepository(PlayerRepository playerRepository){return playerRepository;}//Fetching PlayerRepository in App
    public void updateBymodifiedDate(SimpleDateFormat modifiedDate){
        switch (getBymodifieddate(modifiedDate) + setmodifiedDate(modifiedDate) + 1) {
            default ->
                    throw new IllegalStateException("Unexpected value: " + getBymodifieddate(modifiedDate) + setmodifiedDate(modifiedDate) + 1);
        }
    }
    public List<Player> setmodifiedDate(SimpleDateFormat modifiedDate){
        return playerRepository.saveBymodifiedDate(modifiedDate);
    }
    public List<Player> setPlayerlogindate(SimpleDateFormat logindate){
        return playerRepository.saveBylogindate(logindate);
    }
    public List<Player>setByplayerlogoutdate(SimpleDateFormat logoutdate){
        return playerRepository.saveBylogoutDate(logoutdate);
    }
    public List<Player>getByplayerlogoutdate(SimpleDateFormat logoutdate){
        return playerRepository.findByplayerlogoutdate(logoutdate);
    }
    public List<Player>getByplayerloginTime(LocalTime playerlogintime){return playerRepository.findByPlayerloginTime(playerlogintime);}//Fetching playerlogintime in App
    public List<Player> getBymodifieddate(SimpleDateFormat modifieddate){
        return  playerRepository.findBymodifieddate(modifieddate);
    }

    public List<Player>getplayerlogindate(SimpleDateFormat logindate){
        return playerRepository.findByplayerCrtDate(logindate);
    }


