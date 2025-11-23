package de.hsoz.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfigManagerTest {

    @Test
    void singletonShouldReturnSameInstance() {
        ConfigManager c1 = ConfigManager.getInstance();
        ConfigManager c2 = ConfigManager.getInstance();

        assertSame(c1, c2, "ConfigManager instances should be identical (singleton)");
    }

    @Test
    void configShouldContainDefaultsOrFileValues() {
        ConfigManager cfg = ConfigManager.getInstance();

        assertNotNull(cfg.get("app.name"));
        assertNotNull(cfg.get("app.version"));
    }

    @Test
    void setAndGetShouldWork() {
        ConfigManager cfg = ConfigManager.getInstance();

        cfg.set("test.key", "123");
        assertEquals("123", cfg.get("test.key"));
    }
}
