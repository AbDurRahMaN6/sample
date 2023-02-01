public class Large {
    public static void main(String[] args) {
        int n1 = 14, n2= 50, n3= 7, n4=570;
        getLargest ( n1,  n2, n3, n4);
    }

    private static void getLargest(int n1, int n2, int n3, int n4){
        if(n1>=n2 && n1>=n3 && n1>=n4){
            System.out.println(n1 + " is the largest number.");
        } else if (n2>=n1 && n2>=n3 && n2>=n4) {
            System.out.println(n2 + " is the largest number.");
        }
        else if (n3>=n1 && n3>=n2 && n3>=n4) {
            System.out.println(n3 + " is the largest number.");
        }
        else {
            System.out.println(n4 + " is the largest number.");
        }
    }
}
