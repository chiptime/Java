package net.ddns.noidea.desktop.Commands;

import net.ddns.fquintana.ConsoleCommands.CommandsCore.ColoredConsole;
import net.ddns.fquintana.ConsoleCommands.CommandsCore.CommandSingle;



public class DecidirCommand extends CommandSingle {
    public DecidirCommand() {
        super("Decidir", "{si,no}", "Permite aceptar o denegar");
    }



    @Override
    public boolean onCommand(ColoredConsole coloredConsole, String[] strings) {
        if(usage == "si")
            return true;
        if(usage == "no")
            return false;
    }
}
