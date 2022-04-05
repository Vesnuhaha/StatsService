package ru.netology.stats;

public class StatsService {

    public int calcSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcMiddleSum(long[] sales) {
        int middle = 0;
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
            middle = sum / 12;
        }
        return middle;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
           if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowerMiddleSales(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale < calcMiddleSum(sales)) {
                month = month + 1;
            }
        }
        return month;
    }

    public int upperMiddleSales(long[] sales) {
        int month = 0;
        for (long sale : sales) {
            if (sale > calcMiddleSum(sales)) {
                month = month + 1;
            }
        }
        return month;
    }
}

