
import java.util.Scanner;

//���� ��� Ŭ���� (���: ��ä��, ��¹�: ��ȣ��)
class Balju_Control
{
	int cha; // -- ������ ������ ������ ��� ����(�ڵ����� ���ذ� - ���� �ִ� ���� )
	int all; // -- ������ ���� �ӽ÷� ���� ��� ����

	// ���������� ������ ��� ���� ��� ����
	static int Nbean; // ����
	static int Nmilk; // ����
	static int Nchoco; // ���ڽ÷�
	static int Nvanilla; // �ٴҶ�÷�
	static int Nhazel; // ������ӽ÷�
	static int Ncaramel; // ī���÷�
	static int Ngrapefruit; // �ڸ�
	static int Nspawater; // ź���
	static int Nyogurtpowder; // ���Ʈ�Ŀ��
	static int Nteabag; // Ƽ��
	static int Ngoguma; // ����
	static int Norange; // ������
	static int Ncake; // ����ũ
	static int Nbagel; // ���̱�
	static int Nscone; // ����
	static int Nmacaron; // ��ī��
	static int Ncookie; // ��Ű
	static int Ncreamcheese; // ũ��ġ��
	static int Nstroberryjam; // ������
	static int Nwhipcream; // ����ũ��

	// �ڵ� ���ְ� ���� ���� �޼ҵ�

	static int standard = 5; // �ڵ����ּ��� �ʱⰪ = 5

	public void setGap()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("�ڵ� ���� ������ �����ϼ���.");
		System.out.println();

