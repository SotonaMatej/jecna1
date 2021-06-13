package Info;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import V�pis.DruhFilmu;
/**
 * Vytv���m jednoduch� konstruktor s parametry, kter� budu pot�ebovat v mainu k zalo�en� filmu.
 * VYtv���m jednoduch� gettry s pomoc� kter�ch budu vytv��et objekty v mainu.
 * @author Mat�j Sotona
 *
 */
public class Film {
	private String nazev;
	private DruhFilmu druhFilmu;
	private String herec;
	private String herecka;
	boolean zkus;
	
	public Film(String nazev, DruhFilmu druhFilmu, String herec, String herecka) {
		this.nazev=nazev;
		this.druhFilmu=druhFilmu;
		this.herec=herec;
		this.herecka=herecka;

	}
	
	public DruhFilmu getDruhFilmu() {
		return this.druhFilmu;
	}
	public String getNazev() {
		return this.nazev;
	}
	public String getHerec() {
		return this.herec;
	}
	public String getHerecka() {
		return this.herecka;
	}
	
	@Override
	public String toString() {
		return "Film [nazev=" + nazev + ", druhFilmu=" + druhFilmu + ", herec=" + herec + ", herecka=" + herecka
				+ "]";
	}

	

}
