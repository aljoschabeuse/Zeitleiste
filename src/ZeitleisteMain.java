import java.util.ArrayList;//erm�glicht das Erstellen von Listen
public class ZeitleisteMain {

	public static void main(String[] args) {//jedes Programm braucht eine main-Datei, von der aus alles gestartet (aufgerufen) wird
		CreatedEvents ce = new CreatedEvents();//instanziert eine Klasse CreatedEvents mit dem Namen ce
		ArrayList<Event> arrList = ce.getList();//erstellt eine ArrayList namens arrList und bef�llt diese anhand der getList der Klasse CreatedEvents namens ce
		Timeline t = new Timeline();//instanziert eine Klasse Timeline mit dem Namen t
		String[] str = null;//erzeugt einen String: Ein String ist eine Zeichenkette; in diesem Fall besteht die Zeichenkette aus 0 Elementen
		for (int i = 0; i < arrList.size(); i++) {//eine Schleife, die mittels dreier Parameter aufgerufen wird
			//i = 0 bedeutet, dass die Schleife beim Wert 0 beginnt
			//i < arrList.size() meint, dass die Schleife solange von vorne beginnt, bis i nicht mehr kleiner die Gr��e der ArrayList arrList ist
			//i++ erh�ht den Wert von i nach jedem Schleifendurchlauf um einen (++i w�rde i bereits am Anfang um einen nach oben z�hlen)
			System.out.println("----------------");//gibt in der Konsole den Text aus, der zwischen den Anf�hrungszeichen steht
			str = t.newOrderedTimeline(arrList.get(i));//dem String str wird eine neue Zeichenkette zugewiesen
			for (String s : str) {//dies ist eine spezielle Schreibweise
				System.out.println(s);//der Wert von s  wird in der Konsole ausgegeben
			}
		}
		Gui gui = new Gui();//instanziert die Klasse Gui (=Graphical User Interface), die f�r die Anzeige des Programms entscheidend ist
		gui.buildGui(str);//hier wird die Gui aufgebaut
	}
}
