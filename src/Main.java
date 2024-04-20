public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println("Task 2");
        dog = dog + 4;
        cat += 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println("Task 3");
        dog -= 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println();

        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println();


        System.out.println("Task 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var sum = boxer1 + boxer2;
        System.out.println(sum);
        System.out.println();

        System.out.println("Task 7");
        System.out.println(boxer2 % boxer1);
        System.out.println();

        System.out.println("Task 8");
        var totalHours = 640;
        var hoursPerDay = 8;
        var totalEmployee = totalHours / hoursPerDay;
        System.out.println("Всего работников в компании — " + totalEmployee + " человек");

        int totalEmployee2 = totalEmployee + 94;
        System.out.println("Если в компании работает " + totalEmployee2 + " человек, то всего " +
                (totalEmployee2 * hoursPerDay) + " часов работы может быть поделено между сотрудниками");
    }
}