/**
 * TO DO:
 *  - Increase encryptedField size for brute force results
 *  - Implement brute force
 *      - Implement/fix/rework
 */
import javax.swing.*;
import java.awt.*;

public class CipherGUI extends JFrame{
	
	//private variables
	private static final long serialVersionUID = 1L;
    private JComboBox<String> functionComboBox;
    private JTextField messageField;
    private JTextField shiftValueField;
    private JTextField encryptedField;

    public CipherGUI() {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException
                |IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println(e);
        }
        initComponents();
    }

    private void initComponents() {

        //set title
        setTitle("Caesar Cipher");
        setLocationByPlatform(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //add "Brute Force" back to the functions
        //when implemented
        String[] functions = {"Encryption","Decryption","Random"};
        
        functionComboBox = new JComboBox<>(functions);
        messageField = new JTextField();
        shiftValueField = new JTextField();
        encryptedField = new JTextField();
        
        encryptedField.setEnabled(false);

        //set text field dimensions
        Dimension dim = new Dimension(150, 20);
        var dim2 = new Dimension(150,150);
        
        //set preferred sizes
        functionComboBox.setPreferredSize(dim);
        messageField.setPreferredSize(dim);
        shiftValueField.setPreferredSize(dim);
        encryptedField.setPreferredSize(dim2);
        
        //set minimum sizes
        functionComboBox.setMinimumSize(dim);
        messageField.setMinimumSize(dim);
        shiftValueField.setMinimumSize(dim);
        encryptedField.setMinimumSize(dim2);

        //declare JPanel
        JPanel panel = new JPanel();
        
        //set panels
        panel.setLayout(new GridBagLayout());
        panel.add(new JLabel("Function:"), getConstraints(0, 0));
        panel.add(functionComboBox, getConstraints(1, 0));
        panel.add(new JLabel("Message:"), getConstraints(0, 1));
        panel.add(messageField, getConstraints(1, 1));
        panel.add(new JLabel("Shift Value:"), getConstraints(0, 2));
        panel.add(shiftValueField, getConstraints(1, 2));
        panel.add(new JLabel("Result:"), getConstraints(0, 3));
        panel.add(encryptedField, getConstraints(1, 3));

        //action listeners for buttons
        JButton enterButton = new JButton("Enter");
        enterButton.addActionListener(e -> {
            enterButtonClicked();
        });

        JButton clearFieldsButton = new JButton("Clear Fields");
        clearFieldsButton.addActionListener(e -> {
            clearFieldsButtonClicked();
        });

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> {
            exitButtonClicked();
        });

        //add button elements to buttonPanel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(enterButton);
        buttonPanel.add(clearFieldsButton);
        buttonPanel.add(exitButton);

        //add combobox and textfields to panel
        GridBagConstraints c = getConstraints(0, 4);
        c.anchor = GridBagConstraints.LINE_END;
        c.gridwidth = 2;
        panel.add(buttonPanel, c);

        //add panel to the window
        add(panel, BorderLayout.CENTER);

        setVisible(true);
        setSize(400, 315);
    }

    private void enterButtonClicked(){
        Validators vs = new Validators(this);
        Encryption Encryption = new Encryption();
        
        if(vs.isPresent(messageField, "Message") &&
           vs.isInteger(shiftValueField, "Shift value")&&
           vs.isValid(shiftValueField, "Shift value")){
            String functionBoxItem = (String) functionComboBox.getSelectedItem();
            
            if(functionBoxItem.toLowerCase().equals("encryption")){
                // call encryption
                String m = messageField.getText();
                int s = Integer.parseInt(shiftValueField.getText());
                String result = Encryption.callEncryption(m,s);
                encryptedField.setText(result);
            } else if (functionBoxItem.toLowerCase().equals("decryption")){
                // call decryption
                String m = messageField.getText();
                int s = Integer.parseInt(shiftValueField.getText());
                String result = Encryption.callDecryption(m,s);
                encryptedField.setText(result);
            }  else if (functionBoxItem.toLowerCase().equals("random")){
                // call random
                String m = messageField.getText();
                int s = Integer.parseInt(shiftValueField.getText());
                String result = Encryption.callRandomEncryption(m,s);
                encryptedField.setText(result);
            }  else if (functionBoxItem.toLowerCase().equals("brute force")){
                // call brute force
//                char arrayMessage[];
//                String m = messageField.getText();
//                m = m.toUpperCase();
//                int s = Integer.parseInt(shiftValueField.getText());
//                arrayMessage = m.toCharArray();
//                
//                for (int i = 1; i < 26; i++) {
//                    s = i;
//                    char[] bruteForce = Encryption.callDecryption(m, s);
//                    System.out.println("Shift variation: " + (i) + "\t Message: " + new String(bruteForce));
//                }    
            } else {
                // nothing
                functionComboBox.setSelectedIndex(0);
                messageField.setText("???");
                shiftValueField.setText("???");
                encryptedField.setText("???");
            }
        }
    }

    //
    private void clearFieldsButtonClicked() {
        functionComboBox.setSelectedIndex(0);
        messageField.setText("");
        shiftValueField.setText("");
        encryptedField.setText("");
    }

    private void exitButtonClicked() {
        System.exit(0);
    }

    // Helper method to return GridBagConstraints objects
    private GridBagConstraints getConstraints(int x, int y) {
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(5, 5, 0, 5);
        c.gridx = x;
        c.gridy = y;
        return c;
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new CipherGUI().setVisible(true);
        });
    }
}