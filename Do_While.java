package Loop;

public class Do_While {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        System.out.println("Odd Number");
        do {
            System.out.println(i++);
            i++;
        }while (i<=20);

        System.out.println("Even Number");
        do {
            System.out.println(++j);
            j++;
        }while (j<=20);
    }
}
