package chapter.pkg1;
//Grandfather
class Grandfather
{
    public void GrandFunction(){
        System.out.println("I am GrandFather.");
    }
}
//Father is a child class of Grandfather
class Father extends Grandfather
{
    public void FatherFunction(){
    System.out.println("I am Father.");
    }
}
class Son extends Father
{
    @Override
    public void FatherFunction(){
        System.out.println("It's son's Function");
    }
    public void SonFunction(){
        System.out.println("I am Son.");
    }
    class Son1{
        public static void Son1Function(){
            System.out.println("This is Inner Class Function.");
        }
        public void MyFunction(){
            System.out.println("This is me, My Function");
        }
    }
}

public class InheritanceDemo
{
        public static void main(String[] args){
        Son.Son1.Son1Function();
//        Class.Sub-Class(Or InnerClass).InnerClassFunction();

        Son s_obj=new Son();
        s_obj.GrandFunction();
        s_obj.FatherFunction();
        s_obj.SonFunction();
        Father obj1=new Father();
        obj1.FatherFunction();
        
        Son.Son1 o=s_obj.new Son1();
//        outerClass.innerClass newObjName=outerClassObjName.new innerClass();
        o.MyFunction();
    }
}
