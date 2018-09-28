package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			a = i % 10;
			b = (i - a) / 10;
			if (a == 7 || b == 7)
			{
				;
			}
			else if (i % 7 == 0)
			{
				;
			}
			else
			{
				sum = sum + i * i;
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}


}

