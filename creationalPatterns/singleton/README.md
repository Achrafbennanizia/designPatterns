# 📦 Singleton Demo Project (Java)

Ein vollständiges Java-Projekt, das verschiedene Implementierungen des **Singleton-Patterns**
zeigt – inklusive:

- ✔️ Lazy Singleton (Holder-Idiom)
- ✔️ ConfigManager mit `.properties` Datei
- ✔️ Logger Singleton
- ✔️ DatabaseConnection Mock Singleton
- ✔️ ThreadPoolManager Singleton
- ✔️ SettingsManager (Wrapper)
- ✔️ Maven Build
- ✔️ JUnit 5 Tests
- ✔️ Saubere Projektarchitektur

---

## 🚀 Features

### 🔧 Design Patterns

- **Thread-safe Singleton (Initialization-on-demand holder)**
- Keine `synchronized`-Blöcke nötig
- Lazy instantiation
- Zentraler globaler Zugriffspunkt

### 📁 File-Based Configuration

- Konfiguration wird automatisch aus  
  `src/main/resources/config.properties` geladen:

```properties
app.name=SingletonDemoFromFile
app.version=2.0.0
db.url=jdbc:postgresql://localhost:5432/dwh
db.user=achraf
db.password=secret
```

### 🧪 Testing

- Unit Tests mit **JUnit 5**
- Testen Singleton-Eigenschaft & Key-Value-Zugriff

---

## 📂 Projektstruktur

```text
singleton-demo/
 ├── src/
 │   ├── main/
 │   │   ├── java/de/hsoz/singleton/
 │   │   │   ├── App.java
 │   │   │   ├── ConfigManager.java
 │   │   │   ├── LoggerSingleton.java
 │   │   │   ├── DatabaseConnection.java
 │   │   │   ├── ThreadPoolManager.java
 │   │   │   └── SettingsManager.java
 │   │   └── resources/
 │   │       └── config.properties
 │   └── test/
 │       └── java/de/hsoz/singleton/ConfigManagerTest.java
 ├── pom.xml
 └── README.md
```

---

## 🛠 Installation & Build

### 1️⃣ Projekt clonen

```bash
git clone https://github.com/<yourname>/singleton-demo.git
cd singleton-demo
```

### 2️⃣ Maven Build

```bash
mvn clean package
```

### 3️⃣ Anwendung starten

```bash
java -cp target/singleton-demo-1.0-SNAPSHOT.jar de.hsoz.singleton.App
```

---

## 🧪 Tests ausführen

```bash
mvn test
```

---

## 🧱 Code-Beispiele

### 🔧 Singleton holen

```java
ConfigManager cfg = ConfigManager.getInstance();
System.out.println(cfg.get("app.name"));
```

### 📝 Logger Singleton

```java
LoggerSingleton.getInstance().info("System started");
```

### 💾 Database Connection

```java
DatabaseConnection db = DatabaseConnection.getInstance();
db.connect();
```

### 🧵 ThreadPool Singleton

```java
ThreadPoolManager.getInstance().submitTask(() -> {
    System.out.println("Running task...");
});
```

---

## 🔍 Architektur der Singleton-Implementierung

Der wichtigste Teil:

```java
private static class Holder {
    private static final ConfigManager INSTANCE = new ConfigManager();
}

public static ConfigManager getInstance() {
    return Holder.INSTANCE;
}
```

✔ Lazy Loading
✔ Thread-Safe
✔ High Performance
✔ Industry Standard

---

## 📘 Warum dieses Projekt?

Dieses Projekt ist perfekt für:

- Studenten (SE, OOP, Design Patterns)
- Prüfungen (Singleton Pattern)
- Bewerbungsgespräche (Java Knowledge)
- GitHub Portfolio
- Architektur-Demos

---

## 📜 Lizenz

MIT – frei nutzbar für Studium, Arbeit & Projekte.

---

## 👤 Author

**Achraf Ben**
Software Engineer • Java • Industrie & Technik
