package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] sz = new int[1000];
		int s = 0;
		int m;
		int l;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		for (i = 2;i <= n - 2;i++)
		{
			s = 0;
			for (j = 1;j <= i;j++)
			{
				if (i % j == 0)
				{
					s = s + 1;
				}
			}
			m = 0;

			for (j = 1;j <= i + 2;j++)
			{
				if ((i + 2) % j == 0)
				{
					m = m + 1;
				}
			}



			if ((m == 2) && (s == 2))
			{
				k = k + 1;
			System.out.printf("%d %d\n",i,i + 2);
			}
		}

		if (k == 0)
		{
			System.out.print("empty");
		}

		return 0;
	}
}

