package com.velocitypowered.api.event.player;

import com.google.common.base.Preconditions;
import com.velocitypowered.api.proxy.connection.Player;

/**
 * This event is fired when a player disconnects from the proxy. Operations on the provided player,
 * aside from basic data retrieval operations, may behave in undefined ways.
 */
public final class DisconnectEvent {

  private final Player player;
  private final LoginStatus loginStatus;

  public DisconnectEvent(Player player, LoginStatus loginStatus) {
    this.player = Preconditions.checkNotNull(player, "player");
    this.loginStatus = Preconditions.checkNotNull(loginStatus, "loginStatus");
  }

  public Player getPlayer() {
    return player;
  }

  public LoginStatus getLoginStatus() {
    return loginStatus;
  }

  @Override
  public String toString() {
    return "DisconnectEvent{"
        + "player=" + player + ", "
        + "loginStatus=" + loginStatus
        + '}';
  }

  public enum LoginStatus {

    SUCCESSFUL_LOGIN,
    CONFLICTING_LOGIN,
    CANCELLED_BY_USER,
    CANCELLED_BY_PROXY,
    CANCELLED_BY_USER_BEFORE_COMPLETE,
    PRE_SERVER_JOIN
  }
}
