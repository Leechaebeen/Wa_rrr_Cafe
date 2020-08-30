
import java.util.Scanner;


//���� ��� Ŭ���� (���: ��ä��, ��¹�: ��ȣ��)
class Balju_Control	
{
	int cha;	//-- ������ ������ ������ ��� ����(�ڵ����� ���ذ� - ���� �ִ� ���� )  
	int all;	//-- ������ ���� �ӽ÷� ���� ��� ����
	
	// ���������� ������ ��� ���� ��� ����
	static int Nbean;			// ����
	static int Nmilk;			// ����
	static int Nchoco;			// ���ڽ÷�
	static int Nvanilla;		// �ٴҶ�÷�
	static int Nhazel;			// ������ӽ÷�
	static int Ncaramel;		// ī���÷�
	static int Ngrapefruit;		// �ڸ�
	static int Nspawater;		// ź���
	static int Nyogurtpowder;	// ���Ʈ�Ŀ��
	static int Nteabag;			// Ƽ��
	static int Ngoguma;			// ����
	static int Norange;			// ������
	static int Ncake;			// ����ũ
	static int Nbagel;			// ���̱�
	static int Nscone;			// ����
	static int Nmacaron;		// ��ī��
	static int Ncookie;			// ��Ű
	static int Ncreamcheese;	// ũ��ġ��
	static int Nstroberryjam;	// ������
	static int Nwhipcream;		// ����ũ��
	
	// �ڵ� ���ְ� ���� ���� �޼ҵ� - ǰ�񸶴� ���ְ� �Է� �ޱ� 
	public void setGap()
	{	
		Scanner sc = new Scanner(System.in);
		Inventory inventory = new Inventory();
		
		System.out.println("�ڵ� ���ְ��� �����ϼ���.");
		System.out.println();

		System.out.print("���� ���ذ� : ");
		int standard = sc.nextInt();

		inventory.setBeanL(standard);	//1.����
		inventory.setMilkL(standard);	//2.����
		inventory.setChocoL(standard);	//3.���ڽ÷�
		inventory.setVanillaL(standard);	//4.�ٴҶ�÷�
		inventory.setHazelL(standard);//5.������ӽ÷�
		inventory.setCaramelL(standard);//6.ī���÷�
		inventory.setGrapefruitL(standard);//7.�ڸ�
		inventory.setSpawaterL(standard);//8.ź���
		inventory.setYogurtpowderL(standard);//9.���Ʈ�Ŀ��
		inventory.setTeabagL(standard);//10.Ƽ��
		inventory.setGogumaL(standard);//11.����
		inventory.setOrangeL(standard);//12.������
		inventory.setCakeL(standard);//13.����ũ
		inventory.setBagelL(standard);//14.���̱�
		inventory.setSconeL(standard);//15.����
		inventory.setMacaronL(standard);//16.��ī��
		inventory.setCookieL(standard);//17.��Ű
		inventory.setCreamcheeseL(standard);//18.ũ��ġ��
		inventory.setStroberryjamL(standard);//19.������
		inventory.setWhipcreamL(standard);//20.����ũ��
		 
	}

