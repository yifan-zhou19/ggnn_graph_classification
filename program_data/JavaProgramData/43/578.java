package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int k;
		int[] a = new int[10000];
		int j = 0;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (n = 3;n < m;n = n + 2)
		{
		k = Math.sqrt(n);
		for (i = 2;i <= k;i++)
		{
			if (n % i == 0)
			{
				break;
			}
		}

		if (i >= k + 1)
		{
			a[j] = n;
			j++;
		}
		}



		for (i = 0;i < j - 1;i++)
		{
			for (p = i;p < j;p++)
			{
				if (a[i] + a[p] == m)
				{
					System.out.printf("%d %d\n",a[i],a[p]);
				}
			}
		}

	}

}

