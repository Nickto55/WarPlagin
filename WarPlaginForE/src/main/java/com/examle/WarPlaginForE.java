package com.examle;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;

public class WarPlaginForE extends JavaPlugin {

    @Override
    public void onEnable() {
        // Регистрируем команды
        getCommand("setruler").setExecutor(new SetRulerCommandExecutor());
        getCommand("addplayer").setExecutor(new AddPlayerCommandExecutor());
        getCommand("removeplayer").setExecutor(new RemovePlayerCommandExecutor());
        getCommand("choosestrategy").setExecutor(new ChooseStrategyCommandExecutor());

        // Регистрируем слушателя инвентаря
        getServer().getPluginManager().registerEvents(new RulerInventory(this), this);
    }

    @Override
    public void onDisable() {
        // Логика отключения плагина, если нужно
    }
}
