package Loop;

public class TableWithWhile {

    public static void main(String[] args) {
        int i=1;
        int j=10;

        System.out.println("Table of 10");
        while (i<=10){
            System.out.println(j+"*"+i+"="+i*j);
            i++;
        }
    }
}
