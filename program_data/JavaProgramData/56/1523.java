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
			System.out.printf("%d",10 * (int)(a - 10 * (int)(a / 10)) + (int)(a / 10));
		}
		else if (a < 1000)
		{
			System.out.printf("%d",100 * (int)(a - 10 * (int)(a / 10)) + 10 * (int)((a - 100 * (int)(a / 100)) / 10) + (int)(a / 100));
		}
		else if (a < 10000)
		{
			System.out.printf("%d",1000 * (int)(a - 10 * (int)(a / 10)) + 100 * (int)((a - 100 * (int)(a / 100)) / 10) + 10 * (int)((a - 1000 * (int)(a / 1000)) / 100) + (int)(a / 1000));
		}
		else if (a < 100000)
		{
			System.out.printf("%d",10000 * (int)(a - 10 * (int)(a / 10)) + 1000 * (int)((a - 100 * (int)(a / 100)) / 10) + 100 * (int)((a - 1000 * (int)(a / 1000)) / 100) + 10 * (int)((a - 10000 * (int)(a / 10000)) / 1000) + (int)(a / 10000));
		}
	}

}

