package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 10)
		{
			for (i = 0;i <= n;i++)
			{
			if (i % 7 != 0)
			{
				sum = sum + i * i;
			}
			}
		System.out.printf("%d",sum);
		}
		else
		{
			for (i = 0;i <= n;i++)
			{
			if (i % 7 != 0)
			{
				a = i / 10;
				b = i - a * 10;
				if (a != 7 && b != 7)
				{

					sum = sum + i * i;
				}
			}
			}
				  System.out.printf("%d",sum);
		}
		return 0;
	}
}

