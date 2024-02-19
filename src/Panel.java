// Abstract class representing a Panel
abstract class Panel {
    // Abstract method to display the panel
    abstract void display();
}

// Concrete class representing a Panel for Word90
class Panel90 extends Panel {
    // Implementation of the display method for Word90 Panel
    void display() { System.out.println("Panel Word90"); }
}

// Concrete class representing a Panel for Word00
class Panel00 extends Panel {
    // Implementation of the display method for Word00 Panel
    void display() { System.out.println("Panel Word00"); }
}

// Concrete class representing a Panel for Word10
class Panel10 extends Panel {
    // Implementation of the display method for Word10 Panel
    void display() { System.out.println("Panel Word10"); }
}

// Concrete class representing a Panel for Word24
class Panel24 extends Panel {
    // Implementation of the display method for Word24 Panel
    void display() { System.out.println("Panel Word24"); }
}
