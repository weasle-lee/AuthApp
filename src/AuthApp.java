
public class AuthApp {

	public static void main(String[] args) {
		
		String[] users = {"egoing" , "jinhyuk", "youbin"};
		String inputId = args[0];
		
		boolean isLogined = false;
		
		for(int i=0;i<users.length;i++) {
			String currentId = users[i];
			if(currentId.equals(inputId)) {
				isLogined = true;
				break;
			}
		}
		System.out.println("Hi");
		if(isLogined) {
			System.out.println("Master!");
		}
		else {
			System.out.println("who are you");
		}
		
	}
	}
