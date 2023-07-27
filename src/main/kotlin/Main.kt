/**
  Write a function that has three parameters, two doubles and one character (+, -, *, /) and
  check if the third parameter:
  == *, it will multiply the two doubles
  == +, it will add the two numbers
  == _, it will subtract the two numbers
  == /, it will divide the two numbers
 */
fun main(){
    print("Enter first number: ")
    val firstNumber = readln().toDouble()
    print("Enter second number: ")
    val secondNumber = readln().toDouble()
    print("Enter character: ")
    val character = readln()
    val answer = arithmeticOperationWithCharacter(firstNumber, secondNumber, character)
    print(answer)
}
fun arithmeticOperationWithCharacter(a:Double, b:Double, c:String):Double {
    return when (c) {
        "+" -> { a + b }
        "-" -> { a - b }
        "*" -> { a * b }
        "/" -> { a / b }
        else -> { println("You entered an invalid character"); 0.0 }
    }
}