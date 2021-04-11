package solution_task;

class LeakFactory {

    Leak createLeak() {
        return new Leak();
    }

    // OPTIMIZE: Утечка памяти через внутренний класс
    static class Leak {
        int size = 1;
    }
}

