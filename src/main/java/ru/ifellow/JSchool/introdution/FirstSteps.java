package ru.ifellow.JSchool.introdution;

public class FirstSteps {

    public static int sum(int x, int y){
        return x+y;
    }

    public static int mul(int x, int y){
        return x*y;
    }
 
    public static int div(int x, int y){
        if (y==0){
            return 0;
        }
        else{
            return x/y;
        }
    }

    public static int mod(int x, int y){
        if (y==0){
            return 0;
        }
        else{
            return x%y;
        }
    }

    public static boolean isEqual(int x, int y){
        if (x==y){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isGreater(int x, int y){
        if (x>y){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return x>=xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public static int sum(int[] array){
        if (array.length==0){
            return 0;
        }
        else{
            int s = 0;
            for (int i : array) {  
                s += i;
            }
            return s;
        }
    }

    public static int mul(int[] array){
        if (array.length==0){
            return 0;
        }
        else{
            int m = 1;
            for (int i : array) {  
                m *= i;
            }
            return m;
        }
    }

    public static int min(int[] array){
        if (array.length==0){
            return Integer.MAX_VALUE;
        }
        else{
            int m = 10;
            for (int i : array) {  
                if (i<m){
                    m = i;
                }
            }
            return m;
        }
    }

    public static int max(int[] array){
        if (array.length==0){
            return Integer.MIN_VALUE;
        }
        else{
            int m = 0;
            for (int i : array) {  
                if (i>m){
                    m = i;
                }
            }
            return m;
        }
    }

    public static double average(int[] array){
        if (array.length==0){
            return 0;
        }
        else{
            int sm = 0;
            for (int i : array) {
                sm+=i;
            }
            double srznach = Math.abs(sm/array.length);
            return srznach;
        }
    }

    public static boolean isSortedDescendant(int[] array){
        if (array.length==0){
            return true;
        }
        else{
            for (int i=1; i<array.length; i++) {
               if (array[i]>array[i-1]){
                    return false;
               } 
            }
            return true;
        }
    }

    public static void cube(int[]array){
        for (int i = 0; i<array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    public static boolean find(int[]array, int value){
        for (int i : array) {
            if (i==value){
                return true;
            }
        }
        return false;
    }

    public static void reverse(int[]array){
        int len = array.length;
        int l2 = len/2;
        int a = 0;
        for (int i = 0; i<l2; i++) {
            a = array[i];
            array[i] = array[len-1];
            array[len-1] = a;
            len -= 1;
        }
    }

    public static boolean isPalindrome(int[]array){
        int len = array.length;
            int l2 = len/2;
            for (int i = 0; i<l2; i++) {
                if (array[i]!=array[len-1]){
                    return false;
                }
                len -= 1;
            }
        return true;
    }

    public static int sum(int[][] matrix){
        int sm = 0;
            for (int[] i : matrix) {
                for (int j : i) {
                    sm += j;
                }
            }
        return sm;
    }

    public static int max(int[][] matrix){
        if (matrix.length==0){
            return Integer.MIN_VALUE;
        }
        else{
            int mx = 0;
            for (int[] i : matrix) { 
                for (int j : i) {
                    if (j>mx){
                        mx = j;
                    } 
                } 
                
            }
            return mx;
        }
    }

    public static int diagonalMax(int[][] matrix){
        if (matrix.length==0){
            return Integer.MIN_VALUE;
        }
        else{
            int mx = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][i] > mx) { 
                    mx = matrix[i][i]; 
                }
            }
            return mx;
        }
    }

    public static boolean isSortedDescendant(int[][] matrix){
        if (matrix.length==0){
            return true;
        }
        else{
            for (int[] i : matrix) {
                    for (int j = 1; j<i.length;j++){
                        if (i[j] > i[j-1]){
                            return false;
                        }
                    }
                }
            }
        return true;
    }
    
    //вывод списка
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int z1 = FirstSteps.sum(6,10);
        System.out.println("1. Сумма = " + z1);

        int z2 = FirstSteps.mul(5,7);
        System.out.println("2. Произведение = " + z2);

        int z3 = FirstSteps.div(6,11);
        System.out.println("3. Частное = " + z3);

        int z4 = FirstSteps.mod(27,11);
        System.out.println("4. Остаток от деления = " + z4);

        boolean z5 = FirstSteps.isEqual(27,11);
        System.out.println("5. "+z5);

        boolean z6 = FirstSteps.isGreater(27,11);
        System.out.println("6. "+z6);

        boolean z7 = FirstSteps.isInsideRect(0, 2, 6, 3, 6, 3);
        System.out.println("7. "+z7);

        int[] z8 = {2,5,10};
        int res8 = FirstSteps.sum(z8);
        System.out.println("8. Сумма чисел = "+res8);

        int[] z9 = {2,5,10};
        int res9 = FirstSteps.mul(z9);
        System.out.println("9. Произведение чисел = "+res9);

        int[] z10 = {5,-1,9};
        int res10 = FirstSteps.min(z10);
        System.out.println("10. Минимальное значение = "+res10);

        int[] z11 = {5,-1,9};
        int res11 = FirstSteps.max(z11);
        System.out.println("11. Максимальное значение = "+res11);

        int[] z12 = {5,9,9};
        double res12 = FirstSteps.average(z12);
        System.out.println("12. Среднее значение = "+res12);

        int[] z13 = {5,9,9};
        boolean res13 = FirstSteps.isSortedDescendant(z13);
        System.out.println("13. Упорядочение по убыванию = "+res13);

        int[] z14 = {1, 5, 3};
        System.out.println("14. Исходные числа = ");
        printArray(z14);
        FirstSteps.cube(z14);
        System.out.println("Кубические числа = ");
        printArray(z14);

        int[] z15 = {1,5,4,3,7,5};
        boolean res15 = FirstSteps.find(z15,5);
        System.out.println("15. "+res15);

        int[] z16 = {1, 5, 3, 2};
        System.out.println("16. Исходные числа = ");
        printArray(z16);
        FirstSteps.reverse(z16);
        System.out.println("Перевернутые числа = ");
        printArray(z16);

        int[] z17 = {1, 5, 0, 5, 1};
        boolean res17 = FirstSteps.isPalindrome(z17);
        System.out.println("17. Палиндром = " + res17);

        int[][] z18 = {{2,5,1}, {4,6,7}, {3,0,1}};
        int res18 = FirstSteps.sum(z18);
        System.out.println("18. Сумма чисел = "+res18);

        int[][] z19 = {{5,-1,9},{2,0,1},{4,3,7}};
        int res19 = FirstSteps.max(z19);
        System.out.println("19. Максимальное значение = "+res19);

        int[][] z20 = {{5,-1,9},{2,7,1},{4,3,0}};
        int res20 = FirstSteps.diagonalMax(z20);
        System.out.println("20. Максимальное значение = "+res20);

        int[][] z21 = {{9,9,8},{7,6,6,9},{4,3,1}};
        boolean res21 = FirstSteps.isSortedDescendant(z21);
        System.out.println("21. Упорядочение по убыванию = "+res21);
    }  
}
