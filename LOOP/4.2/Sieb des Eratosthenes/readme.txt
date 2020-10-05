Aufgabe: Sieb des Eratosthenes
(Aufgabe aus Hubwieser et al.: Informatik 3. Ernst Klett Verlag, Stuttgart 2008)

Das Sieb des Eratosthenes ist ein Algorithmus zur Bestimmung von Primzahlen. Primzahlen sind für die Verschlüsselung von Daten von großer Wichtigkeit. Die momentan eingesetzten Verfahren zur sicheren Datenübertragung, beispielsweise bei Banktransaktionen, machen von Primzahlen entscheidenden Gebrauch.

Das Sieb des Eratosthenes filtert alle Primzahlen p mit 1 < p <= n auf folgende Weise:

Generiere ein sortiertes Feld der Zahlen 2 bis n
Wiederhole bis das Ende des Feldes erreicht ist
    Wähle die nächste nicht-markierte Zahl
    Markiere alle echten Vielfachen der gewählten Zahl
Ende Wiederhole
Führen Sie den Algorithmus für n = 20 mit Papier und Bleistift durch.
Vervollständigen Sie in der Klasse Prim die Methode primzahlenBestimmen(int n), die für eine übergebene Zahl n alle Primzahlen p mit p <= n berechnet. Als Ergebnis soll die Methode ein Feld zurückgeben, das genau nur diese Primzahlen enthält.
Bei der Implementierung ist es leichter und übersichtlicher, ein Feld der Zahlen von 0 bis n zu erzeugen (statt von 2 bis n). Dann muss man am Anfang die Zahlen 0 und 1 markieren, weil sie keine Primzahlen sind.
Um eine Zahl im Feld zu markieren, kann man sie einfach auf den Wert 0 setzen.
