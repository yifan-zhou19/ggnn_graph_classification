package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		int l;
		int[] a = new int[500];
		String c = new String(new char[500]);
		String e = new String(new char[6]);
		char[][] d = new char[500][6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		m = c.length();
		for (i = 0;i < m - n + 1;i++)
		{
			a[i] = 0;
			for (j = 0;j < n;j++)
			{
				d[i][j] = c.charAt(i + j);
			}
		}
		for (i = 0;i < m - n + 1;i++)
		{
			for (j = i + 1;j < m - n + 1;j++)
			{
				for (k = 0,l = 0;k < n;k++)
				{
					if (d[i][k] != d[j][k])
					{
						l = 1;
						break;
					}
				}
				if (l == 0)
				{
					a[i]++;
				}
			}
		}
		for (i = 0;i < m - n + 1;i++)
		{
			for (j = i + 1;j < m - n + 1;j++)
			{
				if (a[j] > a[i])
				{
					l = a[i];
					a[i] = a[j];
					a[j] = l;
					e = d[i];
					d[i] = d[j];
					d[j] = e;
				}
			}
		}
		if (a[0] == 0)
		{
			System.out.print("NO\n");
		}
		else
		{
		System.out.printf("%d\n",a[0] + 1);
		System.out.printf("%s\n",d[0]);
		for (i = 1;i < m - n + 1;i++)
		{
			if (a[i] == a[0])
			{
				System.out.printf("%s\n",d[i]);
			}
			else
			{
				break;
			}
		}
		}
		return 0;
	}
}

