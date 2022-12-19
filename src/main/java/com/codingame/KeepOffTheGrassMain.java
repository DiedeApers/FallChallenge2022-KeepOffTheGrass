package com.codingame;

import java.io.File;
import java.io.IOException;

import com.codingame.gameengine.runner.MultiplayerGameRunner;
import com.codingame.gameengine.runner.simulate.GameResult;
import com.google.common.io.Files;

public class KeepOffTheGrassMain {

    public static void main(String[] args) throws IOException, InterruptedException {


        for (int i = 0; i < 50; i++) 
        {
            MultiplayerGameRunner gameRunner = new MultiplayerGameRunner();

            //gameRunner.setSeed(5l);
            
            gameRunner.addAgent("./build/output.exe", "JulienBot");
            //gameRunner.addAgent("./build/idle.exe", "IdleBot");
            gameRunner.addAgent("python ./tools/FallChallenge2022-KeepOffTheGrass/starterAIs/Starter.py", "InsectBot");

            //gameRunner.start();
            GameResult result = gameRunner.simulate();
            //aSystem.out.println("SEED: " + gameRunner.getSeed()); 
            System.out.println("Agents: " + result.agents); 
            System.out.println("Scores: " + result.scores); 
            System.out.println("Summaries: " + result.summaries); 
        }

        System.out.println("SUCCESS!"); 
    }

}
