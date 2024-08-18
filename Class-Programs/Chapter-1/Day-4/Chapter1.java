package chapter1;
//Importing Packages inside the Source Packages
import College.*;
//        if parameterized constructor, then throws error
public class Chapter1 extends Student{
//    Student Constructor
    public Chapter1(){
        super("Hello, Parent Class...");
    }
    @Override
    public void Show(){
        //        calling parent class Show() method
        super.Show();
//super.MethodName(): calls the method which is inside the parent class
        System.out.println("This is Child Method.");
    }
    public static void main(String[] args) {
//        System.out.println("Hello, Java");
        
//        if you're importing packages then, use this one 
//        Student obj=new Student();

//        if not importing then
//            College.Student obj=new College.Student();
//            packageName.ClassName objName=new packageName.className
//            obj.Show();
//                Chapter1 c=new Chapter1();
//                c.Show();
                    try
                    {
                        int a=5;
                        int b=0;
                        if(b==0)
                            throw new CustomizeException("Divide From Zero Error...");
//                        int c=a/b;
                    }
                    catch(CustomizeException e)
                    {
                        System.out.println(e.getMessage());
                    }
    }
    
}
