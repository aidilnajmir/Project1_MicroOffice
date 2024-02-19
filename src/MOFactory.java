abstract class MOFactory {
    public abstract Panel createPanel();
    public abstract Button createButton();
    public abstract Textbox createTextbox();
}

class Word90 extends MOFactory {
    private static final Word90[] instances = new Word90[2];
    private static int instanceCount = 0;

    private Word90() {
        // Private constructor
    }

    public static synchronized Word90 getInstance() {
        if (instanceCount < 2) {
            instances[instanceCount] = new Word90();
            instanceCount++;
        } else {
            System.out.println("WARNING: More than two instances of Word90 requested.");
            return null;
        }
        return instances[instanceCount - 1]; // Return the last created instance
    }

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
    private static final Word00[] instances = new Word00[2];
    private static int instanceCount = 0;

    private Word00() {
        // Private constructor
    }

    public static synchronized Word00 getInstance() {
        if (instanceCount < 2) {
            instances[instanceCount] = new Word00();
            instanceCount++;
        } else {
            System.out.println("WARNING: More than two instances of Word00 requested.");
            return null;
        }
        return instances[instanceCount - 1]; // Return the last created instance
    }

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
    private static final Word10[] instances = new Word10[2];
    private static int instanceCount = 0;

    private Word10() {
        // Private constructor
    }

    public static synchronized Word10 getInstance() {
        if (instanceCount < 2) {
            instances[instanceCount] = new Word10();
            instanceCount++;
        } else {
            System.out.println("WARNING: More than two instances of Word10 requested.");
            return null;
        }
        return instances[instanceCount - 1]; // Return the last created instance
    }

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
    private static final Word24[] instances = new Word24[2];
    private static int instanceCount = 0;

    private Word24() {
        // Private constructor
    }

    public static synchronized Word24 getInstance() {
        if (instanceCount < 2) {
            instances[instanceCount] = new Word24();
            instanceCount++;
        } else {
            System.out.println("WARNING: More than two instances of Word24 requested.");
            return null;
        }
        return instances[instanceCount - 1]; // Return the last created instance
    }

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