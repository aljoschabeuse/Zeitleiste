import java.util.ArrayList;//Importiert die Möglichkeit, eine Liste anzulegen
public class CreatedEvents {
	ArrayList<Event> eventList = new ArrayList<Event>();
	
	public ArrayList<Event> getList() {//dies ist eine Methode, mit der die gesamte Liste zurückgegeben wird
		return eventList;//das ist der Rückgabeaufruf der Methode getList
	}
	
	public CreatedEvents() {//hier wird die Klasse CreatedEvents definiert
		//im Folgenden werden Events kreiert und der Liste angehängt
		eventList.add(new Event(9, 11, 1918, "Gründung der Weimarer Republik"));//mit new Event wird eine neue Instanz der Klasse Event angelegt 
		eventList.add(new Event(28, 7, 1914, "Beginn des Ersten Weltkriegs"));//new Event benötigt als Parameter wie hier 3 Zahlen und einen String (=Zeichenkette)
		eventList.add(new Event(3, 1848, "Märzrevolution in Deutschland"));//oder auch nur zwei Zahlen sowie einen String
		eventList.add(new Event(1095, "Erster Kreuzzug"));//oder auch nur eine Zahl sowie einen String
		eventList.add(new Event(18, 1, 1871, "Proklamation von Wilhelm I. als deutschen Kaiser (Gründung des Zweiten Deutschen Reiches)"));
		eventList.add(new Event(9, 11, 1989, "Fall der Berliner Mauer"));
		eventList.add(new Event(1, 1, 2002, "Einführung des Euro als Bargeld"));
		eventList.add(new Event(3, 10, 1990, "Wiedervereinigung der deutschen Teilstaaten BRD und DDR"));
		eventList.add(new Event(25, 12, 800, "Kaiserkrönung Karls des Großen"));
		eventList.add(new Event(9, 6, 1815, "Abschluss des Wiener Kongresses"));
		eventList.add(new Event(31, 10, 1517, "Luthers Thesenanschlang an der Wittenburger Schlosskirche"));
		eventList.add(new Event(14, 7, 1789, "Sturm auf die Bastille (Französische Revolution)"));
		eventList.add(new Event(1618, "Beginn des Dreißigjährigen Krieges"));
		eventList.add(new Event(1648, "Ende des Dreißigjährigen Krieges"));
		eventList.add(new Event(3, 1862, "Wilhelm I. ernennt Bismarck zum preußischen Ministerpräsidenten"));
		eventList.add(new Event(23, 5, 1949, "Inkrafttreten des Grundgesetzes"));
		eventList.add(new Event(7, 10, 1949, "Gründung der DDR"));
		eventList.add(new Event(1, 9, 1939, "Ausbruch des Zweiten Weltkriegs"));
		eventList.add(new Event(8, 5, 1945, "Bedingungslose Kapitulation Deutschlands/Ende des Zweiten Weltkriegs"));
		eventList.add(new Event(24, 10, 1948, "Beginn der \"Berlin-Blockade\" durch die Sowjetunion"));
		eventList.add(new Event(9, 11, 1938, "Reichskristallnacht/Reichsprogromnacht"));
		eventList.add(new Event(23, 3, 1933, "Ermächtigungsgesetz/Machtergreifung durch die NSDAP"));
		eventList.add(new Event(23, 8, 1961, "Bau der Berliner Mauer"));
		eventList.add(new Event(27, 9, 1529, "Beginn der \"Ersten Wiener Türkenbelagerung\""));//Anführungszeichen signalisieren den Start bzw. das Ende eines Strings
		//will man das im String ein Anführungszeichen steht muss man \" schreiben
		eventList.add(new Event(843, "Teilung des Fränkischen Reichs in Westfranken (Frankreich) und Ostfranken (Deutschland)"));
		eventList.add(new Event(962, "Otto I. wird erster Kaiser des \"Heiligen Römischen Reiches Deutscher Nationen\""));
		eventList.add(new Event(1122, "Wormser Konkordat"));
		eventList.add(new Event(10,9,1190, "Friedrich I. (Barbarossa) ertrinkt während des Dritten Kreuzzugs"));
		eventList.add(new Event(1226, "Der Deutsche Orden beginnt mit der Eroberung Preußens"));
		eventList.add(new Event(1534, "Luther beendet die Übersetzung der Bibel ins Deutsche"));
		eventList.add(new Event(1714, "Ende des Spanischen Erbfolgekrieges, aus dem Österreich als europäische Großmacht hervorgeht"));
		eventList.add(new Event(1763, "Ende des Siebenjährigen Krieges, aus dem Preußen als europäische Großmacht hervorgeht"));
		eventList.add(new Event(1772, "Beginn der Polnischen Teilungen, bei denen Russland, Österreich und Preußen Polen unter sich aufteilen"));
		eventList.add(new Event(5, 1863, "Gründung der SPD"));
		eventList.add(new Event(1878, "Verbot aller kommunistischen Vereine durch Bismarck (\"Sozialistengesetze\")"));
		eventList.add(new Event(1883, "Einführung der ersten Sozialversicherung"));
		eventList.add(new Event(1888, "Dreikaiserjahr"));
		eventList.add(new Event(18, 3, 1890, "Entlassung Bismarcks"));
		eventList.add(new Event(15, 1, 1919, "Ermordung von Rosa Luxemburg und Karl Liebknecht"));
		eventList.add(new Event(31, 7, 1919, "Verabschiedung der Verfassung der Weimarer Republik"));
		eventList.add(new Event(9, 11, 1923, "Beendigung des Ludendorff-Hitler-Putsches, der die Weimarer Republik stürzen wollte"));
		eventList.add(new Event(11, 1, 1923, "Beginn der Ruhrbesetzung durch die Franzosen aufgrund nicht gezahlter Reparationen Deutschlands"));
		eventList.add(new Event(24, 10, 1929, "Beginn der Weltwirtschaftskrise, die zum Scheitern der Weimarer Republik beitrug"));
		eventList.add(new Event(8, 1936, "Olympische Spiele in Berlin"));
		eventList.add(new Event(3, 1938, "\"Anschluss\" Österreichs an Hitler-Deutschland"));
		eventList.add(new Event(20, 7, 1944, "Gescheitertes Attentat auf Hitler durch Stauffenberg"));
		eventList.add(new Event(30, 4, 1945, "Selbstmord Hitlers"));
		eventList.add(new Event(15, 9, 1949, "Adenauer wird zum ersten Bundeskanzler der BRD gewählt"));
		eventList.add(new Event(23, 7, 1952, "Gründung der Montanunion, dem Vorläufer der heutigen EU"));
		eventList.add(new Event(17, 6, 1953, "Volksaufstand in der DDR, der durch sowjetische Truppen niedergeschlagen wird"));
		eventList.add(new Event(9, 5, 1955, "Westdeutschland tritt der NATO bei"));
		eventList.add(new Event(22, 1, 1963, "Adenauer und de Gaulle beschließen den Élysée-Vertrag (Deutsch-Französischer-Freundschaftsvertrag)"));
		eventList.add(new Event(26, 6, 1963, "Kennedy hält seine berühmte Rede in Berlin: \"Ich bin ein Berliner\""));
		eventList.add(new Event(21, 10, 1969, "Willy Brandt wird der erste sozialdemokratische Kanzler der BRD"));
		eventList.add(new Event(3, 5, 1971, "Erich Honecker wird Staatschef der DDR"));
		eventList.add(new Event(1, 10, 1982, "Helmut Kohl wird Kanzler Westdeutschlands"));
		eventList.add(new Event(24, 3, 1999, "NATO-Eingriff in den Kosovo-Krieg (erstmals beteiligt sich die Bundeswehr aktiv an Kampfhandlungen)"));
		eventList.add(new Event(9, 6, 2006, "Beginn der Fußball-Weltmeisterschaft in Gesamtdeutschland (\"Sommermärchen\")"));
	}
}
