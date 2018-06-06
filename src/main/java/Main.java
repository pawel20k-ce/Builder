public class Main {

    public static void main(String[] args) {
        Burger.Builder burgerBuilder = Burger.builder();
       Burger myBurger =  burgerBuilder
                .bread(BreadType.PSZENNE)
                .cheese("masdaamamer")
                .meat("beef")
                .salad("bio lettuce")
                .sauce("cesar")
                .withBacon(true).build();

        System.out.println(myBurger);

    }

}
