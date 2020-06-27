import javafx.scene.effect.Light;

public class Cat implements Jump, Run {
    private int distanceToRun;
    private int heightToJump;
    private String name;
    private boolean isDroppedOut;

    public Cat(int distanceToRun, int heightToJump, String name) {
        this.distanceToRun = distanceToRun;
        this.heightToJump = heightToJump;
        this.name = name;
        isDroppedOut = false;
    }

    public boolean isDroppedOut() {
        return isDroppedOut;
    }

    public void setDroppedOut(boolean droppedOut) {
        isDroppedOut = droppedOut;
    }

    @Override
    public void jump(int height) {
        if (this.heightToJump >= height) {
            System.out.println(String.format("Кот %s перепрыгнул через препятствие высотой %d!", this.name, height));
        } else {
            System.out.println(String.format("Кот %s НЕ СМОГ перепрыгнуть через препятствие высотой %d!", this.name, height));
            System.out.println(String.format("%s выбыл из гонки.", this.name));
            this.isDroppedOut = true;
        }
    }

    @Override
    public void run(int distance) {
        if (this.distanceToRun >= distance) {
            System.out.println(String.format("Кот %s пробежал по дорожке %d метров!", this.name, distance));
        } else {
            System.out.println(String.format("Кот %s НЕ СМОГ пробежать по дорожке %d метров!", this.name, distance));
            System.out.println(String.format("%s выбыл из гонки.", this.name));
            this.isDroppedOut = true;
        }
    }

    @Override
    public String toString() {
        return String.format("Кот %s. Бегает %d, прыгает %d", this.name, this.distanceToRun, this.heightToJump);
    }
}
