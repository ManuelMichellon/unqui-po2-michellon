package unq;

import java.util.ArrayList;

public class TeamWork {
	private String name;
	private ArrayList<Person9> team;
	
	public TeamWork(String name, ArrayList<Person9> team) {
		super();
		this.name = name;
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Person9> getTeam() {
		return team;
	}

	public void setTeam(ArrayList<Person9> team) {
		this.team = team;
	}
	
	public int ageAverage() {
		int result = 0;
		for (Person9 person : team) {
			result = result + person.getAge();
		}
		return result / team.size();
	}

}
