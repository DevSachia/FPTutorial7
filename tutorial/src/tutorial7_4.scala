class Accounts(id: String, n: Int, b: Double) {
  val nic: String = id;
  val acnumber: Int = n;
  var balance: Double = b;

  override def toString = "[ID_Number = " + nic + "| Account Number = " + acnumber + "| Balance = " + balance + "]";

}

object tutorial7_4 {
  def main(args: Array[String]) {

    val acc1 = new Accounts("001V", 1001, 30000.00);
    val acc2 = new Accounts("002V", 1002, -30000.00);
    val acc3 = new Accounts("003V", 1003, 40000.00);
    val acc4 = new Accounts("004V", 1004, -3000.00);
    val acc5 = new Accounts("005V", 1005, -10000.00);
    //create the bank
    var bank: List[Accounts] = List(acc1, acc2, acc3, acc4, acc5);
    
    //List of accounts with negative balances
    def get_neg(bankaccounts: List[Accounts]) = {
      println(bank.filter(x => x.balance < 0));
    }

    //calculate sum of all account balances

    def total(bankaccounts: List[Accounts]) = {
      var sum = bankaccounts.foldLeft(0.0)((sum, y) => sum + y.balance);
      println("Total ammount of all bank accounts = " + sum);
    }

    //update the accounts after adding intrests
    def intrest(bankaccounts: List[Accounts]) = {
      bankaccounts.map(x => {
        if (x.balance > 0) {
          x.balance = x.balance + x.balance * 0.05;
        } else {
          x.balance = x.balance + x.balance * 0.1;
        }
        println("Final Balance of account , where account number = " + x.acnumber + " is " + x.balance);
      })
    }
    
    get_neg(bank);
    total(bank);
    intrest(bank);
  }

}