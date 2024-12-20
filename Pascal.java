class Pascal {
    public static void main(String args[]){
      int i,j,n=5;
      for(i=0;i<n;i++){
          for(j=0;j<n-i-1;j++){
            System.out.print(" ");
          }
          int value=1;
          for(j=0;j<=i;j++){
          System.out.print(value+" ");
          value=value*(i-j)/(j+1);
      }
      System.out.println();
    }
    }
}

    1 
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
