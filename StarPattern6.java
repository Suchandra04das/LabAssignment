package Basicprograms;//program for create pattern

public class StarPattern6 {
    public static void main(String[] args) {
        int i, j, k;//variables declaration
        for (i = 1; i <= 5; i++) {//create row using for loop
            for (j = 5; j > i; j--) {
                System.out.print("  ");
            }//internal loop for space
            for (k = 1; k <(2*i); k++) {
                System.out.print("* ");}//internal loop for column
            System.out.println();
        }//external loop
}}
