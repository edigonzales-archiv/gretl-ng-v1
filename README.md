# gretl-ng

```
 ./gradlew build functionalTest -Pgretltest_dburi_pg=jdbc:postgresql:gretl
```

## TODO

### JUnit-Testkategorien
Was machen mit DbTest-Kategorie? Sowohl die Integrationstests wie auch diese Test-Kategorie haben eine DB-Abhängigkeit. Verlieren wir viel, wenn wir das System der JUnit-Testkategorien über Bord werfen und sagen, dass alles was eine DB-Abhängigkeit hat, als Integrationstest laufen soll? Aufwand/Ertrag? Werden wir noch weitere Testkategorien haben? Wie viele Tests wären heute betroffen? (v.a. Geometrie-Lesen-Schreiben-Tests, die nicht mit Derby etc. gemacht werden können). Alles im Sinne einer Vereinfachung des Ganzen.

Was würde - Stand heute - wegfallen:
* Ein paar Tests.
* "useJUnit"-Zeugs im build.gradle

### Tests
* Im build.gradle gibt es eine Default-DB-Url. In den TestUtilSql-Klassen nicht -> Test fliegt ohne dburi als -P trotzdem um die Ohren.
* -> JUnit 5
* functional tests with 3rd party plugins

### Clean Code
* Gross-/Kleinschreibung in Db2Db-Testklasse.

### Sonstiges
* Fileextension: mit Apache Commons irgendwas?