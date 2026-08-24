/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class multiArray {
    public static void main (String args[] ) {
    int marks[][]={
        
        {10,20,30},
        {40,50,60},
        {70,80,90}
    };
    for (int i=0;i<marks.length;i++){
    for (int j=0;j<marks[i].length;j++){
    System.out.print(marks[i][j]+ " ");
}
System.out.println();
    }
        
        
}
}