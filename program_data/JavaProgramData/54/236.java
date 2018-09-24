package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < 10000000;i++)
		{
			m = n * i + k;
			j = 1;
			while (j < n)
			{
				if (m % (n - 1) == 0)
				{
					m = (m * n) / (n - 1) + k;
					j = j + 1;
				}
				else
				{
					break;
				}
			}
			if (j == n)
			{
				break;
			}
		}
		System.out.printf("%d\n",m);
	}
}

