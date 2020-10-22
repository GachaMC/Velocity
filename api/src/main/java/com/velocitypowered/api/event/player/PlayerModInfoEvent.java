package com.velocitypowered.api.event.player;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.velocitypowered.api.proxy.connection.Player;
import com.velocitypowered.api.util.ModInfo;

/**
 * This event is fired when a Forge client sends its mods to the proxy while connecting to a server.
 */
public final class PlayerModInfoEvent {

  private final Player player;
  private final ModInfo modInfo;

  public PlayerModInfoEvent(Player player, ModInfo modInfo) {
    this.player = Preconditions.checkNotNull(player, "player");
    this.modInfo = Preconditions.checkNotNull(modInfo, "modInfo");
  }

  public Player getPlayer() {
    return player;
  }

  public ModInfo getModInfo() {
    return modInfo;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("player", player)
        .add("modInfo", modInfo)
        .toString();
  }
}
