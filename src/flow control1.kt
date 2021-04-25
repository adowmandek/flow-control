fun main() {
    oddNumbers()
    names("Aisha","shakashangilisho","fatuma")
    robot(guests=3)
    robot(guests = 14)
    robot(guests = 20)
  numbers()
}
fun oddNumbers() {
    for (y: Int in 1..100 step 2) {
        println(y)
    }
}
fun names(name:String,name2:String,name3:String){
    if (name>"five"){
        println("Aisha")
    }else
        println("shakashangiliso")

}
fun robot(guests:Int){
    when(guests) {
        1, 2, 3, 4, 5 -> println("guests are served milk")
        14, 13, 12, 10 -> println ("guests are served fanta orange")
        else-> println("everybody else gets a coca cola")
    }
}
fun numbers() {
    for (number in 1..100)
        if (number%3 == 0) {
            println("fizz")
        }
       else if (number%5==0){
            println("Buzz")
        }else if (number%3==0 && number%5==0){
            println("FizzBuzz")
        }
    else{
        println(number)
        }
}


