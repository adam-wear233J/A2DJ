import javax.swing.*;
import javax.swing.plaf.ButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author Adam Wear
 * @version 4/29/2017.
 *
 * The purpose of this class is to run the test and provide the interface to take
 * the test
 *
 * Changes:
 * -- removed private JTestField testQuestField
 * -- added private JButton quitButton
 * -- initialized variables with "new"
 * -- added "this" to variables
 * -- added "set" methods for buttons
 * -- added userTestTakerPanel() to createUIComponents()
 * -- added tally methods for testTakeButton(1-3)
 * -- added temp storage array storeResults()
 */
public class userTestForm {
    private JPanel userTestTakerPanel;
    private JRadioButton testTakeButton1;
    private JRadioButton testTakeButton2;
    private JRadioButton testTakeButton3;
    private JTextArea testQuestion;
    private JButton testTakerAns;
    private JProgressBar testTakerProg;
    private JButton quitButton;




    public JPanel getTestTakerPanel(){
        return userTestTakerPanel;
    }

    public JProgressBar getTestTakerProg() {return testTakerProg;}
    /**
     * Sets the preferred size.
     */
    public void userTestTakerPanel() {

        this.userTestTakerPanel = new JPanel();
        this.testQuestion = new JTextArea();
        this.testTakeButton1 = new JRadioButton();
        this.testTakeButton2 = new JRadioButton();
        this.testTakeButton3 = new JRadioButton();
        this.testTakerAns = new JButton();
        this.testTakerProg = new JProgressBar();
        this.quitButton = new JButton();


        this.userTestTakerPanel.setPreferredSize(new Dimension(600, 600));
        testTakerAns.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(userTestForm.this.userTestTakerPanel, testQuestion.getText() + ".");
            }
        });
    }

    public void setQuitButton(JButton quitButton) {
        this.quitButton = quitButton;


    }

    public void setTestTakeButton1(int wins){
        wins = 0;
        if (testTakeButton1.isSelected()) {
            wins = wins++;
        }
    }
    public void setTestTakeButton2(int loss){

        loss = 0;
        if (testTakeButton2.isSelected()) {
            loss = loss++;
        }
    }
    public void setTestTakeButton3(int tie){

        tie = 0;
        if (testTakeButton3.isSelected()) {
            tie = tie++;
        }
    }

    private ArrayList storeResults(ArrayList[] results){
        ArrayList win;
        ArrayList loss;
        ArrayList tie;

        win = new ArrayList(0);
        loss = new ArrayList(0);
        tie = new ArrayList(0);

        return null;
    }

    private void createUIComponents() {


        userTestTakerPanel();
    }
}


