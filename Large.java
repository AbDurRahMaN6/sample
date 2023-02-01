public class Large {
    public static void main(String[] args) {
        int n1 = 4, n2= 10, n3= 7;
        getLargest ( n1,  n2, n3);
    }

    private static void getLargest(int n1, int n2, int n3){
        if(n1>=n2 && n1>=n3){
            System.out.println(n1 + " is the largest number.");
        } else if (n2>=n1 && n2>=n3) {
            System.out.println(n2 + " is the largest number.");
        }
        else {
            System.out.println(n3 + " is the largest number.");
        }
    }
}
