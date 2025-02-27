public class LiskovSubstitutionViolation {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();

        NonFlyingBird ostrich = new Ostrich();
        ostrich.walk();
    }
}

abstract class Bird {
    public void walk() {
        System.out.println("Bird is walking");
    }
}

abstract class FlyingBird extends Bird {
    public abstract void fly();
}

class Sparrow extends FlyingBird {
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class NonFlyingBird extends Bird {
    // Não precisa do método fly(), pois não voa
}

class Ostrich extends NonFlyingBird {
    public void walk() {
        System.out.println("Ostrich is walking fast");
    }
}