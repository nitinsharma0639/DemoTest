public class Hello{

public static int sum(int a , int b){
    return a+b;
}

public static int mul(int a , int b){
    return a*b;
}  

public static int sub(int a , int b){
    return a-b;
}   
    public static void main(String[] args) {
        
        int a = 10;
        int b = 10;
       
        System.out.println( sum(a, b));
        System.out.println( mul(a, b));
    }
}
