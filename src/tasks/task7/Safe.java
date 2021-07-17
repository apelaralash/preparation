package tasks.task7;

import java.util.ArrayList;
import java.util.List;

public class Safe {
    private final int volume;
    private int maxWorth;
    private List<Thing> items = new ArrayList<>();

    public Safe(final int volume) {
        this.volume = volume;
    }

    public int getMaxWorthOfSet() {
        return maxWorth;
    }

    public void setItems(int weight, int value){
        Thing thing = new Thing(weight, value);
        items.add(thing);
    }

    public Thing getItem(int index) {
        return items.get(index);
    }

    /* Рекурентный алгортим динамического программирования
     *для задачи о рюкзаке 0-1.
     *Источник: Википедия
     */
    public void fillSafe(){
        items.add(0, new Thing(0, 0));
        maxWorth = fill(items.size() - 1, volume);
    }

    public int fill(int n, int volume){
        if (n == 0)
            return 0;
        if (getItem(n).getVolume() > volume)
            return fill(n - 1, volume);

        return Math.max(fill(n - 1, volume),
                fill(n - 1, volume - getItem(n).getVolume()) +
                        getItem(n).getWorth());
    }
}
