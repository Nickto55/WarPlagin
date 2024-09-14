package com.examle;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AddPlayerCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length > 0) {
            String playerName = args[0];
            sender.sendMessage("Player " + playerName + " added to your team.");
            // Логика добавления игрока в команду
        }
        return true;
    }
}
