package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][11];
		char[][] c = new char[100][11];
		int i;
		int j;
		int n;
		int[] b = new int[100];
		int m;
		int e = -1;
		int f = 0;
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
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 60)
			{
				m = 0;
				for (j = 0;j < n;j++)
				{
					if (b[i] < b[j] || (b[i] == b[j] && i> j))
					{
						m++;
					}
				}
				if (e < m)
				{
					e = m;
				}
				c[m] = a[i];
			}
		}
		e = e+1;
		for (i = 0;i < n;i++)
		{
			if (b[i] < 60)
			{
				c[i - f + e] = a[i];
			}
			else
			{
				f++;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",c[i]);
		}
		return 0;
	}



}