	// ��ü �ڵ� ���� �޼ҵ� 
	public void allAuto()
	{
		Inventory inventory = new Inventory();

		//test - Ȯ�� 
		//System.out.println(cha);
		
		// ���� �ڵ� ���� 
		cha = (inventory.getBeanL()-inventory.getBean());	// ���� �ڵ� �������� �� ��¥ ä������ ����	
		all = inventory.getBean()+cha;						// ���� ���� ���� = ���� �ִ� ���� ���� + ��¥ ä������ ���� 
		Nbean += all;										// ���� ���� ������ �����ؼ� ���� Nbean �� ��´�
		Inventory.setNbean(Nbean);							// ���� ������ ���� ������ �ִ´�
		//test -- Ȯ��
		//System.out.println(cha); 

		// ���� �ڵ� ����
		cha = (inventory.getMilkL()-inventory.getMilk());	 
		all	=  inventory.getMilk() + cha;
		Nmilk += all;				
		Inventory.setNmilk(Nmilk);
		
		// ���ڽ÷� �ڵ� ����
		cha = (inventory.getChocoL()-inventory.getChoco());	
		all = inventory.getChoco()+cha;
		Nchoco += all;
		Inventory.setNchoco(Nchoco);

		// �ٴҶ�÷� �ڵ� ����
		cha = (inventory.getVanillaL()-inventory.getVanilla());	
		all = inventory.getVanilla()+cha;
		Nvanilla += all;
		Inventory.setNvanilla(Nvanilla);
		
		// ������ӽ÷� �ڵ� ����
		cha = (inventory.getHazelL()-inventory.getHazel());	
		all = inventory.getHazel()+cha;
		Nhazel += all;
		Inventory.setNhazel(Nhazel);

		// ī���÷� �ڵ� ����
		cha = (inventory.getCaramelL()-inventory.getCaramel());	
		all = inventory.getCaramel()+cha;
		Ncaramel += all;
		Inventory.setNcaramel(Ncaramel);

		// �ڸ� �ڵ� ����
		cha = (inventory.getGrapefruitL()-inventory.getGrapefruit());
		all = inventory.getGrapefruit()+cha;
		Ngrapefruit += all;
		Inventory.setNgrapefruit(Ngrapefruit);

		// ź��� �ڵ� ����
		cha = (inventory.getSpawaterL()-inventory.getSpawater());	
		all = inventory.getSpawater()+cha;
		Nspawater += all;
		Inventory.setNspawater(Nspawater);

		// ���Ʈ�Ŀ�� �ڵ� ����
		cha = (inventory.getYogurtpowderL()-inventory.getYogurtpowder());	
		all = inventory.getYogurtpowder()+cha;
		Nyogurtpowder += all;
		Inventory.setNyogurtpowder(Nyogurtpowder);

		// Ƽ�� �ڵ� ����
		cha = (inventory.getTeabagL()-inventory.getTeabag());	
		all = inventory.getTeabag()+cha;
		Nteabag += all;
		Inventory.setNteabag(Nteabag);
		
		// ���� �ڵ� ����
		cha = (inventory.getGogumaL()-inventory.getGoguma());	
		all = inventory.getGoguma()+cha;
		Ngoguma += all;
		Inventory.setNgoguma(Ngoguma);
		
		// ������ �ڵ� ����
		cha = (inventory.getOrangeL()-inventory.getOrange());
		all = inventory.getOrange()+cha;
		Norange += all;
		Inventory.setNorange(Norange);

		// ����ũ �ڵ� ����
		cha = (inventory.getCakeL()-inventory.getCake());
		all = inventory.getCake()+cha;
		Ncake += all;
		Inventory.setNcake(Ncake);

		// ���̱� �ڵ� ����
		cha = (inventory.getBagelL()-inventory.getBagel());
		all = inventory.getBagel()+cha;
		Nbagel += all;
		Inventory.setNbagel(Nbagel);
		
		// ���� �ڵ� ����
		cha = (inventory.getSconeL()-inventory.getScone());	
		all = inventory.getScone()+cha;
		Nscone += all;
		Inventory.setNscone(Nscone);
		
		// ��ī�� �ڵ� ����
		cha = (inventory.getMacaronL()-inventory.getMacaron());	
		all = inventory.getMacaron()+cha;
		Nmacaron += all;
		Inventory.setNmacaron(Nmacaron);
		
		// ��Ű �ڵ� ����
		cha = (inventory.getCookieL()-inventory.getCookie());	
		all = inventory.getCookie()+cha;
		Ncookie += all;
		Inventory.setNcookie(Ncookie);
		
		// ũ��ġ�� �ڵ� ����
		cha = (inventory.getCreamcheeseL()-inventory.getCreamcheese());	
		all = inventory.getCreamcheese()+cha;
		Ncreamcheese += all;
		Inventory.setNcreamcheese(Ncreamcheese);
		
		// ������ �ڵ� ����
		cha = (inventory.getStroberryjamL()-inventory.getStroberryjam());	
		all = inventory.getStroberryjam()+cha;
		Nstroberryjam += all;
		Inventory.setNstroberryjam(Nstroberryjam);

		// ����ũ�� �ڵ� ����
		cha = (inventory.getWhipcreamL()-inventory.getWhipcream());	
		all = inventory.getWhipcream()+cha;
		Nwhipcream += all;
		Inventory.setNwhipcream(Nwhipcream);
	
		System.out.println("��ü ǰ���� �ڵ� �����Ͽ����ϴ�.");
		System.out.println();
		

	  // ��ȣ��
	  System.out.println("===================================================================");
      System.out.println("\t\t\t   ���� �� �� Ȳ��");
	  System.out.println("===================================================================");
      System.out.println("-------------------------------------------------------------------");
	  System.out.println("   ����\t          ����");
	  System.out.printf("��  ����\t\t  %d��%n", Inventory.getNbean()); //1.����
	  System.out.printf("��  ����\t\t  %d��%n", Inventory.getNmilk()); //2.����
	  System.out.printf("��  ���ڽ÷�\t\t  %d��%n",Inventory.getNchoco());//3.���ڽ÷�
	  System.out.printf("��  �ٴҶ�÷�\t\t  %d��%n",Inventory.getNvanilla());//4.�ٴҶ�÷�
	  System.out.printf("��  ������ӽ÷�\t  %d��%n",Inventory.getNhazel());//5.������ӽ÷�
	  System.out.printf("��  ī���÷�\t\t  %d��%n",Inventory.getNcaramel());//6.ī���÷�
	  System.out.printf("��  �ڸ�\t\t  %d��%n",Inventory.getNgrapefruit());//7.�ڸ�
	  System.out.printf("��  ź���\t\t  %d��%n",Inventory.getNspawater());//8.ź���
	  System.out.printf("��  ���Ʈ�Ŀ��\t  %d��%n",Inventory.getNyogurtpowder());//9.���Ʈ�Ŀ��
	  System.out.printf("��  Ƽ��\t\t  %d��%n",Inventory.getNteabag());//10.Ƽ��
	  System.out.printf("��  ����\t\t  %d��%n",Inventory.getNgoguma());//11.����
	  System.out.printf("��  ������\t\t  %d��%n",Inventory.getNorange());//12.������
	  System.out.printf("��  ����ũ\t\t  %d��%n",Inventory.getNcake());//13.����ũ
	  System.out.printf("��  ���̱�\t\t  %d��%n",Inventory.getNbagel());//14.���̱�
	  System.out.printf("��  ����\t\t  %d��%n",Inventory.getNscone());//15.����
	  System.out.printf("��  ��ī��\t\t  %d��%n",Inventory.getNmacaron());//16.��ī��
	  System.out.printf("��  ��Ű\t\t  %d��%n",Inventory.getNcookie());//17.��Ű
	  System.out.printf("��  ũ��ġ��\t\t  %d��%n",Inventory.getNcreamcheese());//18.ũ��ġ��
	  System.out.printf("��  ������\t\t  %d��%n",Inventory.getNstroberryjam());//19.������
	  System.out.printf("��  ����ũ��\t\t  %d��%n",Inventory.getNwhipcream());//20.����ũ��
	  System.out.println("-------------------------------------------------------------------");
	  System.out.println("===================================================================");
	  System.out.println();

		Money_Control mc = new Money_Control();

		mc.money_Balju();

	}
	
