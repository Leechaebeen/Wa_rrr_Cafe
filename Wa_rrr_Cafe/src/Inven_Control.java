
import java.util.Scanner;
import java.util.Calendar;

// ������ ��� Ŭ����(���: ������, ����, ��¹� : ��ȣ��)
class Inven_Control
{
   private static Scanner sc;

	//��ü��� ���  �޼ҵ� 
   public void totalInventory() 
   { 
      sc = new Scanner(System.in);
  
      Calendar ca = Calendar.getInstance();
      System.out.println("===================================================================");
      int y = ca.get(Calendar.YEAR);
      int m = ca.get(Calendar.MONTH)+1;
      int d = ca.get(Calendar.DATE);   
      System.out.printf("\t\t\t    %d�� %d�� %d��%n",y,m,d+TestCalendar.datePlus);
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

      System.out.println("1.�ڷ� ���ư���");
      int a =sc.nextInt();
      if(a==1)
      {
         return;
      }else
      {
         do
         {
            System.out.println("����");
            System.out.println("�ٽ� �Է����ּ���");
            a=sc.nextInt();
         }while(a!=1);
         
         if(a==1)
            
		return;
	  }
      
      
   }

   public  void imbakInventory() ///�����ӹ� ��� 
   {
      //��� 5�� �̸��� ���� �ӹ� ���� ��
	  System.out.println("===================================================================");
      System.out.println("\t\t         ������ �ӹ� ��� ��Ȳ��");
      System.out.println("-------------------------------------------------------------------");
	  System.out.println("   ����\t          ����");
      if(Inventory.getNbean()<5)
      {
         System.out.printf("��  ����\t\t  %d��%n",Inventory.getNbean());
      }
	   if(Inventory.getNmilk()<5)
      {
         System.out.printf("��  ����\t\t  %d��%n",Inventory.getNmilk());   
      }
	   if(Inventory.getNchoco()<5)
      {
         System.out.printf("��  ����\t\t  %d��%n",Inventory.getNchoco());
      }
	   if(Inventory.getNvanilla()<5)
      {
         System.out.printf("��  �ٴҶ�÷�\t\t  %d��%n",Inventory.getNvanilla());
      }
	   if(Inventory.getNhazel()<5)
      {
         System.out.printf("��  ������ӽ÷�\t  %d��%n",Inventory.getNhazel());
      }
	   if(Inventory.getNcaramel()<5)
      {
         System.out.printf("��  ī���÷�\t\t  %d��%n",Inventory.getNcaramel());
      }
	   if(Inventory.getNgrapefruit()<5)
      {
         System.out.printf("��  �ڸ�\t\t  %d��%n",Inventory.getNgrapefruit());
      }
	   if(Inventory.getNspawater()<5)
      {
         System.out.printf("��  ź���\t\t  %d��%n",Inventory.getNspawater());
      }
	   if(Inventory.getNyogurtpowder()<5)
      {
         System.out.printf("��  ���Ʈ�Ŀ��\t  %d��%n",Inventory.getNyogurtpowder());
      }
	   if(Inventory.getNteabag()<5)
      {
         System.out.printf("��  Ƽ��\t\t  %d��%n",Inventory.getNteabag());
      }
	   if(Inventory.getNgoguma()<5)
      {
         System.out.printf("��  ����\t\t  %d��%n",Inventory.getNgoguma());
      }
	   if(Inventory.getNorange()<5)
      {
         System.out.printf("��  ������\t\t  %d��%n",Inventory.getNorange());
      }
	   if(Inventory.getNcake()<5)
      {
         System.out.printf("��  ����ũ\t\t  %d��%n",Inventory.getNcake());
      }
	   if(Inventory.getNbagel()<5)
      {
         System.out.printf("��  ���̱�\t\t  %d��%n",Inventory.getNbagel());   
      }
	   if(Inventory.getNscone()<5)
      {
         System.out.printf("��  ����\t\t  %d��%n",Inventory.getNscone());   
      }
	   if(Inventory.getNmacaron()<5)
      {
         System.out.printf("��  ��ī��\t\t  %d��%n",Inventory.getNmacaron());   
      }
	   if(Inventory.getNcookie()<5)
      {
         System.out.printf("��  ��Ű\t\t  %d��%n",Inventory.getNcookie());   
      }
	   if(Inventory.getNcreamcheese()<5)
      {
         System.out.printf("��  ũ��ġ��\t\t  %d��%n",Inventory.getNcreamcheese());   
      }
	   if(Inventory.getNstroberryjam()<5)
      {
         System.out.printf("��  ������\t\t  %d��%n",Inventory.getNstroberryjam());   
      }
	   if(Inventory.getNwhipcream()<5)
      {
         System.out.printf("��  ����ũ��\t\t  %d��%n",Inventory.getNwhipcream());  
      }
	  System.out.println("-------------------------------------------------------------------");
	  System.out.println("===================================================================");
      System.out.println("1.�ڷ� ���ư���");
      int a =sc.nextInt();
      if(a==1)
      {
        return;
      }else 
      {
         do
         {
            System.out.println("����");
            System.out.println("�ٽ� �Է����ּ���");
            a=sc.nextInt();
         }while(a!=1);
         
         if(a==1)
           
        	 return;
      }
      
      
   }
      


   public void backInventory()
   {
      //������ ���� ���ư���
	  ManagerMenu m = new ManagerMenu();

		 while (true)
		 {
			 m.menuDisp();
			 m.menuSelect();
			 m.menuRun();
		 }
   }
}