package java1.homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {
    private static int counter = 0;
    private static int stepCount = 0;
    private static JLabel counterValueView, stepCounterLable;
    private static final int COUNT_START = 0;

    public static void main(String[] args) {
        JFrame mainFrame = initFrame();

        Font font = new Font("Arial", Font.BOLD, 15);

        createStepCounter(mainFrame); // создаем поле ввода для шага
        createCounterView(mainFrame, font); // создаем label счетчик
        createButtons(mainFrame, font); // создаем кнопки навигации
        isEnterStepCounter(); // проверяем задан ли шаг для счетчика
        mainFrame.setVisible(true); // отображаем панель


    }

    private static boolean isEnterStepCounter() {
        if (stepCount == 0) {
            counterValueView.setText("Задайте шаг для счетчика. Введите в поле ввода числовое значение и нажмите ENTER");
            return false;
        } else {
            counterValueView.setText("Шаг для счетчика задан: "+ stepCount + ". Теперь вы можете нажимать на кнопки - и +");
            return true;

        }
    }

    private static void createStepCounter(JFrame mainFrame) {
        JTextField field = new JTextField();
        mainFrame.add(field, BorderLayout.PAGE_START);
        field.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                stepCount += Integer.valueOf(field.getText());
                field.setText(null);
                isEnterStepCounter();
            }
        });
    }

    private static JFrame initFrame() {
        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("Counter");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setBounds(300, 300, 800,200);
        return mainFrame;
    }

    private static void createCounterView(JFrame mainFrame, Font font) {

        counterValueView = new JLabel(getCounterValueAsText());
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        counterValueView.setFont(font);
        mainFrame.add(counterValueView, BorderLayout.CENTER);
    }

    private static String getCounterValueAsText() {
        return String.valueOf(counter);
    }

    private static void createButtons(JFrame mainFrame, Font font) {
        JButton decrementButton = new JButton("-");
        decrementButton.setFont(font);
        mainFrame.add(decrementButton, BorderLayout.LINE_START);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isEnterStepCounter()) {
                    counter = counter - stepCount;
                    counterValueView.setText(String.valueOf(counter));
                }
            }
        });

        JButton incrementButton = new JButton("+");
        decrementButton.setFont(font);
        mainFrame.add(incrementButton, BorderLayout.LINE_END);

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isEnterStepCounter()) {
                    counter = counter + stepCount;
                    counterValueView.setText(String.valueOf(counter));
                }
            }
        });

        JButton resetButton = new JButton("Reset");
        resetButton.setFont(font);
        mainFrame.add(resetButton, BorderLayout.PAGE_END);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stepCount = 0;  //обнуляем шаг
                counter = 0;    //обнуляем значение каунтера
                counterValueView.setText(String.valueOf(counter)); // обнуляем отображение счетчика
                isEnterStepCounter(); // проверяем нужно ли заполнять шаг
            }
        });

        }

}