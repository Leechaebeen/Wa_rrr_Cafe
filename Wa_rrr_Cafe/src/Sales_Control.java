
import java.util.*;

//�Ǹŷ� �� ����� ��� Ŭ����(��ä��, ���Ѻ�, ��ȣ��)
class Sales_Control 
{

	Calendar cal = Calendar.getInstance();

	   int year =  cal.get(Calendar.YEAR);
	   int month = cal.get(Calendar.MONTH) + 1;
	   int date =  cal.get(Calendar.DATE);
	

	   Money m = new Money();
	   Money_Control mc = new Money_Control();
	   Change c = new Change();
	   
	//�Ϻ� ���� ��� �޼ҵ�(��ȣ��)
	  public void sales_day_Lookup() 
      {

       System.out.println();
        System.out.println("===================================================================");
       //System.out.printf("\t\t\t    %d�� %d�� %d��%n",today[0],today[1],today[2]);


       System.out.println("===================================================================");
        System.out.println("\t\t\t   ���޴��� �Ǹŷ���");
        System.out.println("===================================================================");
		System.out.printf("%61d-%d-%d\n",year,month, date  + TestCalendar.datePlus);
       System.out.println("-------------------------------------------------------------------");
       System.out.println("   Coffee��\t       �Ǹŷ�");
        System.out.printf("��  ����������\t\t  %d��\n",Sales.getSespresso());
        System.out.printf("��  �Ƹ޸�ī��\t\t  %d��\n",Sales.getSamericano());
        System.out.printf("��  ī���\t\t  %d��\n",Sales.getSlatte());
        System.out.printf("��  īǪġ��\t\t  %d��\n",Sales.getScappuccino());
        System.out.printf("��  ī���ī\t\t  %d��\n",Sales.getScafeMoca());
        System.out.printf("��  �ٴҶ��\t\t  %d��\n",Sales.getSvanillaLatte());
        System.out.printf("��  ī��Ḷ���ƶ�\t  %d��\n",Sales.getScaramelM());
       System.out.println();
       System.out.println("   NonCoffee��");
        System.out.printf("��  �ڸ����̵�\t\t  %d��\n",Sales.getSjamongAde());
        System.out.printf("��  ���Ʈ������\t  %d��\n",Sales.getSyogurt());
        System.out.printf("��  ����Ŀ��Ƽ\t  %d��\n",Sales.getStea());
        System.out.printf("��  ������\t\t  %d��\n",Sales.getSgogumaLatte());
        System.out.printf("��  �������꽺\t\t  %d��\n",Sales.getSorangeJuice());
       System.out.println();
       System.out.println("   Dessert��");
        System.out.printf("��  ����ũ\t\t  %d��\n",Sales.getScake());
        System.out.printf("��  ��ī��\t\t  %d��\n",Sales.getSmacaron());
        System.out.printf("��  ����\t\t  %d��\n",Sales.getSscone());
        System.out.printf("��  ���̱�\t\t  %d��\n",Sales.getSbagel());
        System.out.printf("��  ��Ű\t\t  %d��\n",Sales.getScookie());
       System.out.println("-------------------------------------------------------------------");
        System.out.println("===================================================================");
       System.out.println("\t\t\t   ���� �� �� Ȳ��");
       System.out.println("===================================================================");
        System.out.printf("�� ��  ��  ��  ��\t  %d��%n",c.getChange());         //�Ž������� �󸶳� �ִ��� Ȯ���ϱ� ���� ��¹� 
        System.out.printf("�� ��  ��  ��  ��\t  %d��%n",m.getBill_SalesD());         // �� ���ݸ��� ���� ��¹�
        System.out.printf("�� ī  ��  ��  ��\t  %d��%n",m.getCard_SalesD());         // �� ī����� ���� ��¹�
        System.out.printf("��   ��    ��  ��\t  %d��%n",m.getBill_SalesD() + m.getCard_SalesD() - c.getChange()); // �Ѽ��� ��¹�
        System.out.printf("�� ��  ��  ��  ��\t  %d��%n",m.getBalju_moneyD());         // �� ���ֱݾ��� ��¹�
        System.out.printf("�� ������  ��  ��\t  %d��%n",mc.money_Profit());   // �� ������ �ݾ� Ȯ�� ��¹�
        System.out.println("===================================================================");
       System.out.println();
      }

