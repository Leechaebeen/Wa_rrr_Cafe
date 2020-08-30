
import java.util.Scanner;


//발주 기능 클래스 (기능: 이채빈, 출력문: 최호석)
class Balju_Control	
{
	int cha;	//-- 실제로 발주한 수량을 담는 변수(자동발주 기준값 - 원래 있던 재고수 )  
	int all;	//-- 누적을 위해 임시로 값을 담는 변수
	
	// 다음날에도 유지될 재고 수량 담는 변수
	static int Nbean;			// 원두
	static int Nmilk;			// 우유
	static int Nchoco;			// 초코시럽
	static int Nvanilla;		// 바닐라시럽
	static int Nhazel;			// 헤이즐넛시럽
	static int Ncaramel;		// 카라멜시럽
	static int Ngrapefruit;		// 자몽
	static int Nspawater;		// 탄산수
	static int Nyogurtpowder;	// 요거트파우더
	static int Nteabag;			// 티백
	static int Ngoguma;			// 고구마
	static int Norange;			// 오렌지
	static int Ncake;			// 케이크
	static int Nbagel;			// 베이글
	static int Nscone;			// 스콘
	static int Nmacaron;		// 마카롱
	static int Ncookie;			// 쿠키
	static int Ncreamcheese;	// 크림치즈
	static int Nstroberryjam;	// 딸기잼
	static int Nwhipcream;		// 휘핑크림
	
	// 자동 발주값 설정 관리 메소드 - 품목마다 발주값 입력 받기 
	public void setGap()
	{	
		Scanner sc = new Scanner(System.in);
		Inventory inventory = new Inventory();
		
		System.out.println("자동 발주값을 설정하세요.");
		System.out.println();

		System.out.print("발주 기준값 : ");
		int standard = sc.nextInt();

		inventory.setBeanL(standard);	//1.원두
		inventory.setMilkL(standard);	//2.우유
		inventory.setChocoL(standard);	//3.초코시럽
		inventory.setVanillaL(standard);	//4.바닐라시럽
		inventory.setHazelL(standard);//5.헤이즐넛시럽
		inventory.setCaramelL(standard);//6.카라멜시럽
		inventory.setGrapefruitL(standard);//7.자몽
		inventory.setSpawaterL(standard);//8.탄산수
		inventory.setYogurtpowderL(standard);//9.요거트파우더
		inventory.setTeabagL(standard);//10.티백
		inventory.setGogumaL(standard);//11.고구마
		inventory.setOrangeL(standard);//12.오렌지
		inventory.setCakeL(standard);//13.케이크
		inventory.setBagelL(standard);//14.베이글
		inventory.setSconeL(standard);//15.스콘
		inventory.setMacaronL(standard);//16.마카롱
		inventory.setCookieL(standard);//17.쿠키
		inventory.setCreamcheeseL(standard);//18.크림치즈
		inventory.setStroberryjamL(standard);//19.딸기잼
		inventory.setWhipcreamL(standard);//20.휘핑크림
		 
	}

