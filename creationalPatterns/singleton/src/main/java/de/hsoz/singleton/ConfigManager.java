package de.hsoz.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Singleton-Konfigurationsmanager:
 * - Lazy, thread-safe (Holder-Idiom)
 * - Lädt Default-Werte + optional aus config.properties
 */
public class ConfigManager {

    private final Map<String, String> config = new HashMap<>();

    private ConfigManager() {
        // Default-Werte
        config.put("app.name", "SingletonDemo");
        config.put("app.version", "1.0.0");

        // Versuche, eine Properties-Datei zu laden
        loadFromProperties("config.properties");
    }

    private static class Holder {
        private static final ConfigManager INSTANCE = new ConfigManager();
    }

    public static ConfigManager getInstance() {
        return Holder.INSTANCE;
    }

    public String get(String key) {
        return config.get(key);
    }

    public void set(String key, String value) {
        config.put(key, value);
    }

    /**
     * Lädt Konfiguration aus einer .properties-Datei im classpath.
     * Bestehende Keys werden überschrieben.
     */
    public void loadFromProperties(String resourceName) {
        try (InputStream in = getClass().getClassLoader().getResourceAsStream(resourceName)) {
            if (in == null) {
                System.err.println("Config file not found: " + resourceName);
                return;
            }
            Properties props = new Properties();
            props.load(in);
            for (String name : props.stringPropertyNames()) {
                config.put(name, props.getProperty(name));
            }
        } catch (IOException e) {
            System.err.println("Error loading config from " + resourceName + ": " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "ConfigManager" + config;
    }
}
