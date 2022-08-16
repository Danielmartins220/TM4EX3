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

    if (num1 > num2 && num1 > num3){
        println(" O numero um e o maior: $num1 ")
    }
    else if (num2 > num1 && num2 > num3){
        println(" O numero dois e o maior: $num2 ")
    }
    else if (num3 > num1 && num3 > num2){
        println(" O numero tres e o maior: $num3 ")
    }

}