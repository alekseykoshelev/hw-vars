public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int i = 25; // 00000000 00000000 00000000 00000010
        byte b = 56;
        short s = 299;
        long l = 23_090_211_112L;
        float f = 1.2f;
        double d = 3.2;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println();

        System.out.println("Task 2");
        float f1 = 27.12f;
        long l1 = 987_678_965_549L;
        double d1 = 2.786;
        short s1 = 569;
        int i1 = -159;
        int i2 = 27897;
        byte b1 = 67;

        System.out.println("Task 3");
        int totalPaper = 480;// camelCase
        int luda = 23;
        int anna = 27;
        int katya = 30;
        int total = luda + anna + katya;
        int perStudent = totalPaper / total;
        System.out.println("На каждого ученика рассчитано " + perStudent + " листов бумаги");
        System.out.println("На каждого ученика рассчитано " + totalPaper / (luda + anna + katya) + " листов бумаги");
        System.out.println();

        System.out.println("Task 4");
        int perMin = 16 / 2;
        int per20Min = 20 * perMin;
        int perDay = 24 * 60 * perMin;
        int per3Days = 3 * perDay;
        int perMonth = 30 * perDay;
        System.out.println("За 20мин машина произвела " + per20Min + "  штук бутылок");
        System.out.println("За 1 день машина произвела " + perDay + "  штук бутылок");
        System.out.println("За 3 дня машина произвела " + per3Days + "  штук бутылок");
        System.out.println("За месяц машина произвела " + perMonth + "  штук бутылок");
        System.out.println();

        System.out.println("Task 5");
        int totalJar = 120;
        int whiteJarPerClass = 2;
        int brownJarPerClass = 4;
        int classCount = totalJar / (whiteJarPerClass + brownJarPerClass);
        int totalWhiteJars = whiteJarPerClass * classCount;
        int totalBrownJars = brownJarPerClass * classCount;
        System.out.printf("В школе, где %s классов, нужно %s банок белой " +
                "краски и %s банок коричневой краски", totalJar, totalWhiteJars, totalBrownJars);

        System.out.println("Task 6");
        int bananaCount = 5;
        int bananaGrams = 80;
        double milk = 200 * 1.05;
        int iceCreamCount = 2;
        int iceCreamGrams = 100;
        int eggCount = 4;
        int eggGrams = 70;

        double inGrams = (bananaCount * bananaGrams) + milk + (iceCreamCount * iceCreamGrams) + (eggCount * eggGrams);
        double inKg = inGrams / 1000;
        System.out.println(inGrams + "гр.");
        System.out.println(inKg + "кг.");

        System.out.println("\nTask 7");
        int weight = 7 * 1000;
        int max = weight / 500;
        int min = weight / 250;
        System.out.println(max);
        System.out.println(min);
        int avg = (max + min) / 2;
        System.out.println(avg);
        System.out.println();

        System.out.println("Task 8");

        int masha = 67_760;
        int denis = 83_690;
        int kris = 76_230;

        double mashaNewSalary = masha * 1.10;
        double denisNewSalary = denis * 1.10;
        double krisNewSalary = kris * 1.10;

        int mashaYearSalary = masha * 12;
        double mashaYearNewSalary = mashaNewSalary * 12;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. " +
                "Годовой доход вырос на " + (int) (mashaYearNewSalary - mashaYearSalary) + " рублей");

        System.out.printf("%.4f", 1.402322222);
    }
}
