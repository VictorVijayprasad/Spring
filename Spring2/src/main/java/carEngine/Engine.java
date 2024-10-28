package carEngine;

public class Engine {
	private String type;
	private String cc;
	private String hp;
	private String engineNo;
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//	public String getCc() {
//		return cc;
//	}
//	public void setCc(String cc) {
//		this.cc = cc;
//	}
//	public String getHp() {
//		return hp;
//	}
//	public void setHp(String hp) {
//		this.hp = hp;
//	}
//	public String getEngineNo() {
//		return engineNo;
//	}
//	public void setEngineNo(String engineNo) {
//		this.engineNo = engineNo;
//	}
	
	public Engine(String type, String cc, String hp, String engineNo) {
		super();
		this.type = type;
		this.cc = cc;
		this.hp = hp;
		this.engineNo = engineNo;
	}
	
	@Override
	public String toString() {
		return "Engine [type=" + type + ", cc=" + cc + ", hp=" + hp + ", engineNo=" + engineNo + "]";
	}

	
	
	
}
