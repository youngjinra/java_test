public class Type_04 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5 - i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
// 직각삼각형 유형4(2의 역)
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < 5 - i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//