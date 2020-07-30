package main.java.temperatureConverterHW6WithSwing;

import javax.swing.*;
import java.awt.*;

// ДЗ 6. Перевод гладусов цельсия в другие измерения

public class TemperatureWindow extends JFrame {

    public TemperatureWindow() {
        setTitle("Converter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 200, 250, 300);
        setResizable(false);

        JTextField fieldToConvert = new JTextField();
        fieldToConvert.setEditable(true);
        fieldToConvert.setHorizontalAlignment(0);
        fieldToConvert.setText("Please enter celsius degrees here");
        fieldToConvert.addCaretListener(l -> {
            try {
                fieldToConvert.setText("");
            } catch (IllegalStateException ex) {

            }
        });
        JTextArea areaConverted = new JTextArea();
        areaConverted.setEditable(false);

        JButton convertButton = new JButton("Convert");
        convertButton.setEnabled(true);
        convertButton.addActionListener(i -> {
            String celsiusDegreesString = fieldToConvert.getText().replaceAll(",", ".");
            if (celsiusDegreesString.isEmpty()) {
                areaConverted.setText("No celsius degrees to convert");
            } else {
                try {
                    BaseConverter baseConverter = new BaseConverter(Double.parseDouble(celsiusDegreesString));
                    areaConverted.setText(baseConverter.toString());
                } catch (NumberFormatException ex) {
                    areaConverted.setText("Please enter only celsius degrees");
                }
            }
        });

        GridLayout gridLayout = new GridLayout(3, 1);
        setLayout(gridLayout);
        add(fieldToConvert, gridLayout, 0);
        add(convertButton, gridLayout, 1);
        add(areaConverted, gridLayout, 2);
        setVisible(true);
    }
}
