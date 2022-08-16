fun main(){

    var num1 : Int
    var num2 : Int
    var num3 : Int

    println(" digete um numero ")
    num1 = readLine()!!.toInt()
    println(" digite o segunto numero")
    num2 = readLine()!!.toInt()
    println(" digite o terceiro numero")
    num3 = readLine()!!.toInt()

    if(num1 <= num2 && num2 <= num3){
        println(" Aordem cresencete e: $num1, $num2, $num3")
    }
    else if(num1 <= num3 && num3 <= num2){
        println(" Aordem cresencete e: $num1, $num3, $num2")
    }
    else if(num2 <= num1 && num1 <= num3){
        println(" Aordem cresencete e: $num2, $num1, $num3")
    }
    else if(num2 <= num3 && num3 <= num1){
        println(" Aordem cresencete e: $num2, $num3, $num1")
    }
    else if(num3 <= num1 && num1 <= num2){
        println(" Aordem cresencete e: $num3, $num1, $num2")
    }
    else {
        println(" Aordem cresencete e: $num3, $num2, $num1")
    }
}