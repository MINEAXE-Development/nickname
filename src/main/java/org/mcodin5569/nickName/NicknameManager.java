package org.mcodin5569.nickName;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class NicknameManager {

    public static void applyNickname(Player player, String nickname) {
        player.setDisplayName(nickname);
        player.setPlayerListName(nickname);
        player.setCustomName(nickname);
        player.setCustomNameVisible(true);

        Scoreboard scoreboard = Bukkit.getScoreboardManager().getMainScoreboard();
        String teamName = "nick_" + player.getName();

        Team team = scoreboard.getTeam(teamName);
        if (team == null) {
            team = scoreboard.registerNewTeam(teamName);
        }

        team.setPrefix("");
        team.setSuffix("");
        team.addEntry(player.getName());
    }
}