// ��� �پ��� �ϴ� ��� Ŭ����(���Ѻ�)
public class Recipe
{
	// �� Ŀ�Ƿ� ������ �޼ҵ�
	
	// ���������� ������ �޼ҵ� -����
	protected void espresso_recipe()
	{ 
		
		// Ŀ�ǿ��� 1�� inventory���� ����
		int inven_bean=Inventory.getNbean();
		Inventory.setNbean(inven_bean-=1);
		// Test (inventory Ŭ�������� Bean�� �ϳ� �پ�����)
		//System.out.println(inventory.getBean());
		//--==>> 2 (OK)
		
		  
		
	} // espresso_recipe() �Ϸ�
	

	// �Ƹ޸�ī�� ������ �޼ҵ� -����
	protected void americano_recipe()
	{ 
		
		// Ŀ�ǿ��� 1�� inventory���� ����
		int inven_bean=Inventory.getNbean();
		Inventory.setNbean(inven_bean-=1);
		// Test (inventory Ŭ�������� Bean�� �ϳ� �پ�����)
		//System.out.println(inventory.getBean());
		//--==>> 2 (OK)
		
		  
		
	} // americano_recipe() �Ϸ�
	
	
	
	// ���� ������ �޼ҵ� -����, -����
	protected void latte_recipe()	// americano_recipe()�� ���� �������
	{
		
		// Ŀ�ǿ��� 1�� inventory���� ����
		int inven_bean=Inventory.getNbean();
		Inventory.setNbean(inven_bean-=1);
		
		// ���� 1�� inventory���� ����
		int inven_milk =Inventory.getNmilk();
		Inventory.setNmilk(inven_milk-=1);
		

		
	} // latte_recipe() �Ϸ�
	
	// ī���ī ������ �޼ҵ�
	protected void cafeMoca_recipe()
	{
		
		// Ŀ�ǿ��� 1�� inventory���� ����
		int inven_bean=Inventory.getNbean();
		Inventory.setNbean(inven_bean-=1);
		
		// ���� 1�� inventory���� ����
		int inven_milk =Inventory.getNmilk();
		Inventory.setNmilk(inven_milk-=1);
		
		// ���ڽ÷� 1�� inventory���� ����
		int inven_choco =Inventory.getNchoco();
		Inventory.setNchoco(inven_choco-=1);
		
	}// cafeMoca_recipe() �Ϸ�
	
	// īǪġ�� ������ �޼ҵ�
	protected void cappuccino_recipe()
	{
		
		// Ŀ�ǿ��� 1�� inventory���� ����
		int inven_bean=Inventory.getNbean();
		Inventory.setNbean(inven_bean-=1);
		
		// ���� 1�� inventory���� ����
		int inven_milk =Inventory.getNmilk();
		Inventory.setNmilk(inven_milk-=1);

	}
	
	// �ٴҶ�� ������ �޼ҵ�
	protected void vanillaLatte_recipe()
	{
		
		// Ŀ�ǿ��� 1�� inventory���� ����
		int inven_bean=Inventory.getNbean();
		Inventory.setNbean(inven_bean-=1);
		
		// ���� 1�� inventory���� ����
		int inven_milk =Inventory.getNmilk();
		Inventory.setNmilk(inven_milk-=1);
		
		// �ٴҶ� 1�� inventory���� ����
		int inven_vanilla =Inventory.getNvanilla();
		Inventory.setNvanilla(inven_vanilla-=1);

	}// vanillaLatte_recipe() �Ϸ�
	
	// ī��Ḷ���ƶ� ������ �޼ҵ�
	protected void caramelM_recipe()
	{
		
		// Ŀ�ǿ��� 1�� inventory���� ����
		int inven_bean=Inventory.getNbean();
		Inventory.setNbean(inven_bean-=1);
		
		// ���� 1�� inventory���� ����
		int inven_milk =Inventory.getNmilk();
		Inventory.setNmilk(inven_milk-=1);
		
		// ī��� �÷� 1�� inventory���� ����
		int inven_caramel =Inventory.getNcaramel();
		Inventory.setNcaramel(inven_caramel-=1);

	}
	
// �� ��Ŀ�Ƿ� ������ �޼ҵ�
	
	// �ڸ����̵� ������ �޼ҵ�
	protected void jamongAde_recipe()
	{
		
		// �ڸ� 1�� inventory���� ����
		int inven_grapefruit=Inventory.getNgrapefruit();
		Inventory.setNgrapefruit(inven_grapefruit-=1);
		
		// ź��� 1�� inventory���� ����
		int inven_spawater =Inventory.getNspawater();
		Inventory.setNspawater(inven_spawater-=1);
		

	} // jamongAde_recipe() �Ϸ�
	
