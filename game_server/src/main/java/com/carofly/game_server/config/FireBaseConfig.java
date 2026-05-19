//WID(18/5/2026)(Sarthak Mittal)(Gameolight)#1,1.1.1,1/1.1.,1
package com.carofly.game_server.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.io.FileInputStream;
import java.io.IOException;


@Configuration
public class FireBaseConfig {
    public  void setFirebasedbref(FireBaseDataBaseReference firebasedbref){this.firebasedbref=firebasedbref;}//Binding firebaseDb in App
    public FirebaseApp initialize() throws IOException {
        FileInputStream serviceAccount =
                new FileInputStream("src/main/resources/serviceAccountKey.json");

        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://<your-database-id>.firebaseio.com")
                .build();

        return FirebaseApp.initializeApp(options);
    }
    @Autowired
    public FireBaseDataBaseReference firebasedbref;

    public Resource getGcpconfig(Resource gcpconfig) {
        return gcpconfig;
    }//Fethcing GCPCOnfig in App

    public void setGcpconfig(Resource gcpconfig) {
        this.gcpconfig = gcpconfig;
    }//Binding gcpConfig in App

    public Resource gcpconfig;
    //    @Value("${firebase.database.url}")
    public String dburl;

    @Bean
    public FirebaseDatabase fireBaseDataBase() throws IOException {
        FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(gcpconfig.getInputStream()))
                .setDatabaseUrl(dburl).build();

        if (FirebaseApp.getApps().isEmpty()) {
            FirebaseApp.initializeApp(options);
        }

        return FirebaseDatabase.getInstance();
    }
    @Bean
    public FireStore firestore(FireBaseApp fireBaseApp){
        return FirestoreClient.getFireStore(fireBaseApp);
    }


}


