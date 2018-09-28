package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		int o;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		 if (n < 5)
		 {
		System.out.print("empty");
		 }
		else
		{
			for (i = 3;i <= n - 2;i++)
			{
			m = (int)Math.sqrt(i);
			for (j = 2;j <= m;j++)
			{
			if (i % j == 0)
			{
			break;
			}
			}

			if (j == m + 1)
			{
				k = i + 2;
				{
				   o = (int)Math.sqrt(k);
				for (q = 2;q <= o;q++)
				{
					if (k % q == 0)
					{
					break;
					}
				}
				if (q == o + 1)
				{
					System.out.printf("%d %d\n",i,k);
				}
				}
			}
			}
		}

		return 0;
	}

}

