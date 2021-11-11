package entities;

import java.util.Date;

public class Client {
	private String name;
	private String email;
	private Date birdDay;

	public Client(String name, String email, Date birdDay) {
		super();
		this.name = name;
		this.email = email;
		this.birdDay = birdDay;
	}

	public Client() {
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

	public Date getBirdDay() {
		return birdDay;
	}

	public void setBirdDay(Date birdDay) {
		this.birdDay = birdDay;
	}

}
