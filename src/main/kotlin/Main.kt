fun main (){
    val cities = arrayOf ("harare", "mumbai", "dodoma", "jakarta")
    cities[0]="Harare"
    cities[1]="Mumbai"
    cities[2]="Dodoma"
    cities[3]="Jakarta"
    println(cities.contentToString())
    println(threeNames("jackline","Mary", "susan"))
totalSalary(2, 5000)
    totalSalary(5,3000)
}

fun totalSalary(hour: Int  , rate: Int ) : Int {
     var salary = hour * rate
    println("The total salary = $salary")
    return salary
}
fun threeNames(firstName:String, secondName:String, thirdName:String): String {
    val name:Array<String> = arrayOf(firstName,secondName,thirdName)
    return name.contentToString()
}

