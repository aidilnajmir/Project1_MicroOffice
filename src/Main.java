// Import statements
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

// Main class to run the program
public class Main {
    // Map to store factory suppliers for each factory type
    private static final Map<String, Supplier<MOFactory>> factorySuppliers = new HashMap<>();

    static {
        // Register each class with its corresponding getInstance method
        factorySuppliers.put("Word90", Word90::getInstance);
        factorySuppliers.put("Word00", Word00::getInstance);
        factorySuppliers.put("Word10", Word10::getInstance);
        factorySuppliers.put("Word24", Word24::getInstance);
    }

    // Main method
    public static void main(String[] args) {
        // Path to the configuration file
        String configFilePath = "config.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(configFilePath))) {
            String factoryName;
            // Read each line from the configuration file
            while ((factoryName = reader.readLine()) != null) {
                // Get the factory supplier for the current factory name
                Supplier<MOFactory> factorySupplier = factorySuppliers.get(factoryName);
                if (factorySupplier != null) {
                    // Get the factory instance from the supplier
                    MOFactory factory = factorySupplier.get();
                    if (factory != null) {
                        // Create a client with the factory and run it
                        Client client = new Client(factory);
                        client.Run();
                    }
                } else {
                    // Print error message if no supplier found for the factory type
                    System.err.println("No supplier found for factory type: " + factoryName);
                }
            }
        } catch (IOException e) {
            // Print error message if an IO exception occurs
            System.err.println("Error reading the configuration file: " + e.getMessage());
        }
    }
}
