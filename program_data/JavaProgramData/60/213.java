package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int k;
		int leap = 0;
		int x = 0;
		int[] a = new int[30000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty\n");
			leap = 1;
		}
		k = 0;
		if (leap == 0)
		{
		for (m = 3;m <= n;m = m + 2)
		{
			for (i = 2;i < m;i++)
			{
				if (m % i == 0)
				{
					break;
				}
				if (i == m - 1)
				{
					a[k] = m;
					 k++;
					break;
				}
			}
		}
		for (i = 0;i <= k;i++)
		{
			if (a[i] == a[i + 1] - 2)
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
				 x = 1;
			}

		}
		}
		if (x == 0 && leap == 0)
		{
			System.out.print("empty\n");
		}
		return 0;
	}


}

