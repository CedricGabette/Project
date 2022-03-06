/*Author GABETTE Cédric
 * cedric.gab687@outlook.com
 * 
 * -- Annuaire (PhoneBook) --
 * Asking information about an user to get his data and to store it in a file.txt
 */

/*Ideas for improving the code
 * -> Create CSV file
 * -> Verify the type and the case given by the user
 * -> Use Long type for "userPhone"
 * -> Encrypt the information with a key for decrypting later
 * -> Create an UI
 */



package dricks.fr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneBook {

	//Choose the location of the file
	public static final String PATH = "C:\\Users\\drick\\Documents\\DOSSIER_PROGRAMMATION\\JAVA\\repo\\annuaire.txt";
	public static Scanner sc = null;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
				
		//User data 
		String userLastName 	= getInput("Nom ?");
		String userFirstName 	= getInput("Prenom ?");
		String userPhone 		= getInput("Num de tel ?");
		String userAdress 		= getInput("Adresse ?");
		
		Contact data = new Contact(userLastName, userFirstName, userPhone, userAdress);
		
		//Generating a object phoneBookFile globaly
		File phoneBookFile = fileGenerator(PATH);
		transferToFile(phoneBookFile, data);
		
		//Pour une utilisation de maintenance uniquement
		//phoneBookFile.delete();
		
		sc.close();
	}
	
	//Verify and create a phoneBookFile in chosen location
	public static File fileGenerator(String PATH) {
		
		File phoneBookFile = new File(PATH);
		
		if(phoneBookFile.exists()) {
			System.out.println("PhoneBook already exists !");
			return phoneBookFile;
		}
		else {
			try {
				phoneBookFile.createNewFile();
				System.out.println("PhoneBook created !");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return phoneBookFile;
	}

	//Get informations
	public static String getInput(String inputText) {
		System.out.println(inputText);
		return sc.nextLine();
	}
	
	//Fill the phoneBookFile through a stream
	public static void transferToFile(File phoneBookFile, Contact data) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(phoneBookFile, true));
			bw.append(data.toString());
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
