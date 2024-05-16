public enum Fruit {
    APPLE(1,"Red","Sweet"),
    BANANA(2,"Yellow","Sweet"),
    ORANGE(3,"Orange","Citrus"),
    GRAPH(4,"Purple","Sweet"),
    LEMON(5,"Yellow","Sour");
    private int number;
   private String color;
   private String taste;

    Fruit(int number,String color, String taste) {
        this.number = number;
        this.color = color;
        this.taste = taste;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public String getTaste() {
        return taste;
    }
}
