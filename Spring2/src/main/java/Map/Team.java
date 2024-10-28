package Map;
import java.util.*;
public class Team {
	private String name;
	private String color;
	private Map<Integer,String> players;
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
//	public Map<Integer,String>  getPlayers() {
//		return players;
//	}
//	public void setPlayers(Map<Integer,String> players) {
//		this.players = players;
//	}
	
	public Team(String name, String color, Map<Integer, String> players) {
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
