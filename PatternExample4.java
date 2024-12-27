class p2 {
        public static void main(String[] args) {
            int rows = 5; 
    
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print((i + j+1) % 2);
                }
                System.out.println(); 
            }
        }
    }
// 1
// 01
// 101
// 0101
// 10101
