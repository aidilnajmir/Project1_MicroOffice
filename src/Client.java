// Class representing a client for testing GUI components
class Client {
    // Instance variables to store panel, button, and textbox
    private final Panel panel;
    private final Button button;
    private final Textbox textbox;

    // Constructor to initialize the client with a factory
    public Client(MOFactory factory) {
        // Create panel, button, and textbox using the factory
        panel = factory.createPanel();
        button = factory.createButton();
        textbox = factory.createTextbox();
    }

    // Method to run the client and display GUI components
    public void Run() {
        // Display panel, button, and textbox
        panel.display();
        button.display();
        textbox.display();
    }
}
