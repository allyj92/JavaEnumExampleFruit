public enum Fruit {
    APPLE("Red","Sweet"),
    BANANA("Yellow","Sweet"),
    ORANGE("Orange","Citrus"),
    GRAPH("Purple","Sweet"),
    LEMON("Yellow","Sour");

   private String color;
   private String taste;

    Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    public String getColor() {
        return color;
    }

    public String getTaste() {
        return taste;
    }
}
