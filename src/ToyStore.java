/*
Необходимо написать программу – розыгрыша игрушек в магазине детских товаров.

 */


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class ToyStore {
    private final List<Toy> toys = new ArrayList<>();
    private final List<Toy> prizeToys = new ArrayList<>();

    public void addToy(Toy toy) {
        toys.add(toy);
    }


    public Toy pickPrizeToy() {
        double totalFrequency = 0;
        for (Toy toy : toys) {
            totalFrequency += toy.frequency;
        }

        double random = new Random().nextDouble() * totalFrequency;
        for (Toy toy : toys) {
            random -= toy.frequency;
            if (random <= 0) {
                Toy selectedToy = new Toy(toy.id, toy.name, 1, toy.frequency);
                toys.remove(toy);
                prizeToys.add(selectedToy);
                return selectedToy;
            }
        }

        return null;
    }

    public void writePrizeToysToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Toy toy : prizeToys) {
                writer.write(toy.toString());
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy(1, "Кукла", 10, 25);
        Toy toy2 = new Toy(2, "Машина", 15, 20);
        Toy toy3 = new Toy(3, "Мяч", 20, 15);

        toyStore.addToy(toy1);
        toyStore.addToy(toy2);
        toyStore.addToy(toy3);

        Toy prizeToy = toyStore.pickPrizeToy();
        if (prizeToy != null) {
            toyStore.writePrizeToysToFile("prize_toys.txt");
            System.out.println("Prize toy selected: " + prizeToy);
        }
    }
}

