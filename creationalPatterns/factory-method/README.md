# 🏭 Factory Method Demo (Java)

Dieses Projekt zeigt eine **saubere und minimalistische Implementierung des Factory Method Design Patterns** in Java.
Das Factory Method Pattern gehört zu den **Creational Patterns** und ermöglicht es, Objekte zu erzeugen, ohne deren konkrete Klassen direkt zu verwenden.

---

# 🎯 Ziel

Das Ziel dieses Beispiels ist:

- das Factory Method Pattern klar verständlich zu demonstrieren
- die Entkopplung von Objekt-Erzeugung und -Verwendung zu zeigen
- eine leicht erweiterbare Architektur bereitzustellen
- ein Beispiel zu liefern, das sowohl für **Uni**, **Interviews** als auch **Praxis** sinnvoll ist

---

# 🧠 Was ist die Factory Method?

Die **Factory Method** erlaubt es, Objekte über eine _Methode_ zu erzeugen, die in Subklassen überschrieben wird.

**Warum?**
Damit der Code nicht von komplizierten oder wechselnden `new`-Operationen abhängig ist.

**Vorteile:**

- lockere Kopplung
- bessere Erweiterbarkeit
- einfaches Hinzufügen neuer Produktklassen
- klare Trennung von Logik und Instanziierung

---

# 📦 Projektstruktur

```
factory-method/
│
├── pom.xml                     # Maven Build File
└── src/
    └── main/
        └── java/
            └── com/
                └── factory/
                    ├── Main.java
                    ├── Transport.java
                    ├── Truck.java
                    ├── Ship.java
                    ├── Logistics.java
                    ├── RoadLogistics.java
                    └── SeaLogistics.java
```

---

# 🧩 Pattern-Aufbau

### **Produkt (Interface)**

```java
public interface Transport {
    void deliver();
}
```

### **Konkrete Produkte**

- `Truck`
- `Ship`

### **Creator (Basisklasse)**

```java
public abstract class Logistics {
    public abstract Transport createTransport();

    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }
}
```

### **Konkrete Creator-Implementierungen**

- `RoadLogistics` → erzeugt `Truck`
- `SeaLogistics` → erzeugt `Ship`

---

# ▶️ Ausführen

## **Mit Maven**

Im Projektverzeichnis:

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.factory.Main"
```

Falls `exec-maven-plugin` fehlt, im `pom.xml` hinzufügen:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>exec-maven-plugin</artifactId>
            <version>3.6.2</version>
            <configuration>
                <mainClass>com.factory.Main</mainClass>
            </configuration>
        </plugin>
    </plugins>
</build>
```

Dann:

```bash
mvn exec:java
```

---

## **Ohne Maven (nur Java)**

```bash
javac -d out src/main/java/com/factory/*.java
java -cp out com.factory.Main
```

---

# 📌 Konsolenausgabe

```
Delivery by truck on the road.
Delivery by ship over the sea.
```

---

# 📚 Learnings

Dieses Beispiel zeigt:

- wie man die Factory Method implementiert
- wie man die Verantwortung für die Objekterzeugung auslagert
- wie man durch Vererbung unterschiedliche Objekte erzeugen kann
- wie man das Open–Closed Principle einhält
- wie man das Pattern zur Erweiterung offen hält (neue Transporte etc.)
