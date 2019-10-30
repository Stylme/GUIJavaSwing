import javax.swing.*;
import java.awt.*;

/**
 * @author Jairo Cardenas
 *
 */
public class GUI {

    public JTextArea createTextArea(){
        return new JTextArea(10, 20);
    }

    public JButton createJButton(){
        return new JButton("Pulse para invertir la cadena");
    }

    public void createFrame(){
        JFrame frame = new JFrame("String inverter");
        frame.setLayout(new BorderLayout());
        frame.add(createTextArea(), BorderLayout.NORTH);
        frame.add(createJButton(), BorderLayout.CENTER);
        JTextArea showReverseString = createTextArea();
        frame.add(showReverseString, BorderLayout.SOUTH);
        showReverseString.setEnabled(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
