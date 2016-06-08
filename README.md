# BigData Homework
Robert Foerster - SE15M041 (se15m041@technikum-wien.at)

## Data Engineering
### Assignment 1: Big Data in Ihrem Umfeld
#### 1.1
*Schauen Sie sich in Ihrem Umfeld um. FH Technikum oder Ihr Job. Nennen Siemindestens ein Beispiel für Daten, die schemalos (unstrukturiert) sind  und mindestens ein Bespiel für Daten, die  strukturiert (schematisch) sind.*

Neben meinem Studium arbeite ich im Logistikbereich in einem Transportunternehmen mit Eigenfuhrpark.
Daten, die in diesem Umfeld unstrukturiert sind: Sensordaten aus verschiedenen LKW, manuelle Aufzeichnungen des Fahrpersonals zu den Aufträgen
Daten, die strukturiert vorliegen: Auftragsdaten, Kundenstammdaten, Abrechnungsdaten

#### 1.2
*Nennen Sie ein Beispiel für Daten in Ihrem Umfeld, die gestreamt verarbeitet werden, nennen Sie ein Beispiel für Daten in Ihrem Umfeld, die über Batchverarbeitung verarbeitet werden.*

Gestreamte Verarbeitung: Die LKW des Unternehmens senden permanent Informationen über die Temperatur im Laderaum des Fahrzeuges. Da diese Informationen von unserem System sofort ausgewertet werden müssen um Abweichungne zu erkennen, müssen diese Daten gestreamt verarbeitet werden.
Batchverarbeitung: Jeden Tag um 22:00 werden sämtliche Daten aus Auftragsinformationen (z.B. Erlös) und Durchführungsinformationen (z.B. Tourdauer, Dieselverbrauch, Mautkosten, etc.) miteinander kombiniert um den täglichen Deckungsbeitrag zu errechnen.

### Assignment 2: Big Data in Ihrem Umfeld
*Entscheiden Sie sich für eine Data Engineering Plattform. Apache Flink oder Apache Spark. 
Installieren Sie die auf Ihrem Arbeitsgerät:*
- *1 Punkt: Erklären Sie ihre Entscheidung*
- *2 Punkte: Schicken Sie einen Screenshot der installierten Umgebung mit*
- *1 Punkt: Beschreiben Sie Ihre Toolchain, die Sie mit dem Framework nutzen würden(z.B: IDE)*

Ich habe mit für Apache Flink entschieden, da ich in der gestreamten Verarbeitung interessante Chancen für die Zukunft sehe, und das System gerne ausprobieren wollte.
Insbesondere ist diese Art der Verarbeitung interessant, da Echtzeitentscheidungen getroffen werden können.

Apache Flink wurde von mir in der Hortonworks Sandbox installiert.

Meine Toolchain, die ich in Verbindung mt Apache Flink nutzen würde:
*) Apache Flink auf einem Linux Betriebssystem (für mich aus lizenztechnischen Gründen)
*) Apache Flink würde auf ein Hadoop System mit HDFS zugreifen um auch eine nötige Ausfallsicherheit und Skalierbarkeit zu gewährleisten.
*) Als IDE würde ich IntelliJ von Jetbrains nutzen um Java Code zu schreiben (natürlich in Verbindung mit Maven um Jars zu generieren)

### Assignment 3: Big Data in Ihrem Umfeld
*Schreiben Sie ein simples Program mit dem Framework (z.B. Helloworld) und laden Sie es hoch. *

- *2 Punkte für Programm*
- *2 Punkte, wenn das Programm auch ausführbar ist.*

Ich habe mich für das WordCount Beispiel als Hello World Programm entschieden.
Eine Hilfe hierfür habe ich unter http://10minbasics.com/apache-flink-hello-world-java-example/ gefunden.
Das Programm ist im Git-Repository zu finden!

## Data Science
### Assignment 1: Technologien
#### 1.1
*Sie haben in der LVA zwei Frameworks kennengelernt (R und Python). Nennen Sie zwei weitere Technologien, um Daten zu analysieren (müssen nicht open source sein).*

Zwei weitere "Frameworks" um Daten zu analysieren wären z.B. MatLab und SAS. Aber auch Java und Scala eignen sich für Data Science.

#### 1.2
*Sie bekommen den Auftrag, sich mit einer Data Science Technologie zu arbeiten. Nennen Sie Technologie, die ihnen auf dem ersten Blick am besten für Sie ersscheint und begründen Sie das*

Es kommt ganz auf die Aufgabenstellung an, mit welchen Tools bzw. Sprachen gearbeitet wird um
zum gewünschten Ergebnis zu kommen. R zeichnet sich zum Beispiel durch eine vielfältigen Möglichkeiten
aus und seine Visualisierungsmöglichkeiten. Dagegen ist Python leichter zu erlernen, dafür aber auch 
ziemlich "zerklüftet" und eine "General Purpose" Sprache. 

### Assignment 2: Technologien
*Entscheiden Sie sich für eine Data Science Plattform. R oder Python Installieren Sie die auf Ihrem Arbeitsgerät*

- *1 Punkt: Begründen Sie ihre Entscheidung (Warum ziehen Sie persönlich aus ihrer Ausgangssituation die eine Technologie der anderen vor). *
- *2 Punkte: Schicken Sie einen Screenshot der installierten Umgebung mit*
- *1 Punkt: Beschreiben Sie Ihre Toolchain, die Sie mit dem Framework nutzen (z.B. IDE)*

Ich habe mich für Python entschieden, da mich die Sprache generell schon immer interessiert hat (insbesondere wegen Einsatz auf Raspberry Pi),
ich aber noch keine Zeit hatte, mich damit zu beschäftigen. Außerdem hat Python (laut diversen Berichten) eine steilere
Lernkurve als R und ist schneller einsatzbereit.
Als IDE setze ich PyCharm von JetBrains ein. Natürlich habe ich Python 3.5.1 heruntergeladen und installiert.

### Assignment 3: Big Science
*Der Cheatsheet auf http://scikit-learn.org/stable/tutorial/machine_learning_map/ ist eine einfache Anleitung, wie man den richtigen Algorithmus zum richtigen Data Science Problem findet.Schauen Sie in Google nach und lernen Sie classificatiom, regression, clusting und dimensional 
reduction unterscheiden. Nennen Sie ein Beispiel aus ihrem Umfeld, wo Sie mit dem Algorithmus zu tun haben. 
Das kann ein Beispiel sein, wie: Wenn Sie bei Amazon einkaufen. Wenn Sie von einem Marketinginstitut angerufen werden, etc.*

Regression: Zielvariable ist kontinuierlich - Beispiel: Voraussichtliche Temperaturverläufe
Classification: Zielvariable lässt sich einer Kategorie zuordnen - Beispiel: Twitter Posts in Positive und Negative Posts kategorisieren
Clustering: Daten können zwar gruppiert werden, allerdings haben die Gruppen (Cluster) keine Benennung - Beispiel: Kunden die dasselbe Kaufverhalten haben.
Dimensionality Reduction: Konvertieren von Daten mit vielen Dimensionen zu Daten mit niedriger Dimenstionsanzahl - Beispiel:
Filme werden auf Beliebtheit bei Personen geprüft. Doch statt die Filme direkt zu überprüfen überprüft man das gesamte Genre.

(Quelle: http://scottge.net/2015/06/14/ml101-regression-vs-classification-vs-clustering-problems/, sowie
http://stackoverflow.com/questions/1994431/what-does-dimensionality-reduction-mean)

