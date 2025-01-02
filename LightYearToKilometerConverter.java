import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LightYearToKilometerConverter {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Light-Year to Kilometer Converter");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create input label and text field
        JLabel inputLabel = new JLabel("Enter Light-Years:");
        inputLabel.setBounds(20, 20, 150, 25);
        frame.add(inputLabel);

        JTextField inputField = new JTextField();
        inputField.setBounds(150, 20, 200, 25);
        frame.add(inputField);

        // Create output label
        JLabel outputLabel = new JLabel("Equivalent Distance (Trillion Km):");
        outputLabel.setBounds(20, 60, 300, 25);
        frame.add(outputLabel);

        // Create a button
        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(150, 100, 100, 25);
        frame.add(convertButton);

        // Add action listener to the button
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Read input
                    double lightYears = Double.parseDouble(inputField.getText());

                    // Conversion logic (1 light-year = 9.461 trillion kilometers)
                    double kilometers = lightYears * 9.461e12;

                    // Convert to millions of kilometers
                    double trillionKilometers = kilometers / 1e12;

                    // Display the result
                    outputLabel.setText("Equivalent Distance (Trillion Km): " + trillionKilometers + " T km");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
