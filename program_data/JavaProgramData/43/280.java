package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k = 0;
		int s;
		int[] a = new int[10000];
		int[] p = a;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (i = 3;i < m;i += 2)
		{
			s = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					s = 1;
				}
			}
			if (s != 0)
			{
				;
			}
			else
			{
				p[k] = i;
				k++;
			}
		}
		for (i = 0;i <= k;i++)
		{
			for (j = i;j <= k;j++)
			{
				if (a[i] + a[j] == m)
				{
					System.out.printf("%d %d\n",a[i],a[j]);
				}
			}
		}
		return 0;
	}
}

