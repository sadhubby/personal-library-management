package library_package;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

//The class that creates the MainFrames instead of it all being in Main driver.
public class MainFrame extends JFrame{


    final private Font mainFont = new Font("Calibri", Font.BOLD, 18);
    JTextField tfUserName;
    JTextField tfPassword;
    private final List<Account> accounts = new ArrayList<>();
    
    public void initialize() {
    accounts.add(new Account("admin", "admin@example.com", "admin123"));
    accounts.add(new Account("user1", "user1@example.com", "password1"));
    accounts.add(new Account("guest", "guest@example.com", "guestpass"));

    
    JLabel lbUserName = new JLabel("Username:");
    lbUserName.setFont(mainFont);

    tfUserName = new JTextField();
    tfUserName.setFont(mainFont);
    tfUserName.setPreferredSize(new Dimension(200, 30));  

    JLabel lbPassword = new JLabel("Password:");
    lbPassword.setFont(mainFont);

    tfPassword = new JTextField();
    tfPassword.setFont(mainFont);
    tfPassword.setPreferredSize(new Dimension(200, 30));

    // Login Button
    JButton btnLogin = new JButton("Login");
    btnLogin.setFont(mainFont); 
    btnLogin.addActionListener((ActionEvent e) -> {
        String inputUsername = tfUserName.getText().trim();
        String inputPassword = tfPassword.getText().trim();
    
        if (validateLogin(inputUsername, inputPassword)) {
            JOptionPane.showMessageDialog(this,
                "Login successful! Welcome " + inputUsername + "!",
                "Success",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,
                "Login failed. Please check your username and password.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    });

    // Panel with fields + button
    JPanel formPanel = new JPanel(new GridBagLayout());
    formPanel.setBorder(new EmptyBorder(30, 30, 30, 30)); 
    formPanel.setBackground(Color.WHITE);

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10); 
    gbc.anchor = GridBagConstraints.WEST;

    gbc.gridx = 0;
    gbc.gridy = 0;
    formPanel.add(lbUserName, gbc);

    gbc.gridx = 1;
    formPanel.add(tfUserName, gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    formPanel.add(lbPassword, gbc);

    gbc.gridx = 1;
    formPanel.add(tfPassword, gbc);

    // Login button under the inputs, centered across two columns
    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.gridwidth = 2;
    gbc.anchor = GridBagConstraints.CENTER;
    formPanel.add(btnLogin, gbc);

    // Main Frame
    JPanel mainPanel = new JPanel(new BorderLayout());
    mainPanel.setBackground(new Color(240, 240, 240));
    mainPanel.add(formPanel, BorderLayout.CENTER);

    add(mainPanel);

        setTitle("Personal Library Management");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true); 
        setResizable(false);
}

private boolean validateLogin(String username, String password) {
    for (Account acc : accounts) {
        if (acc.getAccountUsername().equals(username) &&
            acc.getAccountPassword().equals(password)) {
            return true;
        }
    }
    return false;
}

}
