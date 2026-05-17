//WID(14/5/2026)(Sarthak Mittal)(DegamieSign)#1
package com.carofly.game_server.service;

import com.google.api.services.storage.model.Notifications;
import org.springframework.beans.factory.annotation.Autowired;


//import com.carofly.game_server.entity.Notifications;
//import com.carofly.game_server.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NotificationServices {
    public  String msgid;

    @Autowired
    public NotificationRepository repository;
    public void setmgsIdR(String msgid){
        this.msgid=msgid;
    }

    public List<Notifications>getBymsgId(String msgid){
        return  repository.findBymsgId(msgid);
    }
    public List<Notifications> findBymsg(String msg){
        return repository.findBymsg(msg);
    }

    public List<Notifications> setByMsgId(String msgId) {return repository.saveBymsg(msgId);}
}


