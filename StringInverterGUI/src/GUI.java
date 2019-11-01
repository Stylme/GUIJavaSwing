import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public void onClick(JButton jButton, JTextArea jTextArea1, JTextArea jTextArea2){
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = jTextArea1.getText();
                StringBuffer sb = new StringBuffer(str);
                sb.reverse();
                jTextArea2.setText(sb.toString());
            }
        });
    }

    public void createFrame(){
        //Frame creation
        JFrame frame = new JFrame("String inverter");
        frame.setLayout(new BorderLayout() );

        //JTextArea creation for input string
        JTextArea textArea = createTextArea("Entrada:");
        textArea.setForeground(Color.red);
        frame.add(textArea, BorderLayout.NORTH);

        //JButton creation
        JButton button = createJButton(Color.black, Color.white, "Pasar texto.");
        frame.add(button, BorderLayout.CENTER);

        //JTextArea creation for output reverse string
        JTextArea showReverseString = createTextArea("Salida:");
        showReverseString.setForeground(Color.green);
        frame.add(showReverseString, BorderLayout.SOUTH);
        showReverseString.setEditable(false);

        onClick(button, textArea, showReverseString);

        //Frame config
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
