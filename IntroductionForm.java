import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Adam Wear
 * @version 4/8/2017.
 */
public class IntroductionForm {
    private JLabel Name;
    private JTextField nameTextField;
    private JButton Next;
    private JPanel RootPanel;

    public JPanel getRootPanel(){
        return RootPanel;
    }

    /**
     * Sets the preferred size.
     */
    public IntroductionForm(){
        RootPanel.setPreferredSize(new Dimension(300,200));
        Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(RootPanel, "Hello " + nameTextField.getText() + "!");
                    }
                });
            }
        }
