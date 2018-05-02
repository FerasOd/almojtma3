package View;

import java.sql.Date;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;

import java.awt.Scrollbar;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JScrollBar;

public class clients extends javax.swing.JFrame{
	private static clients client;

	private JTable table;
	private JTable table_1;
	private JTextField SearchFeld;
	
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		jf.setUndecorated(true);
		
	    new login().setVisible(true);
	    //atarem    lko7ot    hod3ot   todoo 
	}
	
	
	public clients() {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		String[] columnNames = {"First Name", "Last Name","Id","Age", "Start Date","End Date", "car","Insurance","price","massages"};
		Object[][] data = {// hay bs 3shan aldogma b3den mnze7ha wmn7ot alnitonem alle mno5edhn mn aldata base
				{"First Name", "Last Name","Id","Age", "Start Date","End Date", "car","Insurance","price","massages"},
				{"Kathy", "Smith", "sdgfsdf", "hh","hhh","dd", "car","sad geml","price","massages"},
				};
	initComponents();
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(true);
	getContentPane().setLayout(null);
	 
	 JScrollPane scrollPane = new JScrollPane();
	 scrollPane.setBounds(20, 137, 964, 377);
	 getContentPane().add(scrollPane);
	 
	 
	 
	 table_1 = new JTable(data,columnNames);
	 scrollPane.setViewportView(table_1);
	 table_1.setSurrendersFocusOnKeystroke(true);
	 table_1.setCellSelectionEnabled(true);
	 table_1.setFillsViewportHeight(true);
	 table_1.setEnabled(false);
	 
	 JButton BackBTN = new JButton("");
	 BackBTN.setIcon(new ImageIcon(clients.class.getResource("/images/BackBTN.png")));
	 BackBTN.setBounds(20, 11, 49, 51);
	 BackBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	 BackBTN.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
             MainMenuBTNMouseClicked(evt);
         }
		});
	 getContentPane().add(BackBTN);
	 
	 JLabel lblClients = new JLabel("Clients");
	 lblClients.setFont(new Font("Dialog", Font.PLAIN, 46));
	 lblClients.setBounds(354, 1, 247, 88);
	 getContentPane().add(lblClients);
	 
	 JButton AddUserBTN = new JButton("");
	 AddUserBTN.setIcon(new ImageIcon(clients.class.getResource("/images/95122_add_512x512.png")));
	 AddUserBTN.setBounds(248, 83, 63, 43);
	 getContentPane().add(AddUserBTN);
	 
	 SearchFeld = new JTextField();
	 SearchFeld.setText("Search Field");
	 SearchFeld.setHorizontalAlignment(SwingConstants.CENTER);
	 SearchFeld.setForeground(Color.GRAY);
	 SearchFeld.setFont(new Font("Serif", Font.BOLD, 20));
	 SearchFeld.setBounds(20, 96, 150, 30);
	 getContentPane().add(SearchFeld);
	 
	 JButton SearchBTN = new JButton("");
	 SearchBTN.setIcon(new ImageIcon(clients.class.getResource("/images/Search.png")));
	 SearchBTN.setBounds(180, 96, 30, 30);
	 getContentPane().add(SearchBTN);
	 
	 JButton logoutBTN = new JButton("");
	 logoutBTN.setIcon(new ImageIcon(clients.class.getResource("/images/logout.png")));
	 logoutBTN.setBounds(935, 0, 49, 51);
	 logoutBTN.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
         	logoutBTNMouseClicked(evt);
         }
		});
	 getContentPane().add(logoutBTN);
	 
	 JLabel lblNewLabel = new JLabel("");
	 lblNewLabel.setIcon(new ImageIcon(clients.class.getResource("/images/whiteeee.png")));
	 lblNewLabel.setBackground(Color.WHITE);
	 lblNewLabel.setForeground(Color.WHITE);
	 lblNewLabel.setBounds(0, 0, 984, 561);
	 getContentPane().add(lblNewLabel);
	 
	 JLabel lblNewLabel_1 = new JLabel("New label");
	 lblNewLabel_1.setIcon(new ImageIcon(clients.class.getResource("/images/background.jpg")));
	 lblNewLabel_1.setBounds(0, 0, 594, 561);
	 getContentPane().add(lblNewLabel_1);
     
    
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
	
	 private void MainMenuBTNMouseClicked(java.awt.event.MouseEvent evt) {                                   

		 mainmenu MM = mainmenu.getInstance();
         this.setVisible(false);
         MM.setVisible(true); 
	 }
	
	public static clients getInstance(){
        if(client == null)
        	client = new clients();
        
        return client;
    }
}
