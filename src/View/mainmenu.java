package View;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;

public class mainmenu extends javax.swing.JFrame{
	
	private static mainmenu mainmenu;
	
	public mainmenu() {
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
		initComponents();
		this.setLocationRelativeTo(null);//hay lbkoda bt5ale alwindow yfta7 bnos alshashe

		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(true);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton messagesBTN = new JButton("");
		messagesBTN.setIcon(new ImageIcon(mainmenu.class.getResource("/images/sms.png")));
		messagesBTN.setBounds(805, 115, 71, 64);
		getContentPane().add(messagesBTN);
		
		JButton todooBTN = new JButton("");
		todooBTN.setIcon(new ImageIcon(mainmenu.class.getResource("/images/list.png")));
		todooBTN.setBounds(592, 115, 71, 64);
		getContentPane().add(todooBTN);
		
		JButton ClientsBTN = new JButton("");
		ClientsBTN.setIcon(new ImageIcon(mainmenu.class.getResource("/images/clients.png")));
		ClientsBTN.setBounds(592, 310, 71, 64);
		ClientsBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	ClientBTNMouseClicked(evt);
            }
		});
		getContentPane().add(ClientsBTN);
		
		JButton websBTN = new JButton("");
		websBTN.setIcon(new ImageIcon(mainmenu.class.getResource("/images/webs.png")));
		websBTN.setBounds(805, 310, 71, 64);
		getContentPane().add(websBTN);
		
		JButton logoutBTN = new JButton("");
		logoutBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	logoutBTNMouseClicked(evt);
            }
		});
		logoutBTN.setIcon(new ImageIcon(mainmenu.class.getResource("/images/logout.png")));
		logoutBTN.setBounds(10, 11, 60, 64);
		getContentPane().add(logoutBTN);
		
		JButton btnEditProfile = new JButton("Edit profile");
		btnEditProfile.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 14));
		btnEditProfile.setBounds(869, 11, 101, 30);
		getContentPane().add(btnEditProfile);
		
		JLabel lblMessages = new JLabel();
		lblMessages.setText("Messages");
		lblMessages.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblMessages.setBounds(801, 190, 150, 30);
		getContentPane().add(lblMessages);
		
		JLabel lblToDooList = new JLabel();
		lblToDooList.setText("To DOO List");
		lblToDooList.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblToDooList.setBounds(563, 196, 150, 30);
		getContentPane().add(lblToDooList);
		
		JLabel lblClients = new JLabel();
		lblClients.setText("Clients");
		lblClients.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblClients.setBounds(595, 385, 150, 30);
		getContentPane().add(lblClients);
		
		JLabel lblWebs = new JLabel();
		lblWebs.setText("webs");
		lblWebs.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblWebs.setBounds(820, 385, 150, 30);
		getContentPane().add(lblWebs);
		
		JLabel lblLogout = new JLabel("LogOut");
		lblLogout.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		lblLogout.setBounds(10, 81, 79, 30);
		getContentPane().add(lblLogout);
		
		JLabel lblWelcomeToAlmojtamaa = new JLabel("Welcome to ALMOJTAMAA ");
		lblWelcomeToAlmojtamaa.setForeground(Color.WHITE);
		lblWelcomeToAlmojtamaa.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 37));
		lblWelcomeToAlmojtamaa.setBounds(20, 86, 485, 219);
		getContentPane().add(lblWelcomeToAlmojtamaa);
		
		JLabel lblCarInauranceCompany = new JLabel("car insurance company");
		lblCarInauranceCompany.setForeground(Color.WHITE);
		lblCarInauranceCompany.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 35));
		lblCarInauranceCompany.setBounds(89, 229, 368, 51);
		getContentPane().add(lblCarInauranceCompany);
		
		JLabel lblNewLabel = new JLabel("A satisfied customer is the best business startegy of all");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(30, 325, 460, 64);
		getContentPane().add(lblNewLabel);
		
		
		
		JLabel labelBackgroound = new JLabel();
		labelBackgroound.setIcon(new ImageIcon(mainmenu.class.getResource("/images/background.jpg")));
		labelBackgroound.setBounds(-12, -42, 1124, 592);
		getContentPane().add(labelBackgroound);
	}
	
	public static mainmenu getInstance(){
        if(mainmenu == null)
        	mainmenu = new mainmenu();
        
        return mainmenu;
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
	
	private void logoutBTNMouseClicked(java.awt.event.MouseEvent evt) {                                   

		login l = login.getInstance();
        this.setVisible(false);
        l.setVisible(true); 
}
	private void ClientBTNMouseClicked(java.awt.event.MouseEvent evt) {                                   

		clients c = clients.getInstance();
        this.setVisible(false);
        c.setVisible(true); 
}
}
