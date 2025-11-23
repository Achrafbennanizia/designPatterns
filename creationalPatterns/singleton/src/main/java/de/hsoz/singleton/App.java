package de.hsoz.singleton;

public class App {
    public static void main(String[] args) {
        ConfigManager cfg1 = ConfigManager.getInstance();
        ConfigManager cfg2 = ConfigManager.getInstance();

        System.out.println("app.name = " + cfg1.get("app.name"));
        System.out.println("db.url   = " + cfg2.get("db.url"));
        System.out.println("cfg1 == cfg2 ? " + (cfg1 == cfg2));
        System.out.println(cfg1);
    }
}
