package practice;

public class Basic {
    public static void main(String[] args) {
        Float value=244.5f;
        int val=value.intValue();
        int rem=Math.abs(val%10);
        if(rem>=0&& rem<5) {
            val=(val/10)*10;
        }
        else{
            val=(val/10)*10+10;
        }
        System.out.println(val);
    }

}
