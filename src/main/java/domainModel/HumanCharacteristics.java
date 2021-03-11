package domainModel;

public enum HumanCharacteristics {
    BRAINLESS("Безмозглый"),
    STUPID("Тупой"),
    GENIUS("Гениальный"),
    COOL("Крутой"),
    DETERMINED("Целеустремлённый");
    private String value;

    HumanCharacteristics(String value) {
        this.value = value;
    }
}