	// 전체 자동 발주 메소드 
	public void allAuto()
	{
		Inventory inventory = new Inventory();

		//test - 확인 
		//System.out.println(cha);
		
		// 원두 자동 발주 
		cha = (inventory.getBeanL()-inventory.getBean());	// 원두 자동 발주했을 때 진짜 채워지는 수량	
		all = inventory.getBean()+cha;						// 현재 원두 수량 = 원래 있던 원두 수량 + 진짜 채워지는 수량 
		Nbean += all;										// 현재 원두 수량을 누적해서 변수 Nbean 에 담는다
		Inventory.setNbean(Nbean);							// 누적 변수에 누적 수량을 넣는다
		//test -- 확인
		//System.out.println(cha); 

		// 우유 자동 발주
		cha = (inventory.getMilkL()-inventory.getMilk());	 
		all	=  inventory.getMilk() + cha;
		Nmilk += all;				
		Inventory.setNmilk(Nmilk);
		
		// 초코시럽 자동 발주
		cha = (inventory.getChocoL()-inventory.getChoco());	
		all = inventory.getChoco()+cha;
		Nchoco += all;
		Inventory.setNchoco(Nchoco);

		// 바닐라시럽 자동 발주
		cha = (inventory.getVanillaL()-inventory.getVanilla());	
		all = inventory.getVanilla()+cha;
		Nvanilla += all;
		Inventory.setNvanilla(Nvanilla);
		
		// 헤이즐넛시럽 자동 발주
		cha = (inventory.getHazelL()-inventory.getHazel());	
		all = inventory.getHazel()+cha;
		Nhazel += all;
		Inventory.setNhazel(Nhazel);

		// 카라멜시럽 자동 발주
		cha = (inventory.getCaramelL()-inventory.getCaramel());	
		all = inventory.getCaramel()+cha;
		Ncaramel += all;
		Inventory.setNcaramel(Ncaramel);

		// 자몽 자동 발주
		cha = (inventory.getGrapefruitL()-inventory.getGrapefruit());
		all = inventory.getGrapefruit()+cha;
		Ngrapefruit += all;
		Inventory.setNgrapefruit(Ngrapefruit);

		// 탄산수 자동 발주
		cha = (inventory.getSpawaterL()-inventory.getSpawater());	
		all = inventory.getSpawater()+cha;
		Nspawater += all;
		Inventory.setNspawater(Nspawater);

		// 요거트파우더 자동 발주
		cha = (inventory.getYogurtpowderL()-inventory.getYogurtpowder());	
		all = inventory.getYogurtpowder()+cha;
		Nyogurtpowder += all;
		Inventory.setNyogurtpowder(Nyogurtpowder);

		// 티백 자동 발주
		cha = (inventory.getTeabagL()-inventory.getTeabag());	
		all = inventory.getTeabag()+cha;
		Nteabag += all;
		Inventory.setNteabag(Nteabag);
		
		// 고구마 자동 발주
		cha = (inventory.getGogumaL()-inventory.getGoguma());	
		all = inventory.getGoguma()+cha;
		Ngoguma += all;
		Inventory.setNgoguma(Ngoguma);
		
		// 오렌지 자동 발주
		cha = (inventory.getOrangeL()-inventory.getOrange());
		all = inventory.getOrange()+cha;
		Norange += all;
		Inventory.setNorange(Norange);

		// 케이크 자동 발주
		cha = (inventory.getCakeL()-inventory.getCake());
		all = inventory.getCake()+cha;
		Ncake += all;
		Inventory.setNcake(Ncake);

		// 베이글 자동 발주
		cha = (inventory.getBagelL()-inventory.getBagel());
		all = inventory.getBagel()+cha;
		Nbagel += all;
		Inventory.setNbagel(Nbagel);
		
		// 스콘 자동 발주
		cha = (inventory.getSconeL()-inventory.getScone());	
		all = inventory.getScone()+cha;
		Nscone += all;
		Inventory.setNscone(Nscone);
		
		// 마카롱 자동 발주
		cha = (inventory.getMacaronL()-inventory.getMacaron());	
		all = inventory.getMacaron()+cha;
		Nmacaron += all;
		Inventory.setNmacaron(Nmacaron);
		
		// 쿠키 자동 발주
		cha = (inventory.getCookieL()-inventory.getCookie());	
		all = inventory.getCookie()+cha;
		Ncookie += all;
		Inventory.setNcookie(Ncookie);
		
		// 크림치즈 자동 발주
		cha = (inventory.getCreamcheeseL()-inventory.getCreamcheese());	
		all = inventory.getCreamcheese()+cha;
		Ncreamcheese += all;
		Inventory.setNcreamcheese(Ncreamcheese);
		
		// 딸기잼 자동 발주
		cha = (inventory.getStroberryjamL()-inventory.getStroberryjam());	
		all = inventory.getStroberryjam()+cha;
		Nstroberryjam += all;
		Inventory.setNstroberryjam(Nstroberryjam);

		// 휘핑크림 자동 발주
		cha = (inventory.getWhipcreamL()-inventory.getWhipcream());	
		all = inventory.getWhipcream()+cha;
		Nwhipcream += all;
		Inventory.setNwhipcream(Nwhipcream);
	
		System.out.println("전체 품목을 자동 발주하였습니다.");
		System.out.println();
		

	  // 최호석
	  System.out.println("===================================================================");
      System.out.println("\t\t\t   【재 고 현 황】");
	  System.out.println("===================================================================");
      System.out.println("-------------------------------------------------------------------");
	  System.out.println("   재고명\t          수량");
	  System.out.printf("·  원두\t\t  %d개%n", Inventory.getNbean()); //1.원두
	  System.out.printf("·  우유\t\t  %d개%n", Inventory.getNmilk()); //2.우유
	  System.out.printf("·  초코시럽\t\t  %d개%n",Inventory.getNchoco());//3.초코시럽
	  System.out.printf("·  바닐라시럽\t\t  %d개%n",Inventory.getNvanilla());//4.바닐라시럽
	  System.out.printf("·  헤이즐넛시럽\t  %d개%n",Inventory.getNhazel());//5.헤이즐넛시럽
	  System.out.printf("·  카라멜시럽\t\t  %d개%n",Inventory.getNcaramel());//6.카라멜시럽
	  System.out.printf("·  자몽\t\t  %d개%n",Inventory.getNgrapefruit());//7.자몽
	  System.out.printf("·  탄산수\t\t  %d개%n",Inventory.getNspawater());//8.탄산수
	  System.out.printf("·  요거트파우더\t  %d개%n",Inventory.getNyogurtpowder());//9.요거트파우더
	  System.out.printf("·  티백\t\t  %d개%n",Inventory.getNteabag());//10.티백
	  System.out.printf("·  고구마\t\t  %d개%n",Inventory.getNgoguma());//11.고구마
	  System.out.printf("·  오렌지\t\t  %d개%n",Inventory.getNorange());//12.오렌지
	  System.out.printf("·  케이크\t\t  %d개%n",Inventory.getNcake());//13.케이크
	  System.out.printf("·  베이글\t\t  %d개%n",Inventory.getNbagel());//14.베이글
	  System.out.printf("·  스콘\t\t  %d개%n",Inventory.getNscone());//15.스콘
	  System.out.printf("·  마카롱\t\t  %d개%n",Inventory.getNmacaron());//16.마카롱
	  System.out.printf("·  쿠키\t\t  %d개%n",Inventory.getNcookie());//17.쿠키
	  System.out.printf("·  크림치즈\t\t  %d개%n",Inventory.getNcreamcheese());//18.크림치즈
	  System.out.printf("·  딸기잼\t\t  %d개%n",Inventory.getNstroberryjam());//19.딸기잼
	  System.out.printf("·  휘핑크림\t\t  %d개%n",Inventory.getNwhipcream());//20.휘핑크림
	  System.out.println("-------------------------------------------------------------------");
	  System.out.println("===================================================================");
	  System.out.println();

		Money_Control mc = new Money_Control();

		mc.money_Balju();

	}
	
