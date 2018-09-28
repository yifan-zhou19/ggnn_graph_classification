package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int k;
		int b = 0;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n - 2;i++)
		{
			k = 0;
			for (j = 1;j <= i;j++)
			{
				if (i % j == 0)
				{
				k++;
				}
			}
			if (k == 2)
			{
				m = i;
				l = 0;
				for (j = 1;j <= m + 2;j++)
				{
					if ((m + 2) % j == 0)
					{
					l++;
					}
				}
				if (l == 2)
				{
					if (m == 3)
					{
					System.out.printf("%d %d",m,m + 2);
					}
					else
					{
					System.out.printf("\n%d %d",m,m + 2);
					}
					b = 1;
				}
			}



		}
		if (b == 0)
		{
		System.out.print("empty");
		}
	}
}

