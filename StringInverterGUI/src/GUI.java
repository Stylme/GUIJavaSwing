import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
/**
 * @author Jairo Cardenas
 *
 */
public class GUI {

    public JTextArea createTextArea(String borderTitle){
        JTextArea textArea = new JTextArea(10,20);
        textArea.setBorder(new TitledBorder(borderTitle));
        return textArea;
    }

    public JButton createJButton(Color buttonColor, Color fontColor, String text){
        JButton button = new JButton();
        button.setBackground(buttonColor);
        button.setForeground(fontColor);
        button.setText(text);
        return button;
    }

    public void createFrame(){
        //Frame creation
        JFrame frame = new JFrame("String inverter");
        frame.setLayout(new BorderLayout() );

        //JTextArea creation for input string
        JTextArea textArea = createTextArea("Entrada:");
        frame.add(textArea, BorderLayout.NORTH);

        //JButton creation
        JButton button = createJButton(Color.black, Color.white, "Pasar texto.");
        frame.add(button, BorderLayout.CENTER);

        //JTextArea creation for output reverse string
        JTextArea showReverseString = createTextArea("Salida:");
        frame.add(showReverseString, BorderLayout.SOUTH);
        showReverseString.setEnabled(false);

        //Frame config
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
