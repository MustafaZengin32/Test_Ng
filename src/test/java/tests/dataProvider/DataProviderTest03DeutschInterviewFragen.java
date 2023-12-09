package tests.dataProvider;

public class DataProviderTest03DeutschInterviewFragen {

    /*

1. Was ist ein Data Provider in TestNG?

Antwort: In TestNG ist ein Data Provider eine Möglichkeit, Testdaten dynamisch an Testmethoden zu übergeben.
Es ermöglicht die Wiederverwendung derselben Testmethode mit unterschiedlichen Eingabewerten.

2. Wie wird ein Data Provider in TestNG erstellt?

Antwort: Ein Data Provider wird durch eine Methode erstellt, die mit der @DataProvider-Annotation markiert ist.
Diese Methode gibt ein 2D-Array oder eine Liste von Arrays zurück, wobei jeder Array die Eingabeparameter
für eine Testmethode enthält.

3. Was ist der Unterschied zwischen einem Data Provider und Parametern in TestNG?

Antwort: Ein Data Provider ermöglicht die dynamische Bereitstellung von Testdaten,
während Parameter eine statische Möglichkeit bieten, Testdaten festzulegen.
Data Provider eignet sich besser für Datensätze, die zur Laufzeit generiert oder aus externen Quellen abgerufen werden.

4. Wie verknüpfen Sie einen Data Provider mit einer Testmethode?

Antwort: Die Verknüpfung erfolgt über die @Test-Annotation,
indem der Parameter dataProvider mit dem Namen des Data Providers festgelegt wird.
Beispiel: @Test(dataProvider = "meinDataProvider")

5. Wie behandelt TestNG den Fehler in einem Data Provider?

Antwort: Wenn eine Testmethode, die von einem Data Provider bereitgestellte Daten verwendet,
einen Fehler auslöst, wird der Fehler für jede Datenzeile separat behandelt.
Die anderen Testdatenzeilen werden weiterhin ausgeführt.

6. Wie können Sie externe Datenquellen wie eine Excel-Tabelle in TestNG verwenden?

Antwort: Externe Datenquellen können über TestNG Data Provider integriert werden.
Sie können eine Methode erstellen, die die Excel-Tabelle liest und die Daten zurückgibt.
 Diese Methode wird dann mit der @DataProvider-Annotation markiert.

 7. Welche Vorteile bietet die Verwendung von Data Providern in TestNG?

Antwort: Die Vorteile sind die Wiederverwendbarkeit von Testmethoden,
die Möglichkeit, verschiedene Testdatensätze einfach zu verwenden, die Trennung von Testlogik und Testdaten,
und die Unterstützung für Data-Driven-Tests.

8. Wie können Sie die Reihenfolge der Daten im Data Provider beeinflussen?

Antwort: Sie können die Reihenfolge der Daten beeinflussen,
indem Sie die dependsOnMethods- oder dependsOnGroups-Attribute in der @Test-Annotation verwenden.
Dadurch können Sie die Ausführungsreihenfolge der Testmethoden steuern, die denselben Data Provider verwenden.


     */

}
