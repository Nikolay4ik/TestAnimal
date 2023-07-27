import java.util.concurrent.CopyOnWriteArrayList;

public class Tick extends Thread {
private final Island island= Island.island;
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println();
                for (int i = 0; i < island.landPlots.length; i++) {
                    for (int j = 0; j < island.landPlots[0].length; j++) {
                        CopyOnWriteArrayList<GodsCreation> copyOnWriteArrayList = new CopyOnWriteArrayList(island.landPlots[i][j].plotAnimalS);
                        for (GodsCreation godsCreation : copyOnWriteArrayList) {
                            System.out.print(godsCreation.imageName());
                        }
                        // System.out.print(island.landPlots[i][j].plotAnimal);
                    }
                    System.out.println();
                }
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (NullPointerException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
