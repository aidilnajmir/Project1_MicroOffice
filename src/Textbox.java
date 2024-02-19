// Abstract class representing a Textbox
abstract class Textbox {
    // Abstract method to display the textbox
    abstract void display();
}

// Concrete class representing a Textbox for Word90
class Textbox90 extends Textbox {
    // Implementation of the display method for Word90 Textbox
    void display() { System.out.println("Textbox Word90"); }
}

// Concrete class representing a Textbox for Word00
class Textbox00 extends Textbox {
    // Implementation of the display method for Word00 Textbox
    void display() { System.out.println("Textbox Word00"); }
}

// Concrete class representing a Textbox for Word10
class Textbox10 extends Textbox {
    // Implementation of the display method for Word10 Textbox
    void display() { System.out.println("Textbox Word10"); }
}

// Concrete class representing a Textbox for Word24
class Textbox24 extends Textbox {
    // Implementation of the display method for Word24 Textbox
    void display() { System.out.println("Textbox Word24"); }
}
