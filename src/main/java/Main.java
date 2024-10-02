public class Main {
    public static void main(String[] args) {
        ru.netology.services.FreelancerService service = new ru.netology.services.FreelancerService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int restMonths = service.calculateRestMonths(income, expenses, threshold);
        System.out.println("Количество месяцев отдыха: " + restMonths);
    }
}
