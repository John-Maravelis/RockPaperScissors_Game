package Game_RPS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI {
    static JLabel lb = new JLabel();
    static JLabel lb2 = new JLabel();
    static JLabel lb3 = new JLabel();
    static JFrame frame = new JFrame("Rock Paper Scissors Game");
    static JPanel panel = new JPanel();

    public static void main(String[] args) {

        lb.setText("Please choose an option");
        lb.setBounds(100, 50, 250, 50);
        panel.add(lb);
        CpuChoice c = new CpuChoice();
        String playAgain = "(Choose any option if you wish to play again :D)";

        //Rock button and properties
        JButton rock = new JButton(new AbstractAction("Rock") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.add(lb);
                panel.add(lb2);
                panel.add(lb3);
                String cpu = c.getCpu();
                lb.setText(Winner.getWinner(cpu, "rock"));
                lb.setBounds(50, 50, 280, 50);
                lb2.setText("Cpu's choice: " + cpu);
                lb2.setBounds(100, 30, 250, 50);
                lb3.setText(playAgain);
                lb3.setBounds(40, 150, 280, 50);
            }
        });
        rock.setBounds(10, 230, 100, 50);
        panel.add(rock);

        //Paper button and properties
        JButton paper = new JButton(new AbstractAction("Paper") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.add(lb);
                panel.add(lb2);
                panel.add(lb3);
                String cpu = c.getCpu();
                lb.setText(Winner.getWinner(cpu, "paper"));
                lb2.setText("Cpu's choice: " + cpu);
                lb.setBounds(50, 50, 280, 50);
                lb2.setBounds(100, 30, 250, 50);
                lb3.setText(playAgain);
                lb3.setBounds(40, 150, 280, 50);
            }
        });
        paper.setBounds(130, 230, 100, 50);
        panel.add(paper);

        //Scissors button and properties
        JButton scissors = new JButton(new AbstractAction("Scissors") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.add(lb);
                panel.add(lb2);
                panel.add(lb3);
                String cpu = c.getCpu();
                lb.setText(Winner.getWinner(cpu, "scissors"));
                lb.setBounds(50, 50, 280, 50);
                lb2.setText("Cpu's choice: " + cpu);
                lb2.setBounds(100, 30, 250, 50);
                lb3.setText(playAgain);
                lb3.setBounds(40, 150, 280, 50);
            }
        });
        scissors.setBounds(250, 230, 100, 50);
        panel.add(scissors);

        //setting the font style and size of the panels
        Font font = new Font("Arial",Font.BOLD, 17);
        lb.setFont(font);
        Font font2 = new Font("Arial",Font.PLAIN, 14);
        lb2.setFont(font2);
        Font font3 = new Font("Arial",Font.ITALIC, 12);
        lb3.setFont(font3);

        //setting the frame icon
        Image icon = Toolkit.getDefaultToolkit().getImage(
                "C:\\Users\\John\\IdeaProjects\\Rock_Paper_Scissors Game\\src\\icons\\rpsIcon.png"
                );
        frame.setIconImage(icon);

        frame.setSize(375, 380);
        frame.add(panel);
        panel.setLayout(null); //using no layout managers
        frame.setVisible(true); //making the frame visible
        frame.setLocationRelativeTo(null); //centering the window
        frame.setResizable(false); //disabling resizing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


