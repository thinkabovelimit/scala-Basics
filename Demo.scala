object Demo{
    def add(a: Int,b: Int):Int={
        var sum: Int=0;
        sum=a+b;
        return sum;
    }
    def mul(a:Int,b:Int):Int={
        var mul:Int=0;
        mul=a*b;
        return mul;
    }
    def div(a:Int,b:Int):Double={
        var div:Double=0.0;
        div=a/b;
        return div;
    }
    def sub(a:Int,b:Int):Int={
        var sub:Int=0;
        sub=a-b;
        return sub;

    }
    def main(args:Array[String]){
        println("Enter two numbers:");
        var a= scala.io.StdIn.readInt();
        var b= scala.io.StdIn.readInt();
        println("Enter Your Choice:");
        var choice=scala.io.StdIn.readInt();
        if(choice==1)
            println("Sum of two numbers is:" + add(a,b));
        else if(choice==2)
            println("multiplied value of two numbers is:" + mul(a,b));
        else if(choice==3) 
            println("Sum of two numbers is:" + div(a,b));
        else if(choice==4)
            println("subtracted value of two number is"+sub(a,b))
    }
}