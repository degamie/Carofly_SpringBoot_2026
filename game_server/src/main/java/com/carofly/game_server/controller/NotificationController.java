//WID(14/05/2026)(Sarthak Mittal)(DegamieSign)#1.1.1/1.1
package com.carofly.game_server.controller;

//import com.carofly.game_server.entity.Player;
//import com.carofly.game_server.service.PlayerService;
//import com.carofly.game_server.entity.Notifications;
//import com.carofly.game_server.entity.Player;
//import com.carofly.game_server.service.NotificationServices;
import com.google.api.services.storage.model.Notifications;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@Controller
@RequestMapping("notificatiions")

public class NotificationController {
    @Autowired
    public NotificationServices notificationServices;
    @PostMapping("/save/msgId")
    public List<Notifications>  setByMsgId(String msgId){
        return notificationServices.setByMsgId(msgId);
    }


    public String msg;
    public Notifications notifications=new Notifications();
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

    public final Sinks.Many<Notifications> notificationlist= (Sinks.Many<Notifications>) Sinks.many().multicast();
    @GetMapping("/send")
    public String publishNotificaitons(String msg){
         notificationlist.tryEmitNext(notifications);
         return "Notification Sent:"+msg;
    }
    @GetMapping(produces=MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Notifications> streamNotifications(){
        return notificationlist.asFlux();
    }
}
