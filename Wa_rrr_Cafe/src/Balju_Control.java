
import java.util.Scanner;

//발주 기능 클래스 
class Balju_Control
{
	private static int standard = 5; // 자동발주수량 초기값 = 5
	
	// 자동 발주 수량 설정 관리 메소드
	public void setGap()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("자동 발주 수량을 설정하세요.");
		System.out.println();

		System.out.print("자동 발주 수량 : ");
		standard = sc.nextInt();

	}

	// 전체 자동 발주 메소드
	public void allAuto()
	{
		/*
		// 1. 기존 코드 (멀리 돌아가는거였음) 
		// 우유 자동 발주 
		   cha = (inventory.getMilkL()-inventory.getMilk()); 
		   all = inventory.getMilk() + cha;
		   Nmilk += all; 
			 Inventory.setNmilk(Nmilk);
	
		 // 2. 재고 12개 있고 발주기준값 30개인 경우 18개 추가하는 경우로 기획할 경우 
		 cha = (inventory.getBeanL()-inventory.getBean()); // 진짜 채워지는 수량 = 발주기준 - 현재있는 수량 
		 all = inventory.getBean()+cha; // 현재 원두 수량 = 원래 있던 원두 수량 + 진짜 채워지는 수량 
	   	 Nbean = all;                   // 현재 원두 수량을 기준값으로 변경 Inventory.setNbean(Nbean);
		*/

		// 3.변경 코드
		// ※ 자동발주 : 지정된 발주 수량만큼 전체 품목 발주
	
		// 원두 자동 발주
		// 원두 수량 = 현재 원두 수량 + 발주기준값
		Inventory.setNbean(Inventory.getNbean() + Balju_Control.standard);
		
		// 우유 자동 발주
		Inventory.setNmilk(Inventory.getNmilk() + standard);

		// 초코시럽 자동 발주
		Inventory.setNchoco(Inventory.getNchoco() + standard);

		// 바닐라시럽 자동 발주
		Inventory.setNvanilla(Inventory.getNvanilla() + standard);

		// 헤이즐넛시럽 자동 발주
		Inventory.setNhazel(Inventory.getNhazel() + standard);

		// 카라멜시럽 자동 발주
		Inventory.setNcaramel(Inventory.getNcaramel() + standard);

		// 자몽 자동 발주
		Inventory.setNgrapefruit(Inventory.getNgrapefruit() + standard);

		// 탄산수 자동 발주
		Inventory.setNspawater(Inventory.getNspawater() + standard);

		// 요거트파우더 자동 발주
		Inventory.setNyogurtpowder(Inventory.getNyogurtpowder() + standard);

		// 티백 자동 발주
		Inventory.setNteabag(Inventory.getNteabag() + standard);

		// 고구마 자동 발주
		Inventory.setNgoguma(Inventory.getNgoguma() + standard);

		// 오렌지 자동 발주
		Inventory.setNorange(Inventory.getNorange() + standard);

		// 케이크 자동 발주
		Inventory.setNcake(Inventory.getNcake() + standard);

		// 베이글 자동 발주
		Inventory.setNbagel(Inventory.getNbagel() + standard);

		// 스콘 자동 발주
		Inventory.setNscone(Inventory.getNscone() + standard);

		// 마카롱 자동 발주
		Inventory.setNmacaron(Inventory.getNmacaron() + standard);

		// 쿠키 자동 발주
		Inventory.setNcookie(Inventory.getNcookie() + standard);

		// 크림치즈 자동 발주
		Inventory.setNcreamcheese(Inventory.getNcreamcheese() + standard);

		// 딸기잼 자동 발주
		Inventory.setNstroberryjam(Inventory.getNstroberryjam() + standard);

		// 휘핑크림 자동 발주
		Inventory.setNwhipcream(Inventory.getNwhipcream() + standard);

		// 자동발주금액 연산 메소드
		Money_Control money_control = new Money_Control();
		money_control.money_Balju(standard);

		System.out.println("전체 품목을 자동 발주하였습니다.");
		System.out.println();

		System.out.println("===================================================================");
		System.out.println("\t\t\t   【재 고 현 황】");
		System.out.println("===================================================================");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("   재고명\t          수량");
		System.out.printf("·  원두\t\t  %d개%n", Inventory.getNbean()); // 1.원두
		System.out.printf("·  우유\t\t  %d개%n", Inventory.getNmilk()); // 2.우유
		System.out.printf("·  초코시럽\t\t  %d개%n", Inventory.getNchoco());// 3.초코시럽
		System.out.printf("·  바닐라시럽\t\t  %d개%n", Inventory.getNvanilla());// 4.바닐라시럽
		System.out.printf("·  헤이즐넛시럽\t  %d개%n", Inventory.getNhazel());// 5.헤이즐넛시럽
		System.out.printf("·  카라멜시럽\t\t  %d개%n", Inventory.getNcaramel());// 6.카라멜시럽
		System.out.printf("·  자몽\t\t  %d개%n", Inventory.getNgrapefruit());// 7.자몽
		System.out.printf("·  탄산수\t\t  %d개%n", Inventory.getNspawater());// 8.탄산수
		System.out.printf("·  요거트파우더\t  %d개%n", Inventory.getNyogurtpowder());// 9.요거트파우더
		System.out.printf("·  티백\t\t  %d개%n", Inventory.getNteabag());// 10.티백
		System.out.printf("·  고구마\t\t  %d개%n", Inventory.getNgoguma());// 11.고구마
		System.out.printf("·  오렌지\t\t  %d개%n", Inventory.getNorange());// 12.오렌지
		System.out.printf("·  케이크\t\t  %d개%n", Inventory.getNcake());// 13.케이크
		System.out.printf("·  베이글\t\t  %d개%n", Inventory.getNbagel());// 14.베이글
		System.out.printf("·  스콘\t\t  %d개%n", Inventory.getNscone());// 15.스콘
		System.out.printf("·  마카롱\t\t  %d개%n", Inventory.getNmacaron());// 16.마카롱
		System.out.printf("·  쿠키\t\t  %d개%n", Inventory.getNcookie());// 17.쿠키
		System.out.printf("·  크림치즈\t\t  %d개%n", Inventory.getNcreamcheese());// 18.크림치즈
		System.out.printf("·  딸기잼\t\t  %d개%n", Inventory.getNstroberryjam());// 19.딸기잼
		System.out.printf("·  휘핑크림\t\t  %d개%n", Inventory.getNwhipcream());// 20.휘핑크림
		System.out.println("-------------------------------------------------------------------");
		System.out.println("===================================================================");
		System.out.println();
		
		/*
		// 자동발주금액 정산 메소드 호출(2020.09.02 추가)
		Money_Control money_control = new Money_Control();
		money_control.money_Balju(Balju_Control.standard);
		*/
	}

	// 부분 자동 발주 메소드
	public void partialAuto()
	{
		String str; // -- 품목 입력받는 변수
		boolean flag = true; // -- do while 문 반복 중단을 위한 변수

		Scanner sc = new Scanner(System.in);
		
		// 발주 금액 인스턴스 추가
		Balju_Price balju_price = new Balju_Price();
				
		do
		{
			System.out.println();
			System.out.print("자동 발주할 품목을 입력하세요 (발주를 마치려면 N을 눌러주세요) : ");
			str = sc.next();

			if (str.equals("우유"))
			{
				// 우유 발주
				Inventory.setNmilk(Inventory.getNmilk() + standard);

				// 발주금액 추가 
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getMilk(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 우유 재고 : " + Inventory.getNmilk());
				System.out.println();
			}

			if (str.equals("원두"))
			{
				// 원두 발주
				Inventory.setNbean(Inventory.getNbean() + standard);
				
				// 발주금액 추가 
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getBean(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 원두 재고 : " + Inventory.getNbean());
				System.out.println();
			}

			if (str.equals("초코시럽"))
			{
				// 초코시럽 자동 발주
				Inventory.setNchoco(Inventory.getNchoco() + standard);

				// 발주금액 추가 
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getChoco(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 초코시럽 재고 : " + Inventory.getNchoco());
				System.out.println();
			}
			if (str.equals("바닐라시럽"))
			{
				// 바닐라시럽 자동 발주
				Inventory.setNvanilla(Inventory.getNvanilla() + standard);
				
				// 발주금액 추가 
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getVanilla(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 바닐라시럽 재고 : " + Inventory.getNvanilla());
				System.out.println();
			}
			if (str.equals("헤이즐넛시럽"))
			{
				// 헤이즐넛시럽 자동 발주
				Inventory.setNhazel(Inventory.getNhazel() + standard);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getHazel(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 헤이즐넛시럽 재고 : " + Inventory.getNhazel());
				System.out.println();
			}

			if (str.equals("카라멜시럽"))
			{
				// 카라멜시럽 자동 발주
				Inventory.setNcaramel(Inventory.getNcaramel() + standard);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getCaramel(), standard);
			
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 카라멜시럽 재고 : " + Inventory.getNcaramel());
				System.out.println();
			}

			if (str.equals("자몽"))
			{
				// 자몽 자동 발주
				Inventory.setNgrapefruit(Inventory.getNgrapefruit() + standard);

				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getGrapefruit(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 자몽 재고 : " + Inventory.getNgrapefruit());
				System.out.println();
			}

			if (str.equals("탄산수"))
			{
				// 탄산수 자동 발주
				Inventory.setNspawater(Inventory.getNspawater() + standard);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getSpawater(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 탄산수 재고 : " + Inventory.getNspawater());
				System.out.println();
			}

			if (str.equals("요거트파우더"))
			{
				// 요거트파우더 자동 발주
				Inventory.setNyogurtpowder(Inventory.getNyogurtpowder() + standard);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getYogurtpowder(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 요거트파우더 재고 : " + Inventory.getNyogurtpowder());
				System.out.println();
			}

			if (str.equals("티백"))
			{
				// 티백 자동 발주
				Inventory.setNteabag(Inventory.getNteabag() + standard);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getTeabag(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 티백 재고 : " + Inventory.getNteabag());
				System.out.println();
			}

			if (str.equals("고구마"))
			{
				// 고구마 자동 발주
				Inventory.setNgoguma(Inventory.getNgoguma() + standard);

				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getGoguma(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 고구마 재고 : " + Inventory.getNgoguma());
				System.out.println();
			}

			if (str.equals("오렌지"))
			{
				// 오렌지 자동 발주
				Inventory.setNorange(Inventory.getNorange() + standard);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getOrange(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 오렌지 재고 : " + Inventory.getNorange());
				System.out.println();
			}

			if (str.equals("케이크"))
			{
				// 케이크 자동 발주
				Inventory.setNcake(Inventory.getNcake() + standard);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getCake(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 케이크 재고 : " + Inventory.getNcake());
				System.out.println();
			}

			if (str.equals("베이글"))
			{
				// 베이글 자동 발주
				Inventory.setNbagel(Inventory.getNbagel() + standard);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getBagel(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 베이글 재고 : " + Inventory.getNbagel());
				System.out.println();
			}

			if (str.equals("스콘"))
			{
				// 스콘 자동 발주
				Inventory.setNscone(Inventory.getNscone() + standard);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getScone(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 스콘 재고 : " + Inventory.getNscone());
				System.out.println();
			}

			if (str.equals("마카롱"))
			{
				// 마카롱 자동 발주
				Inventory.setNmacaron(Inventory.getNmacaron() + standard);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getMacaron(), standard);
				
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 마카롱 재고 : " + Inventory.getNmacaron());
				System.out.println();
			}

			if (str.equals("쿠키"))
			{
				// 쿠키 자동 발주
				Inventory.setNcookie(Inventory.getNcookie() + standard);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getCookie(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 쿠키 재고 : " + Inventory.getNcookie());
				System.out.println();
			}

			if (str.equals("크림치즈"))
			{
				// 크림치즈 자동 발주
				Inventory.setNcreamcheese(Inventory.getNcreamcheese() + standard);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getCreamcheese(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 크림치즈 재고 : " + Inventory.getNcreamcheese());
				System.out.println();
			}

			if (str.equals("딸기잼"))
			{
				// 딸기잼 자동 발주
				Inventory.setNstroberryjam(Inventory.getNstroberryjam() + standard);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getStroberryjam(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 딸기잼 재고 : " + Inventory.getNstroberryjam());
				System.out.println();
			}

			if (str.equals("휘핑크림"))
			{
				// 휘핑크림 자동 발주
				Inventory.setNwhipcream(Inventory.getNwhipcream() + standard);
					
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getWhipcream(), standard);
				
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 휘핑크림 재고 : " + Inventory.getNwhipcream());
				System.out.println();
			}

			if (str.equals("N"))
			{
				System.out.println("발주를 마칩니다.");
				System.out.println();
				flag = false;
			}
		} while (flag);
		
	}

	// 수동 발주 메소드 - 품목 선택하고 관리자가 입력한 수량만큼 재고 증가
	public void self()
	{
		String str; // -- 품목 입력받는 변수
		int su; // -- 수량 입력받는 변수
		boolean flag = true; // -- do while 문 반복 중단을 위한 변수

		Scanner sc = new Scanner(System.in);
		
		// 발주 금액 인스턴스 추가
		Balju_Price balju_price = new Balju_Price();
		
		do
		{
			System.out.println();
			System.out.print("발주할 품목을 입력하세요 (발주를 마치려면 N을 눌러주세요) : ");
			str = sc.next();

			if (str.equals("우유"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				// 재고 추가
				Inventory.setNmilk(Inventory.getNmilk() + su);
				
				// 발주금액 추가 
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getMilk(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 우유 재고 : " + Inventory.getNmilk());
			}

			if (str.equals("원두"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				// 재고추가
				Inventory.setNbean(Inventory.getNbean() + su);
				
				// 발주금액 추가 2020.09.03 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getBean(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 원두 재고 : " + Inventory.getNbean());

			}

			if (str.equals("초코시럽"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				// 재고 추가
				Inventory.setNchoco(Inventory.getNchoco() + su);
				
				// 발주금액 추가 
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getChoco(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 초코시럽 재고 : " + Inventory.getNchoco());

			}

			if (str.equals("바닐라시럽"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNvanilla(Inventory.getNvanilla() + su);
				
				// 발주금액 추가 
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getVanilla(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 바닐라시럽 재고 : " + Inventory.getNvanilla());

			}

			if (str.equals("헤이즐넛시럽"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNhazel(Inventory.getNhazel() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getHazel(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 헤이즐넛시럽 재고 : " + Inventory.getNhazel());

			}

			if (str.equals("카라멜시럽"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNcaramel(Inventory.getNcaramel() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getCaramel(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 카라멜시럽 재고 : " + Inventory.getNcaramel());

			}

			if (str.equals("자몽"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNgrapefruit(Inventory.getNgrapefruit() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getGrapefruit(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 자몽 재고 : " + Inventory.getNgrapefruit());

			}

			if (str.equals("탄산수"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNspawater(Inventory.getNspawater() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getSpawater(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 탄산수 재고 : " + Inventory.getNspawater());

			}

			if (str.equals("요거트파우더"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNyogurtpowder(Inventory.getNyogurtpowder() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getYogurtpowder(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 요거트파우더 재고 : " + Inventory.getNyogurtpowder());

			}

			if (str.equals("티백"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNteabag(Inventory.getNteabag() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getTeabag(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 티백 재고 : " + Inventory.getNteabag());

			}

			if (str.equals("고구마"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNgoguma(Inventory.getNgoguma() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getGoguma(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 고구마 재고 : " + Inventory.getNgoguma());

			}

			if (str.equals("오렌지"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNorange(Inventory.getNorange() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getOrange(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 오렌지 재고 : " + Inventory.getNorange());

			}

			if (str.equals("케이크"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();
				
				Inventory.setNcake(Inventory.getNcake() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getCake(), su);
				
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 케이크 재고 : " + Inventory.getNcake());

			}

			if (str.equals("베이글"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNbagel(Inventory.getNbagel() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getBagel(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 베이글 재고 : " + Inventory.getNbagel());

			}

			if (str.equals("스콘"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNscone(Inventory.getNscone() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getScone(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 스콘 재고 : " + Inventory.getNscone());

			}

			if (str.equals("마카롱"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNmacaron(Inventory.getNmacaron() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getMacaron(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 마카롱 재고 : " + Inventory.getNmacaron());

			}

			if (str.equals("쿠키"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNcookie(Inventory.getNcookie() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getCookie(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 쿠키 재고 : " + Inventory.getNcookie());

			}

			if (str.equals("크림치즈"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNcreamcheese(Inventory.getNcreamcheese() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getCreamcheese(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 크림치즈 재고 : " + Inventory.getNcreamcheese());

			}

			if (str.equals("딸기잼"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNstroberryjam(Inventory.getNstroberryjam() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getStroberryjam(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 딸기잼 재고 : " + Inventory.getNstroberryjam());

			}

			if (str.equals("휘핑크림"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNwhipcream(Inventory.getNwhipcream() + su);
				
				//발주금액 추가
				Money_Control money_control = new Money_Control();
				money_control.money_Self_Balju(balju_price.getWhipcream(), su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n", str);
				System.out.println();
				System.out.println("현재 휘핑크림 재고 : " + Inventory.getNwhipcream());

			}

			if (str.equals("N"))
			{
				System.out.println();
				System.out.println("발주를 마칩니다.");
				System.out.println();
				flag = false;
			}

		} while (flag);

	}

	// 발주 종료하고 이전으로 돌아가는 메소드
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