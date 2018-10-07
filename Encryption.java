/*****CRYPTOGRAPHY.JAVA******/
package com.ngtlearning;

//import java.util.Scanner;   WHy is this necessary? The code still runs the same...
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Cryptography {
	Random randomGenerator;
	// Create a string containing characters a-z, A-Z, . and 0-9
	
	public String alphanumeric = "abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890.";
	
	public ArrayList<String> alphabetArrayList = 
			new ArrayList<String>(Arrays.asList(alphanumeric.split("")));
  
	public Cryptography(long key) {
		//Makes a random order alphabet and numbers for the encryption and puts it in the array alphabet StringArray
		alphabetArrayList.remove("");
		randomGenerator = new Random(key);
		//Shuffle the alphabetArrayList randomly based on the seed key
		Collections.shuffle(alphabetArrayList, randomGenerator);
		
		//Add three extra special characters at the end of the alphabetArrayList as we will replace char with char + 2 later in the encrypt and decrypt
		alphabetArrayList.add("_");
		alphabetArrayList.add("@");
		alphabetArrayList.add("$");
		//END of the section that makes random order alphabet
	}
	
public String encrypt(String input){
	String result = ""; // String where the encrypted text will be stored
	if((input.indexOf("@") == -1) && (input.indexOf("$") ==-1) && (input.indexOf("_") == -1)) { //Check that entire text is valid
		input = input.replaceAll(" ", "_"); //Change spaces to underscores
		
		char[] charachters = input.toCharArray();
		for (int i = 0; i < charachters.length; i++) { //for each char in the string
			char c = charachters[i];
			//Make sure the character is in alphabetArrayList
			if(alphabetArrayList.contains(String.valueOf(c))){
				//Move the letter 2 letters forward in scrambled alphabet
				result = result +
						alphabetArrayList.get(alphabetArrayList.indexOf(String.valueOf(c)) +2);
			
			}else {
				return "Error!-Invalid String, only alphabets, Numbers, . and " + "Spaces are allowed";
			}
			}
	}else{
		return "Error!-Invalid String, only Alphabets, Numbers, . and Spaces are allowed";
		
		
	}
return result; //return the encrypted string
}

public String decrypt (String encryptedInput)
{
	String result = ""; //String where the decrypted text will be stored
	if((encryptedInput.indexOf(alphabetArrayList.get(0)) == -1) && (encryptedInput.indexOf(alphabetArrayList.get(1)) == -1) && (encryptedInput.indexOf(" ") == -1)){ //Check that entire text is valid
		char[] characters = encryptedInput.toCharArray();
		for(int i = 0; i < characters.length; i++) { //for each characters in the string
			char c = characters[i];
			//Make sure the hter is in alphabetArrayList
			if(alphabetArrayList.contains(String.valueOf(c))){
				//Move the letter 2 letters back in our scrambled alphabet
				result = result +
						alphabetArrayList.get(alphabetArrayList.indexOf(String.valueOf(c))-2);
			}else{
				return null; //if invalid, return null(0)
			}
		}
	}else{
		return null; //if invalid, return null(0)
	}
	result = result.replaceAll("_"," "); //replace all underscores with spaces LOGIC_BRAND
	return result; //return the decrypted string
	
	}
}

/*******ENCRYPT/DECRYPT UI.java*********/
package com.ngtlearning;

	import java.awt.BorderLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.*;

	public class EncryptDecryptUI {
		static Cryptography cryptography;
		static JFrame frame;
		public static void main(String[] args) {
			//Create a new JFrame
			frame = new JFrame("Encrypt and Decrypt");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setResizable(false);
		    
		    // Create three JPanel, each will represent one row
			JPanel a = new JPanel();
			JPanel b = new JPanel();
			JPanel c = new JPanel();
			
			// Add a Label, TextField and a Button to first row. 
			final JLabel keyLabel = new JLabel("Enter shared encryption key:");
			final JTextField key = new JTextField();
			key.setColumns(20);
			JButton keyButton = new JButton("Activate Key");
			a.add(keyLabel, BorderLayout.WEST);
			a.add(key, BorderLayout.CENTER);
			a.add(keyButton, BorderLayout.EAST);
			// Add a action listener for JButton
			keyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			try{
				cryptography = new Cryptography(Long.valueOf(key.getText()));
				if(Long.valueOf(key.getText())<=0){
					cryptography= null;
					throw new Exception();
				}
				}catch(Exception e){
					JOptionPane.showMessageDialog(frame,
					    "Please enter a valid number key less than "
					    +(Long.MAX_VALUE-1L)+" and more than 0",
					    "Invalid Input",
					    JOptionPane.ERROR_MESSAGE);
				}
					
				}
			});
			
			// Add a Label, TextField and a Button to second row.
			final JLabel textLabel = new JLabel("Enter text to encrypt:");
			final JTextField text = new JTextField();
			text.setColumns(40);
			JButton textButton = new JButton("Encrypt");
			textButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					if(cryptography == null){
						JOptionPane.showMessageDialog(frame,
							    "Please enter and activate key first",
							    "Activate Key",
							    JOptionPane.ERROR_MESSAGE);
					}else{
						showOutput(cryptography.encrypt(text.getText()));
					}	
				}
			});
			b.add(textLabel, BorderLayout.WEST);
			b.add(text, BorderLayout.CENTER);
			b.add(textButton, BorderLayout.EAST);
			
			// Add a Label, TextField and a Button to third row.
			final JLabel decryptLabel = new JLabel("Enter encrypted text:");
			final JTextField textToDecrypt = new JTextField();
			textToDecrypt.setColumns(40);
			JButton decryptButton = new JButton("Decrypt");
			decryptButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					if(cryptography == null){
						JOptionPane.showMessageDialog(frame,
							    "Please enter and activate key first",
							    "Activate Key",
							    JOptionPane.ERROR_MESSAGE);
					}else{
						showOutput(cryptography.decrypt(textToDecrypt.getText()));
					}
					
				}
			});
			
			c.add(decryptLabel, BorderLayout.WEST);
			c.add(textToDecrypt, BorderLayout.CENTER);
			c.add(decryptButton, BorderLayout.EAST);
			
			// Add three JPanel(rows) to the frame.
			frame.getContentPane().add(a, BorderLayout.NORTH);
			frame.getContentPane().add(b, BorderLayout.CENTER);
			frame.getContentPane().add(c, BorderLayout.SOUTH);
			
	        frame.pack();
	        frame.setVisible(true);  
			}

		public static void showOutput(String s){
			
			JTextArea textArea = new JTextArea(10, 10);
			
			textArea.setText(s);
			
			textArea.setWrapStyleWord(true);
			textArea.setLineWrap(true);
			textArea.setCaretPosition(0);
			textArea.setEditable(false);
			
			JOptionPane.showMessageDialog(frame,new JScrollPane(textArea));
		}
		
	}
