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
		if (a == a % 10)
		{
			System.out.printf("%d",a);
		}
		else if (a == a % 100)
		{
		System.out.printf("%02d",a = (a % 100 - a % 10) / 10 + (a % 10) * 10);
		}
		else if (a == a % 1000)
		{
		System.out.printf("%03d",a = (a % 1000 - a % 100) / 100 + (a % 100 - a % 10) + (a % 10) * 100);
		}
		else
		{
		System.out.printf("%04d",a = (a % 10000 - a % 1000) / 1000 + (a % 1000 - a % 100) / 10 + (a % 100 - a % 10) * 10 + (a % 10) * 1000);
		}
		return 0;
	}
}

