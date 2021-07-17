package tasks.task7;

public class Thing {
    private final int worth;
    private final int volume;

    public Thing(int worth, int vol) {
        this.worth = worth;
        this.volume = vol;
    }

    public int getVolume() {
        return volume;
    }

    public int getWorth() {
        return worth;
    }

}