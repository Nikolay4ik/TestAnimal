import java.util.ArrayList;

public class PlantGrowth extends Thread{
    private final Island island= Island.island;
    @Override
    public void run() {
        try {
            plantGrowth(island.landPlots);
            while (true) {
                for (int i = 0; i < island.landPlots.length; i++) {
                    for (int j = 0; j < island.landPlots[0].length; j++) {
                        if (island.landPlots[i][j].plotAnimalS.size() < 1)
                            island.landPlots[i][j].plotAnimalS.add(new Plants());
                    }
                }
                Thread.sleep(3000);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized static void plantGrowth(LandPlot[][] landPlots) {
        for (LandPlot[] plots : landPlots) {
            for (LandPlot landPlot : plots) {
                ArrayList<GodsCreation> plants = new ArrayList<GodsCreation>();
                plants.add(new Plants());
                landPlot.plotAnimalS.addAll(plants);

            }
        }
    }
}
