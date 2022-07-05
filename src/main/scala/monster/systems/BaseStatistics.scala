package monster.systems

sealed trait BaseStatistics() {
  def hitPoints: Int
  def speed: Int
  def criticalHitRate: Float
  def power: Int
  def endurance: Int
  def intelligence: Int
  def sociability: Int
  def fortune: Int
  def growth: Float
}
object BaseStatistics {
  def createBaseStatistics(
      hitPointsIn: Int,
      speedIn: Int,
      criticalHitRateIn: Float,
      powerIn: Int,
      enduranceIn: Int,
      intelligenceIn: Int,
      sociabilityIn: Int,
      fortuneIn: Int,
      growthIn: Float
  ): Option[BaseStatistics] = {
    val RETURN_DATA = new BaseStatistics {
      override def hitPoints: Int = validateIntStat(hitPointsIn).get
      override def speed: Int = validateIntStat(speedIn).get
      override def criticalHitRate: Float = validateFloatStat(
        criticalHitRateIn
      ).get
      override def power: Int = validateIntStat(powerIn).get
      override def endurance: Int = validateIntStat(enduranceIn).get
      override def intelligence: Int = validateIntStat(intelligenceIn).get
      override def sociability: Int = validateIntStat(sociabilityIn).get
      override def fortune: Int = validateIntStat(fortuneIn).get
      override def growth: Float = validateFloatStat(growthIn).get
    }
    Some(RETURN_DATA)
  }

  private def validateIntStat(intStatIn: Int): Option[Int] = {
    if (intStatIn > 0 && intStatIn < 999999) {
      Some(intStatIn)
    } else {
      None
    }
  }

  private def validateFloatStat(floatStatIn: Float): Option[Float] = {
    if (
      (floatStatIn == 0 || floatStatIn == 1) || (floatStatIn > 0 && floatStatIn < 1)
    ) {
      Some(floatStatIn)
    } else {
      None
    }
  }
}

//  def createBaseStatistics(
//      hitPointsIn: Int,
//      speedIn: Int,
//      criticalHitRateIn: Float,
//      powerIn: Int,
//      enduranceIn: Int,
//      intelligenceInt: Int,
//      sociabilityIn: Int,
//      fortuneIn: Int,
//      growthIn: Float
//  ): Option[BaseStatistics] = {
//    if (
//      (validateIntStat(hitPointsIn).isDefined) && (validateIntStat(
//        speedIn
//      ).isDefined) && (validateFloatStat(
//        criticalHitRateIn
//      ).isDefined) && (validateIntStat(powerIn).isDefined)
//    ) {
//
//      Some(this)
//    } else {
//      None
//    }
//    // returns the base statistics after its been validated
//  }
//
//  private def validateIntStat(intStatIn: Int): Option[Int] = {
//    if (intStatIn > 0 && intStatIn < 999999) {
//      Some(intStatIn)
//    } else {
//      None
//    }
//  }
//
