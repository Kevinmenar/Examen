package PrimerCaso;

public interface Investment {
	public double getSaldo();
	public void interestPayment();
	public void withdrawals(int amount);
	public void setSaldo(int saldo);
}
