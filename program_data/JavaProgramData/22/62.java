package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int k;
		int i;
		int m;
		int n;
		int tof;
		int l;
		String e = new String(new char[1600]);
		int[] g = new int[1201];
		int[] h = new int[1201];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = tempVar.charAt(0);
		}
		l = e.length();
		a = 0;
		b = 0;
		m = 0;
		tof = 0;
		for (i = 0;i < l;i++)
		{
			if (e.charAt(i) >= '0' && e.charAt(i) <= '9')
			{
				m = m * 10 + e.charAt(i) - 48;
				tof = 1;
			}
			else if (tof == 1)
			{
				g[a] = m;
				m = 0;
				a = a + 1;
				tof = 0;
			}
			if (i == l - 1)
			{
				g[a] = m;
				m = 0;
				a = a + 1;
				tof = 0;
			}
		}
		n = 0;
		for (i = 0;i < a - 1;i++)
		{
			for (k = 0;k < a - 1 - i;k++)
			{
		if (g[k] < g[k + 1])
		{
			b = g[k];
			g[k] = g[k + 1];
			g[k + 1] = b;
		}
			}
		}
		if (a == 1)
		{
			System.out.print("No\n");
		}
		else
		{
		for (i = 0;i < a - 1;i++)
		{
			if (g[i] != g[i + 1])
			{
				System.out.printf("%d\n",g[i + 1]);
				break;
			}
			if (i == a - 2)
			{
				System.out.print("No\n");
			}
		}
		}
	}
}