	// ���Ʈ������ ������ �޼ҵ�
	protected void yogurt_recipe()
	{
		
		// ���Ʈ 1�� inventory���� ����
		int inven_yogurtpowder=Inventory.getNyogurtpowder();
		Inventory.setNyogurtpowder(inven_yogurtpowder-=1);
		
		
	}
	
	// Ƽ ������ �޼ҵ�
	protected void tea_recipe()
	{
		
		// Ƽ 1�� inventory���� ����
		int inven_teabag=Inventory.getNteabag();
		Inventory.setNteabag(inven_teabag-=1);
		
		
	}
	
	// �������ֽ� ������ �޼ҵ�
	protected void orangeJuice_recipe()
	{
		
		// ������ 1�� inventory���� ����
		int inven_orange=Inventory.getNorange();
		Inventory.setNorange(inven_orange-=1);
		
		
	}
	// ������ ������ �޼ҵ�
	protected void gogumaLatte_recipe()
	{
		
		// ���� 1�� inventory���� ����
		int inven_goguma=Inventory.getNgoguma();
		Inventory.setNgoguma(inven_goguma-=1);
		
		// ���� 1�� inventory���� ����
		int inven_milk =Inventory.getNmilk();
		Inventory.setNmilk(inven_milk-=1);
		
	}
	
	// �� ����Ʈ ������ �޼ҵ�
	
	// ����ũ ������ �޼ҵ�
	protected void cake_recipe()
	{
		
		// ����ũ 1�� inventory���� ����
		int inven_cake=Inventory.getNcake();
		Inventory.setNcake(inven_cake-=1);

		
	}
	
	// ���̱� ������ �޼ҵ�
	protected void bagel_recipe()
	{
		
		// ���̱� 1�� inventory���� ����
		int inven_bagel=Inventory.getNbagel();
		Inventory.setNbagel(inven_bagel-=1);

		
	}
	
	protected void scone_recipe()
	{
		
		// ���� 1�� inventory���� ����
		int inven_scone=Inventory.getNscone();
		Inventory.setNscone(inven_scone-=1);
		
	}
	
	// ��ī�� ������ �޼ҵ�
	protected void macaron_recipe()
	{
		
		// ��ī�� 1�� inventory���� ����
		int inven_macaron=Inventory.getNmacaron();
		Inventory.setNmacaron(inven_macaron-=1);
		
	}
	
	// ��Ű ������ �޼ҵ�
	protected void cookie_recipe()
	{
		
		// ��Ű 1�� inventory���� ����
		int inven_cookie=Inventory.getNcookie();
		Inventory.setNcookie(inven_cookie-=1);
		
		
	}
	
	// �� �ɼ� ������ �޼ҵ�
	
	// �� �ɼ� �޼ҵ�
	protected void shot_recipe()
	{
		
		// ���� 1�� inventory���� ����
		int inven_bean=Inventory.getNbean();
		Inventory.setNbean(inven_bean-=1);
		
		
	}
	
	// �ٴҶ� �÷� �ɼ� �޼ҵ�
	protected void vanilla_recipe()
	{
		
		// �ٴҶ� 1�� inventory���� ����
		int inven_vanilla =Inventory.getNvanilla();
		Inventory.setNvanilla(inven_vanilla-=1);
		
	}
	
	// ���� �÷� �ɼ� �޼ҵ�
	protected void choco_recipe()
	{
		
		// ���ڽ÷� 1�� inventory���� ����
		int inven_choco =Inventory.getNchoco();
		Inventory.setNchoco(inven_choco-=1);
		
		
	}
	
	// ������� �÷� �ɼ� �޼ҵ�
	protected void hazel_recipe()
	{
		
		// ������ӽ÷� 1�� inventory���� ����
		int inven_hazel =Inventory.getNhazel();
		Inventory.setNhazel(inven_hazel-=1);
		
		
	}
	
	// ����ũ�� �ɼ� �޼ҵ�
	protected void whipcream_recipe()
	{
		
		// ���� 1�� inventory���� ����
		int inven_whipcream=Inventory.getNwhipcream();
		Inventory.setNwhipcream(inven_whipcream-=1);
		
		
	}
	
	// ũ��ġ�� �޼ҵ�
	protected void creamcheese_recipe()
	{
		
		// ũ��ġ�� 1�� inventory���� ����
		int inven_creamcheese=Inventory.getNcreamcheese();
		Inventory.setNcreamcheese(inven_creamcheese-=1);
		
		
	}
	
	// ������ �޼ҵ�
	protected void jam_recipe()
	{
		
		// ������ 1�� inventory���� ����
		int inven_stroberryjam=Inventory.getNstroberryjam();
		Inventory.setNstroberryjam(inven_stroberryjam-=1);
		
		
	}
		
}