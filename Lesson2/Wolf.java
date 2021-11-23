class Wolf {
    private String sex;
    private String name;
    private float weight;
    private int age;
    private String color;

    public void go() {
        System.out.println("going");
    }

    public void sit() {
        System.out.println("sitting");
    }

    public void run() {
        System.out.println("running");
    }

    public void howl() {
        System.out.println("howling");
    }

    public void hunt() {
        System.out.println("hunting");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
            this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        if (age < 0 || age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }
}
