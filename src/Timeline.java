import java.util.ArrayList;//ermöglicht es, eine Liste anzulegen
import java.util.Random;//importiert eine Klasse mit der zufällige Zahlen ausgegeben werden können
public class Timeline {
	ArrayList<Event> events = new ArrayList<Event>();
	Random number = new Random();//Gibt eine Instanz der Random mit dem dem number
	public Timeline() {//Definiert die Klasse Timeline
		int startYear = number.nextInt(1320) + 700;//Hier wird ein zufälliges Jahr zwischen 700 und 2020 ausgewählt
		Event start = new Event(startYear, "Das Jahr "+startYear+".");//Eine Instanz der Klasse Event wird erzeugt
		events.add(start);//Der ArrayList events wird das Element start hinzugefügt
	}
	
	public String[] newOrderedTimeline(Event e) {//diese Methode gibt einen Array zurück, der aus Strings besteht, die nach der Jahreszahl sortiert sind
		events.add(e);//der Methode wurde ein Event übergeben, dieses wird nun der Liste events hinzugefügt
		ArrayList<Event> unsortedList = new ArrayList<Event>();//eine weitere Liste wird erzeugt
		String[] orderedArray = new String[events.size()];//ein Array wird erzeugt, das die Größe der Liste events hat
		for (int i = 0; i < events.size(); i++) {//dies ist eine Schleife: bei Schleifen wird dauerhaft das gemacht, was zwischen den geschweiften Klammern steht
			unsortedList.add(events.get(i));//der Liste unsortedList wird das i-te Element der Liste events hinzugefügt
		}
		long currentMin = unsortedList.get(0).getAllDays();//currentMin erhält den Wert des ersten Events wie viele Tage seit 4.000 v.Chr. vergangen sind
		int minEvent = 0;//minEvent erhält den Wert 0
		int currentPos = 0;//currentPos erhält den Wert 0
		while (unsortedList.size() > 0) {//while ist wie for eine Schleife, die etwas anders funktioniert
			currentMin = unsortedList.get(0).getAllDays();//currentMin erhält den Wert des ersten Events wie viele Tage seit 4.000 v.Chr. vergangen sind
			minEvent = 0;//minEvent erhält den Wert 0
			for (int i = 1; i < unsortedList.size(); i++) {//erneut eine for-Schleife
				if (unsortedList.get(i).getAllDays() < currentMin) {//prüft, ob das i-te Element der unsortedList einen kleineren Wert als currentMin hat
					currentMin = unsortedList.get(i).getAllDays();//falls die Bedingung erfüllt war, wird currentMin auf den des i-ten Events der unsortedList gesetzt
					minEvent = i;//minEvent wird auf i gesetzt, um zu speichern, welches Event den niedrigsten Wert hatte
				}
			}
			orderedArray[currentPos] = unsortedList.get(minEvent).getDate()+": "+unsortedList.get(minEvent).getText();//der sortierte Array wird befüllt
			//currentPos gibt die Position an, an der wir gerade sind
			//hinter dem Gleichzeichen wird ein String erzeugt, der aus drei verschiedenen Bausteinen zusammengesetzt wird
			//der erste Baustein ist das Datum des Events mit der niedrigsten Zahl
			//der zweite Baustein ist ein statischer String: nämlich ein Doppelpunkt gefolgt von einem Leerzeichen
			//der dritte Baustein ist der Text des Events mit der niedrigsten Zahl
			currentPos++;//currentPos wird um einen erhöht (inkrementiert), damit beim nächsten Schleifendurchlauf die nächste Position des Arrays befüllt werden kann
			unsortedList.remove(minEvent);//das Event mit der niedrigsten Zahl wird aus der unsortierten Liste gelöscht, damit es beim nächsten Schleifendurchlauf nicht erneut ausgewählt wird
		}
		
		return orderedArray;//gibt den sortierten Array zurück
	}
}
