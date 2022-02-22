public class Exe3 {

		public static void main(String[] args) {

			String name = "Jayawdhut";
			String pass = "Jay@8208";
			Authentication p = ((username, password) -> {
				if (username.equals(name) && password.equals(pass))
					return true;
				else
					return false;
			});
			System.out.println(p.checkIdentity("Jayawdhut", "Jay@8208"));
		}
		
public interface Authentication {
			
			boolean checkIdentity(String username, String password);

		}
	}