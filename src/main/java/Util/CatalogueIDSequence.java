package Util;

public class CatalogueIDSequence {
    private static CatalogueIDSequence instance; // Singleton instance
    private int nextID; // Next available catalogue ID

    private CatalogueIDSequence() {
        this.nextID = 0;
    }

    public static CatalogueIDSequence getInstance() {
        // Get the singleton instance of CatalogueIDSequence
        if (instance == null) {
            instance = new CatalogueIDSequence();
        }
        return instance;
    }

    public int getNextID() {
        // Get the next available catalogue ID
        return this.nextID++;
    }

    public static interface Describable {
        public String describe();
    }
}
