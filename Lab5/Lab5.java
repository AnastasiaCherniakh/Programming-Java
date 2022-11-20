package Lab5;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Objects;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;


public class Lab5 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JFrame labFrame = new lab5("Lab5");
                    }
                });

    }
    static class lab5 extends JFrame {

        lab5(String title) {
            super(title);
            JPanel mainPanel = new labPanel();
            add(mainPanel);
            int windWidth = 400, windHeight = 350;
            setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/2 - windWidth/2, Toolkit.getDefaultToolkit().getScreenSize().height/2 - windHeight/2, windWidth, windHeight);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            getContentPane().setBackground(new Color(237, 234, 230));
            setVisible(true);
        }

        class labPanel extends JPanel {
            int X = 30;
            labPanel() {
                setLayout(null);
                setBackground(new Color(195, 187, 147));

                Font title_font = new Font("Times New Roman", Font.BOLD, 20);
                Font main_font = new Font("Times New Roman", Font.BOLD, 16);
                Font additional_font = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17);
                Font additional_font2 = new Font("Times New Roman", Font.BOLD, 14);

                JLabel Title = new JLabel("<html><font color=#ab3d31>Реєстрація</font>");
                Title.setBounds(X+105,10,400,20);
                Title.setFont(title_font);
                add(Title);

                JLabel AddText = new JLabel("У вас вже є акаунт?");
                AddText.setBounds(X+30 , 45, 200, 20);
                AddText.setFont(additional_font);
                add(AddText);

                JLabel Link = new JLabel("<html><a color=green><U>Вхід</U></a>");
                Link.setBounds(X + 240, 45, 200, 20);
                Link.setFont(main_font);
                Link.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                Link.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        JOptionPane.showMessageDialog(lab5.this,
                                "Помилка доступу до бази даних",
                                "Помилка",
                                JOptionPane.WARNING_MESSAGE);
                    }
                });
                add(Link);

                JButton loginBtn = new JButton("Вхід");
                loginBtn.setFont(main_font);
                loginBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                loginBtn.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        JOptionPane.showMessageDialog(lab5.this,
                                "Помилка доступу до бази даних",
                                "Помилка",
                                JOptionPane.WARNING_MESSAGE);
                    }
                });
                add(loginBtn);

                JLabel Email = new JLabel("E-mail", SwingConstants.LEFT);
                Email.setBounds(X, 85, 200, 20);
                Email.setFont(main_font);
                add(Email);

                JTextField EmailTxt = new JTextField();
                EmailTxt.setBounds(X+75, 85, 200, 20);
                EmailTxt.setForeground(Color.gray);
                EmailTxt.setBorder(BorderFactory.createLineBorder(new Color(107, 102, 79), 1));
                add(EmailTxt);

                JLabel Password = new JLabel("Password", SwingConstants.LEFT);
                Password.setBounds(X, 125, 200, 20);
                Password.setFont(main_font);
                add(Password);

                JTextField PasswordTxt = new JTextField();
                PasswordTxt.setBounds(X + 75, 125, 200, 20);
                PasswordTxt.setForeground(Color.gray);
                PasswordTxt.setBorder(BorderFactory.createLineBorder(new Color(107, 102, 79), 1));
                add(PasswordTxt);

                JButton RegistrationBtn = new JButton("<html><font color=white>Зареєструватися</font>");
                RegistrationBtn.setBounds(100, 165, 200, 30);
                RegistrationBtn.setBackground(new Color(55, 96, 146));
                RegistrationBtn.setFont(main_font);

                JLabel RegistrationOpt = new JLabel("Або зареєструватись через");
                RegistrationOpt.setBounds(113, 205, 200, 20);
                RegistrationOpt.setFont(additional_font2);
                add(RegistrationOpt);

                JLabel Facebook = new JLabel(new ImageIcon("icon-facebook.png"));
                Facebook.setBounds(138, 235, 30, 30);
                Facebook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                add(Facebook);

                Facebook.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            Desktop.getDesktop().browse(new URI("https://www.facebook.com/ira.garko.7"));
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                });

                JLabel Gmail = new JLabel(new ImageIcon("icon-gmail.png"));
                Gmail.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                Gmail.setBounds(178, 235, 30, 30);
                add(Gmail);
                Gmail.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            Desktop.getDesktop().browse(new URI("https://mail.google.com/mail/u/?authuser=anastasia_cherniakh@knu.ua"));
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                });

                JLabel Twitter = new JLabel(new ImageIcon("icon-twitter.png"));
                Twitter.setBounds(218, 235, 30, 30);
                Twitter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                add(Twitter);
                Twitter.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            Desktop.getDesktop().browse(
                                    new URI("https://twitter.com/marvelstudios"));
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                });

                JLabel errorLabel = new JLabel();
                errorLabel.setBounds(105, 265, 210, 32);
                errorLabel.setForeground(Color.decode("#cf000f"));
                errorLabel.setFont(main_font);
                add(errorLabel);

                RegistrationBtn.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String regexLatin = "[a-zA-Z]{1}";
                        Pattern patternLatin = Pattern.compile(regexLatin);
                        Matcher latinEmail = patternLatin.matcher(EmailTxt.getText());
                        Matcher latinPassword = patternLatin.matcher(PasswordTxt.getText());

                        if (EmailTxt.getText().trim().isEmpty()) {
                            errorLabel.setText("Поле еmail не введене");
                        } else if(!latinEmail.find()) {
                            errorLabel.setText("Напишіть email латиницею");
                        } else if ((EmailTxt.getText().contains(" "))){
                            errorLabel.setText("Приберіть пробіл з email");
                        }else if (PasswordTxt.getText().trim().isEmpty()) {
                            errorLabel.setText("Поле пароль не введене");
                        } else if (!latinPassword.find()) {
                            errorLabel.setText("Напишіть пароль латиницею");
                        } else if ((PasswordTxt.getText().contains(" "))) {
                            errorLabel.setText("Приберіть пробіл з паролю");
                        } else {
                            errorLabel.setText("");
                            Object[] options = { loginBtn };
                            int n = JOptionPane.showOptionDialog(lab5.this,
                                    "Реєстрація успішна",
                                    "lab5",
                                    JOptionPane.YES_NO_OPTION,
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    options,
                                    options[0]);
                            System.exit(0);
                        }
                    }
                });
                add(RegistrationBtn);
            }

            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Graphics2D line = (Graphics2D)g;
                line.setColor(new Color(55, 96, 146));
                line.fillRect(X, 215, 60, 2);
                line.fillRect(300, 215, 60, 2);
            }
        }

    }
}
