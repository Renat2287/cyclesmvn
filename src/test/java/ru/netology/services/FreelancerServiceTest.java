package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FreelancerServiceTest {

    @Test
    public void testIncome10_000() {
        ru.netology.services.FreelancerService service = new ru.netology.services.FreelancerService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int expected = 3;
        int restMonths = service.calculateRestMonths(income, expenses, threshold);
        //System.out.println("Количество месяцев отдыха: " + restMonths);
        Assertions.assertEquals(expected, restMonths);
    }

    @Test
    public void testIncome100_000() {
        ru.netology.services.FreelancerService service = new ru.netology.services.FreelancerService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int expected = 2;
        int restMonths = service.calculateRestMonths(income, expenses, threshold);
        //System.out.println("Количество месяцев отдыха: " + restMonths);
        Assertions.assertEquals(expected, restMonths);
    }
}
