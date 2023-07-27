import java.util.ArrayList;

public  class Plants implements GodsCreation{
    @Override
    public void eat(GodsCreation godsCreation,int chance,LandPlot landPlot,Island island,int stomach) {
    }
    @Override
    public GodsCreation reproduction(GodsCreation godsCreationFather,GodsCreation godsCreationMather, LandPlot landPlot) {
        return this;
    }
    @Override
    public String name() {
        return "Растение";
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
    public void move(Island island,int placeX,int placeY,int moveX,int moveY,Object index) {

    }

    @Override
    public void murder(GodsCreation godsCreation,LandPlot landPlot) {

    }

    @Override
    public String imageName() {
        return "✿";
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
    public void dead(GodsCreation godsCreation, LandPlot landPlot,int eat) {

    }


    public String image(){
        return"\\uD80C\\uDDE3\\";
    }
}