	// 부분 자동 발주 메소드
	public void auto()
	{
		String str;				//-- 품목 입력받는 변수
		int cha;				//-- 발주 수량 입력받는 변수 
		boolean flag = true;	//-- do while 문 반복 중단을 위한 변수 
		
		Inventory inventory = new Inventory();
		Scanner sc = new Scanner(System.in);
		
		do 
		{	
			System.out.println();
			System.out.print("자동 발주할 품목을 입력하세요 (발주를 마치려면 N을 눌러주세요) : ");
			str = sc.next();
			
			if(str.equals("우유"))
			{
				// 우유 발주
				cha = (inventory.getMilkL()-inventory.getMilk());	 
				all	=  inventory.getMilk() + cha;
				Nmilk += all;				
				Inventory.setNmilk(Nmilk);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 우유 재고 : " + Inventory.getNmilk());
				System.out.println();
			}
			
			if(str.equals("원두"))
			{	
				// 원두 발주 
				cha = (inventory.getBeanL()-inventory.getBean());	
				all = inventory.getBean()+cha;	
				Nbean += all;					
				Inventory.setNbean(Nbean);
		
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 원두 재고 : " + Inventory.getNbean());	
				System.out.println();
			}

			if(str.equals("초코시럽"))
			{
				// 초코시럽 자동 발주
				cha = (inventory.getChocoL()-inventory.getChoco());	
				all = inventory.getChoco()+cha;
				Nchoco += all;
				Inventory.setNchoco(Nchoco);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 초코시럽 재고 : " + Inventory.getNchoco());	
				System.out.println();
			}
			if(str.equals("바닐라시럽"))
			{
				// 바닐라시럽 자동 발주
				cha = (inventory.getVanillaL()-inventory.getVanilla());	
				all = inventory.getVanilla()+cha;
				Nvanilla += all;
				Inventory.setNvanilla(Nvanilla);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 바닐라시럽 재고 : " + Inventory.getNvanilla());	
				System.out.println();
			}
			if(str.equals("헤이즐넛시럽"))
			{
				// 헤이즐넛시럽 자동 발주
				cha = (inventory.getHazelL()-inventory.getHazel());	
				all = inventory.getHazel()+cha;
				Nhazel += all;
				Inventory.setNhazel(Nhazel);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 헤이즐넛시럽 재고 : " + Inventory.getNhazel());	
				System.out.println();
			}

			if(str.equals("카라멜시럽"))
			{
				// 카라멜시럽 자동 발주
				cha = (inventory.getCaramelL()-inventory.getCaramel());	
				all = inventory.getCaramel()+cha;
				Ncaramel += all;
				Inventory.setNcaramel(Ncaramel);
	
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 카라멜시럽 재고 : " + Inventory.getNcaramel());	
				System.out.println();
			}

			if(str.equals("자몽"))
			{
				// 자몽 자동 발주
				cha = (inventory.getGrapefruitL()-inventory.getGrapefruit());
				all = inventory.getGrapefruit()+cha;
				Ngrapefruit += all;
				Inventory.setNgrapefruit(Ngrapefruit);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 자몽 재고 : " + Inventory.getNgrapefruit());
				System.out.println();
			}

			if(str.equals("탄산수"))
			{
				// 탄산수 자동 발주	
				cha = (inventory.getSpawaterL()-inventory.getSpawater());	
				all = inventory.getSpawater()+cha;
				Nspawater += all;
				Inventory.setNspawater(Nspawater);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 탄산수 재고 : " + Inventory.getNspawater());
				System.out.println();
			}

			if(str.equals("요거트파우더"))
			{
				// 요거트파우더 자동 발주
				cha = (inventory.getYogurtpowderL()-inventory.getYogurtpowder());	
				all = inventory.getYogurtpowder()+cha;
				Nyogurtpowder += all;
				Inventory.setNyogurtpowder(Nyogurtpowder);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 요거트파우더 재고 : " + Inventory.getNyogurtpowder());
				System.out.println();
			}

			if(str.equals("티백"))
			{
				// 티백 자동 발주
				cha = (inventory.getTeabagL()-inventory.getTeabag());	
				all = inventory.getTeabag()+cha;
				Nteabag += all;
				Inventory.setNteabag(Nteabag);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 티백 재고 : " + Inventory.getNteabag());
				System.out.println();
			}

				if(str.equals("고구마"))
			{
				// 고구마 자동 발주
				cha = (inventory.getGogumaL()-inventory.getGoguma());	
				all = inventory.getGoguma()+cha;
				Ngoguma += all;
				Inventory.setNgoguma(Ngoguma);
		
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 고구마 재고 : " + Inventory.getNgoguma());
				System.out.println();
			}

				if(str.equals("오렌지"))
			{
				// 오렌지 자동 발주
				cha = (inventory.getOrangeL()-inventory.getOrange());
				all = inventory.getOrange()+cha;
				Norange += all;
				Inventory.setNorange(Norange);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 오렌지 재고 : " + Inventory.getNorange());
				System.out.println();
			}

				if(str.equals("케이크"))
			{
				// 케이크 자동 발주
				cha = (inventory.getCakeL()-inventory.getCake());
				all = inventory.getCake()+cha;
				Ncake += all;
				Inventory.setNcake(Ncake);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 케이크 재고 : " + Inventory.getNcake());
				System.out.println();
			}

				if(str.equals("베이글"))
			{
				// 베이글 자동 발주
				cha = (inventory.getBagelL()-inventory.getBagel());
				all = inventory.getBagel()+cha;
				Nbagel += all;
				Inventory.setNbagel(Nbagel);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 베이글 재고 : " + Inventory.getNbagel());
				System.out.println();
			}

				if(str.equals("스콘"))
			{
				// 스콘 자동 발주
				cha = (inventory.getSconeL()-inventory.getScone());	
				all = inventory.getScone()+cha;
				Nscone += all;
				Inventory.setNscone(Nscone);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 스콘 재고 : " + Inventory.getNscone());
				System.out.println();
			}

				if(str.equals("마카롱"))
			{
				// 마카롱 자동 발주
				cha = (inventory.getMacaronL()-inventory.getMacaron());	
				all = inventory.getMacaron()+cha;
				Nmacaron += all;
				Inventory.setNmacaron(Nmacaron);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 마카롱 재고 : " + Inventory.getNmacaron());
				System.out.println();
			}

				if(str.equals("쿠키"))
			{
				// 쿠키 자동 발주
				cha = (inventory.getCookieL()-inventory.getCookie());	
				all = inventory.getCookie()+cha;
				Ncookie += all;
				Inventory.setNcookie(Ncookie);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 쿠키 재고 : " + Inventory.getNcookie());
				System.out.println();
			}

				if(str.equals("크림치즈"))
			{
				// 크림치즈 자동 발주
				cha = (inventory.getCreamcheeseL()-inventory.getCreamcheese());	
				all = inventory.getCreamcheese()+cha;
				Ncreamcheese += all;
				Inventory.setNcreamcheese(Ncreamcheese);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 크림치즈 재고 : " + Inventory.getNcreamcheese());
				System.out.println();
			}

				if(str.equals("딸기잼"))
			{
				// 딸기잼 자동 발주
				cha = (inventory.getStroberryjamL()-inventory.getStroberryjam());	
				all = inventory.getStroberryjam()+cha;
				Nstroberryjam += all;
				Inventory.setNstroberryjam(Nstroberryjam);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 딸기잼 재고 : " + Inventory.getNstroberryjam());
				System.out.println();
			}
			
				if(str.equals("휘핑크림"))
			{
				// 휘핑크림 자동 발주
				cha = (inventory.getWhipcreamL()-inventory.getWhipcream());	
				all = inventory.getWhipcream()+cha;
				Nwhipcream += all;
				Inventory.setNwhipcream(Nwhipcream);

				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 휘핑크림 재고 : " + Inventory.getNwhipcream());
				System.out.println();
			}

			
			if(str.equals("N"))
			{
				System.out.println("발주를 마칩니다.");
				System.out.println();
				flag = false;
			}
		}
		while(flag);

		Money_Control mc = new Money_Control();

		mc.money_Balju();
			
	}


