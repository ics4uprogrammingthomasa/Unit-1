import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//Add pop-up capability
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class HelloWorldGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorldGUI window = new HelloWorldGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		// Change UI background and panel color
		UIManager.put("OptionPane.background", Color.cyan);
	    UIManager.put("Panel.background", Color.cyan);
	    UIManager.put("label", Color.blue);
	    
	    
	}

	/**
	 * Create the application.
	 */
	public HelloWorldGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 191, 255));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 550, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Create Strings
	    String closer = "Created By";
		String name = "Thomas Aubin";
		String course = "Course: ICS4UR";
		
		JLabel lblCredits = new JLabel("");
		lblCredits.setBounds(10, 11, 400, 23);
		frame.getContentPane().add(lblCredits);
		
		JLabel lblHelloWorld = new JLabel("Hello World!");
		lblHelloWorld.setForeground(new Color(46, 139, 87));
		lblHelloWorld.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblHelloWorld.setBounds(200, 65, 119, 16);
		frame.getContentPane().add(lblHelloWorld);
		// Hide Hello World Text
		lblHelloWorld.setVisible(false);
		
		
		JButton btnShowMessage = new JButton("Show Message");
		btnShowMessage.addMouseListener(new MouseAdapter() {
			@Override
			// When 'Show Button' is pressed
			public void mousePressed(MouseEvent arg0) {
				// Show 'Hello World' text
				lblHelloWorld.setVisible(true);
				
				// Set 
				lblCredits.setText(closer + " " + name + "          " + course);
			}
		});
		btnShowMessage.setForeground(new Color(46, 139, 87));
		btnShowMessage.setBounds(25, 261, 133, 30);
		frame.getContentPane().add(btnShowMessage);
		
		JButton btnShowPopup = new JButton("Show Popup");
		btnShowPopup.addMouseListener(new MouseAdapter() {
			@Override
			// When 'Show Pop-Up' is pressed
			public void mousePressed(MouseEvent arg0) {
				// Create dialog window with "Hello World"
				JOptionPane.showMessageDialog(null, "Hello, World");
				
				//JLabel lblCredits.setText("hi");
			}
		});
		btnShowPopup.setForeground(new Color(0, 128, 0));
		btnShowPopup.setBounds(374, 265, 133, 23);
		frame.getContentPane().add(btnShowPopup);
		
		JLabel label = new JLabel("");
		label.setEnabled(false);
		label.setIcon(new ImageIcon("C:\\Users\\s405546\\eclipse-workspace\\HelloWorld GUI (Thomas Aubin)\\pics\\Computer Pun.png"));
		label.setBounds(160, 95, 213, 151);
		frame.getContentPane().add(label);
	}
}