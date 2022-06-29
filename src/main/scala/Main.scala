import zio.*
import zio.Console.printLine
import monster.{BaseStatistics, BodyPart, Leg, Location, Monster, Wing}
import habitat.Biome
import custom_types.Point

object Main extends ZIOAppDefault {
  // % TODO: make this meaningfully a Zio app, find some cool way to tie it into the theme
  val run: URIO[Any, ExitCode] = printLine(
    "== Magical Monsters End =="
  ).exitCode

  val wing: Wing =
    new Wing("Red", 2, "Red Wing", 80, monster.BodyPartMaterialType.Scales)
  val leg: Leg =
    new Leg("Red", 1, "Red Leg", 40, monster.BodyPartMaterialType.Scales)
  val bodyPartList: List[BodyPart] = List(wing, wing, leg, leg, leg, leg)
  val baseStatistics: Option[BaseStatistics] =
    BaseStatistics
      .createBaseStatistics(10, 10, 0.5, 10, 10, 10, 10, 10, 0.5)
  val myCoolPoint: Point = new Point(10, 10, 0, 100)
  val myCoolLocation: Location = Location(myCoolPoint, 11)

  val myCoolMonster =
    new Monster(
      "Betsy",
      bodyPartList,
      habitat.Biome.Volcano,
      5,
      150,
      baseStatistics.get,
      myCoolLocation
    )

  val myCoolMonster2 =
    new Monster(
      "Betsy",
      bodyPartList,
      habitat.Biome.Volcano,
      5,
      150,
      baseStatistics.get,
      myCoolLocation
    )

  println(myCoolMonster.idNumber.theIdNumber)
  println(myCoolMonster2.idNumber.theIdNumber)
  println(myCoolMonster.toString)
}
