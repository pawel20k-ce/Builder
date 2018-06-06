public class Burger {

    private BreadType bread;

    private String meat;
    private String salad;
    private String cheese;
    private String sauce;
    private boolean withBacon;

    private Burger(Builder builder) {
        //private aby nie tworzyc new burger
        this.bread=builder.bread;
        this.salad=builder.salad;
        this.cheese=builder.cheese;
        this.sauce=builder.sauce;
        this.withBacon=builder.withBacon;
        this.meat=builder.meat;

    }

    public BreadType getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getSalad() {
        return salad;
    }

    public String getCheese() {
        return cheese;
    }

    public String getSauce() {
        return sauce;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bread=" + bread +
                ", meat='" + meat + '\'' +
                ", salad='" + salad + '\'' +
                ", cheese='" + cheese + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    //publiczna metoda zwracajaca obiekt typu builder
    public static Builder builder() {
        return new Builder();// zwracamy nowa instancje buildera
    }

    public static class Builder {

        private BreadType bread;

        private String meat;
        private String salad;
        private String cheese;
        private String sauce;
        private boolean withBacon;
        private Builder() {

        }

        public Builder bread(BreadType bread) {
            this.bread = bread;
            return this;//this zwraca obiekt w ktorym aktualnie jestesmy czyli buildera
        }

        public Builder meat(String meat){
            this.meat=meat;
            return this;
        }
        public Builder salad(String salad){
            this.salad=salad;
            return this;
        }
        public Builder cheese(String cheese){
            this.cheese=cheese;
            return this;
        }
        public Builder sauce(String sauce){
            this.sauce=sauce;
            return this;
        }

        public Builder withBacon(boolean withBacon){
            this.withBacon = withBacon;
            return this;
        }

        public Burger build(){
            return new Burger(this);
        }

    }


}
