class Main {
    public static void main(String[] args) {
        int first=0, second=1;
        for(int i=0;i<10;i++){
                int a=first+second;
                first=second;
                second=a;
                 System.out.print(a);
        }
       
    }
}
