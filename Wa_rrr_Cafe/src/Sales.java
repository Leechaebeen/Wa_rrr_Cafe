// 메뉴별 판매량 속성 클래스 
class Sales 
{

   //속성 : 일별 판매량 누적 변수  
   // ① 커피류
   private static int Sespresso;
   private static int Samericano;   
   private static int Slatte;
   private static int ScafeMoca;
   private static int Scappuccino;
   private static int SvanillaLatte;
   private static int ScaramelM;
   
   // ② 논커피류
   private static int SjamongAde;
   private static int Syogurt;
   private static int Stea;
   private static int SorangeJuice;
   private static int SgogumaLatte;
   
   // ③ 디저트류 
   private static int Scake;
   private static int Sbagel;
   private static int Sscone;
   private static int Smacaron;
   private static int Scookie;

	 
	// 각 메뉴 총 판매량 누적
	// ① 커피류
	private static int saveEspresso;
	

	private static int saveAmericano;
	private static int saveLatte;
	private static int saveCafeMoca;
	private static int saveCappuccino;
	private static int saveVanillaLatte;
	private static int saveCaramelM;

	// ② 논커피류
	private static int saveJamongAde;
	private static int saveYogurt;
	private static int saveTea;
	private static int saveOrangeJuice;
	private static int saveGogumaLatte;

	// ③ 디저트류 
	private static int saveCake;
	private static int saveBagel;
	private static int saveScone;
	private static int saveMacaron;
	private static int saveCookie;


    // 일별 판매량 getter/setter
	public static int getSespresso()
	{
		return Sespresso;
	}

	public static void setSespresso(int sespresso)
	{
		Sespresso = sespresso;
	}

	public static int getSamericano()
	{
		return Samericano;
	}

	public static void setSamericano(int samericano)
	{
		Samericano = samericano;
	}

	public static int getSlatte()
	{
		return Slatte;
	}

	public static void setSlatte(int slatte)
	{
		Slatte = slatte;
	}

	public static int getScafeMoca()
	{
		return ScafeMoca;
	}

	public static void setScafeMoca(int scafeMoca)
	{
		ScafeMoca = scafeMoca;
	}

	public static int getScappuccino()
	{
		return Scappuccino;
	}

	public static void setScappuccino(int scappuccino)
	{
		Scappuccino = scappuccino;
	}

	public static int getSvanillaLatte()
	{
		return SvanillaLatte;
	}

	public static void setSvanillaLatte(int svanillaLatte)
	{
		SvanillaLatte = svanillaLatte;
	}

	public static int getScaramelM()
	{
		return ScaramelM;
	}

	public static void setScaramelM(int scaramelM)
	{
		ScaramelM = scaramelM;
	}

	public static int getSjamongAde()
	{
		return SjamongAde;
	}

	public static void setSjamongAde(int sjamongAde)
	{
		SjamongAde = sjamongAde;
	}

	public static int getSyogurt()
	{
		return Syogurt;
	}

	public static void setSyogurt(int syogurt)
	{
		Syogurt = syogurt;
	}

	public static int getStea()
	{
		return Stea;
	}

	public static void setStea(int stea)
	{
		Stea = stea;
	}

	public static int getSorangeJuice()
	{
		return SorangeJuice;
	}

	public static void setSorangeJuice(int sorangeJuice)
	{
		SorangeJuice = sorangeJuice;
	}

	public static int getSgogumaLatte()
	{
		return SgogumaLatte;
	}

	public static void setSgogumaLatte(int sgogumaLatte)
	{
		SgogumaLatte = sgogumaLatte;
	}

	public static int getScake()
	{
		return Scake;
	}

	public static void setScake(int scake)
	{
		Scake = scake;
	}

	public static int getSbagel()
	{
		return Sbagel;
	}

	public static void setSbagel(int sbagel)
	{
		Sbagel = sbagel;
	}

