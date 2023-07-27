import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new PlantGrowth().start();
        for (int i = 0; i <10; i++) {
            new FunAnimal(Island.island, new Rabbit(i, i, 5)).start();
        }
        for (int i = 0; i <5; i++) {
        new FunAnimal(Island.island, new Wolf(i+1, i, 5)).start();
        }
        new Tick().start();

    }


}