	// �κ� �ڵ� ���� �޼ҵ�
	public void auto()
	{
		String str;				//-- ǰ�� �Է¹޴� ����
		int cha;				//-- ���� ���� �Է¹޴� ���� 
		boolean flag = true;	//-- do while �� �ݺ� �ߴ��� ���� ���� 
		
		Inventory inventory = new Inventory();
		Scanner sc = new Scanner(System.in);
		
		do 
		{	
			System.out.println();
			System.out.print("�ڵ� ������ ǰ���� �Է��ϼ��� (���ָ� ��ġ���� N�� �����ּ���) : ");
			str = sc.next();
			
			if(str.equals("����"))
			{
				// ���� ����
				cha = (inventory.getMilkL()-inventory.getMilk());	 
				all	=  inventory.getMilk() + cha;
				Nmilk += all;				
				Inventory.setNmilk(Nmilk);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNmilk());
				System.out.println();
			}
			
			if(str.equals("����"))
			{	
				// ���� ���� 
				cha = (inventory.getBeanL()-inventory.getBean());	
				all = inventory.getBean()+cha;	
				Nbean += all;					
				Inventory.setNbean(Nbean);
		
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNbean());	
				System.out.println();
			}

			if(str.equals("���ڽ÷�"))
			{
				// ���ڽ÷� �ڵ� ����
				cha = (inventory.getChocoL()-inventory.getChoco());	
				all = inventory.getChoco()+cha;
				Nchoco += all;
				Inventory.setNchoco(Nchoco);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ���ڽ÷� ��� : " + Inventory.getNchoco());	
				System.out.println();
			}
			if(str.equals("�ٴҶ�÷�"))
			{
				// �ٴҶ�÷� �ڵ� ����
				cha = (inventory.getVanillaL()-inventory.getVanilla());	
				all = inventory.getVanilla()+cha;
				Nvanilla += all;
				Inventory.setNvanilla(Nvanilla);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� �ٴҶ�÷� ��� : " + Inventory.getNvanilla());	
				System.out.println();
			}
			if(str.equals("������ӽ÷�"))
			{
				// ������ӽ÷� �ڵ� ����
				cha = (inventory.getHazelL()-inventory.getHazel());	
				all = inventory.getHazel()+cha;
				Nhazel += all;
				Inventory.setNhazel(Nhazel);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ������ӽ÷� ��� : " + Inventory.getNhazel());	
				System.out.println();
			}

