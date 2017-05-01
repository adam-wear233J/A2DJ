import javax.swing.*;
import java.awt.*;

/**
 * @author Adam Wear
 * @version 4/8/2017.
 * This class provides the main method for running the test taking software.
 *
 *
 */
public class Main {

    private static int question;

    public static void main(String[] args){
       /**SwingUtilities.invokeLater(() -> CreateAndShowIntro());*/
      /** SwingUtilities.invokeLater(() -> CreateAndShowAdmin());*/
       SwingUtilities.invokeLater(() -> CreateAndShowTestTaker());
       /**SwingUtilities.invokeLater(() -> CreateTestQuest());*/

   }
    /**
     * This method creates and shows the JPanel "IntroductionForm"
     */
   /** public static void CreateAndShowIntro(){
        JFrame frame = new JFrame("Introductions");
        frame.getContentPane().add(new IntroductionForm().getRootPanel());
        frame.pack();
        frame.setVisible(true);
        frame.getContentPane().add(new AdminSetupForm().getAdminPanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }*/


    /**public static void CreateAndShowAdmin(){
        JFrame adminFrame = new JFrame("Admin Set Up");
        adminFrame.getContentPane().add(new AdminSetupForm().getAdminPanel());
        adminFrame.pack();
        adminFrame.setVisible(true);
        adminFrame.getContentPane().add(new TestDB().getTestDBPanel());
        adminFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }*/

    public static void CreateAndShowTestTaker(){
        JFrame takerFrame = new JFrame("Test Set Up");
        takerFrame.getContentPane().add(new userTestForm().getTestTakerPanel());
        takerFrame.pack();
        takerFrame.setVisible(true);
        takerFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**public static void CreateTestQuest(){
        JFrame testFrame = new JFrame("Test");
        testFrame.getContentPane().add(new TestDB().getTestDBPanel());
        testFrame.pack();
        testFrame.setVisible(true);
        testFrame.getContentPane().add(new AdminSetupForm().getAdminPanel());
        testFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }*/
    }