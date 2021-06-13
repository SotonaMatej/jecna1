package V�pis;

import Info.Kina;
/**
 * Vytv���m jednoduch� konstruktor.
 * Vytv���m jednoduch� gettry pomoc� kter�ch budu vytv��et objekty v mainu.
 * @author Mat�j Sotona
 *
 */
public class Program {
	private String den;
	private String nazev;
	private Kina kino;
	private S�ly s�l;

	public Program(String den, String nazev, Kina kino, S�ly s�l) {
		this.den=den;
		this.nazev=nazev;
		this.kino=kino;
		this.s�l=s�l;
				
		
	}
	public String getDen() {
		return this.den;
	}
	public String getNazev() {
		return this.nazev;
	}
	public Kina getKino() {
		return this.kino;
	}
	public S�ly getS�l() {
		return this.s�l;
	}
	@Override
	public String toString() {
		return "Program [den=" + den + ", nazev=" + nazev + ", kino=" + kino + ", s�l=" + s�l + "]";
	}
	
	
}
