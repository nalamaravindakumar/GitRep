package lambda3.abc;

public class Password {
	public static void main(String[] args) {

		String name = "Aravindnalam";
		String pass = "Aravind@1996";
		Authentication p = ((username, password) -> {
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		System.out.println(p.checkIdentity("Aravindnalam", "Aravind@1996"));
	}

}
