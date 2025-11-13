import java.util.Scanner;

public class StaniBogaty {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Масиви с въпроси, опции и верни отговори
        String[] questions = {
                "Кой е столицата на България?",
                "Кой е написал романа 'Под игото'?",
                "Кой е химичният символ на водата?",
                "Кое е най-голямото животно на Земята?"
        };

        String[][] options = {
                {"A) Пловдив", "B) Варна", "C) София", "D) Бургас"},
                {"A) Елин Пелин", "B) Иван Вазов", "C) Христо Ботев", "D) Пенчо Славейков"},
                {"A) O2", "B) CO2", "C) H2O", "D) HO2"},
                {"A) Африкански слон", "B) Син кит", "C) Жираф", "D) Бял носорог"}
        };

        char[] correctAnswers = {'C', 'B', 'C', 'B'};

        int prize = 0;
        int[] levels = {100, 200, 500, 1000};

        System.out.println("Добре дошъл в играта „СТАНИ БОГАТ“!");
        System.out.println("Отговаряй с A, B, C или D.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Въпрос " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Твоят отговор: ");
            char answer = Character.toUpperCase(input.next().charAt(0));

            if (answer == correctAnswers[i]) {
                prize = levels[i];
                System.out.println("Верен отговор! Печелиш " + prize + " лева.\n");

                if (i < questions.length - 1) {
                    System.out.print("Искаш ли да продължиш към следващия въпрос? (да/не): ");
                    String decision = input.next().toLowerCase();
                    if (!decision.equals("да")) {
                        System.out.println("Ти напускаш играта с " + prize + " лева. Поздравления!");
                        break;
                    }
                } else {
                    System.out.println("Поздравления! Отговори вярно на всички въпроси и спечели " + prize + " лева!");
                }

            } else {
                System.out.println("Грешен отговор!");
                System.out.println("Ти си загубил и си тръгваш с 0 лева.");
                break;
            }
        }

        input.close();
    }
}
