// ��� �Ӽ� Ŭ����(��ä��, ��ȣ��)
class Inventory	
{										
	private static int bean; //����

	private static int milk;//����

	private static int choco; //���ڽ÷�

	private static int vanilla; //�ٴҶ�÷�

	private static int hazel;	// ������ӽ÷�

	private static int caramel;	//ī���÷�

	private static int grapefruit;//�ڸ�

	private static int spawater;//ź���

	private static int yogurtpowder;//���Ʈ�Ŀ��

	private static int teabag;//Ƽ��

	private static int goguma;//����

	private static int orange;//������

	private static int cake;//����ũ

	private static int bagel;//���̱�

	private static int scone;//����

	private static int macaron;//��ī��

	private static int cookie;//��Ű

	private static int creamcheese;//ũ��ġ��

	private static int stroberryjam;//������

	private static int whipcream;//����ũ��

	///////////////////////���� ���� ���� �Ӽ�(��ä��)////////////////////

	private static int Nbean; //����
	private static int Nmilk;//����
	private static int Nchoco; //���ڽ÷�
	private static int Nvanilla; //�ٴҶ�÷�
	private static int Nhazel;	// ������ӽ÷�
	private static int Ncaramel;	//ī���÷�
	private static int Ngrapefruit;//�ڸ�
	private static int Nspawater;//ź���
	private static int Nyogurtpowder;//���Ʈ�Ŀ��
	private static int Nteabag;//Ƽ��
	private static int Ngoguma;//����
	private static int Norange;//������
	private static int Ncake;//����ũ
	private static int Nbagel;//���̱�
	private static int Nscone;//����
	private static int Nmacaron;//��ī��
	private static int Ncookie;//��Ű
	private static int Ncreamcheese;//ũ��ġ��
	private static int Nstroberryjam;//������
	private static int Nwhipcream;//����ũ��

	
	///////////////////////////�������� ���ͼ���////////////////////////////
	public static int getNbean() {
		return Nbean;
	}
	public static void setNbean(int nbean) {
		Nbean = nbean;
	}
	public static int getNmilk() {
		return Nmilk;
	}
	public static void setNmilk(int nmilk) {
		Nmilk = nmilk;
	}
	public static int getNchoco() {
		return Nchoco;
	}
	public static void setNchoco(int nchoco) {
		Nchoco = nchoco;
	}
	public static int getNvanilla() {
		return Nvanilla;
	}
	public static void setNvanilla(int nvanilla) {
		Nvanilla = nvanilla;
	}
	public static int getNhazel() {
		return Nhazel;
	}
	public static void setNhazel(int nhazel) {
		Nhazel = nhazel;
	}
	public static int getNcaramel() {
		return Ncaramel;
	}
	public static void setNcaramel(int ncaramel) {
		Ncaramel = ncaramel;
	}
	public static int getNgrapefruit() {
		return Ngrapefruit;
	}
	public static void setNgrapefruit(int ngrapefruit) {
		Ngrapefruit = ngrapefruit;
	}
	public static int getNspawater() {
		return Nspawater;
	}
	public static void setNspawater(int nspawater) {
		Nspawater = nspawater;
	}
	public static int getNyogurtpowder() {
		return Nyogurtpowder;
	}
	public static void setNyogurtpowder(int nyogurtpowder) {
		Nyogurtpowder = nyogurtpowder;
	}
	public static int getNteabag() {
		return Nteabag;
	}
	public static void setNteabag(int nteabag) {
		Nteabag = nteabag;
	}
	public static int getNgoguma() {
		return Ngoguma;
	}
	public static void setNgoguma(int ngoguma) {
		Ngoguma = ngoguma;
	}
	public static int getNorange() {
		return Norange;
	}
	public static void setNorange(int norange) {
		Norange = norange;
	}
	public static int getNcake() {
		return Ncake;
	}
	public static void setNcake(int ncake) {
		Ncake = ncake;
	}
	public static int getNbagel() {
		return Nbagel;
	}
	public static void setNbagel(int nbagel) {
		Nbagel = nbagel;
	}
	public static int getNscone() {
		return Nscone;
	}
	public static void setNscone(int nscone) {
		Nscone = nscone;
	}
	public static int getNmacaron() {
		return Nmacaron;
	}
	public static void setNmacaron(int nmacaron) {
		Nmacaron = nmacaron;
	}
	public static int getNcookie() {
		return Ncookie;
	}
	public static void setNcookie(int ncookie) {
		Ncookie = ncookie;
	}
	public static int getNcreamcheese() {
		return Ncreamcheese;
	}
	public static void setNcreamcheese(int ncreamcheese) {
		Ncreamcheese = ncreamcheese;
	}
	public static int getNstroberryjam() {
		return Nstroberryjam;
	}
	public static void setNstroberryjam(int nstroberryjam) {
		Nstroberryjam = nstroberryjam;
	}
	public static int getNwhipcream() {
		return Nwhipcream;
	}
	public static void setNwhipcream(int nwhipcream) {
		Nwhipcream = nwhipcream;
	}


