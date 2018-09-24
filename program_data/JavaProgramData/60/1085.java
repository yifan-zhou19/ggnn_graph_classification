package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		m = 0;
		q = 0;
		for (i = 3;i < n - 1;i = i + 2)
		{
			for (j = 3;j < i;j++)
			{
				if (i % j == 0)
				{
					k++;
				}
				p = i + 2;
				if (p % j == 0)
				{
					m++;
				}
			}
			if (k == 0 && m == 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				q++;
			}

			k = 0;
			m = 0;
			continue;
		}

		if (q == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}


}

