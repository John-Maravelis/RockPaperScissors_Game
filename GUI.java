import javax.swing.*;


public class GUI {
    public static void main (String[] args) {

        JFrame f = new JFrame("Rock Paper Scissors Game"); //creating instance of JFrame

        JTextField tf = new JTextField();
        tf.setBounds(50,100,250,30);

        //creating JButtons
        JButton ppr = new JButton("Paper");
        JButton rk = new JButton("Rock");
        JButton sc = new JButton("scissors");

        //setting x axis, y axis, width, height values
        ppr.setBounds(10,230,100, 50);
        rk.setBounds(130,230,100, 50);
        sc.setBounds(250,230,100, 50);

        //adding elements in JFrame
        f.add(ppr);
        f.add(rk);
        f.add(sc);
        f.add(tf);

        f.setSize(360,370); //500 width and 500 height
        f.setLayout(null); //using no layout managers
        f.setVisible(true); //making the frame visible




    }

}


