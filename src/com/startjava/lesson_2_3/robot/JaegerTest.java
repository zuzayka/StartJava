class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsyAvenger = new Jaeger("Gipsy Avenger",
            "Mark-6", 2.004f, 81.77f, 85, 55);

        Jaeger saberAthena = new Jaeger("Saber Athena",
                "Mark-7", 1.628f, 76.91f, 75, 55);

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