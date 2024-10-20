package practice;

public class StringFormatRound {
    public static void main(String[] args) {
        Float a=123.56f;
        String b=String.format("%07.0f", a);
        Float c=Float.parseFloat(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        String abc="5.56";
    }
}
