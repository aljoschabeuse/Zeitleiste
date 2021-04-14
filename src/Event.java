//Im Folgenden wird die Klasse Event angelegt
public class Event {
	private int day;//der Tag im Monat, an dem das Event stattgefunden hat
	private int month;//der Monat im Jahr, an dem das Event stattgefunden hat
	private int year;//das Jahr, in dem das Event stattgefunden hat
	private long allDays;//Tage, die seit dem Jahr 4.000 v.Chr. vergangen sind
	private String text;//Text, der beschreibt, was beim Event passiert ist
	private boolean[] dateLayout;//das DateLayout gibt an, ob der Tag und/oder der Monat mit angezeigt wird
	
	//die Klasse Event kann durch mehrere verschiedene Aufrufe erfolgen (man nennt das �berladen)
	public Event(int day, int month, int year, String text) {//hier werden als Parameter drei Zahlen und eine Zeichenkette (=String ben�tigt)
		this.day = day;//weist der Klassen-Variable day den �bergebenen Wert day zu; um dem Compiler das zu verdeutlichen, wird das this ben�tigt
		this.month = month;//weist der Klassen-Variable month den �bergebenen Wert month zu; um dem Compiler das zu verdeutlichen, wird das this ben�tigt
		this.year = year;//weist der Klassen-Variable year den �bergebenen Wert year zu; um dem Compiler das zu verdeutlichen, wird das this ben�tigt
		this.text = text;//der Klassen-Variable text wird der �bergebene Wert text zugewiesen; um dem Compiler das zu verdeutlichen wird das this ben�tigt
		if (month > 2) {//hier wird berechnet, wie viele Tage seit dem Jahr 4.000 v.Chr. vergangen sind
			allDays = (year + 4000) * 365 + (int) Math.floor(year / 4) + calculateMonths(month) + day;
		} else {
			allDays = (year + 4000) * 365 + (int) Math.floor(year / 4) - 1 + calculateMonths(month) + day;
		}
		dateLayout = new boolean[] {true, true};//Tag und Monat werden mit angezeigt
	}
	
	public Event(int month, int year, String text) {//hier werden als Parameter zwei Zahlen und eine Zeichenkette (=String ben�tigt)
		this.day = 1;//der Klassen-Variable day wird der Wert 1 zugewiesen
		this.month = month;//weist der Klassen-Variable month den �bergebenen Wert month zu; um dem Compiler das zu verdeutlichen, wird das this ben�tigt
		this.year = year;//weist der Klassen-Variable year den �bergebenen Wert year zu; um dem Compiler das zu verdeutlichen, wird das this ben�tigt
		this.text = text;//der Klassen-Variable text wird der �bergebene Wert text zugewiesen; um dem Compiler das zu verdeutlichen wird das this ben�tigt
		if (month > 2) {//hier wird berechnet, wie viele Tage seit dem Jahr 4.000 v.Chr. vergangen sind
			allDays = (year + 4000) * 365 + (int) Math.floor(year / 4) + calculateMonths(month) + day;
		} else {
			allDays = (year + 4000) * 365 + (int) Math.floor(year / 4) - 1 + calculateMonths(month) + day;
		}
		dateLayout = new boolean[] {false, true};//es wird nur der Monat angezeigt, nicht aber der Tag
	}
	
	public Event(int year, String text) {//hier werden als Parameter eine Zahl und eine Zeichenkette (=String ben�tigt)
		this.day = 1;//der Klassen-Variable day wird der Wert 1 zugewiesen
		this.month = 1;//der Klassen-Variable month wird der Wert 1 zugewiesen
		this.year = year;//weist der Klassen-Variable year den �bergebenen Wert year zu; um dem Compiler das zu verdeutlichen, wird das this ben�tigt
		this.text = text;//der Klassen-Variable text wird der �bergebene Wert text zugewiesen; um dem Compiler das zu verdeutlichen wird das this ben�tigt
		if (month > 2) {//hier wird berechnet, wie viele Tage seit dem Jahr 4.000 v.Chr. vergangen sind
			allDays = (year + 4000) * 365 + (int) Math.floor(year / 4) + calculateMonths(month) + day;
		} else {
			allDays = (year + 4000) * 365 + (int) Math.floor(year / 4) - 1 + calculateMonths(month) + day;
		}
		dateLayout = new boolean[] {false, false};//es wird nur das Jahr angezeigt
	}
	
	public int getDay() {//gibt den Tag des Events zur�ck
		return day;
	}
	
	public int getMonth() {//gibt den Monat des Events zur�ck
		return month;
	}
	
	public int getYear() {//gibt das Jahr des Events zur�ck
		return year;
	}
	
	public long getAllDays() {//gibt zur�ck, wie viele Tage seit dem Jahr 4.000 v.Chr. vergangen sind
		return allDays;
	}
	
	public String getText() {//gibt den Text des Events zur�ck
		return text;
	}
	
	public String getDate() {//Methode, die das Datum als Zeichenkette (=String) zur�ckgibt
		if (dateLayout[0] && dateLayout[1]) {//pr�ft, welches dateLayout vorliegt
			if (day < 10 && month < 10) {
				return "0"+day+".0"+month+"."+year;//stellt Nullen voran, falls der Tag und der Monat < 10 ist
			} else if (day > 9 && month < 10) {
				return day+".0"+month+"."+year;//stellt eine Null vor den Monat, falls dieser < 10 und der Tag >= 10
			} else if (day < 10 && month > 9) {
				return "0"+day+"."+month+"."+year;//stellt eine Null vor den Tag, falls dieser < 10 und der Monat >= 10
			} else {
				return (day+"."+month+"."+year);//gibt den String zur�ck, wobei Tag, Monat und Jahr mit Punkten getrennt werden
			}
		} else if (dateLayout[0] && !dateLayout[1]) {//pr�ft, ob der Tag nicht mit angegeben werden soll
			switch (month) {//pr�ft den Wert von month ab und gibt diesen als Zeichenkette (Leerzeichen am Ende) sowie den Wert von year zur�ck
				case 1: return "Januar "+year;
				case 2: return "Februar "+year;
				case 3: return "M�rz "+year;
				case 4: return "April "+year;
				case 5: return "Mai "+year;
				case 6: return "Juni "+year;
				case 7: return "Juli "+year;
				case 8: return "August "+year;
				case 9: return "September "+year;
				case 10: return "Oktober "+year;
				case 11: return "November "+year;
				case 12: return "Dezember "+year;
				default: return ((Integer) year).toString();
			}
		} else {
			return ((Integer) year).toString();//soll Tag und Monat nicht mit angegeben werden, wird der Wert des Jahres - aber als Zeichenkette (=String) zur�ckgegeben
		}
	}
	
	public int calculateMonths(int month) {//diese Methode berechnet anhand des Wertes von Monat die Zahl der Tage, die bereits in den Monaten des Jahres verstrichen sind
		switch (month) {
			case 1: return 0;
			case 2: return 31;
			case 3: return 59;
			case 4: return 90;
			case 5: return 120;
			case 6: return 151;
			case 7: return 181;
			case 8: return 212;
			case 9: return 243;
			case 10: return 273;
			case 11: return 304;
			case 12: return 334;
			default: return 0;
		}
	}
}
