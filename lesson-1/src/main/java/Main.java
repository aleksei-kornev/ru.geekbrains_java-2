public class Main {
    public static void main(String[] args) {

        Object creatures[] = new Object[6];
        creatures[0] = new Cat(10, 10, "Васька");
        creatures[1] = new Cat(5, 5, "Барсик");
        creatures[2] = new Human(15, 5, "Иван");
        creatures[3] = new Human(20, 10, "Петр");
        creatures[4] = new Robot(20, 5, "Ио");
        creatures[5] = new Robot(25, 7, "Плуто");

        Object obstacles[] = new Object[6];
        obstacles[0] = new Wall(5);
        obstacles[1] = new Track(5);
        obstacles[2] = new Wall(8);
        obstacles[3] = new Track(10);
        obstacles[4] = new Wall(10);
        obstacles[5] = new Track(20);

        for (int i = 0; i < creatures.length; i++) {
            System.out.println();
            System.out.println("#" + (i + 1) + ". " + creatures[i].toString());

            for (int j = 0; j < obstacles.length; j++) {
                if (creatures[i] instanceof Cat) {
                    if (!((Cat) creatures[i]).isDroppedOut()) {
                        if (obstacles[j] instanceof Wall) {
                            ((Cat) creatures[i]).jump(((Wall) obstacles[j]).getHeight());
                        }
                        if (obstacles[j] instanceof Track) {
                            ((Cat) creatures[i]).run(((Track) obstacles[j]).getDistance());
                        }
                    }
                }
                if (creatures[i] instanceof Human) {
                    if (!((Human) creatures[i]).isDroppedOut()) {
                        if (obstacles[j] instanceof Wall) {
                            ((Human) creatures[i]).jump(((Wall) obstacles[j]).getHeight());
                        }
                        if (obstacles[j] instanceof Track) {
                            ((Human) creatures[i]).run(((Track) obstacles[j]).getDistance());
                        }
                    }
                }
                if (creatures[i] instanceof Robot) {
                    if (!((Robot) creatures[i]).isDroppedOut()) {
                        if (obstacles[j] instanceof Wall) {
                            ((Robot) creatures[i]).jump(((Wall) obstacles[j]).getHeight());
                        }
                        if (obstacles[j] instanceof Track) {
                            ((Robot) creatures[i]).run(((Track) obstacles[j]).getDistance());
                        }
                    }
                }
            }
        }
    }

}
