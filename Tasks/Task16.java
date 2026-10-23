interface Animal{
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    @Override
    public boolean feed(boolean timeToEat) {
        return false;
    }

    @Override
    public void groom() {
        System.out.println("Lather, rinse, repeat");
    }

    @Override
    public void pet() {
        System.out.println("Pet at your own risk");
    }
}

public class Task16 {
    static void main(String[] args) {
        Animal gorrilla1 = new Gorilla();
        gorrilla1.pet();
        gorrilla1.groom();
        System.out.println(gorrilla1.feed(true));
    }
}
