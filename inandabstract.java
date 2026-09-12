//   abstract class Animal{
//     abstract void walk() ; 
//     // abstact void eat(){ /* a constructor cannot be declared abstract */

//     // }; this is wrong
//     void eat(){
//         System.out.println("every animal eat something");
//     } /*it's upto you whether you want to define it or not */
//     Animal(){
//         System.out.println("we all are animal");
//     }

    
// }
// class Horse extends Animal{
//     void walk(){
//         System.out.println("it has four legs");
//     }
    
// }
// class chicken extends Animal{
//     void walk(){
//         System.out.println("it has only two legs");
//     }
// }
// public class inandabstract{
//     public static void main(String[] args) {
//         Horse h1=new Horse();
//         h1.walk();/*it will first provoke the parent constructor than derived constructor */
//        // h1.eat();
//         // Animal a1 = new Animal();
//         // a1.walk(); you can't call animal
//         // this will show error as animal is abstract     
// /*It can contain data + constructor + implemented methods + abstract methods.*/
//     }
// } 

//2nd one using interface
// interface Animal{
//     void walk();
//     /*void eat(){
//         System.out.println("everyone eat");
//     }*/
//    /* by default in the interface everything become abstract
//       so above eat function is wrong write like walk */  
// }
// interface hervi{
//     /*hervi(){
//         System.out.println("we should be hervi");
//     }*/ /* it can't have the constructor */
//     void walk();
//     //void eat(); /* it must be there */
// }

// class Horse implements Animal, hervi{
//    public void walk(){ // use public in implementation
//     System.out.println("it has 4 legs");}
// }
// public class inandabstract{
//     public static void main(String[] args) {
//         Horse h2= new Horse();
//         h2.walk();
//     }
// }

// /*note */
// /*static does NOT mean "the values must be fixed."

// It only means:

// The method belongs to the class rather than to an object. */

