import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author an_we
 * @version 4/10/2017.
 */
public class TestDB {
    private JPanel TestDBPanel;
    private JTextArea questionArea;
    private JRadioButton No;
    private JRadioButton Undecided;
    private JRadioButton Yes;
    private JButton TestNext;
    private JButton Next;

    public Component getTestDBPanel() {
        return TestDBPanel;
    }

    public TestDB(){
        TestDBPanel.setPreferredSize(new Dimension(300,200));
        Next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(TestDBPanel, "Enter the question " + questionArea.getText() + "!");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    //private static final String 234A_A2DJ_URL = "jdbc:sqljdbc42:234A_A2DJ.db";
}
