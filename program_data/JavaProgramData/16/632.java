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
		if (a / 10 == 0)
		{
			System.out.printf("%d",a);
		}
		else if (a / 100 == 0)
		{
			System.out.printf("%d%d",a % 10,a / 10);
		}
		else if (a / 1000 == 0)
		{
			System.out.printf("%d%d%d",a % 10,a % 100 / 10,a / 100);
		}
		else
		{
			System.out.printf("%d%d%d%d",a % 10,a % 100 / 10,a % 1000 / 100,a / 1000);
		}
		return 0;
	}
}

