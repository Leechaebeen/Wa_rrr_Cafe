
import java.util.Scanner;

// �ܰ���� ���(��ȣ��)
class Money_Control
{
	// Change(�Ž�����) Ŭ���� �ν��Ͻ� ����
	Change c = new Change();

	Money m = new Money();// �Ӵ� �ν��Ͻ� ����

	// �Ӽ�: �Ž����� ��ﶧ �Ž������� ���� ��Ƶ� �Ӽ�
	
	// 2020.09.02 static ���� ����
	static int sum = 0; // ���ֱݾ��� ���� �հ踦 �������ִ� sum ���� ����.

	// �Ž����� Ȯ�� �޼ҵ�
	public void hakin()
	{
		System.out.println();
		System.out.println("===================================================================");
		System.out.println("\t\t         ���ܰ� ��Ȳ��");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("     ����\t         ���");
		System.out.printf("��  ������\t\t %d��%n", c.getOhmanwon()); // ������ ����
		System.out.printf("��  �ϸ���\t\t %d��%n", c.getManwon()); // �ϸ��� ����
		System.out.printf("��  ��õ��\t\t %d��%n", c.getOhchonwon());// ��õ�� ����
		System.out.printf("��  ��õ��\t\t %d��%n", c.getChonwon()); // ��õ�� ����
		System.out.printf("��  �����\t\t %d��%n", c.getOhbackwon());// ����� ����
		System.out.println("-------------------------------------------------------------------");
		System.out.println("===================================================================");
		System.out.println();
	}

	// �ܵ� �Ա� �޼ҵ�()
	public void changeInput() // - �ܵ��Ա� �޼ҵ�
	{

		Scanner sc = new Scanner(System.in);

		int oh; // �������� ����� �޾��ִ� ���� ����
		int man; // �ϸ����� ����� �޾��ִ� ���� ����
		int ochon; // ��õ���� ����� �޾��ִ� ���� ����
		int chon; // ��õ���� ����� �޾��ִ� ���� ����
		int obak; // ������� ����� �޾��ִ� ���� ����

		do
		{
			System.out.print(" �������� ���� �����ðڽ��ϱ�? : ");
			oh = sc.nextInt(); // ��ĳ�ʷ� ������ ��� �Է¹ޱ�
			System.out.println();
		} while (!(oh > 0)); // �Է��� ����� ������ ��� �ٽ� �Է¹޵��� do ~ While�� ����

		do
		{
			System.out.print(" ������ ���� �����ðڽ��ϱ�? : ");
			man = sc.nextInt(); // ��ĳ�ʷ� �ϸ��� ��� �Է¹ޱ�
			System.out.println();

		} while (!(man > 0)); // �Է��� ����� ������ ��� �ٽ� �Է¹޵��� do ~ While�� ����

		do
		{
			System.out.print(" ��õ���� ���� �����ðڽ��ϱ�? : ");
			ochon = sc.nextInt(); // ��ĳ�ʷ� ��õ�� ��� �Է¹ޱ�
			System.out.println();
		} while (!(ochon > 0)); // �Է��� ����� ������ ��� �ٽ� �Է¹޵��� do ~ While�� ����

		do
		{
			System.out.print(" õ���� ���� �����ðڽ��ϱ�? : ");
			chon = sc.nextInt(); // ��ĳ�ʷ� ��õ�� ��� �Է¹ޱ�
			System.out.println();
		} while (!(chon > 0)); // �Է��� ����� ������ ��� �ٽ� �Է¹޵��� do ~ While�� ����

		do
		{
			System.out.print(" ������� ���� �����ðڽ��ϱ�? : ");
			obak = sc.nextInt(); // ��ĳ�ʷ� ����� ��� �Է¹ޱ�
			System.out.println();
		} while (!(obak > 0)); // �Է��� ����� ������ ��� �ٽ� �Է¹޵��� do ~ While�� ����

		// ���� �������� ������ �Է¹��� �������� �����ָ� �������� ������ ����
		c.setOhmanwon(c.getOhmanwon() + oh);

		// ������ ���ð� ����
		c.setManwon(c.getManwon() + man);

		// ������ ���ð� ����
		c.setOhchonwon(c.getOhchonwon() + ochon);

		// ������ ���ð� ����
		c.setChonwon(c.getChonwon() + chon);

		// ������ ���ð� ����
		c.setOhbackwon(c.getOhbackwon() + obak);

		// �ܵ��� �Ա� ������ŭ ������־� int a�� ����. (�ܵ���ŭ ����׿��� �����ϱ� ����)
		int a = c.getOhmanwon() * 50000 + c.getManwon() * 10000 + c.getOhchonwon() * 5000 + c.getChonwon() * 1000
				+ c.getOhbackwon() * 500;

		System.out.println();
		System.out.println(" ���� �Ա��� �Ž����� �� �ݾ� : " + a);
		System.out.println();
		System.out.println("===================================================================");
		System.out.println("\t\t         ���ܰ� ��Ȳ��");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("     ����\t         ���");
		System.out.printf("��  ������\t\t %d��%n", c.getOhmanwon()); // ������ ����
		System.out.printf("��  �ϸ���\t\t %d��%n", c.getManwon()); // �ϸ��� ����
		System.out.printf("��  ��õ��\t\t %d��%n", c.getOhchonwon());// ��õ�� ����
		System.out.printf("��  ��õ��\t\t %d��%n", c.getChonwon()); // ��õ�� ����
		System.out.printf("��  �����\t\t %d��%n", c.getOhbackwon());// ����� ����
		System.out.println("-------------------------------------------------------------------");
		System.out.println("===================================================================");
		System.out.println();

	}

