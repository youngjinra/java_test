public class Type_05 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
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
// 직각삼각형 유형5(정삼각형)
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 4 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < (2 * i + 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//