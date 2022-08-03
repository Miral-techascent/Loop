package Loop;

public class TableWithDoWhile {

    public static void main(String[] args) {
        int i=1;
        int j=10;

        do {
            System.out.println(j+"*"+i+"="+i*j);
            i++;
        }while (i<=10);
    }
}
