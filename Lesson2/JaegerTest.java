class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyAvenger = new Jaeger();
        gipsyAvenger.setModelName("Gipsy Avenger");
        gipsyAvenger.setMark("Mark-6");
        gipsyAvenger.setWeight(2.004f);
        gipsyAvenger.setHeight(81.77f);
        gipsyAvenger.setStrength(85);
        gipsyAvenger.setCombat(55);

        Jaeger saberAthena = new Jaeger();
        saberAthena.setModelName("Saber Athena");
        saberAthena.setMark("Mark-7");
        saberAthena.setWeight(1.628f);
        saberAthena.setHeight(76.91f);
        saberAthena.setStrength(75);
        saberAthena.setCombat(55);

        System.out.println(gipsyAvenger.getModelName());
        gipsyAvenger.move();
        System.out.println(gipsyAvenger.scanKaiju());
        saberAthena.useWeapon();
        System.out.println(gipsyAvenger.drift());
        System.out.println(gipsyAvenger.getMark());
        System.out.println(gipsyAvenger.getWeight());
        System.out.println(gipsyAvenger.getStrength());
        System.out.println(gipsyAvenger.getCombat());

        System.out.println(saberAthena.getModelName());
        System.out.println(saberAthena.getHeigh());
        System.out.println(saberAthena.getStrength());

        System.out.println("\nGipsy Avenger revised Strength and Combat:");
        gipsyAvenger.setStrength(90);
        gipsyAvenger.setCombat(60);
        System.out.println(gipsyAvenger.getStrength());
        System.out.println(gipsyAvenger.getCombat());



    }
}