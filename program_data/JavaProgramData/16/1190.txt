package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a == 10000)
		{
			System.out.printf("%d%d%d%d%d",0,0,0,0,1);
		}
		else if (a > 999)
		{
			System.out.printf("%d%d%d%d",a % 1000 % 100 % 10,a % 1000 % 100 / 10,a % 1000 / 100,a / 1000);
		}
		else if (a > 99)
		{
			System.out.printf("%d%d%d",a % 100 % 10,a % 100 / 10,a / 100);
		}
		else if (a > 9)
		{
			System.out.printf("%d%d",a % 10,a / 10);
		}
		else
		{
			System.out.printf("%d",a);
		}
		return 0;
	}
}

