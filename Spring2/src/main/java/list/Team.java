package list;
import java.util.*;
public class Team {
	private String name;
	private String color;
	private List<String> players;
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
//	public List<String> getPlayers() {
//		return players;
//	}
//	public void setPlayers(List<String> players) {
//		this.players = players;
//	}
	
	public Team(String name, String color, List<String> players) {
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
