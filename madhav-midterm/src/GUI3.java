import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.DefaultCaret;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import java.awt.Font;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JSeparator;
import javax.swing.JEditorPane;

public class GUI3 extends JFrame 
{

	private JPanel contentPane;
	private JTextField txtEnterKeyword;
	private ArrayList <Product2> ListOStuff = new ArrayList <Product2>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI3 frame = new GUI3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI3()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtEnterKeyword = new JTextField();
		txtEnterKeyword.setText("Enter keyword");
		txtEnterKeyword.setToolTipText("enter what you want to find");
		txtEnterKeyword.setBounds(48, 142, 310, 20);
		contentPane.add(txtEnterKeyword);
		txtEnterKeyword.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 218, 564, 512);
		contentPane.add(scrollPane);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setContentType("text/html");
		scrollPane.setViewportView(editorPane);
		editorPane.addHyperlinkListener(new HyperlinkListener() {
		    public void hyperlinkUpdate(HyperlinkEvent e) {
		        if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) 
		        {
		        	if(Desktop.isDesktopSupported()) {
		        	    try {
							Desktop.getDesktop().browse(e.getURL().toURI());
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (URISyntaxException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
		        	}
		        }
		    }
		});
		

		
		JLabel lblPcPartFinder = new JLabel("PC Part Finder");
		lblPcPartFinder.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		lblPcPartFinder.setBounds(229, 21, 125, 39);
		contentPane.add(lblPcPartFinder);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Newegg", "TigerDirect"}));
		comboBox.setToolTipText("choose the website you want to search");
		comboBox.setBounds(48, 91, 310, 22);
		contentPane.add(comboBox);
		
		JButton btnFind = new JButton("Find");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				ListOStuff.clear();
				editorPane.setText(null);
				if(comboBox.getSelectedIndex()== 0)
				{
					Logic2.getInfoNewegg(txtEnterKeyword.getText(), ListOStuff);
					editorPane.setText(ListOStuff.toString().replace(",", "").replace("[", "").replace("]", "")  .trim());
					editorPane.setCaretPosition(0);
					if(ListOStuff.isEmpty())
						editorPane.setText("Sorry, Newegg doesn't have that");
				}
				else
				{
					Logic2.getInfoTiger(txtEnterKeyword.getText(), ListOStuff);
					editorPane.setText(ListOStuff.toString().replace(",", "\n").replace("[", "").replace("]", "")  .trim());
					editorPane.setCaretPosition(0);
					if(ListOStuff.isEmpty())
						editorPane.setText("Sorry, TigerDirect doesn't have that");

				}
			}
		});
		btnFind.setBounds(424, 141, 105, 23);
		contentPane.add(btnFind);
		JRootPane rootPane = SwingUtilities.getRootPane(btnFind); 
		rootPane.setDefaultButton(btnFind);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Name", "Price"}));
		comboBox_1.setToolTipText("choose how you want to sort");
		comboBox_1.setBounds(424, 92, 105, 20);
		comboBox_1.addActionListener
		(new ActionListener () 
		{
		    public void actionPerformed(ActionEvent e) 
		    {
		    	editorPane.setText(null);
		    	if(comboBox_1.getSelectedIndex() == 1)
		    	{
		    		Collections.sort
		    		(ListOStuff, new Comparator<Product2>() 
		    				{
		    					public int compare(Product2 it, Product2 it2)
		    					{
		    						if(!it.price.contains(".") && !it2.price.contains("."))
		    						{
		    							//System.out.println(Integer.MIN_VALUE);
		    							return Integer.MIN_VALUE;
		    						}
		    						else
		    						{
		    							if(it.price.contains(".") && !it2.price.contains("."))
		    							{
		    								return 0;
		    							}
		    							if(!it.price.contains(".") && it2.price.contains("."))
		    							{
		    								return Integer.MIN_VALUE;
		    							}
		    							else
		    							{
		    							String parse1 = it.price.substring(it.price.indexOf("$")+1, it.price.indexOf(".")+2).replace(",", "");
		    							String parse2 = it2.price.substring(it2.price.indexOf("$")+1, it2.price.indexOf(".")+2).replace(",", "");
		    							double x = (Double.parseDouble(parse1));
		    							double y = (Double.parseDouble(parse2));
		    							return (int) (x-y);
		    							}
		    						}
		    	        
		    					}
		    				}
		    				);
		    	}
		    	else
		    	{
		    		Collections.sort
		    		(ListOStuff,  new Comparator<Product2>()
		    		{
		    			public int compare(Product2 it, Product2 it2)
		    			{
		    				return it.name.compareTo(it2.name);
		    			}
		    				
		    		}
		    		);
		    	
		    	}    	
		    
		    	editorPane.setText((ListOStuff.toString().replace(",", "").replace("[", "").replace("]", "")  .trim()));
				editorPane.setCaretPosition(0);
		 
		
		    }
		}
		);
		contentPane.add(comboBox_1);
	}
}





