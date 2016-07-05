import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JOptionPane;

public class MainGUI extends JFrame{
	private JList Files;
	private JButton download;
	private JButton upload;
	private JButton share;
	private JButton remove;
	
	
	private JLabel file;
	
	private String[] filenames = {"1","2","3","4","5"};
	
	private Rectangle bounds;
	
	public MainGUI(){
		super("My Drop Box");
		setLayout(new FlowLayout());
		
		//adding file name label
		file = new JLabel("LIST OF YOUR FILES ON SERVER");
		add(file);
		
		//adding of filenames
		Files = new JList(filenames);
		add(new JScrollPane(Files));
		Files.setVisibleRowCount(3);
		Files.setFixedCellWidth(200);
		Files.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		//download button
		download = new JButton("DOWNLAOD");
		add(download);
		download.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String filename = Files.getSelectedValue().toString();
				//do whatever to download the crap 
				//unimplemented
				
			}
		});;
		
		
		//upload button
		upload = new JButton("UPLOAD");
		add(upload);
		upload.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String dir = JOptionPane.showInputDialog("Enter the directory of file:");
				//do whatever to upload the crap 
				//unimplemented
				
			}
		});;
		
		
		
		//share button
		share = new JButton("SHARE");
		add(share);
		share.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String file = Files.getSelectedValue().toString();
				String dir = JOptionPane.showInputDialog("Enter the username whom you want to share with:");
				//do whatever to download the crap 
				//unimplemented
				
			}
		});;
		
		
		//add Remove button
		remove = new JButton("REMOVE");
		add(remove);
		remove.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String file = Files.getSelectedValue().toString();
			}
		});
		
		
		//Customizations on frame
		setSize(280,200);
		setVisible(true);
		bounds = new Rectangle(280,200);
		setMaximizedBounds(bounds);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
