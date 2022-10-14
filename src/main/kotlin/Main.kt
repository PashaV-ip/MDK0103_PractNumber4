fun main(args: Array<String>) {

    //Задача номер 1
    fun printFullName(firstName:String, lastName:String){
        println(firstName + " " + lastName)
    }

    //Задача номер 2
    printFullName("Ваньшев", "Павел")

    //Задача номер 3
    fun calculateFullName(firstName:String, lastName:String):String {
        return "$firstName $lastName"
    }

    //задача номер 4
    fun calculateFullName(function:String):Pair<String, Int> { //Изменил функцию вот так, а почему бы и нет :)
        return Pair(function, function.length)
    }
    println(calculateFullName(calculateFullName("Ваньшев", "Павел")))

    //Задача номер 5
    fun IsPrimeNumber(num:Int):Boolean{
        if(num%2!=0 && num>0)
        for(i:Int in 2..num) {
            if(num % i == 0 && num == i) {
                return true
            }
        }
        return false
    }
    val number:Int = 113
    println("$number - " + IsPrimeNumber(number).toString())

    //Задача номер 6
    fun FibonacciNumber(num:Int):Int{
        if(num>2) {
            var fibonacciOne:Int = 1
            var fibonacciTwo:Int = 1
            for(i in 1..num-2){
                var fibonacciThree:Int = fibonacciOne + fibonacciTwo
                fibonacciOne = fibonacciTwo
                fibonacciTwo = fibonacciThree
                println(fibonacciThree)
            }
            return fibonacciTwo
        }
        return 0
    }
    FibonacciNumber(10)
}