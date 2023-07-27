import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LandPlot {
    // public static final Rabbit Rabbit = new Rabbit();
//    public static final Wolf Wolf = new Wolf();
    public static final Plants Plants = new Plants();

    // public static int quantityRabbit = Rabbit.quantityPlant();
//    public static int quantityWolf = Wolf.quantityPlant();
    public static int quantityPlants = Plants.quantityPlant();

//    private static int maxRabbit = Rabbit.maxQuantity();
//    private static int maxWolf = Wolf.maxQuantity();
//    private static int maxPlants = Plants.maxQuantity();


    public ArrayList<GodsCreation> plotAnimal = new ArrayList<>();
 // public  Collection syncCollection = Collections.synchronizedCollection(new ArrayList<>());
public List<GodsCreation> plotAnimalS= Collections.synchronizedList(plotAnimal);
    public LandPlot() {
//        Runnable listOperations = () -> {
//            syncCollection.addAll(plotAnimal);
//        };

    }

    //    public ArrayList<GodsCreation> plotAnimal(GodsCreation animalOrPlants) {
//        if (animalOrPlants instanceof Wolf) {
//            plotAnimal.add(animalOrPlants);
//            quantityWolf++;
//            maxWolf--;
//            placeCheck(maxWolf);
//            monitor(plotAnimal);
//        }
//        if (animalOrPlants instanceof Rabbit) {
//            plotAnimal.add(animalOrPlants);
//            quantityRabbit++;
//            maxRabbit--;
//            placeCheck(maxRabbit);
//            monitor(plotAnimal);
//        }
//        if (animalOrPlants instanceof Plants) {
//            plotAnimal.add(animalOrPlants);
//            quantityPlants++;
//            maxPlants--;
//            placeCheck(maxPlants);
//            monitor(plotAnimal);
//        }
//        return plotAnimal;
//    }
    public static void monitor(ArrayList<GodsCreation> godsCreationArrayList) {
        for (GodsCreation godsCreation : godsCreationArrayList)
            System.out.println("На клетке " + godsCreation.name());


    }

    public String arrayMonitor(ArrayList<GodsCreation> plotAnimal) {
        StringBuilder stringBuilder = new StringBuilder();
        for (GodsCreation godsCreation : plotAnimal) {
            stringBuilder.append(godsCreation.name() + " ");
        }
        return stringBuilder.toString();
    }
//    public static int quantityAnimalPlots(GodsCreation godsCreation) {
//        if (godsCreation instanceof Plants) {
//            return LandPlot.quantityPlants;
//        }
//        if (godsCreation instanceof Rabbit) {
//            return LandPlot.quantityRabbit;
//        }
//        if (godsCreation instanceof Wolf) {
//            return LandPlot.quantityWolf;
//        } else {
//            return 0;
//        }
//    }
//    public static int quantityAnimalPlotsMinus(GodsCreation godsCreation) {
//        if (godsCreation instanceof Plants) {
//            return --LandPlot.quantityPlants;
//        }
//        if (godsCreation instanceof Rabbit) {
//            return --LandPlot.quantityRabbit;
//        }
//        if (godsCreation instanceof Wolf) {
//            return --LandPlot.quantityWolf;
//        } else {
//            return 0;
//        }
//    }


    private static void placeCheck(int max) {
        if (max == 0) {
            System.out.println("На этой клетке нет места");
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (GodsCreation godsCreation : plotAnimal) {
            if (godsCreation != null) {
                if (godsCreation instanceof Wolf) {
                    stringBuilder.append("\uD80C\uDCE5");
                }
                if (godsCreation instanceof Rabbit) {
                    stringBuilder.append("\uD80C\uDCF9");
                }
                if (godsCreation instanceof Plants) {
                    stringBuilder.append(Plants.image());
                }
            } else {
                stringBuilder.append("\uD80C\uDDE3");
            }
        }
        return stringBuilder.toString();
    }
}
