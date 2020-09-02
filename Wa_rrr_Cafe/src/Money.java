// 매출액 속성 클래스(최호석)
class Money
{
		private static int card_SalesD;		// 일별 카드 매출액 변수 공유를 위해 static으로 수정
		
		private static int bill_SalesD;		// 일별 현금 매출액 변수 공유를 위해 static으로 수정
	
		private static int balju_moneyD;	// 일별 발주  금액  변수 공유를 위해 static으로 수정

		private static int card_SalesM;		// 월별 카드 매출액 변수 공유를 위해 static으로 수정

		private static int bill_SalesM;		// 월별 현금 매출액 변수 공유를 위해 static으로 수정
	
		private static int balju_moneyM;	// 월별 발주  금액  변수 공유를 위해 static으로 수정
		

		public int getCard_SalesD() 
		{
			return card_SalesD;
		}

		public void setCard_SalesD(int card_SalesD) 
		{
			Money.card_SalesD = card_SalesD;
		}

		public int getBill_SalesD() 
		{
			return bill_SalesD;
		}

		public void setBill_SalesD(int bill_SalesD) 
		{
			Money.bill_SalesD = bill_SalesD;
		}

		public int getBalju_moneyD() 
		{
			return balju_moneyD;
		}

		public static void setBalju_moneyD(int balju_moneyD) 
		{
			Money.balju_moneyD = balju_moneyD;
		}

		public int getCard_SalesM() 
		{
			return card_SalesM;
		}

		public void setCard_SalesM(int card_SalesM) 
		{
			Money.card_SalesM = card_SalesM;
		}

		public int getBill_SalesM() 
		{
			return bill_SalesM;
		}

		public void setBill_SalesM(int bill_SalesM) 
		{
			Money.bill_SalesM = bill_SalesM;
		}

		public int getBalju_moneyM() 
		{
			return balju_moneyM;
		}

		public static void setBalju_moneyM(int balju_moneyM) 
		{
			Money.balju_moneyM = balju_moneyM;
		}
		

}
