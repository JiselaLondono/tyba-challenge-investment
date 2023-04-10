import Utils.InvestmentProduct;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import static Utils.Messages.*;
import static Utils.Utilities.*;

public class Main {
    public static void main(String[] args) {
        JTextField name = new JTextField();
        JTextField lastName = new JTextField();
        String[] documentTypes = {"Cédula de ciudadanía", "Cédula de extranjería", "Pasaporte", "Permiso especial de permanencia", "Registro civil", "Tarjeta de identidad"};
        JLabel title = new JLabel(MY_INVESTMENT.getMessage());
        JComboBox<String> documentTypeList = new JComboBox<>(documentTypes);

        Object[] clientDataForm = {
                title,
                "Nombre:", name,
                "Apellido:", lastName,
                "Tipo de documento: ", documentTypeList
        };
        dataValidate(clientDataForm, name, lastName, documentTypeList);
    }

    private static void getRecommendation(int value, String lastName) {
        InvestmentProduct investmentProduct = getInvestmentProduct(value);
        JOptionPane.showMessageDialog(null, String.format(RECOMMENDATION.getMessage(), lastName, investmentProduct.getName(), investmentProduct.getName(), String.format("%.2f", (investmentProduct.getPercentage() * 100)), getFormattedNumber(value * investmentProduct.getPercentage()), getCalculatedProfit(value, investmentProduct.getPercentage())), RECOMMENDATION.getTitle(), JOptionPane.INFORMATION_MESSAGE);
    }

    private static void dataValidate(Object[] form, JTextField name, JTextField lastName, JComboBox documentTypeList) {
        int option;
        do {
            option = JOptionPane.showConfirmDialog(null, form, MY_INVESTMENT.getTitle(), JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                if (name.getText().isEmpty() || lastName.getText().isEmpty() || name.getText().isBlank() || lastName.getText().isBlank()) {
                    JOptionPane.showMessageDialog(null, REQUIRED_INFORMATION.getMessage(), REQUIRED_INFORMATION.getTitle(), JOptionPane.ERROR_MESSAGE);
                } else if (documentTypeList.getSelectedItem().equals("Cédula de ciudadanía") || documentTypeList.getSelectedItem().equals("Cédula de extranjería")) {
                    enterInvestmentAmount(lastName.getText());
                } else {
                    JOptionPane.showMessageDialog(null, String.format(INVALID_DOCUMENT_TYPE.getMessage(), documentTypeList.getSelectedItem()), INVALID_DOCUMENT_TYPE.getTitle(), JOptionPane.WARNING_MESSAGE);
                }
            }
        } while ((name.getText().isEmpty() || lastName.getText().isEmpty() || name.getText().isBlank() || lastName.getText().isBlank()) && option != JOptionPane.CANCEL_OPTION);
    }

    private static void enterInvestmentAmount(String lastName) {
        JTextField amount = new JTextField();
        JLabel title = new JLabel(AMOUNT.getMessage());
        Object[] amountForm = {
                title, amount
        };
        String regex = "[+-]?[0-9]+";
        int option;
        do {
            option = JOptionPane.showConfirmDialog(null, amountForm, AMOUNT.getTitle(), JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                if (amount.getText().isEmpty() || amount.getText().isBlank()) {
                    JOptionPane.showMessageDialog(null, REQUIRED_AMOUNT.getMessage(), REQUIRED_AMOUNT.getTitle(), JOptionPane.ERROR_MESSAGE);
                } else if (!amount.getText().matches(regex)) {
                    JOptionPane.showMessageDialog(null, String.format(INVALID_AMOUNT.getMessage(), amount.getText()), INVALID_AMOUNT.getTitle(), JOptionPane.ERROR_MESSAGE);
                } else if (Integer.parseInt(amount.getText()) < 200000) {
                    JOptionPane.showMessageDialog(null, MINIMUM_AMOUNT.getMessage());
                    amount.setText("");
                } else {
                    getRecommendation(Integer.parseInt(amount.getText()), lastName);
                }
            }
        } while ((amount.getText().isEmpty() || amount.getText().isBlank() || !amount.getText().matches(regex)) && option != JOptionPane.CANCEL_OPTION);
    }
}