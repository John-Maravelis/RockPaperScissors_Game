package Game_RPS;

public class Winner {

    public static String getWinner(String cpu, String user) {
        String result = "13";

        if (user.equals(cpu)) {
            result = "It's a Draw!";

            //user losing
        } else if (cpu.equals("rock") && user.equals("scissors")) {
            result = "Bad luck, the computer won. :(";

        } else if (cpu.equals("paper") && user.equals("rock")) {
            result = "Bad luck, the computer won. :(";

        } else if (cpu.equals("scissors") && user.equals("paper")) {
            result = "Bad luck, the computer won. :(";

            //user winning
        } else if (cpu.equals("rock") && user.equals("paper")) {
            result = "Congratulations, YOU WON!! :D";

        } else if (cpu.equals("paper") && user.equals("scissors")) {
            result = "Congratulations, YOU WON!! :D";

        } else if (cpu.equals("scissors") && user.equals("rock")) {
            result = "Congratulations, YOU WON!! :D";
        }

     return result;
    }
}
