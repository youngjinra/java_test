public class Type_06 {
    public static void main(String[] args) {
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
//        // 역정삼각형 유형6(5의 역)
//        for (int i = 4; i >= 0; i--) {
//            for (int j = 0; j < 4 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < (2 * i + 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();