	  // ������� �Ѹ��� ��� �޼ҵ�(��ȣ��)
            public void sales_month_Lookup() // ������� �Ѹ��� ���
      {
        Money m = new Money();
        Sales s = new Sales();

        Money_Control mc = new Money_Control();
        // ���� ī�� ����� ȣ�� (����~ ���ݱ����� ����)
         
         System.out.println();
        System.out.println("===================================================================");
		
        System.out.println("===================================================================");
        System.out.println("\t\t\t   ���޴��� �Ǹŷ���");
        System.out.println("===================================================================");
		System.out.printf(" %39d-%d-%d ���� ~ %d-%d-%d ����\n",year,month,date,year,month,date+TestCalendar.datePlus);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("   Coffee��\t       �Ǹŷ�");
        System.out.printf("��  ����������\t\t  %d��\n",Sales.saveEspresso);
        System.out.printf("��  �Ƹ޸�ī��\t\t  %d��\n",Sales.saveAmericano);
        System.out.printf("��  ī���\t\t  %d��\n",Sales.saveLatte);
        System.out.printf("��  īǪġ��\t\t  %d��\n",Sales.saveCappuccino);
        System.out.printf("��  ī���ī\t\t  %d��\n",Sales.saveCafeMoca);
        System.out.printf("��  �ٴҶ��\t\t  %d��\n",Sales.saveVanillaLatte);
        System.out.printf("��  ī��Ḷ���ƶ�\t  %d��\n",Sales.saveCaramelM);
       System.out.println();
       System.out.println("   NonCoffee��");
        System.out.printf("��  �ڸ����̵�\t\t  %d��\n",Sales.saveJamongAde);
        System.out.printf("��  ���Ʈ������\t  %d��\n",Sales.saveYogurt);
        System.out.printf("��  ����Ŀ��Ƽ\t  %d��\n",Sales.saveTea);
        System.out.printf("��  ������\t\t  %d��\n",Sales.saveGogumaLatte);
        System.out.printf("��  �������꽺\t\t  %d��\n",Sales.saveOrangeJuice);
       System.out.println();
       System.out.println("   Dessert��");
        System.out.printf("��  ����ũ\t\t  %d��\n",Sales.saveCake);
        System.out.printf("��  ��ī��\t\t  %d��\n",Sales.saveMacaron);
        System.out.printf("��  ����\t\t  %d��\n",Sales.saveScone);
        System.out.printf("��  ���̱�\t\t  %d��\n",Sales.saveBagel);
        System.out.printf("��  ��Ű\t\t  %d��\n",Sales.saveCookie);
       System.out.println("-------------------------------------------------------------------");
        System.out.println("===================================================================");
       System.out.println("\t\t\t   ���� �� �� Ȳ��");
       System.out.println("===================================================================");
        //System.out.printf("�� ��  ��  ��  ��\t  %d��%n",c.getChange());         //�Ž������� �󸶳� �ִ��� Ȯ���ϱ� ���� ��¹� 
        System.out.printf("�� ��  ��  ��  ��\t  %d��%n",m.getBill_SalesM());         // �� ���ݸ��� ���� ��¹�
        System.out.printf("�� ī  ��  ��  ��\t  %d��%n",m.getCard_SalesM());         // �� ī����� ���� ��¹�
        System.out.printf("��   ��    ��  ��\t  %d��%n",m.getBill_SalesM() + m.getCard_SalesM()); // �Ѽ��� ��¹�
        System.out.printf("�� ��  ��  ��  ��\t  %d��%n",m.getBalju_moneyM());         // �� ���ֱݾ��� ��¹�
        System.out.printf("�� ������  ��  ��\t  %d��%n",m.getBill_SalesM() + m.getCard_SalesM()-m.getBalju_moneyM());   // �� ������ �ݾ� Ȯ�� ��¹�
        System.out.println("===================================================================");
       System.out.println();
        
      }
	 
	// ������ ���� ���ư��� �޼ҵ� 
	public void sales_Inventory()	
	{
		ManagerMenu m = new ManagerMenu();

		 while (true)
		 {
			 m.menuDisp();
			 m.menuSelect();
			 m.menuRun();
		 }
	}

