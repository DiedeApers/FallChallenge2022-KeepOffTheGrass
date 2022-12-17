package com.codingame;

import java.io.File;
import java.io.IOException;

import com.codingame.gameengine.runner.MultiplayerGameRunner;
import com.codingame.gameengine.runner.simulate.GameResult;
import com.google.common.io.Files;

public class KeepOffTheGrassMain {

    public static void main(String[] args) throws IOException, InterruptedException {

        MultiplayerGameRunner gameRunner = new MultiplayerGameRunner();

        //gameRunner.setSeed(-8358938852454912011l);
        
        gameRunner.addAgent("./build/output.exe", "JulienBot");
        gameRunner.addAgent("python starterAIs/Starter.py", "InsectBot");

        //gameRunner.start();
        GameResult result = gameRunner.simulate();
        System.out.println("Agents: " + result.agents); 
        System.out.println("Scores: " + result.scores); 
        System.out.println("Summaries: " + result.summaries); 
    }

}
