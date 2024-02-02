
public class HPerson {
	
	String name;
	String surname;
	int age;
	
	public HPerson(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public HPerson makePerson(HPerson person) throws UnderAgeException{
		
		if(this.age < 18 || person.age < 18) {
			throw new UnderAgeException();
		}
		
		HPerson child = new HPerson(this.name, person.surname, 0);
		return child;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "HelloPerson: " + name + " " + surname + ", " + age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HPerson yoongi = new HPerson("Yoongi", "Min", 30);
		HPerson hyein = new HPerson("Hyein", "Lee", 15);
		
	}

}
