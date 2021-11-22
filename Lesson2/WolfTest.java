class WolfTest {
    public static void main(String[] args) {
        Wolf wolfy = new Wolf();
        wolfy.setSex("female");
        wolfy.setName("Foxhunter");
        wolfy.setWeight(83.2f);
        wolfy.setAge(7);
        wolfy.setColor("red");
        String sex = wolfy.getSex();
        System.out.println(sex);
        String name = wolfy.getName();
        System.out.println(name);
        float weight = wolfy.getWeight();
        System.out.println(weight);
        int age = wolfy.getAge();
        System.out.println(age);
        String color = wolfy.getColor();
        System.out.println(color);
        wolfy.go();
        wolfy.sit();
        wolfy.run();
        wolfy.howl();
        wolfy.hunt();
    }
}
