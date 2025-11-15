# 🏗️ Creational Patterns (Erzeugungsmuster)

Die **Creational Patterns** konzentrieren sich darauf, **Objekte flexibel, kontrolliert und entkoppelt zu erzeugen**.
Sie lösen typische Probleme wie:

- Wie verhindere ich „new“-Chaos im Code?
- Wie erzeuge ich komplexe Objekte Schritt für Schritt?
- Wie vermeide ich Duplikation bei Objektfamilien?
- Wie stelle ich sicher, dass es nur ein einziges Objekt einer Klasse gibt?

Diese Patterns verbessern die Flexibilität, Lesbarkeit und Erweiterbarkeit der Software bereits beim **Objektaufbau**.

---

# 📁 Inhalt

```
creationalPatterns/
├── factory-method/
├── abstract-factory/
├── builder/
├── prototype/
└── singleton/
```

Jedes Pattern enthält:

- kurze, klare Erklärung
- typischer Anwendungsfall
- Java-Beispielcode
- ggf. UML-Skizze
- saubere Paketstruktur

---

# 🔧 1. Factory Method

**Problem:**
Objekte direkt mit `new` erzeugen führt schnell zu starrer und doppelt geschriebener Logik.

**Lösung:**
Eine Methode in der Basisklasse entscheidet, **welches Produktobjekt** erzeugt wird.
Subklassen überschreiben diese Factory-Methode.

**Use Cases:**

- Objekte je nach Konfiguration erzeugen
- Frameworks, die Erweiterbarkeit brauchen

📍 Ordner: [`factory-method/`](factory-method)

---

# 🏭 2. Abstract Factory

**Problem:**
Eine App benötigt verschiedene, aber zusammengehörige Produktfamilien
(z. B. MacOS-Buttons + MacOS-Checkboxen).

**Lösung:**
Eine abstrakte _Fabrik_, die mehrere zusammenpassende Produkte erzeugt – **ohne Konkretionen zu kennen**.

**Use Cases:**

- GUI-Frameworks
- Datenbankzugriffe für verschiedene Anbieter

📍 Ordner: [`abstract-factory/`](abstract-factory)

---

# 🧱 3. Builder

**Problem:**
Ein großes, komplexes Objekt (z. B. Auto, Burger, Haus) entsteht aus vielen Teilen → Konstruktor wird unübersichtlich.

**Lösung:**
Ein **Builder** baut ein Objekt Schritt für Schritt, getrennt vom finalen Produkt.

**Use Cases:**

- Komplexe Konstruktion mit vielen Parametern
- Verschiedene Varianten des gleichen Produkts

📍 Ordner: [`builder/`](builder)

---

# 🧬 4. Prototype

**Problem:**
Neue Objekte erzeugen ist teuer oder komplex.

**Lösung:**
Ein existierendes Objekt dient als **Prototyp**, der geklont wird.

**Use Cases:**

- Spieleobjekte (NPC kopieren)
- Teure Konfigurationen duplizieren

📍 Ordner: [`prototype/`](prototype)

---

# 🔒 5. Singleton

**Problem:**
Es darf nur ein einziges Objekt einer Klasse geben
(z. B. Logger, Config, Connection-Pool).

**Lösung:**
Eine Klasse kontrolliert ihre einzige Instanz selbst und gibt sie global frei.

**Use Cases:**

- Logging
- Zugriff auf globale Einstellungen
- zentraler Ressourcenmanager

📍 Ordner: [`singleton/`](singleton)

---

# 🎯 Ziel dieser Sammlung

Die Beispiele in diesem Ordner sollen:

- die wichtigsten Erzeugungsmuster schnell verständlich machen
- reale Szenarien statt künstlicher Beispiele zeigen
- saubere Java-Implementierungen liefern
- für Uni, Praxis und technische Interviews nützlich sein
