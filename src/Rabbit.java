public class Rabbit extends Herbivores {
    @Override
    public String name() {
        return "Кролик";
    }

    @Override
    public boolean eatChance(GodsCreation godsCreation, int chance) {
        if (godsCreation instanceof Wolf) {
            return false;
        }
        if (godsCreation instanceof Rabbit) {
            return false;
        }
        if (godsCreation instanceof Plants){
            return true;
        }
        return false;
    }

    @Override
    public double weight() {
        return 2;
    }

    @Override
    public int maxQuantity() {
        return 150;
    }

    @Override
    public int speed() {
        return 2;
    }

    @Override
    public double amountEaten() {
        return 0.45;
    }

    @Override
    public int quantityPlant() {
        return 0;
    }

    @Override
    public String imageName() {
        return "\uD80C\uDCF9";
    }

    private int stomach;

    public int getStomach() {
        return stomach;
    }

    public void setStomach(int stomach) {
        this.stomach = stomach;
    }

    private int startXrabbit;
    private int startYrabbit;

    public Rabbit(int startXrabbit, int startYrabbit, int stomach) {
        this.startXrabbit = startXrabbit;
        this.startYrabbit = startYrabbit;
        this.stomach = stomach;
    }

    public int getStartXrabbit() {
        return startXrabbit;
    }

    public void setStartXrabbit(int startXrabbit) {
        this.startXrabbit = startXrabbit;
    }

    public int getStartYrabbit() {
        return startYrabbit;
    }

    public void setStartYrabbit(int startYrabbit) {
        this.startYrabbit = startYrabbit;
    }

    @Override
    public void eat(GodsCreation godsCreation, int chance, LandPlot landPlot, Island island, int stomach) {
        if (eatChance(godsCreation, chance)) {
            this.stomach = stomach + 1;
            setStomach(this.stomach);
            this.murder(godsCreation, landPlot);

        }
    }

    @Override
    public int startX() {
        return getStartXrabbit();
    }

    @Override
    public int startY() {
        return getStartYrabbit();
    }

    @Override
    public int stomachGods() {
        return getStomach();
    }

    @Override
    public GodsCreation reproduction(GodsCreation godsCreationFather, GodsCreation godsCreationMather, LandPlot landPlot) {
        if (this == godsCreationMather) {
            int i = 2;
            try {
                    Rabbit rabbitChild = new Rabbit(5, 5, 5);
                    new FunAnimal(Island.island, rabbitChild);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return this;
        } else return null;
    }
}