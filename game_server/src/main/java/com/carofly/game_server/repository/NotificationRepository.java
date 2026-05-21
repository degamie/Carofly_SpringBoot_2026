//WID(21/5/2026)(Sarthak Mittal)(DegamieSign)#1.1.1.1/1.1.1.1.1
package com.carofly.game_server.repository;
import javax.management.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.util.List;

//import com.carofly.game_server.entity.Notification
//import com.google.api.services.storage.model.Notification;


@Component
@Repository
public interface NotificationRepository extends JpaRepository<Notification,String> {
    public List<Notification>findByMsgAllocation(String msgallocation);
    public void saveByMsgName(String msgName);
    @Query("Select msg_name from Notification")
    public List<Notification> findByMsgName(String msgName);
    public void existsBymsg(String msg);
    public void updateBymsg(String msg);
    public List<Notification>saveBymsg(String msg);
    public void updateBymsgid(String msgId);
    public List<Notification>saveBymsgId(String msgId);
    public List<Notification>findBymsgId(String msgId);
    public List<Notification> findBymsg(String msg);
}
