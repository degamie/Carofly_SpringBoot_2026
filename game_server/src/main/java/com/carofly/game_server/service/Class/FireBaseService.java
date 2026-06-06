//WID)(6/6/2026)(Sarthak Mittal)(DegamieSign)(FireBaseServices)
package com.carofly.game_server.service.Class;

import com.google.cloud.firestore.Firestore;
import com.carofly.game_server.entity.Player;
import com.carofly.game_server.repository.PlayerRepository;
import com.carofly.game_server.service.interfaces.FireBaseServiceinterface;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
//import com.carofly.game_server.service.interfaces.FireBaseService;

@Component
@Service
public class FireBaseService implements FireBaseServiceinterface{
    @Autowired
    public Firestore db;
    public FireStore getdb(FireStore db){return db;}//Fethcing Db in App
    public FirebaseDatabase database;
    public DatabaseReference dbref;
    @Override
    public FireBaseService verifyToken(String idToken) throws  Exception{}
    @Override//To be Impl
    public String updateByPlayer(String playerId, String playerName, String playeremail) {
        DocumentReference docRef=db.collection("players").document("playerId");

        return "Updating Player's Data in FireStore's Document dynamically;";
    }


    @Override//Saveplayer() methdo imppl
    public String savePlayer(String playerId, String playerName, String playeremail) throws ExecutionException, InterruptedException {
        Map<String,Object> docData=new HashMap<>();//Docdata's HasMap declare
        docData.put("playername",playerName);//putting Playername in DocData
        docData.put("playeremail",playeremail);//putting Playername  FireStrore's Dynamic DB's Document Data's Reterieval
        ApiFuture<WriteResult> collectionsApiFuture = db.collection("players").document(playerId).set(docData);//Collecting Player's Binded Data

        return "Document created successfully at: " + collectionsApiFuture.get().getUpdateTime();//Printing Player's SavedData in output
    }



    @Override
    public String getPlayers(String playerId) throws ExecutionControl.UserException, InterruptedException, ExecutionException {
        DocumentReference documentReference=db.collection("players").document("playerdId");
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();

        if (document.exists()) {
            return document.getData().toString();
        } else {
            return "Document not found!";
        }
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
