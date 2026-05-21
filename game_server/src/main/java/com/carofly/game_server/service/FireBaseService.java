//WID)(21/5/2026)(Sarthak Mittal)(DegamieSign)#1.1.1.1.1
package com.carofly.game_server.service;

//import com.carofly.game_server.entity.Player;
//import com.carofly.game_server.repository.PlayerRepository;
import com.carofly.game_server.entity.Player;
import com.carofly.game_server.repository.PlayerRepository;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class FireBaseService {
    public   void setDatabase(FirebaseDatabase database){this.database=database;}//Binding FireBaseDataBase in App
    @Autowired
    public PlayerRepository playerrepository;
    public DatabaseReference getDbref(DatabaseReference dbref){return dbref;}//Fethching DbRef in App
    public void setDbref(DatabaseReference dbref){this.dbref=dbref;}
    public FirebaseDatabase database;
    public DatabaseReference dbref;
    public void setfirebaseDb(FirebaseDatabase database){this.database=database;}
    public FirebaseDatabase getDatabase(FirebaseDatabase database){return  database;}//Fetching DataBase in App


    public FireBaseService(FirebaseDatabase database, DatabaseReference dbref) {
        this.database = database;
        this.dbref = dbref;
    }
    public void savePlayer(Player player){
        dbref=database.getReference("player");
        dbref.push().setValueAsync(player);
    }
}
