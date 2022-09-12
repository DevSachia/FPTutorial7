class Account(id : String , n : Int , b : Double) {
  val nic : String = id;
  val acnumber : Int = n ;
  var balance : Double = b;
  
  //withdraw
  
  def withdraw(a:Double) = this.balance = this.balance - a ;
  
  def deposit(a:Double) = this.balance = this.balance + a ;
  
  def transfer(tranferAccount: Account , ammount : Double) : Unit = {
    if( balance < ammount){
      println("Insufficient Account Balance");
    }
    else{
      this.withdraw(ammount);
      tranferAccount.deposit(ammount);
      
    }
  }
  
  override def toString = "[ID_Number = " + nic + "| Account Number = " + acnumber + "| Balance = " + balance + "]";
  
}

object tutorial7_3 {
  
  def main(args:Array[String]){
    val acc1 = new Account("id_1",1001,60000.00);
    val acc2 = new Account("id_2",1002,40000.00);
    println(acc1.toString);
    println(acc2.toString);
    acc1.transfer(acc2,30000.00);
    println(acc1.toString);
    println(acc2.toString);
    
    
    
  }
  
}