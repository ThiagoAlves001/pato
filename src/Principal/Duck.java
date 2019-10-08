/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Interfaces.FlyBehavior;
import Interfaces.QuackBehavior;

/**
 *
 * @author july
 */
public abstract class Duck {
    
   FlyBehavior voar; 
   QuackBehavior som; 
   
   public Duck(){};
   
   public void swim(){
   System.out.println("todos os patos nadam");
   }
   public void setFlyBehavior(FlyBehavior voar){
       this.voar = voar;
   }
   
   public void setQuackBehavior(QuackBehavior som){
       this.som = som;
   }
   
   
   
   public abstract void display();
   
   public void performFly(){
       
   }
   public void performQuack(){
   
   }
   }
        
    
    

