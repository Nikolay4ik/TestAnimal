import java.util.ArrayList;

public interface GodsCreation{
    void eat(GodsCreation godsCreation,int chance,LandPlot landPlot,Island island,int stomach);
    GodsCreation reproduction(GodsCreation godsCreationFather,GodsCreation godsCreationMather,LandPlot landPlot);
    String name();
    public double weight();
    public int maxQuantity();
    public int speed();
    public double amountEaten();
    int quantityPlant();
   void move(Island island,int placeX,int placeY,int moveX,int moveY,Object index);


    void murder(GodsCreation godsCreation,LandPlot landPlot);
    String imageName();
    int startX();
    int startY();
    int stomachGods();

    void dead(GodsCreation godsCreation,LandPlot landPlot,int eat);


}
