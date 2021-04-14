import javax.swing.*;//Importiert einige wichtige Dateien, um die Grafik anzuzeigen
import java.util.ArrayList;//Importiert ein Werkzeug, das als eine Art Ordner funktioniert, zu dem Sachen hinzugef�gt oder entfernt werden k�nnen
import java.awt.*;//Importiert eine Reihe von Layout-Stilen
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {//Ruft die Klasse "Gui" auf und stellt sie auf �ffentlich zug�nglich
	JFrame f = new JFrame();//Erzeugt ein neues Frame (=Fenster), indem etwas gezeigt werden kann
	JPanel p = new JPanel();//Erzeugt einen Layout-Container
	JPanel pBottom = new JPanel();//s. o.
	JLabel l = new JLabel();//Erzeugt ein Feld mit einem nicht-editierbaren Textfeld
	JButton next = new JButton("Next");//Erzeugt einen Button mit dem Text "Next" ohne Anf�hrungszeichen
	JButton prev = new JButton("Previous");//s. o.
	BorderLayout bl = new BorderLayout();//Erzeugt ein Border-Layout (Aussehen/Anordnung der Elemente s. Google)
	BoxLayout boxLayout = new BoxLayout(pBottom, BoxLayout.X_AXIS);//Weist dem Panel pBottom ein horizontales BoxLayout zu
	int position = 0;//Eine Variable, die speichert, an welcher Stelle sich das Programm befindet
	
	public void buildGui (String[] events) {//Ruft die Methode "buildGui und stellt sie auf �ffentlich zug�nglich
		//In den Klammern einer Methode werden dieser Variablen �bergeben
		//In diesem Fall ist das ein String-Array: Arrays sind Sammlungen von Objekten desselben Datentyps (hier String)
		//Strings sind Zeichenketten - also W�rter, Satzteile/S�tze oder auch ganze Texte 
		f.setTitle("Zeitleiste");//Legt den Titel des Fensters fest
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Legt fest, dass der Frame f normal geschlossen werden kann
		p.setLayout(bl);//Weist dem Panel p das BorderLayout bl zu
		l.setFont(new Font("Arial", 16, 16));//Bestimmt die Schriftart und -gr��e des Labels
		p.add(l, BorderLayout.CENTER);//F�gt das Label l dem Panel p zu und zeigt es in der Mitte des Fensters an
		pBottom.add(prev);//Weist dem Panel pBottom als erstes Element (also ganz links) den Button next zu
		pBottom.add(next);//prev wird rechts von next angezeigt
		
		l.setText(events[position]);//Der Text des ersten Elements (in Java wird bei 0 angefangen zu z�hlen) wird ins Label l geschrieben
		next.addActionListener(new ActionListener() {//Das Nachfolgende wird ausgef�hrt, wenn next geklickt wird
			@Override//Gibt eine Anweisung, das fr�her implementierter Code �berschrieben werden soll
            public void actionPerformed(ActionEvent e) {
				if (position < events.length - 1) {//Vergleicht den Wert von position mit der Gr��e der ArrayList events - 1
					position++;//Falls die Pr�fung == true, wird position um 1 erh�ht
				}
				l.setText(events[position]);//Das Label l wird mit dem neuen Text �berschrieben
			}
		});
		prev.addActionListener(new ActionListener() {//Das Nachfolgende wird ausgef�hrt, wenn prev geklickt wird
			@Override//Gibt eine Anweisung, das fr�her implementierter Code �berschrieben werden soll
            public void actionPerformed(ActionEvent e) {
				if (position > 0) {//Vergleicht den Wert von position mit dem Wert 0
					position--;//Falls die Pr�fung == true, wird position um 1 verringert
				}
				l.setText(events[position]);//Das Label l wird mit dem neuen Text �berschrieben
			}
		});
		
		p.add(pBottom, BorderLayout.SOUTH);//F�gt das Panel pBottom dem Panel p am unteren Rand hinzu
		f.add(p);//F�gt das Panel p dem Frame f hinzu
		f.setSize(800, 400);//Legt die Gr��e des Frames f auf 800x400 Pixel fest
		f.setVisible(true);//Zeigt den Frame f an
	}
}
