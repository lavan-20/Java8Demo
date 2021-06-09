//Check arraysDemo

public enum Olives {
	
	ABC("abc"),
	BCD("bcd");
	
	private String name;

	private Olives(String name) {
		this.name = name;
	}
	
	public String getValueFromKey() {
		// TODO Auto-generated method stub
		return this.name;
	}

	
	
}
