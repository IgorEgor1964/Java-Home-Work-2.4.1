package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    void calculateSumOfSales() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateSum(purchases);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void showAverageOfSales() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateAverageSum(purchases);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void showMonthWithMaxOfSales() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.showMaxSales(purchases);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void showMonthWithMinOfSales() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.showMinSales(purchases);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void showUnderverageMonths() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.showUnderAverage(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void showOververageMonths() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.showOverAverage(purchases);
        int expected = 5;
        assertEquals(expected, actual);
    }
}
