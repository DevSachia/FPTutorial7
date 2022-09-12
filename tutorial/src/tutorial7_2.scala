class Rational_2(var x : Int , var y : Int){
  require(y > 0 , "denominator must be positive");
  
  private def gcd(a : Int , b : Int): Int = if (b == 0) a else gcd(b,((a%b)+b)%b);
  private val g = gcd(x,y);
  
  val numer = x/g ;
  val demon = y/g ;
  
  //get the negative
  def  neg = new Rational_2( -numer , demon);
  
  //get sum
  
  def +(r : Rational_2) = new Rational_2(numer * r.demon + r.numer * demon , demon * r.demon);
  
  def -(r : Rational_2) = this + r.neg;
  
  override def toString = numer + "/" + demon;
  
 
}
object tutorial7_2 {
  def main(args:Array[String]){
    var x = new Rational_2(3,4);
    var y = new Rational_2(5,8);
    var z = new Rational_2(2,7);
    
    var result = x - z - y ;
    println(result.toString);

  }
  
}