	// �Ǹŷ� ���� �޼ҵ�(��ä��) - �ڷᱸ�� �ʱ�ȭ �Ǳ����� ������ Ŭ�������� ȣ�� (������ ���� �Ǹŷ� ����) 
	public void sales_Cal()
	{
		Iterator<Cafe_Select> it = Cafe_Menus.cafe_select.iterator(); //    cafe_select �� ����Ǿ��ִ� <Cafe_Select> Ÿ�� ��ü  
		
		while(it.hasNext())   // ��ü�� ���� ������ �ݺ�       
		{
			Object obj = it.next();   // <Cafe_Select> Ÿ�� ��ü�� �����´�
			 Cafe_Select cafe_select = (Cafe_Select)obj;
				 
				if(cafe_select.getCategory() == 1) //ī�װ����� 1�̶��...Ŀ��
				{

					switch(cafe_select.getMain()) 
					{
						 case 1 : Sales.setSespresso(Sales.getSespresso()+1); break;
								 
						 case 2 : Sales.setSamericano(Sales.getSamericano()+1); break;
											  
						 case 3 : Sales.setSlatte(Sales.getSlatte()+1); break;
							
						 case 4 : Sales.setScafeMoca(Sales.getScafeMoca()+1);break;
								
						 case 5 : Sales.setScappuccino(Sales.getScappuccino()+1);break;

						 case 6 : Sales.setSvanillaLatte(Sales.getSvanillaLatte()+1);break; 

						 case 7 : Sales.setScaramelM(Sales.getScaramelM()+1);break;
					}
					
				}else if(cafe_select.getCategory() == 2) //2������ ��Ŀ��
				{
					switch(cafe_select.getMain())
					{
						case 1 : Sales.setSjamongAde(Sales.getSjamongAde()+1);break; 
									
						case 2 : Sales.setSyogurt(Sales.getSyogurt()+1);break; 
			 
						case 3 : Sales.setStea(Sales.getStea()+1);break;  
 
					    case 4 : Sales.setSorangeJuice(Sales.getSorangeJuice()+1); break;
					
					    case 5 : Sales.setSgogumaLatte(Sales.getSgogumaLatte()+1); break;
					}
				}else if(cafe_select.getCategory() == 3)//3������ ����Ʈ
				{
					switch(cafe_select.getMain())
					{
						
						case 1 : Sales.setScake(Sales.getScake()+1); break;
								
					    case 2 : Sales.setSbagel(Sales.getSbagel()+1); break;
										  
					    case 3 : Sales.setSscone(Sales.getSscone()+1); break;
											  
					    case 4 : Sales.setSmacaron(Sales.getSmacaron()+1); break;
										
					    case 5 : Sales.setScookie(Sales.getScookie()+1); break;
								
					}
				
				}

		}// while �� end

		// ���� �Ǹŷ� ���̵��� �ؾ��� 

	}

	static int sEspresso, sAmericano, sLatte, sCafeMoca, sCappuccino, sVanillaLatte, sCaramelM;
	static int sJamongAde, sYogurt, sTea, sOrangeJuice, sGogumaLatte;
	static int sCake, sBagel, sScone, sMacaron, sCookie;

	int all;
	
	// �� �Ǹŷ� ���� ���� �޼ҵ�(���Ѻ�)	
	public void saveSales()
	{
		Cafe_Menus.cafe_select.clear();

		  // �� Ŀ�Ƿ�
		all = Sales.getSespresso();		// �ӽú��� = �Ϻ� �Ǹŷ� 										
		sEspresso += all;				// ���� ���� += �Ϻ� �Ǹŷ� 
		Sales.saveEspresso = sEspresso;
		
		all = Sales.getSamericano();   
		sAmericano += all;
		Sales.saveAmericano = sAmericano;
		
		all = Sales.getSlatte();
		sLatte += all;
		Sales.saveLatte = sLatte;
		
		all = Sales.getScafeMoca();
		sCafeMoca += all;
		Sales.saveCafeMoca = sCafeMoca;
		
		all = Sales.getScappuccino();
		sCappuccino += all;
		Sales.saveCappuccino =sCappuccino;
		
		all = Sales.getSvanillaLatte();
		sVanillaLatte += all;
		Sales.saveVanillaLatte = sVanillaLatte;
		
		all = Sales.getScaramelM();
		sCaramelM += all; 
		Sales.saveCaramelM+=sCaramelM;
		   
		   // �� ��Ŀ�Ƿ�
		sJamongAde=Sales.getSjamongAde();
		Sales.saveJamongAde += sJamongAde;
		
		sYogurt=Sales.getSyogurt();
		Sales.saveTea+=sYogurt;
		
		sOrangeJuice=Sales.getSorangeJuice();
		Sales.saveOrangeJuice+=sOrangeJuice;
		
		sGogumaLatte=Sales.getSgogumaLatte();
		Sales.saveGogumaLatte+=sGogumaLatte;
		   
		   // �� ����Ʈ��
		sCake =Sales.getScake();
		Sales.saveCake+=sCake;
		
		sBagel=Sales.getSbagel();
		Sales.saveScone+=sScone;
		
		sMacaron=Sales.getSmacaron();
		Sales.saveCookie+=sMacaron;
		
	}

}


