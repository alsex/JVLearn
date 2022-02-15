package D_01;

public class ArrayM {
    public static void main(String[] args) {
        //静态数组
        int[] arrayA = new int[3];
        int[] arrayB=new int[]{3,4,5};
        System.out.println(arrayA[2]);
        System.out.println(arrayB[0]);
        //静态省略
        int[] arrayC= {3,4,5};
        System.out.println(arrayC[2]);
    }
}
