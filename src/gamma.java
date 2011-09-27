package gamma;

public class gamma {
    	public String bonjour(String nom) {
            return String.format("Bonjour %s!", nom);
	}

	public static void main (String... args) {
		gamma b = new gamma();
		System.out.println(b.bonjour("le monde"));
        }
        
        // un commentaire pour Alex
}