	public void change_Reset() // - �Ž����� �ʱ�ȭ �۾�.
	{

		// ������ �ʱ�ȭ
		c.setOhmanwon(0); // �������� ������ 0���� �ʱ�ȭ.
		c.setManwon(0); // �ϸ����� ������ 0���� �ʱ�ȭ.
		c.setOhchonwon(0); // ��õ���� ������ 0���� �ʱ�ȭ.
		c.setChonwon(0); // ��õ���� ������ 0���� �ʱ�ȭ.
		c.setOhbackwon(0); // ������� ������ 0���� �ʱ�ȭ.

		System.out.println();
		System.out.println("===================================================================");
		System.out.println("\t\t         ���ܰ� ��Ȳ��");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("     ����\t         ���");
		System.out.printf("��  ������\t\t %d��%n", c.getOhmanwon()); // ������ ����
		System.out.printf("��  �ϸ���\t\t %d��%n", c.getManwon()); // �ϸ��� ����
		System.out.printf("��  ��õ��\t\t %d��%n", c.getOhchonwon());// ��õ�� ����
		System.out.printf("��  ��õ��\t\t %d��%n", c.getChonwon()); // ��õ�� ����
		System.out.printf("��  �����\t\t %d��%n", c.getOhbackwon());// ����� ����
		System.out.println("-------------------------------------------------------------------");
		System.out.println("===================================================================");
		System.out.println();

	}

	// �Ž������� ���� �޼ҵ�()
	// {�Ž��������� ���� �Ž����� �Ӽ����� ��� ���� �ǹ� }

	// class Money �Ӽ��� ��⵵��

	// ������
	// ���� ���� ���� �޼ҵ�() - ���� ������ ������ �ݾ��� �� ����� �����⿡ �״´�. ������ Ŭ�������� �ʱ�ȭ �Ǳ� ���� ȣ��
	public void money_Sales()
	{
		// �� ���� ������� �����ϱ� ���� ���ð���
		// ���� �� ���ݸ���׿� �Ѱ����ݾ��� �����־�߸� �� ���� ���� �հ谡 ��������.
		m.setBill_SalesD(m.getBill_SalesD() + Pay_Control.allPay);

		m.setBill_SalesM(m.getBill_SalesM() + Pay_Control.allPay);
	}

	// ��ä��
	// ī�� ���� ���� �޼ҵ�() - ī�� ������ ������ �ݾ��� �� ����� �����⿡ �״´�. ������ Ŭ�������� �ʱ�ȭ �Ǳ� ���� ȣ��
	public void card_Sales()
	{
		// �� ī�� ������� �����ϱ� ���� ���ð���
		// ���� �� ī�����׿� �Ѱ����ݾ��� �����־�߸� �� ī�� ���� �հ谡 ��������.
		m.setCard_SalesD(m.getCard_SalesD() + Pay_Control.allPay);
		m.setCard_SalesM(m.getCard_SalesM() + Pay_Control.allPay);
	}

	// �ڵ����ֱݾ� ���� �޼ҵ�() ���� ����.
	// 2020.09.02 ����
	public void money_Balju(int standard) 
	{
		Balju_Price balju_price = new Balju_Price(); // ���ְ��� �ν��Ͻ� ����
		
		/*
		// �����ڵ�
		// ������ ���ְ��ݰ� ������ �������� ���Ͽ� ������ ���ֱݾ��� �������� sum�� �����ش�.
		sum += bp.getBean() * Inventory.getNbean();
		*/
		
		sum += balju_price.getBean() * standard;
		
		// ������ ���ְ��� * ���ּ��� ���Ͽ� �������� sum �� ���Ѵ�
		
		// �ڸ��� ���ְ��ݰ� �ڸ��� �������� ���Ͽ� �ڸ��� ���ֱݾ��� �������� sum�� �����ش�.
		sum += balju_price.getGrapefruit() * standard;

		// ���� �ڸ��� ���� ��� ����� ���ݰ� �������� ���� ����� ���ֱݾ��� �������� sum�� �����ش�.
		sum += balju_price.getSpawater() * standard;
		sum += balju_price.getYogurtpowder() * standard;
		sum += balju_price.getTeabag() * standard;
		sum += balju_price.getGoguma() * standard;
		sum += balju_price.getOrange() * standard;
		sum += balju_price.getCake() * standard;
		sum += balju_price.getBagel() * standard;
		sum += balju_price.getScone() * standard;
		sum += balju_price.getMacaron() * standard;
		sum += balju_price.getCookie() * standard;
		sum += balju_price.getCreamcheese() * standard;
		sum += balju_price.getStroberryjam() * standard;
		sum += balju_price.getWhipcream() * standard;

		Money.setBalju_moneyD(sum); // �����ߴ� ��� ����� ������ ���ֱݾ� ������ ����.

		Money.setBalju_moneyM(m.getBalju_moneyD()); // ���� ���ְ��� ���� ���̴� ����
	}

	// 2020.09.03 �߰�
	// �������ֱݾ� ���� �޼ҵ�
	
	
	// ������ ���� �޼ҵ�()
	// { ���� - ���ֱݾ� }
	public int money_Profit()
	{
		int profit = m.getBill_SalesD() + m.getCard_SalesD() - c.getChange() - m.getBalju_moneyD();
		// ������ = �� ���� ����� + �� ī������ - �ܰ�ݾ� - ���ֱݾ�

		return profit;
		// ������ �ݾ� ����.
	}

	public void change_Inventory() // ���ư��� �޼ҵ�
	{

		ManagerMenu m = new ManagerMenu();

		while (true)
		{
			m.menuDisp();
			m.menuSelect();
			m.menuRun();
		}
	}

}
