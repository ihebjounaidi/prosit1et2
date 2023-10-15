package Zoo;

public class ZooManagement {

    public static void main(String[] args) {
        //PROSIT 2
        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Wildlife Park";
        myZoo.city = "Ariana";
        myZoo.nbrCages = 25;
        myZoo.animals = new Animal[25];


        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

    }

}
    //instruction 11
    public int searchAnimal(Animal Object animal = animal;){
        int i ;


        for ( int i=0; i<Animal.length; i++ ) {
        if(name.Animal=name)
        System.out.println( Animal[ i ] );
        return i;
        }

        }
//instruction 13
public static boolean removeAnimal(Animal animal) {
        Animal[] Animal ;
        int[] Animal_new = new Animal[Animal.length-1];
        int j=3;
        for(int i=0, k=0;i<Animal.length;i++){
        if(i!=j){
        Animal_new[k]=Animal[i];
        k++;
        }
        }
        System.out.println("Before deletion :" + Arrays.toString(Animal));
        System.out.println("After deletion :" + Arrays.toString(Animal_new));

        }