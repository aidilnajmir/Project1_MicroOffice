// Abstract class representing a Button
abstract class Button {
    // Abstract method to display the button
    abstract void display();
}

// Concrete class representing a Button for Word90
class Button90 extends Button {
    // Implementation of the display method for Word90 Button
    void display() { System.out.println("Button Word90"); }
}

// Concrete class representing a Button for Word00
class Button00 extends Button {
    // Implementation of the display method for Word00 Button
    void display() { System.out.println("Button Word00"); }
}

// Concrete class representing a Button for Word10
class Button10 extends Button {
    // Implementation of the display method for Word10 Button
    void display() { System.out.println("Button Word10"); }
}

// Concrete class representing a Button for Word24
class Button24 extends Button {
    // Implementation of the display method for Word24 Button
    void display() { System.out.println("Button Word24"); }
}

