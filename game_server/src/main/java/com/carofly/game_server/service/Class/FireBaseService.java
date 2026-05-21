//WID)(21/5/2026)(Sarthak Mittal)(DegamieSign)#1.1.1.1.1.2.1
package com.carofly.game_server.service.Class;

//import com.carofly.game_server.entity.Player;
//import com.carofly.game_server.repository.PlayerRepository;
import com.carofly.game_server.entity.Player;
import com.carofly.game_server.repository.PlayerRepository;
import com.carofly.game_server.service.interfaces.FireBaseServiceinterface;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//import com.carofly.game_server.service.interfaces.FireBaseService;

@Component
@Service
public class FireBaseService implements FireBaseServiceinterface{
    public FireStore db;
    public FirebaseDatabase database;
    public DatabaseReference dbref;
    @Override
    public String getPlayers(String playerId)throws ExecutionControl.UserException,InterruptedException{
        DocumentReference documentReference=dbref.collection("players").document("playerdId");
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();

        if (document.exists()) {
            return document.getData().toString();
        } else {
            return "Document not found!";
        }
    }

    @Override
    public String savePlayer(String playerId, String playerName, String playeremail) {
        return "Player Data'S FirebaseDB's (To be IMpl)";
    }

    public   void setDatabase(FirebaseDatabase database){this.database=database;}//Binding FireBaseDataBase in App
    @Autowired
    public PlayerRepository playerrepository;
    public DatabaseReference getDbref(DatabaseReference dbref){return dbref;}//Fethching DbRef in App
    public void setDbref(DatabaseReference dbref){this.dbref=dbref;}

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
