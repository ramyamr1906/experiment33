package SUS; 

import java.util.Scanner; 

public class Imposter6 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter the size of the matrix (n): ");
        int n = sc.nextInt(); 
        
        int[][] a = new int[n][n]; 
        int[][] b = new int[n][n]; 
        int[][] c = new int[n][n]; 
        
        int k = 0; 
        System.out.println("----------------------------------------------------------------------------------------------"); 
        System.out.println("Enter Matrix A \n"); 
        for(int i = 0; i < n ; i++){ 
            for(int j = 0; j < n; j++){ // Corrected loop variable
                System.out.printf("Enter the matrix A for the place %d: ", k); 
                a[i][j] = sc.nextInt(); 
                k++; 
            } 
        } 
        System.out.printf("\n"); 
        
        int m = 0; 
        System.out.println("----------------------------------------------------------------------------------------------"); 
        System.out.println("Enter Matrix B \n"); 
        for(int i = 0; i < n ; i++){ 
            for(int j = 0; j < n; j++){ // Corrected loop variable
                System.out.printf("Enter the matrix B for the place %d: ", m); 
                b[i][j] = sc.nextInt(); 
                m++; 
            } 
        } 
        
        // Matrix Addition
        for(int i = 0; i < n; i++) { 
            for(int j = 0; j < n; j++){ // Fixed 'i < n' to 'j < n'
                c[i][j] = a[i][j] + b[i][j]; 
            } 
        } 
        
        System.out.println("----------------------------------------------------------------------------------------------"); 
        System.out.println("Entered Matrix A: \n"); 
        for(int i = 0; i < n; i++) { 
            for(int j = 0; j < n; j++){ // Fixed 'i < n' to 'j < n'
                System.out.printf("%d \t", a[i][j]); 
            } 
            System.out.println(); // Added newline for correct matrix structure
        } 
        
        System.out.println("----------------------------------------------------------------------------------------------"); 
        System.out.println("Entered Matrix B: \n"); 
        for(int i = 0; i < n; i++) { 
            for(int j = 0; j < n; j++){ // Fixed 'i < n' to 'j < n'
                System.out.printf("%d \t", b[i][j]); 
            } 
            System.out.println(); // Added newline for correct matrix structure
        } 
        
        System.out.println("----------------------------------------------------------------------------------------------"); 
        System.out.println("Addition of Matrix A & B: \n"); 
        for(int i = 0; i < n; i++) { 
            for(int j = 0; j < n; j++){ // Fixed 'i < n' to 'j < n'
                System.out.printf("%d \t", c[i][j]); 
            } 
            System.out.println(); // Added newline for correct matrix structure
        } 
        
        sc.close(); // Good practice to close the scanner
    } 
}
