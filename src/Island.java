import java.util.ArrayList;

public class Island  {
    public  LandPlot [][] landPlots;
private final int x;
private final int y;
public static Island island=new Island(10,10);
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Island(int y, int x) {
        this.x = x;
        this.y = y;
        landPlots = new LandPlot[y][x];
        for (int i = 0; i < landPlots.length; i++) {
            for (int j = 0; j < landPlots[0].length; j++) {
                landPlots[i][j] = new LandPlot();
            }
        }
    }

}
