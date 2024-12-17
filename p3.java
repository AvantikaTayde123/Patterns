class p3{
    public static void main(String[] args) {
        int i,j,n=5;
        //for(i=n;i>=1;i--){
        for(i=1;i<=n;i++){
              for(int k=n;k>=i;k--){
                System.out.print(" ");
              }
            for(j=1;j<=n;j++){
                if(i==n||j==1||i==j){
         System.out.print(" *");
            }
            else{
                System.out.print("  ");
            }
        
        }
    System.out.println();
    }
}
}