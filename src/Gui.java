import javax.swing.*;//Importiert einige wichtige Dateien, um die Grafik anzuzeigen
import java.util.ArrayList;//Importiert ein Werkzeug, das als eine Art Ordner funktioniert, zu dem Sachen hinzugefügt oder entfernt werden können
import java.awt.*;//Importiert eine Reihe von Layout-Stilen
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {//Ruft die Klasse "Gui" auf und stellt sie auf öffentlich zugänglich
	JFrame f = new JFrame();//Erzeugt ein neues Frame (=Fenster), indem etwas gezeigt werden kann
	JPanel p = new JPanel();//Erzeugt einen Layout-Container
	JPanel pBottom = new JPanel();//s. o.
	JLabel l = new JLabel();//Erzeugt ein Feld mit einem nicht-editierbaren Textfeld
	JButton next = new JButton("Next");//Erzeugt einen Button mit dem Text "Next" ohne Anführungszeichen
	JButton prev = new JButton("Previous");//s. o.
	BorderLayout bl = new BorderLayout();//Erzeugt ein Border-Layout (Aussehen/Anordnung der Elemente s. Google)
	BoxLayout boxLayout = new BoxLayout(pBottom, BoxLayout.X_AXIS);//Weist dem Panel pBottom ein horizontales BoxLayout zu
	int position = 0;//Eine Variable, die speichert, an welcher Stelle sich das Programm befindet
	
	public void buildGui (String[] events) {//Ruft die Methode "buildGui und stellt sie auf öffentlich zugänglich
		//In den Klammern einer Methode werden dieser Variablen übergeben
		//In diesem Fall ist das ein String-Array: Arrays sind Sammlungen von Objekten desselben Datentyps (hier String)
		//Strings sind Zeichenketten - also Wörter, Satzteile/Sätze oder auch ganze Texte 
		f.setTitle("Zeitleiste");//Legt den Titel des Fensters fest
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Legt fest, dass der Frame f normal geschlossen werden kann
		p.setLayout(bl);//Weist dem Panel p das BorderLayout bl zu
		l.setFont(new Font("Arial", 16, 16));//Bestimmt die Schriftart und -größe des Labels
		p.add(l, BorderLayout.CENTER);//Fügt das Label l dem Panel p zu und zeigt es in der Mitte des Fensters an
		pBottom.add(prev);//Weist dem Panel pBottom als erstes Element (also ganz links) den Button next zu
		pBottom.add(next);//prev wird rechts von next angezeigt
		
		l.setText(events[position]);//Der Text des ersten Elements (in Java wird bei 0 angefangen zu zählen) wird ins Label l geschrieben
		next.addActionListener(new ActionListener() {//Das Nachfolgende wird ausgeführt, wenn next geklickt wird
			@Override//Gibt eine Anweisung, das früher implementierter Code überschrieben werden soll
            public void actionPerformed(ActionEvent e) {
				if (position < events.length - 1) {//Vergleicht den Wert von position mit der Größe der ArrayList events - 1
					position++;//Falls die Prüfung == true, wird position um 1 erhöht
				}
				l.setText(events[position]);//Das Label l wird mit dem neuen Text überschrieben
			}
		});
		prev.addActionListener(new ActionListener() {//Das Nachfolgende wird ausgeführt, wenn prev geklickt wird
			@Override//Gibt eine Anweisung, das früher implementierter Code überschrieben werden soll
            public void actionPerformed(ActionEvent e) {
				if (position > 0) {//Vergleicht den Wert von position mit dem Wert 0
					position--;//Falls die Prüfung == true, wird position um 1 verringert
				}
				l.setText(events[position]);//Das Label l wird mit dem neuen Text überschrieben
			}
		});
		
		p.add(pBottom, BorderLayout.SOUTH);//Fügt das Panel pBottom dem Panel p am unteren Rand hinzu
		f.add(p);//Fügt das Panel p dem Frame f hinzu
		f.setSize(800, 400);//Legt die Größe des Frames f auf 800x400 Pixel fest
		f.setVisible(true);//Zeigt den Frame f an
	}
}