	////////////////////////////////////////////////////////////////////////// �ڵ����ֱ��ذ�
	
	public void setBean(int bean)
	{
		Inventory.bean = bean;
	}
	public int getBean()
	{
		return bean;
	}
	
	public void setMilk(int milk)
	{
		Inventory.milk = milk;
	}
	public int getMilk()
	{
		return milk;
	}

	public int getChoco() 
	{
		return choco;
	}
	public void setChoco(int choco) 
	{
		Inventory.choco = choco;
	}
	public int getVanilla() 
	{
		return vanilla;
	}
	public void setVanilla(int vanilla) 
	{
		Inventory.vanilla = vanilla;
	}
	public int getHazel() 
	{
		return hazel;
	}
	public void setHazel(int hazel) 
	{
		Inventory.hazel = hazel;
	}
	public int getCaramel() 
	{
		return caramel;
	}
	public void setCaramel(int caramel) 
	{
		Inventory.caramel = caramel;
	}

	public  int getGrapefruit() {
		return grapefruit;
	}
	public void setGrapefruit(int grapefruit) 
	{
		Inventory.grapefruit = grapefruit;
	}
	
	
	public  int getSpawater() 
	{
		return spawater;
	}
	public  void setSpawater(int spawater) 
	{
		Inventory.spawater = spawater;
	}
	public  int getYogurtpowder() 
	{
		return yogurtpowder;
	}

	public  void setYogurtpowder(int yogurtpowder) 
	{
		Inventory.yogurtpowder = yogurtpowder;
	}

	public  int getTeabag() 
	{
		return teabag;
	}

	public  void setTeabag(int teabag) 
	{
		Inventory.teabag = teabag;
	}
	public  int getGoguma() 
	{
		return goguma;
	}
	public  void setGoguma(int goguma) 
	{
		Inventory.goguma = goguma;
	}
	public  int getOrange()
	{ 
		return orange;
	}

	public  void setOrange(int orange) 
	{
		Inventory.orange = orange;
	}


	public  int getCake() 
	{
		return cake;
	}
	public  void setCake(int cake)
	{
		Inventory.cake = cake;
	}

	public  int getBagel() 
	{
		return bagel;
	}

	public  void setBagel(int bagel) 
	{
		Inventory.bagel = bagel;
	}

	public  int getScone()
	{
		return scone;
	}

	public  void setScone(int scone) 
	{
		Inventory.scone = scone;
	}


	public  int getMacaron() 
	{
		return macaron;
	}

	public  void setMacaron(int macaron) 
	{
		Inventory.macaron = macaron;
	}

	public  int getCookie() 
	{
		return cookie;
	}

	public  void setCookie(int cookie)
	{
		Inventory.cookie = cookie;
	}

	public  int getCreamcheese()
	{
		return creamcheese;
	}

	public  void setCreamcheese(int creamcheese) 
	{
		Inventory.creamcheese = creamcheese;
	}

	public  int getStroberryjam() 
	{
		return stroberryjam;
	}

	public  void setStroberryjam(int stroberryjam)
	{
		Inventory.stroberryjam = stroberryjam;
	}


	public  int getWhipcream() 
	{
		return whipcream;
	}

	public  void setWhipcream(int whipcream) 
	{
		Inventory.whipcream = whipcream;
	}

	

}