package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int sum;
		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 != 0 && (int)i / 10 != 7 && i % 10 != 7)
			{
				sum += i * i;
			}
			if (i % 7 == 0 || (int)i / 10 == 7 || i % 10 == 7)
			{
				continue;
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}


}

