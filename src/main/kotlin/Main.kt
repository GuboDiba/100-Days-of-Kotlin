fun main() {
  tax(32,120000)

    passwordS()
    passwordS()
    passwordS()


}
//Day1
//Using if else expression to calculate tax percentage in relation to the
// income of employs less than 60years and
// retired any Country above 60years
fun tax(age:Int,income:Int){
   if(age<60){
       if (income<=50000){
           println(0.015)
       }else if(income in 50001..100000){
           println(0.02)
       }else if(income in 100001..150000){
           println(0.03)
       }else{
           println(13.0)
       }
   }else if (age in 61..79){
       if (income<=50000){
           println(0.015)
       }else if(income in 50001..100000){
           println(0.02)
       }else if(income in 100001..150000){
           println(0.03)
       }else{
           println(13.0)
       }
   }else{
       if (income<=50000){
           println(0.015)
       }else if(income in 50001..100000){
           println(0.02)
       }else if(income in 100001..150000){
           println(0.03)
       }else{
           println(13.0)
       }
   }
}

//Day2
//Write a program in Kotlin that asks the user to enter a password.
// If the password is "password123", print "Access granted".
// If the password is incorrect, print "Access denied".
fun passwordS(){
   print("enter password")
    val pass= readLine()
    if (pass=="password123"){
        println("Access granted")
    }else{
        println("Access denied")
    }

}