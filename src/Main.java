public class Main {
    public static void main(String[] args) {
        String nameJohn = "John";
        int ageJohn = 13;
        String nameSarah = "Sarah";
        int aheSarah = 30;

        String[] names = {"John", "Sarah "};
        int[] ages  = {13,30};

        for (int i = 0; i < names.length;i++) {
            System.out.println("Имя - " + names[i] + " Возвраст -  " + ages[i]);
        }
        Person sarah =  new Person("Sarah",30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person john = new Person("John",13);
    }
}