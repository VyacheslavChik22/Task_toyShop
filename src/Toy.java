public class Toy {
    int id;
    String name;
    private final int quantity;
    double frequency;

    public Toy(int id, String name, int quantity, double frequency) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public String toString() {
        return "ID: " + id + ", Наименование: " + name + ", Количество: " + quantity + ", Частота: " + frequency + "%";
    }
}
