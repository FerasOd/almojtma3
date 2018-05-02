package View;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends javax.swing.JFrame{
	
	private static login login;
	private JTextField username;
	private JPasswordField password;
	
//	public static void main(String[] args) {
//		JFrame jf = new JFrame();
//		jf.setExtendedState(JFrame.MAXIMIZED_BOTH); 
//		jf.setUndecorated(true);
//		
//	    new login().setVisible(true);
//	    //atarem    lko7ot    hod3ot   todoo 
//	}
	public login() {
		getContentPane().setForeground(Color.BLACK);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setBackground(Color.WHITE);
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
		 
		 
		initComponents();
		this.setLocationRelativeTo(null);//hay lbkoda bt5ale alwindow yfta7 bnos alshashe
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel lblAlmojtamaa = new JLabel("ALMOJTAMAA");
		lblAlmojtamaa.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 65));
		lblAlmojtamaa.setForeground(Color.WHITE);
		lblAlmojtamaa.setBackground(Color.WHITE);
		lblAlmojtamaa.setBounds(234, 0, 454, 81);
		getContentPane().add(lblAlmojtamaa);
		
		JLabel label_2 = new JLabel("Insurance Car Company");
		label_2.setFont(new Font("Arial", Font.PLAIN, 18));
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(334, 75, 247, 22);
		getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel();
		label_3.setText("Log In Please");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 48));
		label_3.setBounds(326, 185, 273, 30);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel();
		label_4.setForeground(Color.WHITE);
		label_4.setText("USER NAME");
		label_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		label_4.setBounds(396, 229, 130, 30);
		getContentPane().add(label_4);
		
		username = new JTextField();
		username.setText("Enter User Name");
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setForeground(Color.LIGHT_GRAY);
		username.setFont(new Font("Serif", Font.BOLD, 20));
		username.setBounds(280, 259, 360, 50);
		getContentPane().add(username);
		
		JLabel label_5 = new JLabel();
		label_5.setForeground(Color.WHITE);
		label_5.setText("PASSWORD");
		label_5.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		label_5.setBounds(396, 320, 150, 30);
		getContentPane().add(label_5);
		
		JButton logInBTN = new JButton("");
		logInBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		logInBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainMenuBTNMouseClicked(evt);
            }
		});
		
		password = new JPasswordField();
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setText("password");
		password.setBounds(280, 350, 360, 50);
		getContentPane().add(password);
		logInBTN.setIcon(new ImageIcon(login.class.getResource("/images/login.png")));
		logInBTN.setBounds(350, 430, 220, 70);
		getContentPane().add(logInBTN);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setIcon(new ImageIcon(login.class.getResource("/images/background.jpg")));
		backgroundLabel.setBounds(0, 0, 1022, 571);
		getContentPane().add(backgroundLabel);
//        if(username.getText().length() <1)
//            username.setText("User Name");
//        else
//             username.setForeground(Color.black);
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
		jf.setUndecorated(true);

	    
		jf.setVisible(true);
		
		
		
	}
	 private void MainMenuBTNMouseClicked(java.awt.event.MouseEvent evt) {                                   

		 mainmenu MM = mainmenu.getInstance();
         this.setVisible(false);
         MM.setVisible(true); 
 }
	 public static login getInstance(){
	        if(login == null)
	        	login = new login();
	        
	        return login;
	    }
}
