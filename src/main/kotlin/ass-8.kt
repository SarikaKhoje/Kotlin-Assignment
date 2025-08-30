
fun main() {
    var restart: String
    do {
        var number = 10
        println("Starting Countdown...")

        while (number >= 1) {
            println(number)
            Thread.sleep(1000)  // wait for 1 second
            number--
        }

        println("🚀 Countdown Finished!")
        print("Do you want to restart the countdown? (yes/no): ")
        restart = readLine()?.lowercase() ?: "no"
    } while (restart == "yes")

    println("Countdown program ended. Goodbye! 👋")
}
