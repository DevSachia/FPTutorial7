
class Rational(var x: Int, var y: Int) {
  //preconditions - denominator is positive
  require(y > 0, "denominator must be positive");

  //simplifing the rational number
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b);

  private val g = gcd(x, y);

  val numer = x / g;
  val denom = y / g;

  def neg = new Rational(-numer, denom);

}

object tutorial7_1 {

  def main(args: Array[String]) {
    var x = new Rational(3, 4);
    println("x = " + x.numer + "/" + x.denom);
    println("-x = " + x.neg.numer + "/" + x.neg.denom);
  }
}