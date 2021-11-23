class WolfTest {
    public static void main(String[] args) {
        Wolf wolfy = new Wolf();
        wolfy.setSex("female");
        wolfy.setName("Foxhunter");
        wolfy.setWeight(83.2f);
        wolfy.setAge(7);
        wolfy.setColor("red");

        System.out.println(wolfy.getSex());
        System.out.println(wolfy.getName());
        System.out.println(wolfy.getWeight());
        System.out.println(wolfy.getAge());
        System.out.println(wolfy.getColor());

        wolfy.go();
        wolfy.sit();
        wolfy.run();
        wolfy.howl();
        wolfy.hunt();
    }
}
