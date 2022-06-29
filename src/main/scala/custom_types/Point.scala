package custom_types

class Point(xIn: Int, yIn: Int, boundaryMaxIn: Int, boundaryMinIn: Int) {
  val x: Int = validateInputByBoundaries(xIn, boundaryMaxIn, boundaryMinIn).get
  val y: Int = validateInputByBoundaries(yIn, boundaryMaxIn, boundaryMinIn).get

  private def validateInputByBoundaries(
      input: Int,
      boundaryMax: Int,
      boundaryMin: Int
  ): Option[Int] = {
    if (input > boundaryMax || input < boundaryMinIn) {
      Some(input)
    } else {
      None
    }
  }
}
