package as1;

abstract class GeneralBank{
	
	abstract double getSavingsInterestRate();
	abstract double getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank{
	
	public ICICIBank() {
		System.out.print("ICICIBank Instance Created!\n");
	}

	@Override
	double getSavingsInterestRate() {
		return 4;
	}

	@Override
	double getFixedDepositInterestRate() {
		return 8.5;
	}
}

class KotakBank extends GeneralBank{
	
	public KotakBank() {
		System.out.print("KotakBank Instance Created!\n");
	}

	@Override
	double getSavingsInterestRate() {
		return 6;
	}

	@Override
	double getFixedDepositInterestRate() {
		return 9;
	}
}



public class Assignment {
	public static void main(String[] args) {
		ICICIBank iciciBank = new ICICIBank();
		GeneralBank iBank = new ICICIBank();
		
		System.out.print(iciciBank.getSavingsInterestRate() + "\n");
		System.out.print(iBank.getFixedDepositInterestRate() + "\n");
		
		KotakBank kotakBank = new KotakBank();
		GeneralBank kBank = new KotakBank();
		
		System.out.print(kotakBank.getSavingsInterestRate() + "\n");
		System.out.print(kBank.getFixedDepositInterestRate() + "\n");
	}

}
