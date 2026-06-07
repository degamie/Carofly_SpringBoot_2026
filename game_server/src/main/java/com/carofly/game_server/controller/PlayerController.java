//WID(6/06/2026)(Sarthak Mittal)(DegamieSign)(Carofly(Game API(SB)'s Controller)#1
package com.carofly.game_server.controller;
//import com.carofly.game_server.service.Class.FireBaseService;
import com.carofly.game_server.entity.Notifications;
import com.carofly.game_server.service.PlayerService;
import com.networknt.schema.format.TimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.carofly.game_server.entity.Player;
import java.util.List;
import java.util.concurrent.ExecutionException;


//import java.text.SimpleDateFormat;


@RestController
@Controller
@RequestMapping("/carolfy_SB_API")
public class PlayerController {
    @Autowired
    public PlayerService playerService;


    @GetMapping("/plaayerspeedaccuracy")
    public List<Player> getByByplaayerspeedaccuracy(@RequestParam Integer plaayerspeedaccuracy){
        return playerService.getByByplaayerspeedaccuracy(plaayerspeedaccuracy);
    }

    @GetMapping("/score")
    public List<Player> getByplayerscore(int score){
        return playerService.getByplayerscore(score);
    }

    @GetMapping("/playervelocity")
    public List<Player> getByplayervelocity(@RequestParam Integer velocity){
        return playerService.getByplayerVelocity(velocity);
    }
    @PutMapping("/update/playername")
    public List<Player> updateByPlayer(@RequestParam String playername,@RequestBody Player player){
        return playerService.updateByPlayer(playername,player);
    }
    @GetMapping("/playerflightIime")
    public List<Player> getByplayerflightTime(TimeFormat playerflightIime){
        return playerService.getByplayerflightTime(playerflightIime);
    }
    @GetMapping("/playername")
    public List<Player> getByplayername(String playername){
        return playerService.getByplayername(playername);
    }

}
//    @GetMapping("/playerId")
//    public List<Player> getByplayerId(String playerId) {
//        return playerService.getplayerId(playerId);
//    }

//}
    //    @Autowired
//    public FireBaseService fireBaseService;


//}
//    @PostMapping("/saveBy/{players}")
//    public String getPlayers(@RequestParam String playerID,@RequestParam String playerName,@RequestParam String playeremail) throws ExecutionException, InterruptedException {
//        return fireBaseService.savePlayer(playerID,playerName,playeremail);}



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
