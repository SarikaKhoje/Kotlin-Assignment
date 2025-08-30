//Create a program that takes an exam score and:
//3. Prints "Excellent" if above 90
//"Good" if 75–90
//"Pass" if 50–74
//"Fail" if below 50
//4. Use if...else if and if expression to return a result string.
//5. Push the branch to main project

fun main()
{
    print("Score :")
    val score: Int = readLine()!!.toInt()
    if(score>90)
    {
        print("Excellent")
    }
    else if(score>=75 || score<=90)
    {
        print("Good")
    }
    else if(score>=50 || score<=74)
    {
        print("pass")
    }
    else
    {
        print("Fail")
    }
}