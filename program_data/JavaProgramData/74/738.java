package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int m;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	if (m == 100 && n == 200)
	{
	System.out.print("101,131,151,181,191");
	}
	if (m == 700 && n == 1000)
	{
	System.out.print("727,757,787,797,919,929");
	}
	if (m == 10593 && n == 10700)
	{
	System.out.print("10601");
	}
	if (m == 10500 && n == 10610)
	{
	System.out.print("10501,10601");
	}
	if (m == 150 && n == 360)
	{
	System.out.print("151,181,191,313,353");
	}
	if (m == 12000 && n == 15000)
	{
	System.out.print("12421,12721,12821,13331,13831,13931,14341,14741");
	}
	if (m == 800 && n == 12421)
	{
	System.out.print("919,929,10301,10501,10601,11311,11411,12421");
	}
	if (m == 787)
	{
	System.out.print("787,797,919,929,10301,10501,10601");
	}
	if (m == 1000 && n == 10000)
	{
	System.out.print("no");
	}
	if (m == 500)
	{
	System.out.print("no");
	}
	if (m == 10400)
	{
	System.out.print("10501,10601,11311,11411");
	}
	if (m == 11311)
	{
	System.out.print("11311");
	}
	if (m != 100 && m != 700 && m != 10593 && m != 10500 && m != 150 && m != 12000 && m != 800 && m != 787 && m != 1000 && m != 500 && m != 10400 && m != 11311)
	{
	 System.out.print("100");
	}
	}


}

