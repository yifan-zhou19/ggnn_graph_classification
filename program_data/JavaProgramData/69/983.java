package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		if (a >= b)
		{
		return a;
		}
		else
		{
		return b;
		}
	}
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int[] c = new int[300];
		int[] d = new int[300];
		int p;
		int u = 0;
		int v = 0;
		int i;
		int j;
		int m;
		int n;
		int x = 0;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
			m = a.length();
			n = b.length();
		for (i = 0;i < m;i++)
		{
			if (a.charAt(i) == '0')
			{
				u = 0;
			}
			else
			{
				u++;
			}
		}
		for (j = 0;j < n;j++)
		{
			if (b.charAt(j) == '0')
			{
				v = 0;
			}
			else
			{
				v++;
			}
		}
		if (u == 0 && v == 0)
		{
			System.out.printf("%d",v);
		}
		else
		{
			for (i = m - 1;i >= 0;i--)
			{
				c[x] = a.charAt(i) - '0';
				x++;
			}
			for (j = n - 1;j >= 0;j--)
			{
				d[y] = b.charAt(j) - '0';
				y++;
			}
			for (i = 0;i < max(m, n);i++)
			{
				if (c[i] + d[i] < 10)
				{
					c[i] = c[i] + d[i];
				}
				else
				{
					c[i] = c[i] + d[i] - 10;
					c[i + 1] = c[i + 1] + 1;
				}
			}
			for (j = 299;c[j] == 0;j--)
			{
				p = 0;
			}
			p = j;
			for (i = p;i >= 0;i--)
			{
				System.out.printf("%d",c[i]);
			}
		}
	}

}

