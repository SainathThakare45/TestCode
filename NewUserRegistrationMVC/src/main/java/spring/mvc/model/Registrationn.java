package spring.mvc.model;

public class Registrationn {
	
	public String Name;
	public String City;
	public long Mob_No;
	
	public Registrationn() {
		// TODO Auto-generated constructor stub
	}

	public Registrationn(String name, String city, Long mob_No) {
		super();
		Name = name;
		City = city;
		Mob_No = mob_No;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public long getMob_No() {
		return Mob_No;
	}

	public void setMob_No(long mob_No) {
		Mob_No = mob_No;
	}
	

}
