public class Herbivores extends Animal {
    @Override
    public void eat(GodsCreation godsCreation, int chance, LandPlot landPlot, Island island,int stomach) {
       if (stomach<godsCreation.amountEaten()){
        if (eatChance(godsCreation, chance)) {
            this.murder(godsCreation, landPlot);
        }
       }
    }


    @Override
    public GodsCreation reproduction(GodsCreation godsCreationFather,GodsCreation godsCreationMather, LandPlot landPlot) {
        if (this.equals(godsCreationMather)) {
            return this;
        }else return null;
    }


    @Override
    public String name() {
        return null;
    }

    @Override
    public double weight() {
        return 0;
    }

    @Override
    public int maxQuantity() {
        return 0;
    }

    @Override
    public int speed() {
        return 0;
    }

    @Override
    public double amountEaten() {
        return 0;
    }

    @Override
    public int quantityPlant() {
        return 0;
    }

    @Override
    public void move(Island island, int placeX, int placeY, int moveX, int moveY, Object index) {
        island.landPlots[moveX][moveY].plotAnimalS.add(island.landPlots[placeX][placeY].plotAnimalS.remove(island.landPlots[placeX][placeY].plotAnimalS.indexOf(index)));

    }

    @Override
    public void murder(GodsCreation godsCreation, LandPlot landPlot) {
                landPlot.plotAnimalS.remove(godsCreation);

    }

    @Override
    public String imageName() {
        return "";
    }

    @Override
    public int startX() {
        return 0;
    }

    @Override
    public int startY() {
        return 0;
    }

    @Override
    public int stomachGods() {
        return 0;
    }


    @Override
    public void dead(GodsCreation godsCreation, LandPlot landPlot, int eat) {
        if (eat == 0) {
            landPlot.plotAnimalS.remove(godsCreation);
        }

    }


    public boolean eatChance(GodsCreation godsCreation, int chance) {
        return false;
    }

}
