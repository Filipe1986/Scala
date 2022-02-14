//Comment 
/*
    multiple lines comment
    multiple lines comment
*/
object BasicOperations {
    def add(x:Int, y:Int) = x + y;
    def subtract(x:Int, y:Int) = x - y;
    def multiply(x:Int, y:Int) = x * y;
    def divide(x:Int, y:Int) = x / y;
    

    def main(args: Array[String]) {
        println(" x + y = " + add(25,10));
        println(" x - y = " + subtract(25,10));
        println(" x * y = " + multiply(25,10));
        println(" x / y = " + divide(25,10)); // The result is the integer part of the division
        
        
    }
}
