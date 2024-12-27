class p2{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(n-i+1);
                    //System.out.print(i);
                }
                System.out.println();
            }
           
        }
    }
// 55555
//   4444
//    333
//     22
//      1
