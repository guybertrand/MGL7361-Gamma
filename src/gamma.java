package ca.uqam.mgl7361.a2011.gamma.hello;

public class Bonjour {
    	public String bonjour(String nom) {
            return String.format("Bonjour %s!", nom);
	}

	public static void main (String... args) {
		Bonjour b = new Bonjour();
		System.out.println(b.bonjour("le monde"));
        }
}


