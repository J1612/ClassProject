/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesassociate;

/**
 *
 * @author Marisa
 */
public class SalesAssociate {
    private String name;
    private int employeeNumber=1;
    Order[] orders=new Order[10000];
    
    public SalesAssociate (String name){
        this.name=name;
        this.emloyeeNumber=this.employeeNumber++;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
