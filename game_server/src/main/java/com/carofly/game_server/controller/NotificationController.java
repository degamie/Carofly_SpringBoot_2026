//WID(26/05/2026)(Sarthak Mittal)(DegamieSign)#1.1.1/1.1.1
package com.carofly.game_server.controller;

//import com.carofly.game_server.entity.Player;
//import com.carofly.game_server.service.PlayerService;
//import com.carofly.game_server.entity.Notifications;
//import com.carofly.game_server.entity.Player;
//import com.carofly.game_server.service.NotificationServices;
import com.carofly.game_server.service.NotificationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.management.Notification;
import java.util.List;

@RestController
@Controller
@RequestMapping("notificatiions")

public class NotificationController {
    @Autowired
    public NotificationServices notificationServices;
    @GetMapping("/msgname")
    public List<Notification> getbymsgName(@RequestParam String msgName, @RequestParam String playerName){
        return notificationServices.getbymsgName(msgName,playerName);
    }
}

//    @PostMapping("/save/msgId")
//    public List<Notifications>  setByMsgId(String msgId){
//        return notificationServices.setByMsgId(msgId);
//    }
//
//
//    public String msg;
//    public Notifications notifications=new Notifications();
//    @GetMapping("/msgname")
//    public List<Notifications> getBymsgId(String msgname){
//        return notificationServices.getbymsgName(msgname);
//    }
//    @GetMapping("/msgId")
//    public List<Notifications> getBymsgId(String msgId){
//        return notificationServices.getBymsgId(msgId);
////    }
//
//    public List<Notifications> findBymsg(String msg){
//        return notificationServices.findBymsg(msg);
//    }

//    public final Sinks.Many<Notifications> notificationlist= (Sinks.Many<Notifications>) Sinks.many().multicast();
//    @GetMapping("/send")
//    public String publishNotificaitons(String msg){
//         notificationlist.tryEmitNext(notifications);
//         return "Notification Sent:"+msg;
//    }
//    @GetMapping(produces=MediaType.TEXT_EVENT_STREAM_VALUE)
//    public Flux<Notifications> streamNotifications(){
//        return notificationlist.asFlux();
//    }
