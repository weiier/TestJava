package com.zhangb.eleven;
class  A {   
    int  i =  0 ;   
}   
 
 
public   class  TestParams_1 {   
 
    public   static   void  add(A a) {   
       a =  new  A();   
       System.out.println(a);
       a.i++;   
   }   
      
    public   static   void  main(String args[]) {   
       A a =  new  A();   
       System.out.println(a);
       add(a);   
       System.out.println(a.i);   
   }   
}    