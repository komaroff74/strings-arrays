import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sale);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sale) / 12;
        long expected = 180 / 12;

        Assertions.assertEquals(expected, actual);
        System.out.println("Средние продажи равны" + actual);

    }

    @Test
    public void testMonthMaxSale() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMaxSale(sale);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
        System.out.println("Минимальные продажи в  " + expected + " месяце");

    }

    @Test
    public void testMonthMinSale() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMinSale(sale);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthLowAverage() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthLowAverage(sale);
        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testMonthHigherAverage() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthLowAverage(sale);
        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }

}