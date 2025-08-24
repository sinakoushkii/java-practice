public class Cat extends Animal{
    void speak(){
        String showTheStateOfAnimal=(isAlive) ? "Cat is alive and Meowing...": "Cat is NOT alive and Meowing...";
        System.out.println(showTheStateOfAnimal);
    }
}
