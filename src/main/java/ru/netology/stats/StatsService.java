package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int amount = calculateSum(purchases);
        System.out.println("Сумма продаж: " + amount + " рублей");


        int averageAmount = calculateAverageSum(purchases);
        System.out.println("Средняя сумма продаж: " + averageAmount + " рублей");


        int maxSales = showMaxSales(purchases);
        System.out.println("Месяц с max продаж: " + maxSales);


        int minSales = showMinSales(purchases);
        System.out.println("Месяц с min продаж: " + minSales);


        int underAverage = showUnderAverage(purchases);
        System.out.println("Количество месяцев с продажами ниже средней суммы: " + underAverage);


        int overAverage = showOverAverage(purchases);
        System.out.println("Количество месяцев с продажами выше средней суммы: " + overAverage);
    }


    public static int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }


    public static int calculateAverageSum(int[] purchases) {
        return calculateSum(purchases) / purchases.length;
    }


    public static int showMaxSales(int[] purchases) {
        int max = purchases[0];
        int number = 0;
        int maxSales = 0;
        for (int purchase : purchases) {
            number++;
            if (max <= purchase) {
                max = purchase;
                maxSales = number;
            }
        }
        return maxSales;
    }


    public static int showMinSales(int[] purchases) {
        int min = purchases[0];
        int number = 0;
        int minSales = 0;
        for (int purchase : purchases) {
            number++;
            if (min >= purchase) {
                min = purchase;
                minSales = number;
            }
        }
        return minSales;
    }


    public static int showUnderAverage(int[] purchases) {
        int average = calculateAverageSum(purchases);
        int month = 0;
        int monthUnder = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                month++;
                monthUnder = month;
            }
        }
        return monthUnder;
    }


    public static int showOverAverage(int[] purchases) {
        int average = calculateAverageSum(purchases);
        int month = 0;
        int monthOver = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                month++;
                monthOver = month;
            }
        }
        return monthOver;
    }
}
