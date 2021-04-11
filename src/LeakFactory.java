class LeakFactory {

    Leak createLeak() {
        return new Leak();
    }

    class Leak {
        int size = 1;
    }
}