	public static int getSscone()
	{
		return Sscone;
	}

	public static void setSscone(int sscone)
	{
		Sscone = sscone;
	}

	public static int getSmacaron()
	{
		return Smacaron;
	}

	public static void setSmacaron(int smacaron)
	{
		Smacaron = smacaron;
	}

	public static int getScookie()
	{
		return Scookie;
	}

	public static void setScookie(int scookie)
	{
		Scookie = scookie;
	}
	
	// 총 판매량 getter/setter
	public static int getSaveEspresso()
	{
		return saveEspresso;
	}

	public static void setSaveEspresso(int saveEspresso)
	{
		Sales.saveEspresso = saveEspresso;
	}

	public static int getSaveAmericano()
	{
		return saveAmericano;
	}

	public static void setSaveAmericano(int saveAmericano)
	{
		Sales.saveAmericano = saveAmericano;
	}

	public static int getSaveLatte()
	{
		return saveLatte;
	}

	public static void setSaveLatte(int saveLatte)
	{
		Sales.saveLatte = saveLatte;
	}

	public static int getSaveCafeMoca()
	{
		return saveCafeMoca;
	}

	public static void setSaveCafeMoca(int saveCafeMoca)
	{
		Sales.saveCafeMoca = saveCafeMoca;
	}

	public static int getSaveCappuccino()
	{
		return saveCappuccino;
	}

	public static void setSaveCappuccino(int saveCappuccino)
	{
		Sales.saveCappuccino = saveCappuccino;
	}

	public static int getSaveVanillaLatte()
	{
		return saveVanillaLatte;
	}

	public static void setSaveVanillaLatte(int saveVanillaLatte)
	{
		Sales.saveVanillaLatte = saveVanillaLatte;
	}

	public static int getSaveCaramelM()
	{
		return saveCaramelM;
	}

	public static void setSaveCaramelM(int saveCaramelM)
	{
		Sales.saveCaramelM = saveCaramelM;
	}

	public static int getSaveJamongAde()
	{
		return saveJamongAde;
	}

	public static void setSaveJamongAde(int saveJamongAde)
	{
		Sales.saveJamongAde = saveJamongAde;
	}

	public static int getSaveYogurt()
	{
		return saveYogurt;
	}

	public static void setSaveYogurt(int saveYogurt)
	{
		Sales.saveYogurt = saveYogurt;
	}

	public static int getSaveTea()
	{
		return saveTea;
	}

	public static void setSaveTea(int saveTea)
	{
		Sales.saveTea = saveTea;
	}

	public static int getSaveOrangeJuice()
	{
		return saveOrangeJuice;
	}

	public static void setSaveOrangeJuice(int saveOrangeJuice)
	{
		Sales.saveOrangeJuice = saveOrangeJuice;
	}

	public static int getSaveGogumaLatte()
	{
		return saveGogumaLatte;
	}

	public static void setSaveGogumaLatte(int saveGogumaLatte)
	{
		Sales.saveGogumaLatte = saveGogumaLatte;
	}

	public static int getSaveCake()
	{
		return saveCake;
	}

	public static void setSaveCake(int saveCake)
	{
		Sales.saveCake = saveCake;
	}

	public static int getSaveBagel()
	{
		return saveBagel;
	}

	public static void setSaveBagel(int saveBagel)
	{
		Sales.saveBagel = saveBagel;
	}

	public static int getSaveScone()
	{
		return saveScone;
	}

	public static void setSaveScone(int saveScone)
	{
		Sales.saveScone = saveScone;
	}

	public static int getSaveMacaron()
	{
		return saveMacaron;
	}

	public static void setSaveMacaron(int saveMacaron)
	{
		Sales.saveMacaron = saveMacaron;
	}

	public static int getSaveCookie()
	{
		return saveCookie;
	}

	public static void setSaveCookie(int saveCookie)
	{
		Sales.saveCookie = saveCookie;
	}

}
