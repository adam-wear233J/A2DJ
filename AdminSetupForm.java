import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author an_we
 * @version 4/9/2017.
 */
public class AdminSetupForm {
    private JTextField adName;
    private JLabel adminName;
    private JButton adminNext;
    private JPanel adminPanel;

    public JPanel getAdminPanel(){
        return adminPanel;
    }

    //private JTextField getAdName(){
      //return adName;
    //}

     /**
     * Sets the preferred size.
     */
    public AdminSetupForm(){
        adminPanel.setPreferredSize(new Dimension(300,200));
        adminNext.addActionListener(new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       JOptionPane.showMessageDialog(adminPanel, "Welcome " + adName.getText() + "!");
                                   }
                               }
        );
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}



