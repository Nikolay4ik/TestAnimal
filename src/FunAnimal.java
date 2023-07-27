import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class FunAnimal extends Thread {
    private GodsCreation godsCreation;

    public FunAnimal(Island island, GodsCreation godsCreation) throws InterruptedException {
        if (godsCreation instanceof Rabbit) {
            island.landPlots[godsCreation.startX()][godsCreation.startY()].plotAnimal.add(godsCreation);
        }
        if (godsCreation instanceof Wolf) {
            island.landPlots[godsCreation.startX()][godsCreation.startY()].plotAnimal.add(godsCreation);
        }


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        Thread.sleep(1000);
                        randomPath(godsCreation, island, godsCreation.startX(), godsCreation.startY(), godsCreation.startX(), godsCreation.startY());
                        moveEating(godsCreation, island, godsCreation.stomachGods(), island.landPlots[godsCreation.startX()][godsCreation.startY()]);
                        if (sizeArrayPlots(island.landPlots[godsCreation.startX()][godsCreation.startY()].plotAnimalS) <= 0) {
                            moveReproduction(godsCreation, island, godsCreation.startX(), godsCreation.startY());
                        }
                        moveDead(godsCreation, island, godsCreation.startX(), godsCreation.startY(), godsCreation.stomachGods());
                    }


                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (IndexOutOfBoundsException e) {
                    System.out.print(godsCreation.imageName() + "☠");
                    island.landPlots[godsCreation.startX()][godsCreation.startY()].plotAnimalS.remove(godsCreation);
                }
            }
        }).start();
    }

    public synchronized void goLeft(GodsCreation godsCreation, Island island, int placeX, int placeY, int moveX, int moveY) {
        if (godsCreation instanceof Wolf) {
            if (moveY < island.getY() - 1 && moveY != 2) {
                moveY = moveY - 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Wolf) godsCreation).setStartYwolf(moveY);
            } else {
                moveY = moveY + 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Wolf) godsCreation).setStartYwolf(moveY);
            }
        }
        if (godsCreation instanceof Rabbit) {
            if (moveY < (island.getY() - 1) && moveY != 2) {
                moveY = moveY - 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Rabbit) godsCreation).setStartYrabbit(moveY);
            } else {
                moveY = moveY + 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Rabbit) godsCreation).setStartYrabbit(moveY);
            }
        }

    }

    public synchronized void goWrite(GodsCreation godsCreation, Island island, int placeX, int placeY, int moveX, int moveY) {


        if (godsCreation instanceof Wolf) {
            if (moveY < island.getY() - 1 && moveY != 8) {
                moveY = moveY + 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Wolf) godsCreation).setStartYwolf(moveY);
            } else {
                moveY = moveY - 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Wolf) godsCreation).setStartYwolf(moveY);
            }
        }
        if (godsCreation instanceof Rabbit) {
            if (moveY < (island.getY() - 1) && moveY != 8) {
                moveY = moveY + 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Rabbit) godsCreation).setStartYrabbit(moveY);
            } else {
                moveY = moveY - 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Rabbit) godsCreation).setStartYrabbit(moveY);
            }
        }
    }

    public synchronized void goUp(GodsCreation godsCreation, Island island, int placeX, int placeY, int moveX,
                                  int moveY) {
        if (godsCreation instanceof Wolf) {
            if (moveX < (island.getX() - 1) && moveX != 2) {
                moveX = moveX - 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Wolf) godsCreation).setStartXwolf(moveX);

            } else {
                moveX = moveX + 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Wolf) godsCreation).setStartXwolf(moveX);
            }
        }

        if (godsCreation instanceof Rabbit) {
            if (moveX < (island.getX() - 1) && moveX != 2) {
                moveX = moveX - 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Rabbit) godsCreation).setStartXrabbit(moveX);
            } else {
                moveX = moveX + 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Rabbit) godsCreation).setStartXrabbit(moveX);
            }
        }
    }

    public synchronized void goDown(GodsCreation godsCreation, Island island, int placeX, int placeY, int moveX,
                                    int moveY) {
        if (godsCreation instanceof Wolf) {
            if (moveX < (island.getX() - 1) && moveX != 8) {
                moveX = moveX + 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Wolf) godsCreation).setStartXwolf(moveX);
            } else {
                moveX = moveX - 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Wolf) godsCreation).setStartXwolf(moveX);
            }
        }

        if (godsCreation instanceof Rabbit) {
            if (moveX < (island.getX() - 1) && moveX != 8) {
                moveX = moveX + 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Rabbit) godsCreation).setStartXrabbit(moveX);
            } else {
                moveX = moveX - 1;
                godsCreation.move(island, placeX, placeY, moveX, moveY, godsCreation);
                ((Rabbit) godsCreation).setStartXrabbit(moveX);
            }
        }
    }

    public synchronized void moveEating(GodsCreation godsCreation, Island island, int stomach, LandPlot landPlot) {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        CopyOnWriteArrayList<GodsCreation> copyOnWriteArrayList = new CopyOnWriteArrayList(landPlot.plotAnimalS);
        // godsCreation.eat(island.landPlots[placeX][placeY].plotAnimal.get(0),threadLocalRandom.nextInt(0,100),island.landPlots[placeX][placeY]);
        for (GodsCreation godsCreation1 : copyOnWriteArrayList) {
            godsCreation.eat(godsCreation1, threadLocalRandom.nextInt(0, 100), landPlot, island, stomach);
        }
    }

    public synchronized GodsCreation moveReproduction(GodsCreation godsCreationFather, Island island, int placeX, int placeY) {
        CopyOnWriteArrayList<GodsCreation> copyOnWriteArrayList = new CopyOnWriteArrayList(island.landPlots[placeX][placeY].plotAnimalS);
        for (GodsCreation godsCreation1 : copyOnWriteArrayList) {
            return godsCreationFather.reproduction(godsCreationFather, godsCreation1, island.landPlots[placeX][placeY]);
        }
        return null;
    }

    public synchronized void moveDead(GodsCreation godsCreation, Island island, int placeX, int placeY, int eat) {
        eat = eat - 1;
        godsCreation.dead(godsCreation, island.landPlots[placeX][placeY], eat);
        if (godsCreation instanceof Wolf) {
            ((Wolf) godsCreation).setStomach(eat);
        }
        if (godsCreation instanceof Rabbit) {
            ((Rabbit) godsCreation).setStomach(eat);
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

    public synchronized void randomPath(GodsCreation godsCreation, Island island, int placeX, int placeY, int moveX,
                                        int moveY) {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        switch (threadLocalRandom.nextInt(1, 4)) {
            case 1 -> {
                goLeft(godsCreation, island, placeX, placeY, moveX, moveY);
            }
            case 2 -> {
                goUp(godsCreation, island, placeX, placeY, moveX, moveY);
            }
            case 3 -> {
                goDown(godsCreation, island, placeX, placeY, moveX, moveY);
            }
            case 4 -> {
                goWrite(godsCreation, island, placeX, placeY, moveX, moveY);
            }
        }

    }

    private synchronized int sizeArrayPlots(List<GodsCreation> list) {
        int sizeArray = 0;
        CopyOnWriteArrayList<GodsCreation> copyOnWriteArrayList = new CopyOnWriteArrayList(list);
        for (GodsCreation godsCreation1 : copyOnWriteArrayList) {
            if (godsCreation1 instanceof Wolf) {
                if (list.contains(godsCreation1)) {
                    sizeArray++;
                }
            }
            if (godsCreation1 instanceof Rabbit) {
                if (list.contains(godsCreation1)) {
                    sizeArray++;
                }
            }
        }
        return sizeArray;
    }

}
