public class A6 {
    public static void main(String[] args) {
        String str = "HELLO_WORLD";
        for (int i = 0; i < 5; i++){
            System.out.print(str.substring(i, 6)); // prints HELLO_W, ELLO_W
            System.out.println(str.substring(6, 7 + i)); // prints _W, _WO, _WOR
        }
    }
}
// HELLO_W
// ELLO_WO
// LLO_WOR
// LO_WORL
// O_WORLD