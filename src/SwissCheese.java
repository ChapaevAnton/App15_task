public class SwissCheese {

    LeakFactory.Leak[] myHoles;

    SwissCheese() {
        myHoles = new LeakFactory.Leak[100_000_000];
        for (int i = 0; i < myHoles.length; i++) {
            myHoles[i] = new LeakFactory().createLeak();
        }
    }

    public static void main(String[] args) {

        // TODO: Задание. Устраните утечку памяти не внося кардинальные изменения в код и логику работы программы.
        SwissCheese swissCheese = new SwissCheese();

    }
}