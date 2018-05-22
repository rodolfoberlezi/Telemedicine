package telemedicine;

import javax.swing.JOptionPane;

public class GUIMessages {

    public static void error(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE, null);
    }

    public static void exit() {
        int res = JOptionPane.showConfirmDialog(null, "Are you sure about leave?", "Exit", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
