package _2020_8_16_p01;

import java.util.Scanner;

/**
 * 입력받아 처리하기
 *
 * 3개의 정수를 입력받아, 그 중 최대값을 출력하고자 한다.
 * 이를 수행하는 프로그램을 작성하시오.
 *
 */

public class InputOutput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 3 integers. ");

        /**
         * Wrong Approach that I made.
         */

//        System.out.print("1st Integer :  ");
//        scanner.nextLine();
//        System.out.print("2nd Integer :  ");
//        scanner.nextLine();
//        System.out.print("3rd Integer :  ");
//        scanner.nextLine();
//
//        int x;
//        int y;
//        int z;
//        int valMax =

        /**
         * Solution.
         */
//        System.out.print("1st Integer :  ");
//        int x = scanner.nextInt();
//        System.out.print("2nd Integer :  ");
//        int y = scanner.nextInt();
//        System.out.print("3rd Integer :  ");
//        int z = scanner.nextInt();
//
//        int valMax = x>y ? x:y;
//        valMax = valMax>z? valMax:z;
//
//        System.out.println("The highest Integer is : "+valMax);
//        scanner.close();


        /**
         * Expansion 1.
         * what if it's looking for lowest integers?
         * (working)
         */
//        System.out.print("1st Integer :  ");
//        int x = scanner.nextInt();
//        System.out.print("2nd Integer :  ");
//        int y = scanner.nextInt();
//        System.out.print("3rd Integer :  ");
//        int z = scanner.nextInt();
//
//        int valMin = x<y ? x:y;
//        valMin = valMin<z? valMin:z;
//
//        System.out.println("The lowest Integer is : "+valMin);

        /**
         * Expansion 2.
         * what if it's looking for highest and lowest real number?
         * (Working)
         */

//        System.out.print("1st Integer :  ");
//        int x = scanner.nextInt();
//        System.out.print("2nd Integer :  ");
//        int y = scanner.nextInt();
//        System.out.print("3rd Integer :  ");
//        int z = scanner.nextInt();
//
//
//        int valMax = x>y? x:y;
//        int valMin = x<y ? x:y;
//        valMax = valMax>z? valMax:z;
//        valMin = valMin<z? valMin:z;
//
//        System.out.println("The highest Integer is : "+valMax);
//        System.out.println("The lowest Integer is : "+valMin);
//        scanner.close();

        /**
         * Expansion 3.
         * what if it's showing the error bcz of inputting same value?
         * (Working)
         */
//        System.out.print("1st Integer :  ");
//        int x = scanner.nextInt();
//        System.out.print("2nd Integer :  ");
//        int y = scanner.nextInt();
//        System.out.print("3rd Integer :  ");
//        int z = scanner.nextInt();
//
//        if (x != y && y!= z && z!= x) {
//
//            int valMax = x>y? x:y;
//            valMax = valMax>z? valMax:z;
//            int valMin = x<y ? x:y;
//            valMin = valMin<z? valMin:z;
//            System.out.println("The highest Integer is : "+valMax);
//            System.out.println("The lowest Integer is : "+valMin);
//            scanner.close();
//        }
//        else if (x ==y | y == z | x == z) {
//            System.out.println("Error.");
//            scanner.close();
//        }

        /**
         * Expansion 4.
         * what if using if only??
         */
//        System.out.print("1st Integer :  ");
//        int x = scanner.nextInt();
//        System.out.print("2nd Integer :  ");
//        int y = scanner.nextInt();
//        System.out.print("3rd Integer :  ");
//        int z = scanner.nextInt();
//
//        if (x != y & y!= z & z!= x) {
//            if (x > y ){
//                int x1;
//            } else {
//                int y1;
//            }
//
//            int valMax = x>y? x:y;
//            valMax = valMax>z? valMax:z;
//            int valMin = x<y ? x:y;
//            valMin = valMin<z? valMin:z;
//            System.out.println("The highest Integer is : "+valMax);
//            System.out.println("The lowest Integer is : "+valMin);
//            scanner.close();
//        }
//        else if (x ==y | y == z | x == z) {
//            System.out.println("Error.");
//            scanner.close();
        }

    }

    }
