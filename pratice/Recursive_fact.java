public class Recursive_fact {
    public static void main(String[] args) {
        int num = 12;
        System.out.println( fact(num));
    }

    static int fact(int num) {
        if (num == 0 || num == -1)
            return 1;
        return num * fact(num - 1);
        
    }
}
