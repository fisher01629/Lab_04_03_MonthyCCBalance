//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthlyCCBalance
{
    public static void main(String[] args)
    {
        double cardBalance = 5000;
        double interestRate = .17;
        double interest = 0;
        double finalBalance = cardBalance;
        for (int i = 1; i <= 2; i++)
        {
            interest = cardBalance * interestRate;
            finalBalance += interest;
            System.out.println("With the balance of $" + cardBalance + " at month " + i + ", the interest is $" + interest + " and total is $" + finalBalance +  ".");
            cardBalance = finalBalance;
        }
    }
}
