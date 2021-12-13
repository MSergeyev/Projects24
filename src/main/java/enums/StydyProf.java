package enums;

public enum StydyProf  {
    COMPUTER_SCIENCE("Информатика"),
    MATHEMATICS("Математика"),
    JURISPRUDENCE("Юриспруденция"),
    MEDICINE("Медицина");



    public String getProfileName() {
        return this.profileName;
    }
    private StydyProf(String profileName) {
        this.profileName = profileName;
    }

    private final String profileName;



}