		System.out.print("�ڵ� ���� ���� : ");
		standard = sc.nextInt();

	}

	// ��ü �ڵ� ���� �޼ҵ�
	public void allAuto()
	{
		// test - Ȯ��
		// System.out.println(cha);

		// ���� �ڵ�(2020.09.01)
		// �� �ڵ����� : ������ ���� ������ŭ ��ü ǰ�� ����
		// ���� �ڵ� ����
		// ���� ���� = ���� ���� ���� + ���ֱ��ذ�
		Inventory.setNbean(Inventory.getNbean() + Balju_Control.standard);

		/*
		 * // ���� �ڵ� (���ư��°ſ���) // ���� �ڵ� ���� cha =
		 * (inventory.getMilkL()-inventory.getMilk()); all = inventory.getMilk() + cha;
		 * Nmilk += all; Inventory.setNmilk(Nmilk);
		 */

		/*
		 * // ��� 12�� �ְ� ���ֱ��ذ� 30���� ��� 18�� �߰��ϴ� ��� cha =
		 * (inventory.getBeanL()-inventory.getBean()); // ���ֱ��� - �����ִ� ���� all =
		 * inventory.getBean()+cha; // ���� ���� ���� = ���� �ִ� ���� ���� + ��¥ ä������ ���� Nbean = all;
		 * // ���� ���� ������ ���ذ����� ���� Inventory.setNbean(Nbean);
		 */

		// test -- Ȯ��
		// System.out.println(cha);

		// ���� �ڵ� ����
		Inventory.setNmilk(Inventory.getNmilk() + Balju_Control.standard);

		// ���ڽ÷� �ڵ� ����
		Inventory.setNchoco(Inventory.getNchoco() + Balju_Control.standard);

		// �ٴҶ�÷� �ڵ� ����
		Inventory.setNvanilla(Inventory.getNvanilla() + Balju_Control.standard);

		// ������ӽ÷� �ڵ� ����
		Inventory.setNhazel(Inventory.getNhazel() + Balju_Control.standard);

		// ī���÷� �ڵ� ����
		Inventory.setNcaramel(Inventory.getNcaramel() + Balju_Control.standard);

		// �ڸ� �ڵ� ����
		Inventory.setNgrapefruit(Inventory.getNgrapefruit() + Balju_Control.standard);

		// ź��� �ڵ� ����
		Inventory.setNspawater(Inventory.getNspawater() + Balju_Control.standard);

		// ���Ʈ�Ŀ�� �ڵ� ����
		Inventory.setNyogurtpowder(Inventory.getNyogurtpowder() + Balju_Control.standard);

		// Ƽ�� �ڵ� ����
		Inventory.setNteabag(Inventory.getNteabag() + Balju_Control.standard);

		// ���� �ڵ� ����
		Inventory.setNgoguma(Inventory.getNgoguma() + Balju_Control.standard);

		// ������ �ڵ� ����
		Inventory.setNorange(Inventory.getNorange() + Balju_Control.standard);

		// ����ũ �ڵ� ����
		Inventory.setNcake(Inventory.getNcake() + Balju_Control.standard);

		// ���̱� �ڵ� ����
		Inventory.setNbagel(Inventory.getNbagel() + Balju_Control.standard);

		// ���� �ڵ� ����
		Inventory.setNscone(Inventory.getNscone() + Balju_Control.standard);

		// ��ī�� �ڵ� ����
		Inventory.setNmacaron(Inventory.getNmacaron() + Balju_Control.standard);

		// ��Ű �ڵ� ����
		Inventory.setNcookie(Inventory.getNcookie() + Balju_Control.standard);

		// ũ��ġ�� �ڵ� ����
		Inventory.setNcreamcheese(Inventory.getNcreamcheese() + Balju_Control.standard);

		// ������ �ڵ� ����
		Inventory.setNstroberryjam(Inventory.getNstroberryjam() + Balju_Control.standard);

		// ����ũ�� �ڵ� ����
		Inventory.setNwhipcream(Inventory.getNwhipcream() + Balju_Control.standard);

		// ���ֱݾ� ���� �޼ҵ�
		Money_Control money_control = new Money_Control();
		money_control.money_Balju(Balju_Control.standard);

		System.out.println("��ü ǰ���� �ڵ� �����Ͽ����ϴ�.");
		System.out.println();

		// ��ȣ��
		System.out.println("===================================================================");
		System.out.println("\t\t\t   ���� �� �� Ȳ��");
		System.out.println("===================================================================");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("   ����\t          ����");
		System.out.printf("��  ����\t\t  %d��%n", Inventory.getNbean()); // 1.����
		System.out.printf("��  ����\t\t  %d��%n", Inventory.getNmilk()); // 2.����
		System.out.printf("��  ���ڽ÷�\t\t  %d��%n", Inventory.getNchoco());// 3.���ڽ÷�
		System.out.printf("��  �ٴҶ�÷�\t\t  %d��%n", Inventory.getNvanilla());// 4.�ٴҶ�÷�
		System.out.printf("��  ������ӽ÷�\t  %d��%n", Inventory.getNhazel());// 5.������ӽ÷�
		System.out.printf("��  ī���÷�\t\t  %d��%n", Inventory.getNcaramel());// 6.ī���÷�
		System.out.printf("��  �ڸ�\t\t  %d��%n", Inventory.getNgrapefruit());// 7.�ڸ�
		System.out.printf("��  ź���\t\t  %d��%n", Inventory.getNspawater());// 8.ź���
		System.out.printf("��  ���Ʈ�Ŀ��\t  %d��%n", Inventory.getNyogurtpowder());// 9.���Ʈ�Ŀ��
		System.out.printf("��  Ƽ��\t\t  %d��%n", Inventory.getNteabag());// 10.Ƽ��
		System.out.printf("��  ����\t\t  %d��%n", Inventory.getNgoguma());// 11.����
		System.out.printf("��  ������\t\t  %d��%n", Inventory.getNorange());// 12.������
		System.out.printf("��  ����ũ\t\t  %d��%n", Inventory.getNcake());// 13.����ũ
		System.out.printf("��  ���̱�\t\t  %d��%n", Inventory.getNbagel());// 14.���̱�
		System.out.printf("��  ����\t\t  %d��%n", Inventory.getNscone());// 15.����
		System.out.printf("��  ��ī��\t\t  %d��%n", Inventory.getNmacaron());// 16.��ī��
		System.out.printf("��  ��Ű\t\t  %d��%n", Inventory.getNcookie());// 17.��Ű
		System.out.printf("��  ũ��ġ��\t\t  %d��%n", Inventory.getNcreamcheese());// 18.ũ��ġ��
		System.out.printf("��  ������\t\t  %d��%n", Inventory.getNstroberryjam());// 19.������
		System.out.printf("��  ����ũ��\t\t  %d��%n", Inventory.getNwhipcream());// 20.����ũ��
		System.out.println("-------------------------------------------------------------------");
		System.out.println("===================================================================");
		System.out.println();
		
		// �ڵ����ֱݾ� ���� �޼ҵ� ȣ��(2020.09.02 �߰�)
		Money_Control mc = new Money_Control();
		mc.money_Balju(Balju_Control.standard);

	}

	// �κ� �ڵ� ���� �޼ҵ�
	public void auto()
	{
		String str; // -- ǰ�� �Է¹޴� ����
		boolean flag = true; // -- do while �� �ݺ� �ߴ��� ���� ����

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.println();
			System.out.print("�ڵ� ������ ǰ���� �Է��ϼ��� (���ָ� ��ġ���� N�� �����ּ���) : ");
			str = sc.next();

			if (str.equals("����"))
			{
				// ���� ����
				Inventory.setNmilk(Inventory.getNmilk() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNmilk());
				System.out.println();
			}

			if (str.equals("����"))
			{
				// ���� ����
				Inventory.setNbean(Inventory.getNbean() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNbean());
				System.out.println();
			}

			if (str.equals("���ڽ÷�"))
			{
				// ���ڽ÷� �ڵ� ����
				Inventory.setNchoco(Inventory.getNchoco() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ���ڽ÷� ��� : " + Inventory.getNchoco());
				System.out.println();
			}
			if (str.equals("�ٴҶ�÷�"))
			{
				// �ٴҶ�÷� �ڵ� ����
				Inventory.setNvanilla(Inventory.getNvanilla() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� �ٴҶ�÷� ��� : " + Inventory.getNvanilla());
				System.out.println();
			}
			if (str.equals("������ӽ÷�"))
			{
				// ������ӽ÷� �ڵ� ����
				Inventory.setNhazel(Inventory.getNhazel() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ������ӽ÷� ��� : " + Inventory.getNhazel());
				System.out.println();
			}

			if (str.equals("ī���÷�"))
			{
				// ī���÷� �ڵ� ����
				Inventory.setNcaramel(Inventory.getNcaramel() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ī���÷� ��� : " + Inventory.getNcaramel());
				System.out.println();
			}

			if (str.equals("�ڸ�"))
			{
				// �ڸ� �ڵ� ����
				Inventory.setNgrapefruit(Inventory.getNgrapefruit() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� �ڸ� ��� : " + Inventory.getNgrapefruit());
				System.out.println();
			}

			if (str.equals("ź���"))
			{
				// ź��� �ڵ� ����
				Inventory.setNspawater(Inventory.getNspawater() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ź��� ��� : " + Inventory.getNspawater());
				System.out.println();
			}

			if (str.equals("���Ʈ�Ŀ��"))
			{
				// ���Ʈ�Ŀ�� �ڵ� ����
				Inventory.setNyogurtpowder(Inventory.getNyogurtpowder() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ���Ʈ�Ŀ�� ��� : " + Inventory.getNyogurtpowder());
				System.out.println();
			}

			if (str.equals("Ƽ��"))
			{
				// Ƽ�� �ڵ� ����
				Inventory.setNteabag(Inventory.getNteabag() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� Ƽ�� ��� : " + Inventory.getNteabag());
				System.out.println();
			}

			if (str.equals("����"))
			{
				// ���� �ڵ� ����
				Inventory.setNgoguma(Inventory.getNgoguma() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNgoguma());
				System.out.println();
			}

			if (str.equals("������"))
			{
				// ������ �ڵ� ����
				Inventory.setNorange(Inventory.getNorange() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ������ ��� : " + Inventory.getNorange());
				System.out.println();
			}

			if (str.equals("����ũ"))
			{
				// ����ũ �ڵ� ����
				Inventory.setNcake(Inventory.getNcake() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ����ũ ��� : " + Inventory.getNcake());
				System.out.println();
			}

			if (str.equals("���̱�"))
			{
				// ���̱� �ڵ� ����
				Inventory.setNbagel(Inventory.getNbagel() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ���̱� ��� : " + Inventory.getNbagel());
				System.out.println();
			}

			if (str.equals("����"))
			{
				// ���� �ڵ� ����
				Inventory.setNscone(Inventory.getNscone() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNscone());
				System.out.println();
			}

			if (str.equals("��ī��"))
			{
				// ��ī�� �ڵ� ����
				Inventory.setNmacaron(Inventory.getNmacaron() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ��ī�� ��� : " + Inventory.getNmacaron());
				System.out.println();
			}

			if (str.equals("��Ű"))
			{
				// ��Ű �ڵ� ����
				Inventory.setNcookie(Inventory.getNcookie() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ��Ű ��� : " + Inventory.getNcookie());
				System.out.println();
			}

			if (str.equals("ũ��ġ��"))
			{
				// ũ��ġ�� �ڵ� ����
				Inventory.setNcreamcheese(Inventory.getNcreamcheese() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ũ��ġ�� ��� : " + Inventory.getNcreamcheese());
				System.out.println();
			}

			if (str.equals("������"))
			{
				// ������ �ڵ� ����
				Inventory.setNstroberryjam(Inventory.getNstroberryjam() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ������ ��� : " + Inventory.getNstroberryjam());
				System.out.println();
			}

			if (str.equals("����ũ��"))
			{
				// ����ũ�� �ڵ� ����
				Inventory.setNwhipcream(Inventory.getNwhipcream() + Balju_Control.standard);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ����ũ�� ��� : " + Inventory.getNwhipcream());
				System.out.println();
			}

			if (str.equals("N"))
			{
				System.out.println("���ָ� ��Ĩ�ϴ�.");
				System.out.println();
				flag = false;
			}
		} while (flag);

		// �ڵ����ֱݾ� ���� �޼ҵ� ȣ��(2020.09.02 �߰�)
		Money_Control mc = new Money_Control();
		
		mc.money_Balju(Balju_Control.standard);

	}

	// ���� ���� �޼ҵ� - ǰ�� �����ϰ� �����ڰ� �Է��� ������ŭ ��� ����
	public void self()
	{
		String str; // -- ǰ�� �Է¹޴� ����
		int su; // -- ���� �Է¹޴� ����
		boolean flag = true; // -- do while �� �ݺ� �ߴ��� ���� ����

		Scanner sc = new Scanner(System.in);
		
		// ���� �ݾ� �ν��Ͻ� �߰�
		Balju_Price balju_price = new Balju_Price();
		
		do
		{
			System.out.println();
			System.out.print("������ ǰ���� �Է��ϼ��� (���ָ� ��ġ���� N�� �����ּ���) : ");
			str = sc.next();

			if (str.equals("����"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				// ��� �߰�
				Inventory.setNmilk(Inventory.getNmilk() + su);
				
				// ���ֱݾ� �߰� 2020.09.03 �߰�
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getMilk(), su);
				
				
				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNmilk());
			}

			if (str.equals("����"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				// ����߰�
				Inventory.setNbean(Inventory.getNbean() + su);
				
				// ���ֱݾ� �߰� 2020.09.03 �߰�
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getBean(), su);
				
				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNbean());

			}

			if (str.equals("���ڽ÷�"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNchoco(Inventory.getNchoco() + su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ���ڽ÷� ��� : " + Inventory.getNchoco());

			}

			if (str.equals("�ٴҶ�÷�"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNvanilla(Inventory.getNvanilla() + su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� �ٴҶ�÷� ��� : " + Inventory.getNvanilla());

			}

			if (str.equals("������ӽ÷�"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNhazel(Inventory.getNhazel() + su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ������ӽ÷� ��� : " + Inventory.getNhazel());

			}

			if (str.equals("ī���÷�"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNcaramel(Inventory.getNcaramel() + su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ī���÷� ��� : " + Inventory.getNcaramel());

			}

			if (str.equals("�ڸ�"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNgrapefruit(Inventory.getNgrapefruit() + su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� �ڸ� ��� : " + Inventory.getNgrapefruit());

			}

			if (str.equals("ź���"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNspawater(Inventory.getNspawater() + su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ź��� ��� : " + Inventory.getNspawater());

			}

			if (str.equals("���Ʈ�Ŀ��"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNyogurtpowder(Inventory.getNyogurtpowder() + su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ���Ʈ�Ŀ�� ��� : " + Inventory.getNyogurtpowder());

			}

			if (str.equals("Ƽ��"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNteabag(Inventory.getNteabag() + su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� Ƽ�� ��� : " + Inventory.getNteabag());

			}

			if (str.equals("����"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNgoguma(Inventory.getNgoguma() + su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNgoguma());

			}

			if (str.equals("������"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNorange(Inventory.getNorange() + su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ������ ��� : " + Inventory.getNorange());

			}

			if (str.equals("����ũ"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				System.out.println();
				Inventory.setNcake(Inventory.getNcake() + su);
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ����ũ ��� : " + Inventory.getNcake());

			}

			if (str.equals("���̱�"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNbagel(Inventory.getNbagel() + su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ���̱� ��� : " + Inventory.getNbagel());

			}

			if (str.equals("����"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNscone(Inventory.getNscone() + su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNscone());

			}

			if (str.equals("��ī��"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNmacaron(Inventory.getNmacaron() + su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ��ī�� ��� : " + Inventory.getNmacaron());

			}

			if (str.equals("��Ű"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNcookie(Inventory.getNcookie() + su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ��Ű ��� : " + Inventory.getNcookie());

			}

			if (str.equals("ũ��ġ��"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNcreamcheese(Inventory.getNcreamcheese() + su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ũ��ġ�� ��� : " + Inventory.getNcreamcheese());

			}

			if (str.equals("������"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNstroberryjam(Inventory.getNstroberryjam() + su);
				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ������ ��� : " + Inventory.getNstroberryjam());

			}

			if (str.equals("����ũ��"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNwhipcream(Inventory.getNwhipcream() + su);
				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n", str);
				System.out.println();
				System.out.println("���� ����ũ�� ��� : " + Inventory.getNwhipcream());

			}

			if (str.equals("N"))
			{
				System.out.println();
				System.out.println("���ָ� ��Ĩ�ϴ�.");
				System.out.println();
				flag = false;
			}

		} while (flag);

		Money_Control mc = new Money_Control();

		// �������ֱݾ� ���� �޼ҵ� �߰����� 
		//

	}

	// ���� �����ϰ� �������� ���ư��� �޼ҵ�
	public void exit()
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