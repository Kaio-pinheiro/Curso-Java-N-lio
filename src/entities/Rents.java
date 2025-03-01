package entities;

public class Rents {

	private String name;
	private String email;

	public Rents(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Rents() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return name + ", " + email;
	}

}
