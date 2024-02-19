abstract class MOFactory {
    // Abstract method to create GUI components
    public abstract Panel createPanel();
    public abstract Button createButton();
    public abstract Textbox createTextbox();
}

class Word90 extends MOFactory {
    // Array to hold instances of Word90
    private static final Word90[] instances = new Word90[2];
    private static int instanceCount = 0;

    // Private constructor to prevent direct instantiation
    private Word90() {
        // Private constructor
    }

    // Method to get a synchronized instance of Word90
    public static synchronized Word90 getInstance() {
        if (instanceCount < 2) {
            // Create a new instance and store it in the array
            instances[instanceCount] = new Word90();
            instanceCount++;
        } else {
            // Print a warning if more than two instances are requested
            System.out.println("WARNING: More than two instances of Word90 were requested.");
            return null;
        }
        // Return the last created instance
        return instances[instanceCount - 1];
    }

    // Override methods to create specific GUI components for Word90
    @Override
    public Panel createPanel() {
        return new Panel90();
    }
    @Override
    public Button createButton() {
        return new Button90();
    }
    @Override
    public Textbox createTextbox() {
        return new Textbox90();
    }
}

class Word00 extends MOFactory {
    // Array to hold instances of Word00
    private static final Word00[] instances = new Word00[2];
    private static int instanceCount = 0;

    // Private constructor to prevent direct instantiation
    private Word00() {
        // Private constructor
    }

    // Method to get a synchronized instance of Word00
    public static synchronized Word00 getInstance() {
        if (instanceCount < 2) {
            // Create a new instance and store it in the array
            instances[instanceCount] = new Word00();
            instanceCount++;
        } else {
            // Print a warning if more than two instances are requested
            System.out.println("WARNING: More than two instances of Word00 were requested.");
            return null;
        }
        // Return the last created instance
        return instances[instanceCount - 1];
    }

    // Override methods to create specific GUI components for Word00
    @Override
    public Panel createPanel() {
        return new Panel00();
    }
    @Override
    public Button createButton() {
        return new Button00();
    }
    @Override
    public Textbox createTextbox() {
        return new Textbox00();
    }
}

class Word10 extends MOFactory {
    // Array to hold instances of Word10
    private static final Word10[] instances = new Word10[2];
    private static int instanceCount = 0;
    
    // Private constructor to prevent direct instantiation
    private Word10() {
        // Private constructor
    }

    // Method to get a synchronized instance of Word10
    public static synchronized Word10 getInstance() {
        if (instanceCount < 2) {
            // Create a new instance and store it in the array   
            instances[instanceCount] = new Word10();
            instanceCount++;
        } else {
            // Print a warning if more than two instances are requested
            System.out.println("WARNING: More than two instances of Word10 were requested.");
            return null;
        }
        // Return the last created instance
        return instances[instanceCount - 1];
    }
    // Override methods to create specific GUI components for Word10
    @Override
    public Panel createPanel() {
        return new Panel10();
    }
    @Override
    public Button createButton() {
        return new Button10();
    }
    @Override
    public Textbox createTextbox() {
        return new Textbox10();
    }
}

class Word24 extends MOFactory {
    // Array to hold instances of Word24
    private static final Word24[] instances = new Word24[2];
    private static int instanceCount = 0;

    // Private constructor to prevent direct instantiation
    private Word24() {
        // Private constructor
    }
    // Method to get a synchronized instance of Word24
    public static synchronized Word24 getInstance() {
        if (instanceCount < 2) {
            // Create a new instance and store it in the array
            instances[instanceCount] = new Word24();
            instanceCount++;
        } else {
            // Print a warning if more than two instances are requested
            System.out.println("WARNING: More than two instances of Word24 were requested.");
            return null;
        }
        // Return the last created instance
        return instances[instanceCount - 1];
    }

    // Override methods to create specific GUI components for Word24
    @Override
    public Panel createPanel() {
        return new Panel24();
    }
    @Override
    public Button createButton() {
        return new Button24();
    }
    @Override
    public Textbox createTextbox() {
        return new Textbox24();
    }
}