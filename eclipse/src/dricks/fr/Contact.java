package dricks.fr;

public class Contact {

	private String userLastName;
	private String userFirstName;
	private String userPhone;
	private String userAdress;
	
		public Contact(String userLastName, String userFirstName, String userPhone, String userAdress) {
			this.userLastName = userLastName;  
			this.userFirstName = userFirstName;
			this.userPhone = userPhone;
			this.userAdress = userAdress;         
		}


		public String getUserLastName() {
			return userLastName;
		}

		public void setUserLastName(String userLastName) {
			this.userLastName = userLastName;
		}

		public String getUserFirstName() {
			return userFirstName;
		}

		public void setUserFirstName(String userFirstName) {
			this.userFirstName = userFirstName;
		}

		public String getUserPhone() {
			return userPhone;
		}

		public void setUserPhone(String userPhone) {
			this.userPhone = userPhone;
		}

		public String getUserAdress() {
			return userAdress;
		}

		public void setUserAdress(String userAdress) {
			this.userAdress = userAdress;
		}


		@Override
		public String toString() {
			return 	"Nom : "+userLastName+"\n"+
					"Prenom : "+userFirstName+"\n"+
					"Numero de telephone : "+userPhone+"\n"+
					"Adresse : "+userAdress+"\n";
		}
		
		
		
}
