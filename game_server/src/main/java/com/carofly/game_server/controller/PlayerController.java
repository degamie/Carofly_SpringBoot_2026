//WID(07/05/2026)(Sarthak Mittal)(GameoLight)#1 ,1.1.1.1
package com.carofly.game_server.controller;

import com.carofly.game_server.entity.Player;
import com.carofly.game_server.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@Controller
@RequestMapping("player")
public class PlayerController {
    @Autowired
    public PlayerService playerService;
    @PostMapping("/saveBy/modifiedDate")
    public List<Player> setmodifiedDate(SimpleDateFormat modifiedDate){
        return playerService.setmodifiedDate(modifiedDate);
    }

  @GetMapping("/modifieddate")
  public List<Player> getBymodifieddate(SimpleDateFormat modifieddate){
      return  playerService.getBymodifieddate(modifieddate);
  }
    @GetMapping("/logindate")
    public List<Player>getplayerlogindate(SimpleDateFormat logindate){
        return playerService.getplayerlogindate(logindate);
    }
    @GetMapping("/score")
    public List<Player>getBYPlayerScore(int score){
        return playerService.getBYPlayerScore(score);
    }
    @GetMapping("/playerName")
    public List<Player> getByplayername(String playerName){
        return playerService.getByplayername(playerName);
    }

}

