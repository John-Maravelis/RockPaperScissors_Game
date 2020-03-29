import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        boolean quit = false;
        do { //loop for the correction of mistakes
            String answer = "";
            do { //looping through the game
                Random rn = new Random();
                String userChoice = userInput();

                if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {

                    //generating random number for cpu's answer
                    int cpuRandom = rn.nextInt(3) + 1;

                    //changing cpu's random number to a choice
                    String cpuChoice = "";
                    switch (cpuRandom) {
                        case 1:
                            if (cpuRandom == 1) {
                                cpuChoice = "rock";
                            }
                            break;
                        case 2:
                            if (cpuRandom == 2) {
                                cpuChoice = "paper";
                            }
                            break;
                        case 3:
                            if (cpuRandom == 3) {
                                cpuChoice = "scissors";
                            }
                            break;
                        default:
                            break;
                    }


                    //finding and displaying the winner
                    System.out.println("Your Input:" + " " + userChoice);
                    System.out.println("Computer's input:" + " " + cpuChoice );
                    System.out.println();
                    System.out.println(Winner(cpuChoice, userChoice));

                    //rematch
                    System.out.println();
                    System.out.println("Do you want to play again?");
                    System.out.println("Type yes or no.");
                    Scanner sc = new Scanner(System.in);
                    answer = sc.nextLine();



                } else{
                    System.out.println("Wrong input, please re-enter.");
                    break;
                }
            } while (answer.equals("yes"));

            // In case of no-answer
            if (answer.equals("no")) quit = true;

        }while(!quit);
    }


    private static String Winner(String cpu, String user ) {

        String result = "";

        if (cpu.equals(user.toLowerCase())) {
            result = "Draw.";

            //user losing
        } else if (cpu.toLowerCase().equals("rock") && user.equals("scissors")) {
            result ="Bad luck, the computer won. :(";

        } else if (cpu.toLowerCase().equals("paper") && user.equals("rock")) {
            result ="Bad luck, the computer won. :(";

        } else if (cpu.toLowerCase().equals("scissors") && user.equals("paper")) {
            result ="Bad luck, the computer won. :(";

            //user winning
        } else if (cpu.toLowerCase().equals("rock") && user.equals("paper")) {
            result = "Congratulations, YOU WON!! :D";

        } else if (cpu.toLowerCase().equals("paper") && user.equals("s")) {
            result = "Congratulations, YOU WON!! :D";

        } else if (cpu.toLowerCase().equals("scissors") && user.equals("rock")) {
            result ="Congratulations, YOU WON!! :D";
        }

        return result;
    }

    private static String userInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your choice:");
        System.out.println("(rock, paper, scissors)");
        String userChoice = sc.nextLine();

        return userChoice;
    }


}
