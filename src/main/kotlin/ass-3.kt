class Student(var name:String,var roll:Int,var marks:Int)
{
    fun getGrade(): Char
    {
      if(marks>=75)
      {
          return 'A'
      }
      else if(marks>=50)
      {
        return 'B'
      }
        else
      {
          return 'C'
      }
    }
}
fun main()
{
    val s1=Student("sarika",1,90)
    val s2=Student("bb",2,70)
    val s3=Student("cc",3,40)

    println("${s1.name} - Roll no :${s1.roll} - Grade : ${s1.getGrade()}")
    println("${s2.name} - Roll no :${s2.roll} - Grade : ${s2.getGrade()}")
    println("${s3.name} - Roll no :${s3.roll} - Grade : ${s3.getGrade()}")
}