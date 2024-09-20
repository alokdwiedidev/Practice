package org.example;
//Given an NxM matrix. The task is to find the maximum element in this matrix.
public class Practice10 {
    public static void main(String[] args) {
        int [] [] matrix={
                {1,2,3},
                {4,27,6},
                {7,8,9}};
        int numberOfRows= matrix.length;
        int numCollumn=matrix[0].length;

        int maxElement=matrix[0][0];
        for (int i=0; i< numberOfRows;i++){ 
            for (int j=0; j< numCollumn; j++){
                if (matrix[i][j]>maxElement){
                    maxElement=matrix[i][j];
                }
            }
        }
        System.out.println("max element of matrix : "+ maxElement);
    }

}
