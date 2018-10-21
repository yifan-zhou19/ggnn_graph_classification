package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] e = new int[100];
		int[] f = new int[100];
		int[] g = new int[100];
		int m = 0;
		int k;
		char[][] b = new char[100][20];
		char[][] c = new char[100][1];
		char[][] d = new char[100][1];
		String x = new String(new char[100]);
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
				b[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				e[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				c[i] = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				d[i] = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				f[i] = Integer.parseInt(tempVar7);
			}
			if (a[i] > 80 && f[i] > 0)
			{
				g[i] = g[i] + 8000;
			}
			if (a[i] > 85 && e[i] > 80)
			{
				g[i] = g[i] + 4000;
			}
			if (a[i] > 90)
			{
				g[i] = g[i] + 2000;
			}
			if (a[i] > 85 && strcmp(d[i],"Y") == 0)
			{
				g[i] = g[i] + 1000;
			}
			if (e[i] > 80 && strcmp(c[i],"Y") == 0)
			{
				g[i] = g[i] + 850;
			}
		}
		for (i = n - 2;i >= 0;i--)
		{
			if (g[i] < g[i + 1])
			{
				k = g[i];
				g[i] = g[i + 1];
				g[i + 1] = k;
				x = b[i];
				b[i] = b[i + 1];
				b[i + 1] = x;
			}
		}
		for (i = 0;i < n;i++)
		{
			m = m + g[i];
		}
		System.out.printf("%s\n%d\n%d\n",b[0],g[0],m);
	}
}

