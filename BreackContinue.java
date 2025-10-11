public class BreackContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if(i == 5) break;
            System.out.println(i + "\n");
        }

        for (int i = 0; i < 5; i++){
            if (i == 2 ) continue;
            System.out.println(i);
        }
    }
}
