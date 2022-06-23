import zio.*
import zio.Console.printLine
import monster.{BodyPart, Leg, Monster, Wing}
import habitat.Biome

object Main extends ZIOAppDefault {
  val run: URIO[Any, ExitCode] = printLine(
    "== Magical Monsters End =="
  ).exitCode

  val wing: Wing =
    new Wing("Red", 2, "Red Wing", 80, monster.BodyPartMaterialType.Scales)
  val leg: Leg =
    new Leg("Red", 1, "Red Leg", 40, monster.BodyPartMaterialType.Scales)
  val bodyPartList: List[BodyPart] = List(wing, wing, leg, leg, leg, leg)
  val myCoolMonster =
    new Monster("Betsy", bodyPartList, habitat.Biome.Volcano, 5, 150)

  println(myCoolMonster.toString)
}
