public class Dog extends Animal{

    void speak(){
        String showTheStateOfAnimal=(isAlive) ? "Dog is alive and Barking...": "Dog is NOT alive and Barking...";
        System.out.println(showTheStateOfAnimal);
    }
}
