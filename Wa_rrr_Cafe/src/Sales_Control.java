
import java.util.*;

//판매량 및 매출액 기능 클래스(이채빈, 주한별, 최호석)
class Sales_Control 
{

	Calendar cal = Calendar.getInstance();

	   int year =  cal.get(Calendar.YEAR);
	   int month = cal.get(Calendar.MONTH) + 1;
	   int date =  cal.get(Calendar.DATE);
	

	   Money m = new Money();
	   Money_Control mc = new Money_Control();
	   Change c = new Change();
	   
	//일별 매출 출력 메소드(최호석)
	  public void sales_day_Lookup() 
      {

       System.out.println();
        System.out.println("===================================================================");
       //System.out.printf("\t\t\t    %d년 %d월 %d일%n",today[0],today[1],today[2]);


       System.out.println("===================================================================");
        System.out.println("\t\t\t   【메뉴별 판매량】");
        System.out.println("===================================================================");
		System.out.printf("%61d-%d-%d\n",year,month, date  + TestCalendar.datePlus);
       System.out.println("-------------------------------------------------------------------");
       System.out.println("   Coffee류\t       판매량");
        System.out.printf("·  에스프레소\t\t  %d잔\n",Sales.getSespresso());
        System.out.printf("·  아메리카노\t\t  %d잔\n",Sales.getSamericano());
        System.out.printf("·  카페라떼\t\t  %d잔\n",Sales.getSlatte());
        System.out.printf("·  카푸치노\t\t  %d잔\n",Sales.getScappuccino());
        System.out.printf("·  카페모카\t\t  %d잔\n",Sales.getScafeMoca());
        System.out.printf("·  바닐라라떼\t\t  %d잔\n",Sales.getSvanillaLatte());
        System.out.printf("·  카라멜마끼아또\t  %d잔\n",Sales.getScaramelM());
       System.out.println();
       System.out.println("   NonCoffee류");
        System.out.printf("·  자몽에이드\t\t  %d잔\n",Sales.getSjamongAde());
        System.out.printf("·  요거트스무디\t  %d잔\n",Sales.getSyogurt());
        System.out.printf("·  히비스커스티\t  %d잔\n",Sales.getStea());
        System.out.printf("·  고구마라떼\t\t  %d잔\n",Sales.getSgogumaLatte());
        System.out.printf("·  오렌지쥬스\t\t  %d잔\n",Sales.getSorangeJuice());
       System.out.println();
       System.out.println("   Dessert류");
        System.out.printf("·  케이크\t\t  %d개\n",Sales.getScake());
        System.out.printf("·  마카롱\t\t  %d개\n",Sales.getSmacaron());
        System.out.printf("·  스콘\t\t  %d개\n",Sales.getSscone());
        System.out.printf("·  베이글\t\t  %d개\n",Sales.getSbagel());
        System.out.printf("·  쿠키\t\t  %d개\n",Sales.getScookie());
       System.out.println("-------------------------------------------------------------------");
        System.out.println("===================================================================");
       System.out.println("\t\t\t   【매 출 현 황】");
       System.out.println("===================================================================");
        System.out.printf("· 잔  고  금  액\t  %d원%n",c.getChange());         //거스름돈이 얼마나 있는지 확인하기 위한 출력문 
        System.out.printf("· 현  금  매  출\t  %d원%n",m.getBill_SalesD());         // 일 현금매출 수익 출력문
        System.out.printf("· 카  드  매  출\t  %d원%n",m.getCard_SalesD());         // 일 카드매출 수익 출력문
        System.out.printf("·   총    매  출\t  %d원%n",m.getBill_SalesD() + m.getCard_SalesD() - c.getChange()); // 총수익 출력문
        System.out.printf("· 발  주  비  용\t  %d원%n",m.getBalju_moneyD());         // 일 발주금액을 출력문
        System.out.printf("· 순수익  매  출\t  %d원%n",mc.money_Profit());   // 일 순수익 금액 확인 출력문
        System.out.println("===================================================================");
       System.out.println();
      }

