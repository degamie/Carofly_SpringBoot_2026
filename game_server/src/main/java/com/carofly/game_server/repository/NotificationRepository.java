//WID(25/5/2026)(Sarthak Mittal)(DegamieSign)#1.1.1.1/1.1.1.1.1.1.1
package com.carofly.game_server.repository;
import com.carofly.game_server.entity.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.util.List;


//import javax.management.Notification;


//import com.google.api.services.storage.model.Notification;


@Component
@Repository
public interface NotificationRepository extends JpaRepository<Notifications,String> {
    public List<Notifications>saveBymsgname(String msgName);
    public List<Notifications>findBymsgacknow(String msgacknow);
    public List<Notifications>findByMsgAllocation(String msgallocation);
    public void saveByMsgName(String msgName);
    @Query("Select msg_name from Notification")
    public List<Notifications> findByMsgName(String msgName);
    public void existsBymsg(String msg);
    public void updateBymsg(String msg);
    public List<Notifications>saveBymsg(String msg);
    public void updateBymsgid(String msgId);
    public List<Notifications>saveBymsgId(String msgId);
    public List<Notifications>findBymsgId(String msgId);
    public List<Notifications> findBymsg(String msg);
}
