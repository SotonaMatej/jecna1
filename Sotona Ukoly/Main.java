import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ukol ukolAR2 = new Ukol("ukolAR2", Priorita.NEDULEZITE_NALEHAVE);
		Ukol ukolIT3 = new Ukol("ukolIT3", Priorita.DULEZITE_NENALEHAVE);
		Ukol ukolIT = new Ukol("ukolIT", Priorita.DULEZITE_NENALEHAVE);
		Ukol ukolIT2 = new Ukol("ukolIT2", Priorita.NEDULEZITE_NENALEHAVE);
		Ukol ukolAR = new Ukol("ukolAR", Priorita.DULEZITE_NALEHAVE);
		Ukol ukolAR3 = new Ukol("ukolAR3", Priorita.NEDULEZITE_NENALEHAVE);
		Ukol ukolAR4 = new Ukol("ukolAR3", Priorita.NEDULEZITE_NENALEHAVE);
		Ukol ukolAR5 = new Ukol("ukolAR3", Priorita.NEDULEZITE_NENALEHAVE);
		Ukol ukolAR6 = new Ukol("ukolAR", Priorita.DULEZITE_NALEHAVE);
		Ukol ukolAR7 = new Ukol("ukolAR", Priorita.DULEZITE_NALEHAVE);
		Ukol ukolAR8 = new Ukol("ukolAR2", Priorita.NEDULEZITE_NALEHAVE);
		Ukol ukolIT4 = new Ukol("ukolIT3", Priorita.DULEZITE_NALEHAVE);
	  
	    HashMap<String, Priorita> ukol = new HashMap<String, Priorita>();


	  
	    ukol.put(ukolAR2.getName(),ukolAR2.getPriorita());
	    ukol.put(ukolIT3.getName(),ukolIT3.getPriorita());
	    ukol.put(ukolIT.getName(), ukolIT.getPriorita());
	    ukol.put(ukolIT2.getName(), ukolIT2.getPriorita());

	    for (String i : ukol.keySet()) {
	      System.out.println("key: " + i + " value: " + ukol.get(i));
	    }
	    HashSet<Ukol> ukol2 = new HashSet<Ukol>();
	    ukol2.add(ukolAR);
	    ukol2.add(ukolAR3);
	    ukol2.add(ukolAR4);
	    ukol2.add(ukolAR5);
	    System.out.println(ukol2);
	    
	    LinkedList<Ukol> ukol3 = new LinkedList<Ukol>();
	    ukol3.add(ukolAR6);
	    ukol3.add(ukolAR7);
	    ukol3.add(ukolAR8);
	    ukol3.add(ukolIT4);
	    System.out.println(ukol3);
	
	}
	

}
