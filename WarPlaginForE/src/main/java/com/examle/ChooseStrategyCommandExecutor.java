package com.examle;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ChooseStrategyCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length > 0) {
            String strategy = args[0];
            sender.sendMessage("Strategy set to " + strategy);
            // Логика выбора тактики
        }
        return true;
    }
}
