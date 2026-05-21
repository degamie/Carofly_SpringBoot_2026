package com.carofly.game_server.service.interfaces;

import jdk.jshell.spi.ExecutionControl;

public interface FireBaseServiceinterface  {
    String getPlayers(String playerId)throws ExecutionControl.UserException,InterruptedException;

    String savePlayer(String playerId, String playerName, String playeremail);
}