class WolfTest {
    public static void main(String[] args) {
        Wolf wolfy = new Wolf();
        wolfy.sex = "male";
        wolfy.name = "Bearhunter";
        wolfy.weight = 183.2f;
        wolfy.age = 12;
        wolfy.color = "white";
        System.out.println(wolfy.sex);
        System.out.println(wolfy.name);
        System.out.println(wolfy.weight);
        System.out.println(wolfy.age);
        System.out.println(wolfy.color);
        wolfy.go();
        wolfy.set();
        wolfy.run();
        wolfy.houl();
        wolfy.hunt();
    }
}
