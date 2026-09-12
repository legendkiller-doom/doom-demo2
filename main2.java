
import pack1.Teacher;
import java.util.Scanner;
//the new class should be outside
class Student{
            String name;
            int roll_no;
            int marks;
            protected String password;
            Student(String name ,int roll_no,int marks,String password){
                this.name=name;
                this.roll_no=roll_no;
                this.marks=marks;
                this.password=password;
            }
            
            // if the function depends on the particular value don't give it static
             void Display(){
                System.out.println("Name of student :"+this.name);
                System.out.println("Name of student :"+this.roll_no);
                System.out.println("Name of student :"+this.marks);
                System.out.println("Name of student :"+this.password);
            }
              
        }

public class main2 {
    static double average(int a, int b, int c){
        return(a+b+c)/3.0;
    }
   
    public static void main(String[] args) {
       /*  System.out.println("hello new frame! this side Abhishek kumar.");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=input.nextLine();
        //string is a class
        System.out.printf("%s please enter your no:",name);
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        System.out.println("the average marks is:"+average(a, b, c));
        int [] arr={10,20,30};
       for(int i=0;i<3;i++){
        System.out.printf(" the array %d is %d\n", i+1 ,arr[i]);
       }
        Student s1= new Student("Abhi",7,99);
        System.out.println("name:"+s1.name);
        s1.Display();   */

        //now you can use package if all are not public use*
       /*  Teacher t1= new Teacher("oops",32,100);
        t1.Display(); */

        //private
         Student s1= new Student("Abhi",7,99,"nothing");
         s1.Display();
        s1.password="everything";

    }
    
}
