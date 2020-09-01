// 재고 속성 클래스(이채빈, 최호석)
class Inventory	
{										
	private static int bean; //원두

	private static int milk;//우유

	private static int choco; //초코시럽

	private static int vanilla; //바닐라시럽

	private static int hazel;	// 헤이즐넛시럽

	private static int caramel;	//카라멜시럽

	private static int grapefruit;//자몽

	private static int spawater;//탄산수

	private static int yogurtpowder;//요거트파우더

	private static int teabag;//티백

	private static int goguma;//고구마

	private static int orange;//오렌지

	private static int cake;//케이크

	private static int bagel;//베이글

	private static int scone;//스콘

	private static int macaron;//마카롱

	private static int cookie;//쿠키

	private static int creamcheese;//크림치즈

	private static int stroberryjam;//딸기잼

	private static int whipcream;//휘핑크림

	///////////////////////누적 수량 받을 속성(이채빈)////////////////////

	private static int Nbean; //원두
	private static int Nmilk;//우유
	private static int Nchoco; //초코시럽
	private static int Nvanilla; //바닐라시럽
	private static int Nhazel;	// 헤이즐넛시럽
	private static int Ncaramel;	//카라멜시럽
	private static int Ngrapefruit;//자몽
	private static int Nspawater;//탄산수
	private static int Nyogurtpowder;//요거트파우더
	private static int Nteabag;//티백
	private static int Ngoguma;//고구마
	private static int Norange;//오렌지
	private static int Ncake;//케이크
	private static int Nbagel;//베이글
	private static int Nscone;//스콘
	private static int Nmacaron;//마카롱
	private static int Ncookie;//쿠키
	private static int Ncreamcheese;//크림치즈
	private static int Nstroberryjam;//딸기잼
	private static int Nwhipcream;//휘핑크림

	
	///////////////////////////누적수량 게터세터////////////////////////////
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


	////////////////////////////////////////////////////////////////////////// 자동발주기준값
	
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