package Výpis;

import java.util.HashSet;
import java.io.*;
import java.util.Scanner;

import Info.Film;
import Info.Kina;

/**
 * Vytvoøím si pár položek filmù, které budu ukládat do HashSetu.
 * Vytvoøím si pár položek programù, které budu ukládat do HashSetu.
 * Pomocí nìkolika HashSetù, Scannerù a cyklu umožním pøidání filmu, programu, druhu filmu, herce, herecky, kina kde se to promita a v jakem salu.
 * Pomocí nìkolika HashSetù, Scannerù a cyklu umožním nezávislé pøidání herce nebo herecky s kompletním jménem.
 * Vše se následnì snažím zapsat do souboru pomocí serializace.
 * Na závìr testuji, jestli se zadaný název filmu neshoduje už s pøedem vytvoøeným.
 * @author Matìj Sotona
 *
 */
public class Main implements java.io.Serializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Zde to budu vše volat.
		
		Film Shrek = new Film("Shrek", DruhFilmu.ANIMOVANE,"Edie Murphy","Cameron Diaz");
		Film Shrek2 = new Film("Shrek2", DruhFilmu.ANIMOVANE,"Edie Murphy","Cameron Diaz");
		Film AnthropoidCZ = new Film("AnthropoidCZ", DruhFilmu.CESKE,"Vaclav Jan","Milose Nova");
		Film Seven = new Film("Seven", DruhFilmu.DRAMA,"Brad Pitt","Morgan Freeman");
		Film LOTR = new Film("LOTR", DruhFilmu.FANTASY,"Vigo Mortensen","Arwen");
		Film Interstelar = new Film("Interstelar", DruhFilmu.SCIENCE_FICTION,"Dave","Anne Hathaway");
		Film BlaznivaStrela = new Film("Blazniva strela", DruhFilmu.KOMEDIE, "Leslie Nealson", "Anna");
		
		Program pondeliRanoHos = new Program("pondeli rano",Shrek.getNazev(), Kina.CINEMA_CITY_HOSTIVAR, Sály.PRVNI_SAL);
		Program pondeliPoledneHos = new Program("pondeli poledne",Shrek2.getNazev(), Kina.CINEMA_CITY_HOSTIVAR, Sály.PRVNI_SAL);
		Program pondeliOdpoledneHos = new Program("pondeli odpoledne",Seven.getNazev(), Kina.CINEMA_CITY_HOSTIVAR, Sály.PATY_SAL);
		Program uteryRanoHos = new Program("utery rano",Interstelar.getNazev(), Kina.CINEMA_CITY_HOSTIVAR, Sály.DRUHY_SAL);
		Program uteryRanoCho = new Program("utery rano",LOTR.getNazev(), Kina.CINEMA_CITY_CHODOV, Sály.PRVNI_SAL);
		
		HashSet<Film> film = new HashSet<Film>();
		
		film.add(Shrek);
		film.add(Shrek2);
		film.add(AnthropoidCZ);
		film.add(Seven);
		film.add(LOTR);
		film.add(Interstelar);
		film.add(BlaznivaStrela);
		
		System.out.println(film);
		
		HashSet<Program> program = new HashSet<Program>();
		
		program.add(pondeliRanoHos);
		program.add(uteryRanoCho);
		program.add(pondeliPoledneHos);
		program.add(pondeliOdpoledneHos);
		program.add(uteryRanoHos);
		
		System.out.println(program);
		
		final int zapis = 2;
		
		final HashSet<String> s = new HashSet<String>();
		final HashSet<String> e = new HashSet<String>();
		final HashSet<String> r = new HashSet<String>();
		final HashSet<String> t = new HashSet<String>();
		final HashSet<String> ss = new HashSet<String>();
		final HashSet<String> rr = new HashSet<String>();
		final HashSet<String> tt = new HashSet<String>();
		final Scanner nazev = new Scanner(System.in);
		final Scanner druh = new Scanner(System.in);
		final Scanner herec = new Scanner(System.in);
		final Scanner herecka = new Scanner(System.in);
		final Scanner den = new Scanner(System.in);
		final Scanner kino = new Scanner(System.in);
		final Scanner sal = new Scanner(System.in);
		
		 for (int i = 0; i < zapis; i++){
				
				System.out.println("Zadejte nazev filmu.");
				s.add(nazev.next());
				System.out.println("Zadejte druh filmu.");
				e.add(druh.next());
				System.out.println("Zadejte jmeno hlavniho herce.");
				r.add(herec.next());
				System.out.println("Zadejte jmeno hlavni herecky.");
				t.add(herecka.next());
				System.out.println("Zadejte den promitani.");
				ss.add(den.next());
				System.out.println("Zadejte kino ve kterem se to bude promitat.");
				rr.add(kino.next());
				System.out.println("Zadejte sál.");
				tt.add(sal.next());

		 }


		
		String finale = s.toString() + e.toString() + r.toString() + t.toString() + ss.toString() + rr.toString() + tt.toString();		 
        System.out.println(finale);
        
        final int pocet = 3;
        
        final HashSet<String> jmeno = new HashSet<String>();
        final HashSet<String> prijmeni = new HashSet<String>();
        final Scanner jmenoH = new Scanner(System.in);
        final Scanner prijmeniH = new Scanner(System.in);
        
        for(int j = 0; j < pocet; j++)	{
        	System.out.println("Zadejte krestni jmeno herce/herecky.");
        	jmeno.add(jmenoH.next());
        	System.out.println("Zadejte prijmeni herce/herecky.");
        	prijmeni.add(prijmeniH.next());
        }
        String jmenoPri = jmeno.toString() + prijmeni.toString();
        System.out.println(jmenoPri);

		  try (OutputStream os = new FileOutputStream("mujseznam.txt");
			         ObjectOutputStream oos = new ObjectOutputStream(os)) {
			  
			  oos.writeObject(film);
			  oos.writeObject(program);
			  oos.writeObject(finale);
			  oos.writeObject(jmenoPri);
			  os.close();
			  oos.close();
		  }catch (IOException w) {
		        System.out.println("Chyba pøi zápisu souboru : "+w);
		    }
		System.out.println(film.contains(nazev));
	}

}
