public class Human implements Jump, Run {
    private int distanceToRun;
    private int heightToJump;
    private String name;
    private boolean isDroppedOut;

    public Human(int distanceToRun, int heightToJump, String name) {
        this.distanceToRun = distanceToRun;
        this.heightToJump = heightToJump;
        this.name = name;
        this.isDroppedOut = false;
    }

    public boolean isDroppedOut() {
        return isDroppedOut;
    }

    @Override
    public void jump(int height) {
        if (this.heightToJump >= height) {
            System.out.println(String.format("Человек %s перепрыгнул через препятствие высотой %d!", this.name, height));
        } else {
            System.out.println(String.format("Человек %s НЕ СМОГ перепрыгнуть через препятствие высотой %d!", this.name, height));
            System.out.println(String.format("%s выбыл из гонки.", this.name));
            this.isDroppedOut = true;
        }
    }

    @Override
    public void run(int distance) {
        if (this.distanceToRun >= distance) {
            System.out.println(String.format("Человек %s пробежал по дорожке %d метров!", this.name, distance));
        } else {
            System.out.println(String.format("Человек %s НЕ СМОГ пробежать по дорожке %d метров!", this.name, distance));
            System.out.println(String.format("%s выбыл из гонки.", this.name));
            this.isDroppedOut = true;
        }
    }

    @Override
    public String toString() {
        return String.format("Человек %s. Бегает %d, прыгает %d", this.name, this.distanceToRun, this.heightToJump);
    }
}
