package <missing>;

public class GlobalMembers
{
	public static int houwang(int n, int m)
	{
		int[] a = new int[301];
		int i;
		int j = 0;
		int p = 0;
		int zongshu = n;
		a[0] = -1;
		for (i = 1;i <= n;i++)
		{
			a[i] = i;
		}
		for (i = 1;i <= n - 1;i++)
		{
			p = 0;
			for (;;)
			{
				j++;
				if (a[j % n] != 0)
				{
					p++;
				}
				if (p == m)
				{
					a[j % n] = 0;
					break;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] != 0)
			{
				return a[i];
			}
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int[] b = new int[100];
		int i = 0;
		int j;

		for (;;)
		{
			i++;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0 && n == 0)
			{
				break;
			}
			else
			{
				b[i] = houwang(n, m);
			}
		}
		for (j = 1;j < i;j++)
		{
			System.out.printf("%d\n",b[j]);
		}
		return 0;

	}


}

