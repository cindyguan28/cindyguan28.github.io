Im Folgenden wollen wir bedingte Anweisungen in Java einüben. Dazu betrachten wir wieder die Klasse Haarföhn, wie wir sie in Kapitel 1 (Abschnitt 1.5) schon gesehen haben. Der Föhn verfügt über drei Temperaturstufen, die über einen Schiebeschalter eingestellt werden: kalt, mittel und heiß. Außerdem besitzt er einen Ein-/Aus-Knopf. Den Föhn hatten wir mit folgender Klassenkarte und folgendem Zustandsdiagramm modelliert:

Zustandsdiagramm mit sechs Zuständen: kalt/ein, mittel/ein, heiß/ein, kalt/aus, mittel/aus, heiß/aus.
Zwischen den 3 "ein"-Zuständen gibt es Zustandsübergänge, die mit "hochschalten" und "runterschalten" markiert sind. Gleiches gilt für die 3 "aus"-Zustände.
Es gibt weitere Zustandsübergänge zwischen den Zuständen mit jeweils gleicher Temperaturstufe, die mit "einschalten" und "ausschalten" markiert sind.

Haarföhn
stromschalter
temperatur
einschalten()
ausschalten()
hochschalten()
runterschalten()
Aufgabe
Im Folgenden soll dieser Haarföhn nun in der Programmiersprache Java implementiert werden.

Machen Sie sich vorher erneut den Zusammenhang zwischen Klassenkarte und Zustandsdiagramm klar. Vergegenwärtigen Sie sich insbesondere, wo in beiden Darstellungen die Attribute/Attributwerte und die Methoden zu finden sind.
Fügen Sie die beiden Attribute hinzu: Das Stromschalter-Attribut soll die Werte true und false annehmen können, die Temperatur soll die Werte 0 (= kalt), 1 (= mittel) und 2 (= heiß) annehmen können.
Fügen Sie einen Konstruktor ohne Parameter hinzu. Ein neuer Föhn soll ausgeschaltet sein und die mittlere Temperatureinstellung haben.
Fügen Sie die beiden Methoden zum Ein- und Ausschalten hinzu.
Fügen Sie Methoden zum Hoch- und Runterschalten der Temperatur hinzu. Achtung: Die Temperatur soll nur erlaubte Werte annehmen. Wenn der Föhn beispielsweise schon auf "heiß" eingestellt ist und dann die Temperatur hochgeschaltet wird, soll einfach nichts geschehen. Prüfen Sie dies jeweils mit einer bedingten Anweisung.
Vervollständigen Sie die Methode luftstrom(), sodass jeweils eine Zeichenkette zurückgegeben wird, die den aktuellen Luftstrom grafisch darstellt: Wenn der Föhn aus ist, soll die leere Zeichenkette "" zurückgegeben werden; wenn der Föhn eingeschaltet ist, soll es je nach Temperatur ein andere Rückgabe geben (z.B. "*****" für kalt,  "=====" für mittel und "#####" für heiß). Testen Sie Ihre Methode, indem Sie die unteren auskommentierten Zeilen aktivieren.
