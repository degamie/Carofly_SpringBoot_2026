//WID(26/05/2026)(Sarthak Mittal)(DegamieSign)#1,1.1
package com.carofly.game_server.service.interfaces;

import com.carofly.game_server.repository.NotificationRepository;
import com.carofly.game_server.service.PlayerService;
import jdk.jshell.spi.ExecutionControl;

import java.util.concurrent.ExecutionException;

public interface FireBaseServiceinterface   extends NotificationRepository{
     PlayerService playerService = null;
    public String getplayername(String playername) throws  ExecutionControl.UserException,InterruptedException,ExecutionException;

    public String updateByPlayer(String playerId, String playerName, String playeremail);//updating Player in Server
    String getPlayers(String playerId) throws ExecutionControl.UserException, InterruptedException, ExecutionException;

    String savePlayer(String playerId, String playerName, String playeremail) throws ExecutionException, InterruptedException;
}