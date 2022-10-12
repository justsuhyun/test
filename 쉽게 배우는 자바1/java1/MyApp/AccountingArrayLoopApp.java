
public class AccountingArrayLoopApp {

	public static void main(String[] args) {

		double valueofsupply = Double.parseDouble(args[0]); //문자열을 그냥 더블에 넣으려고 하면 에러남
		double VatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = valueofsupply*VatRate;
		double total = valueofsupply + VAT;
		double expense = valueofsupply*expenseRate;
		double Income = valueofsupply - expense;
		
		System.out.println("Value of supply : "+valueofsupply);
		System.out.println("VAT : "+VAT);
		System.out.println("Total : "+total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : "+Income);
				
//		double rate1 = 0.5;
//		double rate2 = 0.3;
//		double rate3 = 0.2;
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2; //변수가 3개가 아니라 1개이며 서로 연관됨을 알기 쉽다
		
//		double dividend1 = Income * dividendRates[0];
//		double dividend2 = Income * dividendRates[1];
//		double dividend3 = Income * dividendRates[2]; 
		
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend "+(i + 1)+" : "+(Income*dividendRates[i]));
			i = i + 1;  
		// 개수만큼 출력문 입력할 필요없이 딱 한줄로 표현가능
		}
		
		

	}

}