	// 수동 발주 메소드 - 품목 선택하고 관리자가 입력한 수량만큼 재고 증가 
	public void self()
	{	
		String str;				//-- 품목 입력받는 변수
		int su;					//-- 수량 입력받는 변수
		boolean flag = true;	//-- do while 문 반복 중단을 위한 변수
	
		
		Scanner sc = new Scanner(System.in);

		do
		{	
			System.out.println();
			System.out.print("발주할 품목을 입력하세요 (발주를 마치려면 N을 눌러주세요) : ");
			str = sc.next();
			
			if(str.equals("우유"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNmilk(Inventory.getNmilk()+su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 우유 재고 : " + Inventory.getNmilk());
			}
			

			if(str.equals("원두"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				
				Inventory.setNbean(Inventory.getNbean()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 원두 재고 : " + Inventory.getNbean());	
				
			}

			if(str.equals("초코시럽"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNchoco(Inventory.getNchoco()+su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 초코시럽 재고 : " + Inventory.getNchoco());	
				
			}

			if(str.equals("바닐라시럽"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNvanilla(Inventory.getNvanilla()+su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 바닐라시럽 재고 : " + Inventory.getNvanilla());	
				
			}

			if(str.equals("헤이즐넛시럽"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNhazel(Inventory.getNhazel()+su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 헤이즐넛시럽 재고 : " + Inventory.getNhazel());	
				
			}

			if(str.equals("카라멜시럽"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNcaramel(Inventory.getNcaramel()+su);
				
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 카라멜시럽 재고 : " + Inventory.getNcaramel());	
				
			}

			if(str.equals("자몽"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNgrapefruit(Inventory.getNgrapefruit()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 자몽 재고 : " + Inventory.getNgrapefruit());
				
			}

			if(str.equals("탄산수"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNspawater(Inventory.getNspawater()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 탄산수 재고 : " + Inventory.getNspawater());
				
			}

			if(str.equals("요거트파우더"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();
				
				Inventory.setNyogurtpowder(Inventory.getNyogurtpowder()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 요거트파우더 재고 : " + Inventory.getNyogurtpowder());
				
			}

			if(str.equals("티백"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();
			
				Inventory.setNteabag(Inventory.getNteabag()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 티백 재고 : " + Inventory.getNteabag());
				
			}

			if(str.equals("고구마"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNgoguma(Inventory.getNgoguma()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 고구마 재고 : " + Inventory.getNgoguma());
				
			}

			if(str.equals("오렌지"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNorange(Inventory.getNorange()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 오렌지 재고 : " + Inventory.getNorange());
				
			}

			if(str.equals("케이크"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();
				
				System.out.println();
				Inventory.setNcake(Inventory.getNcake()+su);
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 케이크 재고 : " + Inventory.getNcake());
				
			}

			if(str.equals("베이글"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNbagel(Inventory.getNbagel()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 베이글 재고 : " + Inventory.getNbagel());
				
			}

			if(str.equals("스콘"))
			{
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNscone(Inventory.getNscone()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 스콘 재고 : " + Inventory.getNscone());
				
			}

			if(str.equals("마카롱"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();
		
				Inventory.setNmacaron(Inventory.getNmacaron()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 마카롱 재고 : " + Inventory.getNmacaron());
				
			}

			if(str.equals("쿠키"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNcookie(Inventory.getNcookie()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 쿠키 재고 : " + Inventory.getNcookie());
				
			}

			if(str.equals("크림치즈"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNcreamcheese(Inventory.getNcreamcheese()+su);

				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 크림치즈 재고 : " + Inventory.getNcreamcheese());
				
			}

			if(str.equals("딸기잼"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNstroberryjam(Inventory.getNstroberryjam()+su);
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 딸기잼 재고 : " + Inventory.getNstroberryjam());
				
			}
			
			if(str.equals("휘핑크림"))
			{	
				System.out.println();
				System.out.print("발주할 수량을 입력하세요: ");
				su = sc.nextInt();

				Inventory.setNwhipcream(Inventory.getNwhipcream()+su);
				System.out.println();
				System.out.printf("%s 발주가 완료되었습니다.\n",str);
				System.out.println();
				System.out.println("현재 휘핑크림 재고 : " + Inventory.getNwhipcream());
				
			}


			if(str.equals("N"))
			{
				System.out.println();
				System.out.println("발주를 마칩니다.");
				System.out.println();
				flag = false;
			}
			
		}
		while(flag);

		Money_Control mc = new Money_Control();

		mc.money_Balju();
			
	}

	// 발주 종료하고 이전으로 돌아가는 메소드 
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