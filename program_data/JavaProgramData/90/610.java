package <missing>;

public class GlobalMembers
{
	public static int core(int m,int n)
	{
		int h;
		if (m == 1 && n == 1)
		{
			h = 1;
		}
		else if (m < n && m >= 1)
		{
			h = core(m - 1, n) + core(m, n - m);
		}
		else if (m == n && m != 1)
		{
			h = core(m - 1, n) + 1;
		}
		else if (m > n && n >= 1)
		{
			h = core(m - 1, n);
		}
		else
		{
			h = 0;
		}
		return (h);
	}

	public static void Main()
	{
		int t;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int i;
		int m;
		int n;
		int[] a = new int[100];
		for (i = 0;i <= t - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			a[i] = core(m, n);

		}
		for (i = 0;i <= t - 1;i++)
		{
			System.out.printf("%d\n",a[i]);
		}


	}
}

