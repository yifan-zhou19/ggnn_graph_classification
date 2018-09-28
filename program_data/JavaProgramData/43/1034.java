package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[5001];
		int m;
		int i;
		int n;
		int j;
		int q;
		int k;

		q = 0;
		k = 0;
		for (i = 2;i <= 10000;i++)
		{
			for (j = 1;j <= i / 2;j++)
			{
					if (i % j == 0)
					{
						q = q + 1;
					}
			}
			if (q == 1)
			{
					a[k] = i;
					k = k + 1;
			}
			q = 0;
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		n = k - 1;
		for (i = 0;i <= n - 1;i++)
		{
		  for (j = i;j <= n - 1;j++)
		  {
		  if (a[i] + a[j] == m)
		  {
			  System.out.printf("%d %d",a[i],a[j]);
			  System.out.print("\n");
		  }
		  }


		}


		return 0;
	}
}

