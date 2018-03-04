# gretl-ng

## TODO

### JUnit-Testkategorien
Was machen mit DbTest-Kategorie? Sowohl die Integrationstests wie auch diese Test-Kategorie haben eine DB-Abhängigkeit. Verlieren wir viel, wenn wir das System der JUnit-Testkategorien über Bord werfen und sagen, dass alles was eine DB-Abhängigkeit hat, als Integrationstest laufen soll? Aufwand/Ertrag? Werden wir noch weitere Testkategorien haben? Wie viele Tests wären heute betroffen? (v.a. Geometrie-Lesen-Schreiben-Tests, die nicht mit Derby etc. gemacht werden können). Alles im Sinne einer Vereinfachung des Ganzen.

Was würde - Stand heute - wegfallen:
* Ein paar Tests.
* "useJUnit"-Zeugs im build.gradle
* "tasks.withType(Tests)" weil keine Parameter weitergeleitet werden müssen (vielleicht aber andere?) (im build.gradle)


### Clean Code
* Gross-/Kleinschreibung in Db2Db-Testklasse.

### Sonstiges
* Fileextension: mit Apache Commons irgendwas?