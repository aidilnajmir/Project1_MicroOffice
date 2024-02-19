class Client {
    private final Panel panel;
    private final Button button;
    private final Textbox textbox;

    public Client(MOFactory factory) {
            panel = factory.createPanel();
            button = factory.createButton();
            textbox = factory.createTextbox();
    }

    public void Run() {
        panel.display();
        button.display();
        textbox.display();
    }
}