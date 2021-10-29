class ConditionalStatement {
    public static void main(String[] args) {
        int age = 20;
        if(age > 20) {
            System.out.println("Person over 20 years old");
        }

        boolean maleSex = true;
        if(maleSex) {
            System.out.println("Person sex male");
        }

        if(!maleSex) {
            System.out.println("Person sex female");
        }

        float height = 1.75f;
        if(height < 1.80) {
            System.out.println("Person height less than 1.80");
        }

        char firstNameLatter = 'P';
        if(firstNameLatter == 'M') {
            System.out.println("Person first latter of name is M");
        } else if(firstNameLatter == 'I') {
            System.out.println("Person first latter of name is I");
        } else {
            System.out.println("Message to person \"We will contact you later \"");
        }
    }
}