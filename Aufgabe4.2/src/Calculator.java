import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator implements ActionListener{

    //textfelder, buttons
    JTextField input1, input2, output;
    JButton plusButton, minusButton;

    //frame und panel
    JFrame frame;
    JPanel panel = new JPanel();

    Calculator(){
        frame = new JFrame();

        input1 = new JTextField( 16);
        input2 = new JTextField( 16);
        output = new JTextField("Ergebnis");
        output.setEditable(false);

        Font fo = new Font("Serif", Font.BOLD,20);
        output.setFont(fo);

        plusButton = new JButton("+");
        minusButton = new JButton("-");
        plusButton.addActionListener(this);
        minusButton.addActionListener(this);

        panel.add(input1);panel.add(input2);panel.add(output);panel.add(plusButton);panel.add(minusButton);
        frame.add(panel);

        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent b) {

        int x=Integer.parseInt(input1.getText());
        int y=Integer.parseInt(input2.getText());
        int z=0;
        if (b.getSource() == plusButton) {
            z = x+y;
        } else if (b.getSource() == minusButton) {
            z = x-y;
        }
        output.setText(String.valueOf(z));
    }
    public static void main(String[] args){
        new Calculator();
    }
}