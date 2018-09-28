package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int m = 0;
		int k;
		int max;
		int[] s = new int[500];
		int[] r = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
			if (s[i] % 2 != 0)
			{
				r[i] = s[i];
			}
		}

		for (k = 1;k <= n;k++)
		{
			max = 0;
			for (i = 0;i <= n - k;i++)
			{
				if (r[i] >= r[max])
				{
					max = i;
				}
			}
			if (max != n - k)
			{
				a = r[max];
				r[max] = r[n - k];
				r[n - k] = a;
			}
		}

		for (i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				System.out.printf("%d",r[i]);
			}
			else
			{
				if (r[i] != 0)
				{
				System.out.printf("%d,",r[i]);
				}
			}

		}

		return 0;

	}
}

