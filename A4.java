public class A4 {
    public static void main(String[] args) {
        int n = 5; 
        int mid = n / 2; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == mid) {
                    System.out.print((j + 1) + "  ");
                } else if (j == mid) {
                    System.out.print((i + 1) + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

//       1        
//       2
// 1  2  3  4  5
//       4
//       5