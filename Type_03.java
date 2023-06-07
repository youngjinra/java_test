public class Type_03 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// 직각삼각형 유형3(1의 역)
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 4 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i + 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//