			if(str.equals("ī���÷�"))
			{
				// ī���÷� �ڵ� ����
				cha = (inventory.getCaramelL()-inventory.getCaramel());	
				all = inventory.getCaramel()+cha;
				Ncaramel += all;
				Inventory.setNcaramel(Ncaramel);
	
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ī���÷� ��� : " + Inventory.getNcaramel());	
				System.out.println();
			}

			if(str.equals("�ڸ�"))
			{
				// �ڸ� �ڵ� ����
				cha = (inventory.getGrapefruitL()-inventory.getGrapefruit());
				all = inventory.getGrapefruit()+cha;
				Ngrapefruit += all;
				Inventory.setNgrapefruit(Ngrapefruit);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� �ڸ� ��� : " + Inventory.getNgrapefruit());
				System.out.println();
			}

			if(str.equals("ź���"))
			{
				// ź��� �ڵ� ����	
				cha = (inventory.getSpawaterL()-inventory.getSpawater());	
				all = inventory.getSpawater()+cha;
				Nspawater += all;
				Inventory.setNspawater(Nspawater);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ź��� ��� : " + Inventory.getNspawater());
				System.out.println();
			}

			if(str.equals("���Ʈ�Ŀ��"))
			{
				// ���Ʈ�Ŀ�� �ڵ� ����
				cha = (inventory.getYogurtpowderL()-inventory.getYogurtpowder());	
				all = inventory.getYogurtpowder()+cha;
				Nyogurtpowder += all;
				Inventory.setNyogurtpowder(Nyogurtpowder);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ���Ʈ�Ŀ�� ��� : " + Inventory.getNyogurtpowder());
				System.out.println();
			}

			if(str.equals("Ƽ��"))
			{
				// Ƽ�� �ڵ� ����
				cha = (inventory.getTeabagL()-inventory.getTeabag());	
				all = inventory.getTeabag()+cha;
				Nteabag += all;
				Inventory.setNteabag(Nteabag);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� Ƽ�� ��� : " + Inventory.getNteabag());
				System.out.println();
			}

