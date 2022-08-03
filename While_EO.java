package Loop;

public class While_EO {
    public static void main(String[] args) {

        int i=1, j=1;
        int a=1, b=1;
        System.out.println("Odd Number");
        while (i<=10){
            System.out.println(j);
            i++;
            j+=2;
        }
        System.out.println("Even Number");
        while (a<=10){
            System.out.println(++b);
            a++;
            b++;
        }
    }
}
