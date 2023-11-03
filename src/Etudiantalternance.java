public class EtudiantAlter extends Etudiant
{
    private int salaire;
}
    public int getsalaire() {
        return salaire;
    }

    public void setsalaire(String salaire) {
        this.salaire = salaire;
    }
    public void ajouterUneAbsence() {
        salaire -= 50;
    }
    public String toString() {
        return "EtudiantAlter{" +
                "salaire=" + salaire +
                '}';
    }