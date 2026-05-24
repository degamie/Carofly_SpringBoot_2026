////WID(23/5/2026)(Sarthak Mittal)(DegamieSign)#1,1.1.1,1/1.1.,1.1
//package com.carofly.game_server.config;
//
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.cloud.firestore.Firestore;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//import com.google.firebase.cloud.FirestoreClient;
//import com.google.firebase.database.FirebaseDatabase;
//import jakarta.annotation.PostConstruct;
//import lombok.Value;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.Resource;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//
//
//@Configuration
//public class FireBaseConfig {
//    public void setResource(Resource firebaseconfig){this.firebaseconfig=firebaseconfig;}//Binding FireBaseConfig Resource in App
//    public Resource firebaseconfig;
//    @PostConstruct
//    public void initialize() {
//        try {
//            if (firebaseconfig == null || !firebaseconfig.exists()) {
//                throw new IllegalArgumentException("Firebase configuration file could not be found at the specified path!");
//            }
//
//            InputStream serviceAccount = firebaseconfig.getInputStream();
//
//            FirebaseOptions options = FirebaseOptions.builder()
//                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                    .build();
//
//            if (FirebaseApp.getApps().isEmpty()) {
//                FirebaseApp.initializeApp(options);
//            }
//        } catch (IOException e) {
//            // In production, consider utilizing a proper logging framework (e.g., Slf4j) here
//            e.printStackTrace();
//        }
//    }
//    @Bean
//    public Firestore firestore(FirebaseApp fireBaseApp){
//        return FirestoreClient.getFirestore(fireBaseApp);
//    }
//
//
//    @Autowired
//    public FirebaseDatabase firebasedbref;
//    public  void setFirebasedbref(FirebaseDatabase firebasedbref){this.firebasedbref=firebasedbref;}//Binding firebaseDb in App
////    public FirebaseApp initialize() throws IOException {
////        FileInputStream serviceAccount =
////                new FileInputStream("path/to/serviceAccountKey.json");
////
////        FirebaseOptions options = FirebaseOptions.builder()
////                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
////                .setDatabaseUrl("firebase-adminsdk-fbsvc@carofly-714e0.iam.gserviceaccount.com")
//////                .setDatabaseUrl("https://<your-database-id>.firebaseio.com")
////                .build();
////        return FirebaseApp.initializeApp(options);
////    }
//
//
//    public Resource getGcpconfig(Resource gcpconfig) {
//        return gcpconfig;
//    }//Fethcing GCPCOnfig in App
//
//    public void setGcpconfig(Resource gcpconfig) {
//        this.gcpconfig = gcpconfig;
//    }//Binding gcpConfig in App
//
//    public Resource gcpconfig;
//    //    @Value("${firebase.database.url}")
//    public String dburl;
//
//    @Bean
//    public FirebaseDatabase fireBaseDataBase() throws IOException {
//        FirebaseOptions options = FirebaseOptions.builder()
//                .setCredentials(GoogleCredentials.fromStream(gcpconfig.getInputStream()))
//                .setDatabaseUrl(dburl).build();
//
//        if (FirebaseApp.getApps().isEmpty()) {
//            FirebaseApp.initializeApp(options);
//        }
//
//        return FirebaseDatabase.getInstance();
//    }
//
//}
//
//
