/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz2;

/**
 *
 * @author Filip
 */
public class FizzBuzz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    int checkCount =100;
        
        for(int i=1;i<=checkCount;i++){
            
            
            if((i%3)==0){
                System.out.print("Fizz");
            }
            if((i%5)==0){
                System.out.print("Buzz");
            }
            else if((i%3)==0){}
            else {
                System.out.print(i);
            }
                System.out.println();
        }
    
    
    }
}
