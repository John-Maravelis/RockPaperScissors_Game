package Game_RPS;

import java.util.Random;

public class CpuChoice {

    public String getCpu() {
        Random rn = new Random();

        //generating random number for cpu's answer
        int cpuRandom = rn.nextInt(3) + 1;
        //changing cpu's random number to a choice
        String cpu = "";
        switch (cpuRandom) {
            case 1:
                if (cpuRandom == 1) {
                    cpu = "rock";
                }
                break;
            case 2:
                if (cpuRandom == 2) {
                    cpu = "paper";
                }
                break;
            case 3:
                if (cpuRandom == 3) {
                    cpu = "scissors";
                }
                break;
            default:
                break;
        }
        return cpu;
    }
}