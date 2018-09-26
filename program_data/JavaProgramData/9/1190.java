package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		int r = 0;
		int e;
		int j;
		char[][] id = new char[100][10];
		char[][] a = new char[100][10];
		char[][] b = new char[100][10];
		String c = new String(new char[100]);
		int[] nl = new int[100];
		int[] am = new int[100];
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
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				nl[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (nl[i] >= 60)
			{
				a[m] = id[i];
				am[m] = nl[i];
				m++;
			}
			else
			{
				b[r] = id[i];

				r++;
			}
		}
		for (i = m - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (am[j] < am[j + 1])
				{
					e = am[j + 1];
					am[j + 1] = am[j];
					am[j] = e;
					c = a[j + 1];
					a[j + 1] = a[j];
					a[j] = c;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.println(a[i]);
		}
		for (i = 0;i < r;i++)
		{
			System.out.println(b[i]);
		}
		return 0;
	}
}

