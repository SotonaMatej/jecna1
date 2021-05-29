
public class Ukol {
	private String name;
	private Priorita priorita;

	public Ukol(String name,Priorita priorita) {
		this.priorita=priorita;
		this.name=name;
				
		
	}

	public Priorita getPriorita() {
		return this.priorita;
	}
	public String getName() {
		return this.name;
	}
	
}