public class Ecole {
    private String name;
}
    public int getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }
    public Etudiant (String n) {
        this.name=n;
    }
    public Etudiant[] etudiants;

    public Ecole() {
        etudiants = new Etudiant[500];
    }