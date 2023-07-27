public class Wolf extends Predators{
    @Override
    public boolean eatChance(GodsCreation godsCreation,int chance) {
        if (godsCreation instanceof Wolf) {
            return false;}
        if (godsCreation instanceof Rabbit) {
           if (chance>=40){
            return true;}
        }
        if (godsCreation instanceof Plants) {
            return false;
        }
        else {
            return false;
        }
    }
    @Override
    public String name() {
        return "Волк";
    }

    @Override
    public double weight() {
        return 50;
    }

    @Override
    public int maxQuantity() {
        return 30;
    }

    @Override
    public int speed() {
        return 3;
    }

    @Override
    public double amountEaten() {
        return 8;
    }

    @Override
    public int quantityPlant() {
        return 0;
    }

    @Override
    public String imageName() {
        return "\uD80C\uDCE5";
    }


    private int stomach;

    public int getStomach() {
        return stomach;
    }

    public void setStomach(int stomach) {
        this.stomach = stomach;
    }


    private int startXwolf;
    private int startYwolf;



    public Wolf(int startXwolf, int startYwolf,int stomach) {
        this.startXwolf = startXwolf;
        this.startYwolf = startYwolf;
        this.stomach=stomach;

    }

    public int getStartXwolf() {
        return startXwolf;
    }

    public int getStartYwolf() {
        return startYwolf;
    }

    public void setStartXwolf(int startXwolf) {
        this.startXwolf = startXwolf;
    }

    public void setStartYwolf(int startYwolf) {
        this.startYwolf = startYwolf;
    }

    @Override
    public void eat(GodsCreation godsCreation, int chance, LandPlot landPlot, Island island, int stomach) {
        if (eatChance(godsCreation, chance)) {
            this.stomach=stomach+2;
            this.murder(godsCreation, landPlot);
            setStomach(this.stomach);
        }
    }

    @Override
    public int startX() {
        return getStartXwolf();
    }

    @Override
    public int startY() {
        return getStartYwolf();
    }

    @Override
    public int stomachGods() {
        return getStomach();
    }
}
