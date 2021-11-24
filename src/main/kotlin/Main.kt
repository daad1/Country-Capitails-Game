
 // Create a Country class with two attributes

 class Country(name: String, capital: String) {
     var name: String
     var capital: String

     init {
         this.name = name
         this.capital = capital
     }

     //Create a function that prints the country and its capital

     fun display() {
         println("$name: $capital")
     }
 }


    fun main(args: Array<String>) {
//Create ten countries (instances of the Country class) and place them inside a list

        val countries = listOf(
            Country("Saudi Arabia", "Riyadh"),
            Country("Egypt", "Cairo"),
            Country("lebanon", "Beirut"),
            Country("Bahrain", "Manama"),
            Country("Kuwait", "Kuwait"),
            Country("Libya", "Tripoli"),
            Country("Morocco", "Rabat"),
            Country("Oman", "Muscat"),
            Country("Qatar", "Doha"),
            Country("Syria", "Damascus"),
        )
        //Randomly select three countries and quiz the user to see if they know the capitals

        var round = 1
        while (true) {

            //unique three questions

            var randomNumbers = (0..9).shuffled().take(3) // here we can take 3 unique random number
            var score = 3


            for (i in 0..2) {
                print("Can you guess the capital city of ${countries[randomNumbers[i]].name}: ")
                val answer = readLine()
                if (answer == countries[randomNumbers[i]].capital)
                    println("Great")
                else {
                    println("Wrong answer, the answer is: ${countries[randomNumbers[i]].capital}")
                    score--
                }
            }
            // Show final score to the user

            println("Thank for play. Your score is: $score/3")
            print("Do you want to play again? (y|n)")
            val answer2 = readLine()
            if (answer2 != "y") {
                break
            }
            round++
            println("Round $round")
        }
        print("See you next time !")
    }


