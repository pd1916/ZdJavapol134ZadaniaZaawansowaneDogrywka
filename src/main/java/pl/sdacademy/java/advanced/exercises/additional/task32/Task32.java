package pl.sdacademy.java.advanced.exercises.additional.task32;

import java.io.*;
import java.nio.file.Path;
import java.util.List;

public class Task32 {
    public static void main(String[] args) throws IOException {
        initData();
        Path dirPath = Path.of("src/main/java/pl/sdacademy/java/advanced/exercises/additional/task32");
        Path inputFile = dirPath.resolve("course.txt");
        File file = inputFile.toFile();
        System.out.println("Saving file...");
        save(file);
        System.out.println("Opening file...");
        List<Car> loadedCars = load(file);
        System.out.println(loadedCars);

//        List<String> strings = List.of("aba", "sdfdsfds");
//        List<Car> cars = initData();
//        Files.write(inputFile, strings, StandardCharsets.UTF_8);
//        Files.write(inputFile, cars, StandardCharsets.UTF_8);
    }

    private static List<Car> load(File file) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Car>) ois.readObject();
        } catch(IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void save(File file) {
        List<Car> cars = initData();
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(cars);
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

//        try {
//            //logika
//        } catch (RuntimeException ex) {
//            // obsługa exceptiona
//        } finally {
//            // zamykanie pliku/streama/zasobów
//        }
//
//        try (//tworzymy obiekty które mają zostać zamknięte po zakońćzeniu try/catcha) {
//             //logika
//        } catch (RuntimeException ex) {
//            // obsługa exceptiona
//        }
    }

    private static List<Car> initData() {
        return List.of(
                new Car("Volvo", 300_000, true),
                new Car("BMW", 50_000, false),
                new Car("Audi", 250_000, true)
        );
    }
}
