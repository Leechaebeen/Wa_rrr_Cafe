import java.util.Calendar;
//������
class TestCalendar //�ÿ��� ���� ��¥�� �ٲ�� �ٲ��� �� ��ɵ��� �����ֱ� ���� Ŭ����
{
	static int sumCustomer = 0; //��¥�� �ٲٱ� ���� ���� �մ� �� ����
	static int datePlus;//��¥ �����ֱ�.���� 1�� �ٲ�� 1 ���ϰ� 2�� �ٲ�� 2 ���ϰ�

	public void calendar()
	{
		Calendar cal = Calendar.getInstance();//�޷� �ν��Ͻ� ����

		
		Receipt rec = new Receipt(); //������ �ν��Ͻ� ����(�մԼ��� �ҷ����� ����)
		Money money = new Money();   //���� �ν��Ͻ� ����(������ �ʱ�ȭ ��Ű�� ����)
		Sales_Control sc = new Sales_Control(); //�Ǹŷ� �ν��Ͻ� ����

		//��¥ �׽�Ʈ
		//int year = cal.get(Calendar.YEAR);
		//int month = cal.get(Calendar.MONTH) + 1;
		//int date = cal.get(Calendar.DATE);

		sumCustomer += 1; //�մ� ���� �Ѹ� �þ  

		if((sumCustomer)%3 == 0 && (sumCustomer) != 0) //�մ��� 3�� ���� ��¥�� �ٲ� 0���� �� ����ȵ�
		{
			datePlus= datePlus+1; 
			rec.setCustomer(0); 	 	//�Ϸ� �մ� �� �ʱ�ȭ 
			money.setCard_SalesD(0); 	//�Ϻ� ī�尪 �ʱ�ȭ
			money.setBill_SalesD(0); 	//�Ϻ� ���ݰ� �ʱ�ȭ
			Money.setBalju_moneyD(0);	//�Ϻ� ���� �ݾ� �ʱ�ȭ

			resetSales();// �Ϻ� �Ǹŷ� �ʱ�ȭ
			//resetChange();//�Ž����� �ʱ�ȭ
		}

	}

	//��¥�� �ٲ�� ��� �޴� �Ϻ� �Ǹŷ� �ʱ�ȭ
	void resetSales()
	{
		  // Sales �Ǹŷ� Ŭ���� 

		  // �� Ŀ�Ƿ�
		   Sales.setSespresso(0);
		   Sales.setSamericano(0);   
		   Sales.setSlatte(0);
		   Sales.setScafeMoca(0);
		   Sales.setScappuccino(0);
		   Sales.setSvanillaLatte(0);
		   Sales.setScaramelM(0);
		   
		   // �� ��Ŀ�Ƿ�
		   Sales.setSjamongAde(0);
		   Sales.setSyogurt(0);
		   Sales.setStea(0);
		   Sales.setSorangeJuice(0);
		   Sales.setSgogumaLatte(0);
		   
		   // �� ����Ʈ�� 
		   Sales.setScake(0);
		   Sales.setSbagel(0);
		   Sales.setSscone(0);
		   Sales.setSmacaron(0);
		   Sales.setScookie(0);



	}

	//��¥�� �ٲ�� �Ž����� �ʱ�ȭ
	void resetChange()
	{
		Change ch = new Change(); //�Ž����� Ŭ���� �ν��Ͻ� ����

		ch.setOhmanwon(0);
		ch.setManwon(0);
		ch.setOhchonwon(0);
		ch.setChonwon(0);
		ch.setOhbackwon(0);
	}
	
}
