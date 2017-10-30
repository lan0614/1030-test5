import java.util.*;
public class Main {
    //最大值 最小值
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x,y,z;
        int max,min;
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        max=x;
        if(y>max)
            max=y;
        if(z>max)
            max=z;
        System.out.println(max);
        min=x;
        if(y<min)
            min=y;
        if(z<min)
            min=z;
        System.out.println(min);
    }
}