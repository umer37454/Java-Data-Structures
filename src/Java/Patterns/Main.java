package Java.Patterns;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pattern 1");
        pattern1(4);
        System.out.println("Pattern 2");
        pattern2(4);
        System.out.println("Pattern 3");
        pattern3(5);
        System.out.println("Pattern 4");
        pattern4(5);
        System.out.println("Pattern 5");
        pattern5(4);
        System.out.println("Pattern 6");
        pattern6(4);
        System.out.println("Pattern 7");
        pattern7(4);
    }

    static void pattern1(int noOfLInes) {
//        ****
//        ****
//        ****
//        ****
        for (int row = 1; row <= noOfLInes; row++) {
            for (int column = 1; column <= noOfLInes; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern2(int noOfLines) {
//        ****
//        ***
//        **
//        *
        for (int row = noOfLines; row >= 1; row--) {
            for (int column = row; column >= 1; column--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int noOfLInes) {
//        *
//        **
//        ***
//        ****
        for (int row = 1; row <= noOfLInes; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern4(int noOfLines) {
//        1
//        12
//        123
//        1234
//        12345
        for (int row = 1; row <= noOfLines; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    static void pattern5(int noLine) {
//        *
//        **
//        ***
//        ****
//        ***
//        **
//        *
        for (int row = 1; row <= noLine * 2 - 1; row++) {
            int totalRow;
            if (row > noLine) {
                totalRow = 2 * noLine - row;
            } else {
                totalRow = row;
            }
            for (int column = 1; column <= totalRow; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int noLine) {
//        ****
//        ***
//        **
//        *
//        **
//        ***
//        ****
        for (int row = 1; row <= 2 * noLine - 1; row++) {
            int totalRow;
            if (row > noLine) {
                totalRow = row - noLine + 1;
            } else {
                totalRow = noLine - row + 1;
            }
            for (int column = 1; column <= totalRow; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int noLine) {
//        ********   1       no of line - 4
//        ***  ***   2       2 * no of line - 8
//        **    **   3
//        *      *   4
//        **    **   5  6
//        ***  ***   6  5
//        ********   7  4
        for (int row = 1; row <= 2 * noLine - 1; row++) {
            for (int column = 1; column <= 2 * noLine; column++) {
                if (row > noLine) {
                    if (column > row - noLine + 1 && column < 2 * noLine - (row - noLine)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if (column > noLine - row + 1 && column < noLine + row) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
