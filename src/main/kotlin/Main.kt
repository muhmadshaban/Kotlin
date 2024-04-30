import java.util.*
fun main (){

    var reader = Scanner(System.`in`)
    println("plz Enter Two Number")
    var first = reader.nextDouble()
    var second = reader.nextDouble()
    println("plz Enter one Operator from these '*' , '-' , '*' , '/'" )
    var operator = reader.next()[0]
    var result :  Double =0.0
    when(operator) {
        '+' -> result = first + second
        '-' -> result = first - second
        '*' -> result = first * second
        '/' -> result = first / second
        else -> println("error")
    }
    println("$first $operator $second = $result")
}
