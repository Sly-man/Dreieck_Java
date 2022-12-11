package Practices.day04;

public class ThisKeyword {
    int a;

    public ThisKeyword (int a) {
        a = 400;
        this.a = 600;
        System.out.println(a);
        a = 900;
    }

    @Override
    public String toString() {
        return "ThisKeyword{" +
                "a=" + a +
                '}';
    }
}
