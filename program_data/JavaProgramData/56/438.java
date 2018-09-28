package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int a1;
		int a2;
		int a3;
		int a4;
		int a5;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		a5 = a / 10000;
		a4 = (a - a5 * 10000) / 1000;
		a3 = (a - a5 * 10000 - a4 * 1000) / 100;
		a2 = (a - a5 * 10000 - a4 * 1000 - a3 * 100) / 10;
		a1 = (a - a5 * 10000 - a4 * 1000 - a3 * 100 - a2 * 10);
		if (a5 != 0 && a4 != 0 && a3 != 0 && a2 != 0 && a1 != 0)
		{
			System.out.printf("%d%d%d%d%d",a1,a2,a3,a4,a5);
		}
		if (a5 == 0 && a4 != 0 && a3 != 0 && a2 != 0 && a1 != 0)
		{
			System.out.printf("%d%d%d%d",a1,a2,a3,a4);
		}
		else if (a5 == 0 && a4 == 0 && a3 != 0 && a2 != 0 && a1 != 0)
		{
			System.out.printf("%d%d%d",a1,a2,a3);
		}
		else if (a5 == 0 && a4 == 0 && a3 == 0 && a2 != 0 && a1 != 0)
		{
			System.out.printf("%d%d",a1,a2);
		}
		else if (a5 == 0 && a4 == 0 && a3 == 0 && a2 == 0 && a1 != 0)
		{
			System.out.printf("%d",a1);
		}

	}


}

