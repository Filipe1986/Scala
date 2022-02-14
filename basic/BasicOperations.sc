//Comment 
/*
    multiple lines comment
    multiple lines comment
*/
object BasicOperations {
    def add(x:Int, y:Int) = x + y;
    def subtract(x:Int, y:Int) = x - y;
    def multiply(x:Int, y:Int) = x * y;
    def pow(base: Int, exponent: Int) = Math.pow(base, exponent);
    def divide(x:Int, y:Int) = x / y;

    
    
    def addDouble(x:Double, y:Double) = x + y;
    def subtractDouble(x:Double, y:Double) = x - y;
    def multiplyDouble(x:Double, y:Double) = x * y;
    def divideDouble(x:Double, y:Double) = x / y;
    

    def main(args: Array[String]) {
        println("Int")
        println(" x + y = " + add(25,10));
        println(" x - y = " + subtract(25,10));
        println(" x * y = " + multiply(25,10));
        println(" x ** y = " + pow(25,3));
        println(" x / y = " + divide(25,10)); // The result is the integer part of the division
        
        
        println("Double")
        println(" x + y = " + addDouble(25,10));
        println(" x - y = " + subtractDouble(25,10));
        println(" x * y = " + multiplyDouble(25,10));
        println(" x / y = " + divideDouble(25,10));
        
        
    }
}
