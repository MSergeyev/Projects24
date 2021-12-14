package enums;

public enum StydyProf  {

    COMPUTER_SCIENCE ("Информатика"),
    MATHEMATICS("Математика"),
    LINGUISTICS("Лингвистика"),
    PHYSICS("Физика"),
    MEDICINE5("Медицина"),
    JURISPRUDENCE("Юриспруденция"),
    MEDICINE("Медицина");



    private final String profileName;

    public String getProfileName() {
        return this.profileName;
    }
    StydyProf(String profileName) {
        this.profileName = profileName;
    }



}
