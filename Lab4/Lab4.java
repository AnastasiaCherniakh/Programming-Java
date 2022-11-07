import java.awt.*;
import javax.swing.*;

public class Lab4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        JFrame labFrame = new lab4("Lab4");
                    }
                });

    }
    static class lab4 extends JFrame {

        lab4(String title) {
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

                JLabel Link = new JLabel("<html><font color=green><U>Вхід</U></font>");
                Link.setBounds(X + 240, 45, 200, 20);
                Link.setFont(main_font);
                add(Link);

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
                add(RegistrationBtn);

                JLabel RegistrationOpt = new JLabel("Або зареєструватись через");
                RegistrationOpt.setBounds(113, 205, 200, 20);
                RegistrationOpt.setFont(additional_font2);
                add(RegistrationOpt);

                JLabel Facebook = new JLabel(new ImageIcon("icon-facebook.png"));
                Facebook.setBounds(138, 235, 30, 30);
                add(Facebook);

                JLabel Gmail = new JLabel(new ImageIcon("icon-gmail.png"));
                Gmail.setBounds(178, 235, 30, 30);
                add(Gmail);

                JLabel Twitter = new JLabel(new ImageIcon("icon-twitter.png"));
                Twitter.setBounds(218, 235, 30, 30);
                add(Twitter);
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
