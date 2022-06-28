package custom_types

trait Name {
  def theName: String
  val sayMyName: Any = (someoneIsAroundYou: Boolean) => {
    if (someoneIsAroundYou) {
      println("Baby I love you.") // Why the sudden change?
    } else {
      println(theName)
    }
  }
}
