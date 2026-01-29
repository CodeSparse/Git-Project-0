
import java.util.ArrayList;
import java.util.Random;

public class Organizer {

	//For test users 
	static final String [] firstNames = {"John","Megan","Alex","Sarah","Michael","Emily","David","Jessica","Daniel","Ashley","Matthew","Amanda","Christopher","Brittany","Andrew","Samantha","James","Lauren","Joshua","Nicole","Ryan","Hannah","Brandon","Stephanie","Justin","Rachel","Kevin","Melissa","Brian","Kimberly","Tyler","Amber","Nicholas","Kayla","Jonathan","Victoria","Joseph","Olivia","Zachary","Madison","Adam","Brooke","Eric","Allison","Kyle","Natalie","Nathan","Chloe","Aaron","Sophia","Christian","Isabella","Jason","Grace","Sean","Lily","Benjamin","Emma","Patrick","Avery","Dylan","Zoe","Cameron","Paige","Evan","Claire","Luke","Julia","Jared","Morgan","Austin","Taylor","Jordan","Peyton","Trevor","Hailey","Cole","Savannah","Blake","Alexis","Dominic","Nevaeh","Parker","Mackenzie","Ian","Destiny","Leo","Vanessa","Marcus","Ruby","Oscar","Faith","Victor","Autumn","Maxwell","Sierra","Felix","Naomi","Julian","Riley"};
	static final String [] lastNames = {"Smith","Johnson","Williams","Brown","Jones","Garcia","Miller","Davis","Rodriguez","Martinez","Hernandez","Lopez","Gonzalez","Wilson","Anderson","Thomas","Taylor","Moore","Jackson","Martin","Lee","Perez","Thompson","White","Harris","Sanchez","Clark","Ramirez","Lewis","Robinson","Walker","Young","Allen","King","Wright","Scott","Torres","Nguyen","Hill","Flores"};
	

	public static void main (String [] args){

		ArrayList <User> userDatabase = createUserDatabase();

		userDatabase = organizeByFirst(userDatabase);

		for( User user : userDatabase){
			System.out.println(user);
		}
		
	}

	public static ArrayList <User> organizeByFirst(ArrayList <User> database){

		
		for(int i = 0 ; i < database.size() - 1 ; i++){

			for(int j = 0 ; j < database.size() - 1 - i ; j++){
				if( database.get(j).first_name().compareTo(database.get( j + 1 ).first_name()) < -1 ){
				User temp = database.get(j);
				database.set(j, database.get(j + 1));
				database.set(j + 1, temp);
				}
			}
			
		}

		return database;
		
	}

	public static ArrayList <User> organizeByID(ArrayList <User> database){

		

		for(int i = 0 ; i < database.size() - 1 ; i++){

			for(int j = 0 ; j < database.size() - 1 - i ; j++){
				if( database.get(j).id() > database.get( j + 1 ).id() ){
				User temp = database.get(j);
				database.set(j, database.get(j + 1));
				database.set(j + 1, temp);
				}
			}
			
		}

		System.out.println("Hello");

		return database;
	}


	//Creates random users
	public static ArrayList<User> createUserDatabase() {
		ArrayList <User> database= new ArrayList<>();
		
		for( int i = 0 ; i < 40 ; i ++ ){
			Random rand = new Random();
			String first = firstNames[ rand.nextInt( firstNames.length ) ];
			String last = lastNames[ rand.nextInt( lastNames.length ) ];
			int id = rand.nextInt(101);
			String email = last+"@gmail.com";
			String password = last+rand.nextInt(100,999);
			database.add(new User( first, last, id, email, password));
		}

		return database;
	}
}


