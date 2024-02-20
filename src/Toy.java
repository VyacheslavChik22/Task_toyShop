public class Toy {
    int toyId;
    String toyName;
    int frequency;
    double weight;

    public Toy(int toyId, String toyName, int frequency, double weight) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.frequency = frequency;
        this.weight = weight;
    }

    public int getToyId() {
        return toyId;
    }

    public void setToyId(int toyId) {
        this.toyId = toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
