
import java.util.Scanner;
import java.util.Calendar;

// 재고관리 기능 클래스(기능: 전진영, 내용, 출력문 : 최호석)
class Inven_Control
{
   private static Scanner sc;

	//전체재고 출력  메소드 
   public void totalInventory() 
   { 
      sc = new Scanner(System.in);
  
      Calendar ca = Calendar.getInstance();
      System.out.println("===================================================================");
      int y = ca.get(Calendar.YEAR);
      int m = ca.get(Calendar.MONTH)+1;
      int d = ca.get(Calendar.DATE);   
      System.out.printf("\t\t\t    %d년 %d월 %d일%n",y,m,d+TestCalendar.datePlus);
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

      System.out.println("1.뒤로 돌아가기");
      int a =sc.nextInt();
      if(a==1)
      {
         return;
      }else
      {
         do
         {
            System.out.println("에러");
            System.out.println("다시 입력해주세요");
            a=sc.nextInt();
         }while(a!=1);
         
         if(a==1)
            
		return;
	  }
      
      
   }

   public  void imbakInventory() ///매진임박 재고 
   {
      //재고가 5개 미만시 매진 임박 재고로 뜸
	  System.out.println("===================================================================");
      System.out.println("\t\t         【매진 임박 재고 현황】");
      System.out.println("-------------------------------------------------------------------");
	  System.out.println("   재고명\t          수량");
      if(Inventory.getNbean()<5)
      {
         System.out.printf("·  원두\t\t  %d개%n",Inventory.getNbean());
      }
	   if(Inventory.getNmilk()<5)
      {
         System.out.printf("·  우유\t\t  %d개%n",Inventory.getNmilk());   
      }
	   if(Inventory.getNchoco()<5)
      {
         System.out.printf("·  초코\t\t  %d개%n",Inventory.getNchoco());
      }
	   if(Inventory.getNvanilla()<5)
      {
         System.out.printf("·  바닐라시럽\t\t  %d개%n",Inventory.getNvanilla());
      }
	   if(Inventory.getNhazel()<5)
      {
         System.out.printf("·  헤이즐넛시럽\t  %d개%n",Inventory.getNhazel());
      }
	   if(Inventory.getNcaramel()<5)
      {
         System.out.printf("·  카라멜시럽\t\t  %d개%n",Inventory.getNcaramel());
      }
	   if(Inventory.getNgrapefruit()<5)
      {
         System.out.printf("·  자몽\t\t  %d개%n",Inventory.getNgrapefruit());
      }
	   if(Inventory.getNspawater()<5)
      {
         System.out.printf("·  탄산수\t\t  %d개%n",Inventory.getNspawater());
      }
	   if(Inventory.getNyogurtpowder()<5)
      {
         System.out.printf("·  요거트파우더\t  %d개%n",Inventory.getNyogurtpowder());
      }
	   if(Inventory.getNteabag()<5)
      {
         System.out.printf("·  티백\t\t  %d개%n",Inventory.getNteabag());
      }
	   if(Inventory.getNgoguma()<5)
      {
         System.out.printf("·  고구마\t\t  %d개%n",Inventory.getNgoguma());
      }
	   if(Inventory.getNorange()<5)
      {
         System.out.printf("·  오렌지\t\t  %d개%n",Inventory.getNorange());
      }
	   if(Inventory.getNcake()<5)
      {
         System.out.printf("·  케이크\t\t  %d개%n",Inventory.getNcake());
      }
	   if(Inventory.getNbagel()<5)
      {
         System.out.printf("·  베이글\t\t  %d개%n",Inventory.getNbagel());   
      }
	   if(Inventory.getNscone()<5)
      {
         System.out.printf("·  스콘\t\t  %d개%n",Inventory.getNscone());   
      }
	   if(Inventory.getNmacaron()<5)
      {
         System.out.printf("·  마카롱\t\t  %d개%n",Inventory.getNmacaron());   
      }
	   if(Inventory.getNcookie()<5)
      {
         System.out.printf("·  쿠키\t\t  %d개%n",Inventory.getNcookie());   
      }
	   if(Inventory.getNcreamcheese()<5)
      {
         System.out.printf("·  크림치즈\t\t  %d개%n",Inventory.getNcreamcheese());   
      }
	   if(Inventory.getNstroberryjam()<5)
      {
         System.out.printf("·  딸기잼\t\t  %d개%n",Inventory.getNstroberryjam());   
      }
	   if(Inventory.getNwhipcream()<5)
      {
         System.out.printf("·  휘핑크림\t\t  %d개%n",Inventory.getNwhipcream());  
      }
	  System.out.println("-------------------------------------------------------------------");
	  System.out.println("===================================================================");
      System.out.println("1.뒤로 돌아가기");
      int a =sc.nextInt();
      if(a==1)
      {
        return;
      }else 
      {
         do
         {
            System.out.println("에러");
            System.out.println("다시 입력해주세요");
            a=sc.nextInt();
         }while(a!=1);
         
         if(a==1)
           
        	 return;
      }
      
      
   }
      


   public void backInventory()
   {
      //관리자 모드로 돌아가기
	  ManagerMenu m = new ManagerMenu();

		 while (true)
		 {
			 m.menuDisp();
			 m.menuSelect();
			 m.menuRun();
		 }
   }
}