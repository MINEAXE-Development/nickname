package org.mcodin5569.nickName;

import org.bukkit.plugin.java.JavaPlugin;

public class NickName extends JavaPlugin {

    private static NickName instance;

    @Override
    public void onEnable() {
        instance = this;

        getCommand("nick").setExecutor(new NickCommand());

        getLogger().info("NickName wurde aktiviert!");
    }

    public static NickName getInstance() {
        return instance;
    }
}