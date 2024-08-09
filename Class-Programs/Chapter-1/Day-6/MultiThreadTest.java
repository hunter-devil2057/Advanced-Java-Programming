package chapter1;

public class MultiThreadTest implements Runnable{
//Variable
String name;

//    Defining parameterized constructor
   MultiThreadTest(String name){
       this.name=name;
   }
   synchronized void Print()
   {
       try{
        for(int i=5; i>0; i--)
        {
            System.out.println(name+i);
            Thread.sleep(1000);
//            Syntax: Thread.sleep(timeDuration);
        }
    }
    catch(Exception e) {}
   }
    @Override
    public void run(){
    Print();
}
    public static void main(String[] s)
    {
//        First Thread
        MultiThreadTest R1=new MultiThreadTest("Thread 1: ");
        Thread t1=new Thread(R1);           //passing class object R1

//        Second Thread
//        MultiThreadTest R2=new MultiThreadTest("Thread 2: ");
        Thread t2=new Thread(R1);       //passing class object R1, initially was R2
        
//        Third Thread
//        MultiThreadTest R3=new MultiThreadTest("Thread 3: ");
        Thread t3=new Thread(R1);       //passing class object R1, initially was R3
        
        t3.setPriority(10);
        t1.setPriority(5);
        t2.setPriority(1);
        
        t2.start();
        t1.start();
        t3.start();
    }
}
