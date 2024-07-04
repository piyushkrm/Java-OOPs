import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Mainbalance {
  protected int balance;
  protected long accountNo;
  protected String accountHolderName;
  Scanner sc = new Scanner(System.in);

  public Mainbalance() {
    readBalanceFromFile(); // Read balance from file
  }

  public void mainbalance() {
    System.out.println("Main balance is : " + balance);
  }

  public void accountNo(long accountNo) {
    this.accountNo = accountNo;
  }

  public void accountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }

  public void writeDetailsToFile() {
    try {
      FileWriter writer = new FileWriter("balance.txt");
      writer.write(Integer.toString(balance));
      if (accountHolderName != null) {
        writer.write(accountHolderName);
      }
      writer.write(Long.toString(accountNo));
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void readBalanceFromFile() {
    try {
      BufferedReader reader = new BufferedReader(new FileReader("balance.txt"));
      String line = reader.readLine();
      if (line != null) {
        balance = Integer.parseInt(line);
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

class credit extends Mainbalance {
  public void creditBalance() {
    System.out.print("Enter amount to add to your account : ");
    int creditAmmount = sc.nextInt();
    balance = balance + creditAmmount;
    writeDetailsToFile(); // Write new balance to file
    mainbalance(); // Display updated balance
  }
}

class debit extends Mainbalance {
  public void debitBalance() {
    System.out.print("Enter ammount to debit from your account : ");
    int debitAmmount = sc.nextInt();
    balance = balance - debitAmmount;
    if (balance < 0) {
      balance = 0;
    }
    writeDetailsToFile();
    mainbalance();
  }
}

class accountNo extends Mainbalance {
  public void account() {
    System.out.print("Enter your account no : ");
    long accountNo = sc.nextLong();
    accountNo(accountNo);
    writeDetailsToFile();
    // account();
  }
}

class accountHolderName extends Mainbalance {
  public void accountHolder() {
    System.out.print("Enter your name : ");
    String name = sc.nextLine();
    accountHolderName(name);
    writeDetailsToFile();
    // accountHolder();
  }
}

public class BankApplication {
  public static void main(String[] args) {
    credit creditObj = new credit();
    debit debitObj = new debit();
    accountHolderName holderObj = new accountHolderName();
    accountNo accountObj = new accountNo();

    creditObj.creditBalance();
    debitObj.debitBalance();
    holderObj.accountHolder();
    accountObj.account();
  }
}