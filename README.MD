#**Magical Monsters**

This is a game about making monsters *and* a demonstration of various Scala concepts.

[Building a Better Monster](https://scenarioworld.itch.io/building-a-better-monster) is the article series that 
discusses system design, inclusivity, and accessibility in software development that draws its examples from this 
codebase. 

##Composition:

- [x] BaseStatistics trait composing Biome type, see BaseStatistic.scala Otherwise known as Mixin(sic)

- [x] Inheritance: Wing trait, see Wing.scala

- [x] Mixed: Monster class, see Monster.scala

- [x] Smart constructor: BaseStatistics trait, see BaseStatistics.scala

##Custom Types:

- [x] Class: Habitat class, see Habitat.scala

- [x] Sealed traits: BaseStatistics trait, see BaseStatistic.scala

- [x] Case Class: Location class, see Location.scala

- [x] Singleton object: UniqueIdNumberGenerator Object, see IdNumber.scala

- [x] Trait: BodyPart trait, see BodyPart.scala

- [x] Companion object: BaseStatistics trait, see BaseStatistics.scala

- [x] Package object: MysteryStack object, see MysteryStack.package.scala

- [x] enum: BodyPartMaterialType, see BodyPart.Scala

##Functions:
- [ ] Anonymous function:
- [x] Function assignment to a variable: sayMyName, see Name.scala

##Scala Language Features:
- [x] Option: validateInputByBoundaries function, see Point.scala

##Primitive Types:
- [ ] Nothing:

- [ ] Null:

- [ ] Any:

- [ ] AnyVal:

- [ ] AnyRef:

##Type Casting:
- [ ] Char to Int: