package Practices.day04;

public class UseThisKeyword {

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(300); //400
        System.out.println("===========");
        System.out.println(obj);
        System.out.println("===============");
//System.out.println(obj.a); //100 without this
        System.out.println(obj.a); //600 with this


    }




}
