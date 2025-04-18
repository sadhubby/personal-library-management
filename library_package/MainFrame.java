package library_package;
import java.awt.*;
import javax.swing.*;

// The class that creates the MainFrames instead of it all being in Main driver.
public class MainFrame extends JFrame{
    final private Font mainFont = new Font("Calibri", Font.BOLD, 18);
    JTextField tfUserName;

    public void initialize() {

        JLabel lbUserName = new JLabel("Username");
        lbUserName.setFont(mainFont);

        tfUserName = new JTextField();
        tfUserName.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5 , 5));
        formPanel.add(lbUserName);
        formPanel.add(tfUserName);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128,128,255));
        mainPanel.add(formPanel, BorderLayout.WEST);
        
        add(mainPanel);

        setTitle("Personal Library Management");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    

}
}
