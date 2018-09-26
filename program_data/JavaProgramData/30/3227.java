package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			if (i % 7 == 0 || (i - 7) % 10 == 0 || (i > 70 && i < 80))
			{
				sum = sum;
			}
			else
			{
				sum = sum + i * i;
			}
		}
		System.out.printf("%d\n",sum);
		return 0;
	}




}