				if(str.equals("����"))
			{
				// ���� �ڵ� ����
				cha = (inventory.getGogumaL()-inventory.getGoguma());	
				all = inventory.getGoguma()+cha;
				Ngoguma += all;
				Inventory.setNgoguma(Ngoguma);
		
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNgoguma());
				System.out.println();
			}

				if(str.equals("������"))
			{
				// ������ �ڵ� ����
				cha = (inventory.getOrangeL()-inventory.getOrange());
				all = inventory.getOrange()+cha;
				Norange += all;
				Inventory.setNorange(Norange);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ������ ��� : " + Inventory.getNorange());
				System.out.println();
			}

				if(str.equals("����ũ"))
			{
				// ����ũ �ڵ� ����
				cha = (inventory.getCakeL()-inventory.getCake());
				all = inventory.getCake()+cha;
				Ncake += all;
				Inventory.setNcake(Ncake);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ����ũ ��� : " + Inventory.getNcake());
				System.out.println();
			}

				if(str.equals("���̱�"))
			{
				// ���̱� �ڵ� ����
				cha = (inventory.getBagelL()-inventory.getBagel());
				all = inventory.getBagel()+cha;
				Nbagel += all;
				Inventory.setNbagel(Nbagel);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ���̱� ��� : " + Inventory.getNbagel());
				System.out.println();
			}

				if(str.equals("����"))
			{
				// ���� �ڵ� ����
				cha = (inventory.getSconeL()-inventory.getScone());	
				all = inventory.getScone()+cha;
				Nscone += all;
				Inventory.setNscone(Nscone);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNscone());
				System.out.println();
			}

				if(str.equals("��ī��"))
			{
				// ��ī�� �ڵ� ����
				cha = (inventory.getMacaronL()-inventory.getMacaron());	
				all = inventory.getMacaron()+cha;
				Nmacaron += all;
				Inventory.setNmacaron(Nmacaron);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ��ī�� ��� : " + Inventory.getNmacaron());
				System.out.println();
			}

				if(str.equals("��Ű"))
			{
				// ��Ű �ڵ� ����
				cha = (inventory.getCookieL()-inventory.getCookie());	
				all = inventory.getCookie()+cha;
				Ncookie += all;
				Inventory.setNcookie(Ncookie);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ��Ű ��� : " + Inventory.getNcookie());
				System.out.println();
			}

				if(str.equals("ũ��ġ��"))
			{
				// ũ��ġ�� �ڵ� ����
				cha = (inventory.getCreamcheeseL()-inventory.getCreamcheese());	
				all = inventory.getCreamcheese()+cha;
				Ncreamcheese += all;
				Inventory.setNcreamcheese(Ncreamcheese);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ũ��ġ�� ��� : " + Inventory.getNcreamcheese());
				System.out.println();
			}

				if(str.equals("������"))
			{
				// ������ �ڵ� ����
				cha = (inventory.getStroberryjamL()-inventory.getStroberryjam());	
				all = inventory.getStroberryjam()+cha;
				Nstroberryjam += all;
				Inventory.setNstroberryjam(Nstroberryjam);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ������ ��� : " + Inventory.getNstroberryjam());
				System.out.println();
			}
			
				if(str.equals("����ũ��"))
			{
				// ����ũ�� �ڵ� ����
				cha = (inventory.getWhipcreamL()-inventory.getWhipcream());	
				all = inventory.getWhipcream()+cha;
				Nwhipcream += all;
				Inventory.setNwhipcream(Nwhipcream);

				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ����ũ�� ��� : " + Inventory.getNwhipcream());
				System.out.println();
			}

			
			if(str.equals("N"))
			{
				System.out.println("���ָ� ��Ĩ�ϴ�.");
				System.out.println();
				flag = false;
			}
		}
		while(flag);

		Money_Control mc = new Money_Control();

		mc.money_Balju();
			
	}


	// ���� ���� �޼ҵ� - ǰ�� �����ϰ� �����ڰ� �Է��� ������ŭ ��� ���� 
	public void self()
	{	
		String str;				//-- ǰ�� �Է¹޴� ����
		int su;					//-- ���� �Է¹޴� ����
		boolean flag = true;	//-- do while �� �ݺ� �ߴ��� ���� ����
	
		
		Scanner sc = new Scanner(System.in);

		do
		{	
			System.out.println();
			System.out.print("������ ǰ���� �Է��ϼ��� (���ָ� ��ġ���� N�� �����ּ���) : ");
			str = sc.next();
			
			if(str.equals("����"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNmilk(Inventory.getNmilk()+su);
				
				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNmilk());
			}
			

			if(str.equals("����"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				
				Inventory.setNbean(Inventory.getNbean()+su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNbean());	
				
			}

			if(str.equals("���ڽ÷�"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNchoco(Inventory.getNchoco()+su);
				
				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ���ڽ÷� ��� : " + Inventory.getNchoco());	
				
			}

			if(str.equals("�ٴҶ�÷�"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNvanilla(Inventory.getNvanilla()+su);
				
				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� �ٴҶ�÷� ��� : " + Inventory.getNvanilla());	
				
			}

			if(str.equals("������ӽ÷�"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNhazel(Inventory.getNhazel()+su);
				
				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ������ӽ÷� ��� : " + Inventory.getNhazel());	
				
			}

			if(str.equals("ī���÷�"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNcaramel(Inventory.getNcaramel()+su);
				
				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ī���÷� ��� : " + Inventory.getNcaramel());	
				
			}

			if(str.equals("�ڸ�"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNgrapefruit(Inventory.getNgrapefruit()+su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� �ڸ� ��� : " + Inventory.getNgrapefruit());
				
			}

			if(str.equals("ź���"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNspawater(Inventory.getNspawater()+su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ź��� ��� : " + Inventory.getNspawater());
				
			}

			if(str.equals("���Ʈ�Ŀ��"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();
				
				Inventory.setNyogurtpowder(Inventory.getNyogurtpowder()+su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ���Ʈ�Ŀ�� ��� : " + Inventory.getNyogurtpowder());
				
			}

			if(str.equals("Ƽ��"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();
			
				Inventory.setNteabag(Inventory.getNteabag()+su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� Ƽ�� ��� : " + Inventory.getNteabag());
				
			}

			if(str.equals("����"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNgoguma(Inventory.getNgoguma()+su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNgoguma());
				
			}

			if(str.equals("������"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNorange(Inventory.getNorange()+su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ������ ��� : " + Inventory.getNorange());
				
			}

			if(str.equals("����ũ"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();
				
				System.out.println();
				Inventory.setNcake(Inventory.getNcake()+su);
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ����ũ ��� : " + Inventory.getNcake());
				
			}

			if(str.equals("���̱�"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNbagel(Inventory.getNbagel()+su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ���̱� ��� : " + Inventory.getNbagel());
				
			}

			if(str.equals("����"))
			{
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNscone(Inventory.getNscone()+su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ���� ��� : " + Inventory.getNscone());
				
			}

			if(str.equals("��ī��"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();
		
				Inventory.setNmacaron(Inventory.getNmacaron()+su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ��ī�� ��� : " + Inventory.getNmacaron());
				
			}

			if(str.equals("��Ű"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNcookie(Inventory.getNcookie()+su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ��Ű ��� : " + Inventory.getNcookie());
				
			}

			if(str.equals("ũ��ġ��"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNcreamcheese(Inventory.getNcreamcheese()+su);

				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ũ��ġ�� ��� : " + Inventory.getNcreamcheese());
				
			}

			if(str.equals("������"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNstroberryjam(Inventory.getNstroberryjam()+su);
				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ������ ��� : " + Inventory.getNstroberryjam());
				
			}
			
			if(str.equals("����ũ��"))
			{	
				System.out.println();
				System.out.print("������ ������ �Է��ϼ���: ");
				su = sc.nextInt();

				Inventory.setNwhipcream(Inventory.getNwhipcream()+su);
				System.out.println();
				System.out.printf("%s ���ְ� �Ϸ�Ǿ����ϴ�.\n",str);
				System.out.println();
				System.out.println("���� ����ũ�� ��� : " + Inventory.getNwhipcream());
				
			}


			if(str.equals("N"))
			{
				System.out.println();
				System.out.println("���ָ� ��Ĩ�ϴ�.");
				System.out.println();
				flag = false;
			}
			
		}
		while(flag);

		Money_Control mc = new Money_Control();

		mc.money_Balju();
			
	}

	// ���� �����ϰ� �������� ���ư��� �޼ҵ� 
	public void exit(){
	ManagerMenu m = new ManagerMenu();
	while (true)
	{
	   m.menuDisp();
	   m.menuSelect();
	   m.menuRun();
	}
}


}