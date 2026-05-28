//WID(28/5/2026)(Sarthak Mittal)(DegamieSign)#1.1.1
package com.carofly.game_server.service;

import com.carofly.game_server.entity.Notifications;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import com.carofly.game_server.repository.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
//import javax.management.Notification;

//import java.util.List;

//import java.util.stream.Collectors;

@Service
public class NotificationServices {
    ArrayList<String> players = new ArrayList<>();
    public String playername;
    @Autowired
    public NotificationRepository repository;
    @Autowired
    public PlayerService playerService;

    Logger logger = null;
    public NotificationServices() {
    }
    Thread thread = new Thread();
    public List<Notifications> getbymsgName(String msgName, String playername) {
        String matchedPlayers = players.stream()
                .filter(name -> name.equalsIgnoreCase(playername)) // or .matches() if using regex
                .sorted()
                .collect(Collectors.joining(", "));

        logger.info("Fetching Carofly Game's Player's Name: {} {}"
                + playerService.getByplayername(playername)
                + matchedPlayers);
        return repository.findByMsgName(msgName);
    }
}
//        logger.info(new StringBuilder().append("Fetching Carofly Game's Player's Name:").append(playerService.getByplayername(playername)).append(players.stream()
//                .sorted()
//                .filter(playerName -> playername.matches(playerName))
//                .map(playerNames -> playername.length() % 2 == 0)
//                .distinct()
//                .collect(playername.toLowerCase().toString())));



//    public void setmgsIdR(String msgid){
//        this.msgid=msgid;
//    }
//    public List<Notifications>getBymsgId(String msgid){
//        return  repository.findBymsgId(msgid);
//    }
//    public List<Notifications> setByMsgId(String msgId) {return repository.saveBymsg(msgId);}

//    public List<Notifications> findBymsg(String msg){
//        return repository.findBymsg(msg);
//    }



