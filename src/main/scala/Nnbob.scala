
object Nnbob extends App {
  def beerDrinker(b: Int) = for (x <- b to 1 by -1) yield (x, x-1)
  beerDrinker(99) foreach {
    case (2, 1)  => println("2 bottles of beer on the wall, 2 bottles of beer.\nTake one down, pass it around, 1 bottle of beer on the wall.\n")
    case (1, 0)  => println("1 bottle of beer on the wall, 1 bottle of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n")
    case (b, nb) => println(s"$b bottles of beer on the wall, $b bottles of beer.\nTake one down, pass it around, $nb bottles of beer on the wall.\n")
  }
}
