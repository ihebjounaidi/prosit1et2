public class Etudiant_3eme extends Etudiant
{
    private String branche;
}
    public int getbranche() {
        return branche;
    }

    public void setbranche(String branche) {
        this.branche = branche;
    }
    public Etudiant (String b) {
        this.branche=b;
    }
    public void ajouterUneAbsence() {
        moyenne -= 0.5;
    }