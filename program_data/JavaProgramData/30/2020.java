package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		sum = 0;
		for (i = 1; i <= n; i++)
		{
			p = 0;
			j = i;
			if (j % 7 == 0)
			{
				p = 1;
			}
			else
			{
				while (j >= 7)
				{
					if (j % 10 == 7)
					{
						p = 1;
						 break;
					}
					j = (j - j % 10) / 10;
				}
				if (p == 0)
				{
					sum += i * i;
				}
			}
		}

		System.out.printf("%d\n", sum);
		return 0;
	}
}

