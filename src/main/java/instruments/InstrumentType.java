package instruments;

public enum InstrumentType {

    WOODWIND("Wood Wind"),
    STRING("String"),
    KEYBOARD("KeyBoard"),
    BRASS("Brass"),
    PERCUSSION("Percussion");

    private final String name;

    InstrumentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
