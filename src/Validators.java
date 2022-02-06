import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

public class Validators {

    private final Component parentComponent;

    public Validators(Component parent) {
        this.parentComponent = parent;
    }

    private void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(parentComponent, message,
                "Invalid Entry", JOptionPane.ERROR_MESSAGE);
    }

    public boolean isPresent(JTextComponent c, String fieldName) {
        if (c.getText().isEmpty()) {
            showErrorDialog(fieldName + " is a required field.");
            c.requestFocusInWindow();
            return false;
        } else {
            return true;
        }
    }

    public boolean isInteger(JTextComponent c, String fieldName) {
        try {
            Integer.parseInt(c.getText());
            return true;
        } catch (NumberFormatException e) {
            showErrorDialog(fieldName + " must be an integer.");
            c.requestFocusInWindow();
            return false;
        }
    }

    public boolean isValid(JTextComponent c, String fieldName) {
        if (Integer.parseInt(c.getText()) < 1 || Integer.parseInt(c.getText()) > 26) {
            showErrorDialog(fieldName + " must be a valid value (1 - 26).");
            c.requestFocusInWindow();
            return false;
        } else {
            return true;
        }
    }

}