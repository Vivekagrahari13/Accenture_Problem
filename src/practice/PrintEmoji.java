package practice;


public class PrintEmoji {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++) {
            for(int j=1;j<=i;j++){
                System.out.print("\uD83E\uDEE2"+" ");
            }
            System.out.println();
        }
    }
}
