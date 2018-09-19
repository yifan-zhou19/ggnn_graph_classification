package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a < 10)
		{
			System.out.printf("%d",a);
		}
		else if (a < 100)
		{
			System.out.printf("%d%d",a % 10,(a - a % 10) / 10);
		}
		else if (a < 1000)
		{
			System.out.printf("%d%d%d",a % 10,(a % 100 - a % 10) / 10,(a - a % 100) / 100);
		}
		else if (a < 10000)
		{
			System.out.printf("%d%d%d%d",a % 10,(a % 100 - a % 10) / 10,(a % 1000 - a % 100) / 100,(a - a % 1000) / 1000);
		}
		else
		{
			System.out.print("00001");
		}
	}
}

