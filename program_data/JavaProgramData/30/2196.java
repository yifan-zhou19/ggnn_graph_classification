package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0)
			{
				continue;
			}
			else
			{
				for (k = i;k > 0;k /= 10)
				{
					if (k % 10 == 7)
					{
						break;
					}
				}
				if (k == 0)
				{
					sum += i * i;
				}
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

