import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class Main {
    private static final Map<String, Supplier<MOFactory>> factorySuppliers = new HashMap<>();

    static {
        // Register each class with its corresponding getInstance method
        factorySuppliers.put("Word90", Word90::getInstance);
        factorySuppliers.put("Word00", Word00::getInstance);
        factorySuppliers.put("Word10", Word10::getInstance);
        factorySuppliers.put("Word24", Word24::getInstance);
    }

    public static void main(String[] args) {
        String configFilePath = "config.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(configFilePath))) {
            String factoryName;
            while ((factoryName = reader.readLine()) != null) {
                Supplier<MOFactory> factorySupplier = factorySuppliers.get(factoryName);
                if (factorySupplier != null) {
                    MOFactory factory = factorySupplier.get();
                    if (factory != null) {
                        Client client = new Client(factory);
                        client.Run();
                    }
                }
                else {
                    System.err.println("No supplier found for factory type: " + factoryName);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the configuration file: " + e.getMessage());
        }
    }
}