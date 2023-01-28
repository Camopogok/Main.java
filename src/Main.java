import javax.swing.*;
import java.awt.*;

public class Main {
    JFrame frame = new JFrame("Крутилка");
    JPanel jpanel = new JPanel();
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JSpinner spinner = new JSpinner(new SpinnerNumberModel(5,1, 10, 1));
    JButton button = new JButton("Ответить");
    JLabel label = new JLabel();
    

    public Main () {
        frame.setSize(100,150);
        frame.setLocation(600,400);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        spinner.setSize(50,20);
        panel.add(spinner);
        panel1.add(button);
        panel2.add(label);
        button.addActionListener(actionEvent -> label.setText("Ответ: " + spinner.getValue()));
        jpanel.setLayout(new GridLayout(3, 1));
        panel.setLayout(new FlowLayout());
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new FlowLayout());
        jpanel.add(panel);
        jpanel.add(panel1);
        jpanel.add(panel2);
        frame.add(jpanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

}
