import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Adam Wear
 * @version 4/9/2017.
 *
 * The purpose of this form is to provide the interface so that users are
 * able to create accounts.
 */
public class userAcctCreateForm{
    private JTextField usrAcctFullName;
    private JTextField usrAcctUsername;;
    private JLabel userAcctFullName;
    private JLabel userAcctPassword;
    private JButton userAcctNext;
    private JPasswordField userAcctPasswordField;
    private JPanel userPanel;
    private JLabel userAcctUsername;

    public JPanel getUserPanel(){
        return userPanel;
    }

    private JTextField getUsrAcctFullName(){
        return this.usrAcctFullName;
    }

    private JTextField getUsrAcctUsername() {
        return this.usrAcctUsername;
    }

    private JPasswordField getAdPassword() {
        return this.userAcctPasswordField;
    }
    /**
     * Sets the preferred size.
     */
    public JPanel userAcctSetupForm(){
        userPanel.setPreferredSize(new Dimension(300,200));
        userAcctNext.addActionListener(new ActionListener() {
                                           @Override
                                           public void actionPerformed(ActionEvent e) {
                                               JOptionPane.showMessageDialog(userPanel, "Welcome " + userAcctUsername.getText() + "!");
                                           }
                                       }
        );
        return userPanel;
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

