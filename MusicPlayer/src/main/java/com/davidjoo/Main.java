package com.davidjoo;

import com.davidjoo.commands.Ban;
import com.davidjoo.commands.musicplayer.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws LoginException {
        JDA musicPlayerBot = JDABuilder.createDefault("MTExNTg0NTk1NzU3NDE5NzI0OA.G4CRy2._uuRLTg7wqnHcphecF70RBtiU2J3BJIdOiGALU")
                .build();


        CommandManager manager = new CommandManager();
        manager.add(new Ban());
        manager.add(new Play());
        manager.add(new Queue());
        manager.add(new Repeat());
        manager.add(new Skip());
        manager.add(new Stop());

        musicPlayerBot.addEventListener(manager);
    }
}
