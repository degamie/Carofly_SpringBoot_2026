//WID(21/05/2026)(Sarthak Mittal)(DegamieSign)#1 ,1.1.1.1.1
package com.carofly.game_server.controller;
import com.carofly.game_server.service.Class.FireBaseService;
import com.carofly.game_server.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.carofly.game_server.entity.Player;


//import java.text.SimpleDateFormat;
//import java.util.List;

@RestController
@Controller
@RequestMapping("/carolfy_SB_API/player")
public class PlayerController {
    @Autowired
    public FireBaseService fireBaseService;
    @Autowired
    public PlayerService playerService;
    @PostMapping("/saveBy/{players}")
    public String getPlayers(@RequestParam String playerID,@RequestParam String playerName,@RequestParam String playeremail){
        return fireBaseService.savePlayer(playerID,playerName,playeremail);}


}
//@PostMapping("/saveBy/modifiedDate")
//    public List<Player> setmodifiedDate(SimpleDateFormat modifiedDate){
//        return playerService.setmodifiedDate(modifiedDate);
//    }
//
//  @GetMapping("/modifieddate")
//  public List<Player> getBymodifieddate(SimpleDateFormat modifieddate){
//      return  playerService.getBymodifieddate(modifieddate);
//  }
//    @GetMapping("/logindate")
//    public List<Player>getplayerlogindate(SimpleDateFormat logindate){
//        return playerService.getplayerlogindate(logindate);
//    }
//    @GetMapping("/score")
//    public List<Player>getBYPlayerScore(int score){
//        return playerService.getBYPlayerScore(score);
//    }
//    @GetMapping("/playerName")
//    public List<Player> getByplayername(String playerName){
//        return playerService.getByplayername(playerName);
//    }
