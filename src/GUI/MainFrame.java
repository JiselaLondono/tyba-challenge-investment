package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JTextField txtName;
    private JComboBox listDocumentType;
    private JButton btnOk;
    private JButton btnCancel;
    private JPanel mainPanel;
    private JLabel lblMessage;

    public MainFrame() {
        setContentPane(mainPanel);
        setTitle("Mis Inversiones");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String documentType = listDocumentType.getSelectedItem().toString();
                if (documentType.equals("Cédula de ciudadanía") || documentType.equals("Cédula de extranjería")){
                } else {
                    lblMessage.setText("El tipo de documento " + documentType + " no es válido para invertir");
                }
            }
        });
    }

}
