package Výpis;

import Info.Kina;
/**
 * Vytváøím jednoduchý konstruktor.
 * Vytváøím jednoduché gettry pomocí kterých budu vytváøet objekty v mainu.
 * @author Matìj Sotona
 *
 */
public class Program {
	private String den;
	private String nazev;
	private Kina kino;
	private Sály sál;

	public Program(String den, String nazev, Kina kino, Sály sál) {
		this.den=den;
		this.nazev=nazev;
		this.kino=kino;
		this.sál=sál;
				
		
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
	public Sály getSál() {
		return this.sál;
	}
	@Override
	public String toString() {
		return "Program [den=" + den + ", nazev=" + nazev + ", kino=" + kino + ", sál=" + sál + "]";
	}
	
	
}
