class Address
{
	String country, state, city;
	int streetNum;

	Address(int num,String city, String state, String country) {
		this.country=country;
		this.state=state;
		this.city=city;
		streetNum=num;
	}
}

class Student
{
	String name;
	int rollno;
	Address add;
	Student(String name, int r, Address a) {
		this.name=name;
		rollno=r;
		add=a;
	}
	
	void display()
	{
		System.out.println(name + " " + rollno + " " + add.streetNum + " " + add.state + " " + add.city + " " + add.country);
	}
}

class Test1
{
	public static void main(String[] args)
	{
		Address ad=new Address(53, "bangalore" , "karntaka", "india");
		Student s=new Student("pooja", 2, ad);
		s.display();
	}
}

