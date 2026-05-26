//WID(26/05/2026)(Sarthak Mittal)(DegamieSign)#1,1
package com.carofly.game_server.service.interfaces;

import jdk.jshell.spi.ExecutionControl;

import java.util.concurrent.ExecutionException;

public interface FireBaseServiceinterface  {
    public String getplayername(String playername) throws  ExecutionControl.UserException,InterruptedException,ExecutionException;

    public String updateByPlayer(String playerId, String playerName, String playeremail);//updating Player in Server
    String getPlayers(String playerId) throws ExecutionControl.UserException, InterruptedException, ExecutionException;

    String savePlayer(String playerId, String playerName, String playeremail) throws ExecutionException, InterruptedException;
}