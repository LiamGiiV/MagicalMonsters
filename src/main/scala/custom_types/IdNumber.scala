package custom_types

class IdNumber() {
  val theIdNumber: Int = UniqueIdNumberGenerator.generate(this)
}

object UniqueIdNumberGenerator {
  private var nextIdNumber: Int = 0
  // TODO: Update when Scala allows postfix operators on return values
  def generate(idNumberIn: IdNumber): Int = {
    val RETURN_VALUE = nextIdNumber
    UsedIdNumbers.usedIdNumbers.addOne(idNumberIn)
    nextIdNumber += 1
    RETURN_VALUE
  }
  def previewNextIdNumber: Int = nextIdNumber
}
