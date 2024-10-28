package set;
import java.util.*;
public class Team {
	private String name;
	private String color;
	private Set<String> players;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	public Set<String> getPlayers() {
//		return players;
//	}
//	public void setPlayers(Set<String> players) {
//		this.players = players;
//	}
	
	public Team(String name, String color, Set<String> players) {
		super();
		this.name = name;
		this.color = color;
		this.players = players;
	}
	
	@Override
	public String toString() {
		return "Team [name=" + name + ", color=" + color + ", players=" + players + "]";
	}

	
	
}