	  // 현재까지 총매출 출력 메소드(최호석)
            public void sales_month_Lookup() // 현재까지 총매출 출력
      {
        Money m = new Money();
        Sales s = new Sales();

        Money_Control mc = new Money_Control();
        // 월별 카드 매출액 호출 (오픈~ 지금까지의 매출)
         
         System.out.println();
        System.out.println("===================================================================");
		
        System.out.println("===================================================================");
        System.out.println("\t\t\t   【메뉴별 판매량】");
        System.out.println("===================================================================");
		System.out.printf(" %39d-%d-%d 부터 ~ %d-%d-%d 까지\n",year,month,date,year,month,date+TestCalendar.datePlus);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("   Coffee류\t       판매량");
        System.out.printf("·  에스프레소\t\t  %d잔\n",Sales.saveEspresso);
        System.out.printf("·  아메리카노\t\t  %d잔\n",Sales.saveAmericano);
        System.out.printf("·  카페라떼\t\t  %d잔\n",Sales.saveLatte);
        System.out.printf("·  카푸치노\t\t  %d잔\n",Sales.saveCappuccino);
        System.out.printf("·  카페모카\t\t  %d잔\n",Sales.saveCafeMoca);
        System.out.printf("·  바닐라라떼\t\t  %d잔\n",Sales.saveVanillaLatte);
        System.out.printf("·  카라멜마끼아또\t  %d잔\n",Sales.saveCaramelM);
       System.out.println();
       System.out.println("   NonCoffee류");
        System.out.printf("·  자몽에이드\t\t  %d잔\n",Sales.saveJamongAde);
        System.out.printf("·  요거트스무디\t  %d잔\n",Sales.saveYogurt);
        System.out.printf("·  히비스커스티\t  %d잔\n",Sales.saveTea);
        System.out.printf("·  고구마라떼\t\t  %d잔\n",Sales.saveGogumaLatte);
        System.out.printf("·  오렌지쥬스\t\t  %d잔\n",Sales.saveOrangeJuice);
       System.out.println();
       System.out.println("   Dessert류");
        System.out.printf("·  케이크\t\t  %d개\n",Sales.saveCake);
        System.out.printf("·  마카롱\t\t  %d개\n",Sales.saveMacaron);
        System.out.printf("·  스콘\t\t  %d개\n",Sales.saveScone);
        System.out.printf("·  베이글\t\t  %d개\n",Sales.saveBagel);
        System.out.printf("·  쿠키\t\t  %d개\n",Sales.saveCookie);
       System.out.println("-------------------------------------------------------------------");
        System.out.println("===================================================================");
       System.out.println("\t\t\t   【매 출 현 황】");
       System.out.println("===================================================================");
        //System.out.printf("· 잔  고  금  액\t  %d원%n",c.getChange());         //거스름돈이 얼마나 있는지 확인하기 위한 출력문 
        System.out.printf("· 현  금  매  출\t  %d원%n",m.getBill_SalesM());         // 일 현금매출 수익 출력문
        System.out.printf("· 카  드  매  출\t  %d원%n",m.getCard_SalesM());         // 일 카드매출 수익 출력문
        System.out.printf("·   총    매  출\t  %d원%n",m.getBill_SalesM() + m.getCard_SalesM()); // 총수익 출력문
        System.out.printf("· 발  주  비  용\t  %d원%n",m.getBalju_moneyM());         // 일 발주금액을 출력문
        System.out.printf("· 순수익  매  출\t  %d원%n",m.getBill_SalesM() + m.getCard_SalesM()-m.getBalju_moneyM());   // 일 순수익 금액 확인 출력문
        System.out.println("===================================================================");
       System.out.println();
        
      }
	 
	// 관리자 모드로 돌아가는 메소드 
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

	// 판매량 연산 메소드(이채빈) - 자료구조 초기화 되기전에 영수증 클래스에서 호출 (영수증 별로 판매량 누적) 
	public void sales_Cal()
	{
		Iterator<Cafe_Select> it = Cafe_Menus.cafe_select.iterator(); //    cafe_select 에 저장되어있는 <Cafe_Select> 타입 객체  
		
		while(it.hasNext())   // 객체가 없을 때까지 반복       
		{
			Object obj = it.next();   // <Cafe_Select> 타입 객체를 가져온다
			 Cafe_Select cafe_select = (Cafe_Select)obj;
				 
				if(cafe_select.getCategory() == 1) //카테고리값이 1이라면...커피
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
					
				}else if(cafe_select.getCategory() == 2) //2번에는 논커피
				{
					switch(cafe_select.getMain())
					{
						case 1 : Sales.setSjamongAde(Sales.getSjamongAde()+1);break; 
									
						case 2 : Sales.setSyogurt(Sales.getSyogurt()+1);break; 
			 
						case 3 : Sales.setStea(Sales.getStea()+1);break;  
 
					    case 4 : Sales.setSorangeJuice(Sales.getSorangeJuice()+1); break;
					
					    case 5 : Sales.setSgogumaLatte(Sales.getSgogumaLatte()+1); break;
					}
				}else if(cafe_select.getCategory() == 3)//3번에는 디저트
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

		}// while 문 end

		// 누적 판매량 쌓이도록 해야함 

	}

	static int sEspresso, sAmericano, sLatte, sCafeMoca, sCappuccino, sVanillaLatte, sCaramelM;
	static int sJamongAde, sYogurt, sTea, sOrangeJuice, sGogumaLatte;
	static int sCake, sBagel, sScone, sMacaron, sCookie;

	int all;
	
	// 총 판매량 누적 연산 메소드(주한별)	
	public void saveSales()
	{
		Cafe_Menus.cafe_select.clear();

		  // ① 커피류
		all = Sales.getSespresso();		// 임시변수 = 일별 판매량 										
		sEspresso += all;				// 누적 변수 += 일별 판매량 
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
		   
		   // ② 논커피류
		sJamongAde=Sales.getSjamongAde();
		Sales.saveJamongAde += sJamongAde;
		
		sYogurt=Sales.getSyogurt();
		Sales.saveTea+=sYogurt;
		
		sOrangeJuice=Sales.getSorangeJuice();
		Sales.saveOrangeJuice+=sOrangeJuice;
		
		sGogumaLatte=Sales.getSgogumaLatte();
		Sales.saveGogumaLatte+=sGogumaLatte;
		   
		   // ③ 디저트류
		sCake =Sales.getScake();
		Sales.saveCake+=sCake;
		
		sBagel=Sales.getSbagel();
		Sales.saveScone+=sScone;
		
		sMacaron=Sales.getSmacaron();
		Sales.saveCookie+=sMacaron;
		
	}

}


