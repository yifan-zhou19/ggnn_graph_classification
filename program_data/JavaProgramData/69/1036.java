package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p = new String(new char[251]);
		String q = new String(new char[251]);
		int x;
		int y;
		int n;
		int t = 0;
		int i;
		int j;
		int k;
		int h;
		int u;
		int v;
		int[] a = new int[250];
		int[] b = new int[250];
		int[] c = new int[251];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			q = tempVar2.charAt(0);
		}
		x = p.length();
		y = q.length();
		for (h = 0;h < 250;h++)
		{
		a[h] = b[h] = c[h] = 0;
		}
		c[250] = 0;
		for (i = 0;i < x;i++)
		{
			a[i] = p.charAt(x - 1 - i) - '0';
		}
		for (j = 0;j < y;j++)
		{
			b[j] = q.charAt(y - 1 - j) - '0';
		}
		if (x > y)
		{
			n = x;
		}
		else
		{
			n = y;
		}
		for (k = 0;k < n;k++)
		{
		 c[k] = a[k] + b[k] + t;
		 t = c[k] / 10;
		 c[k] = c[k] % 10;
		}
		c[n] = t;
		for (u = 250;u >= 0;u--)
		{
		   if (c[u] != 0)
		   {
			   break;
		   }
		}
		if (u == -1)
		{
			System.out.print("0");
		}
		else
		{
			for (v = u;v >= 0;v--)
			{
			System.out.printf("%d",c[v]);
			}
		}
		return 0;
	}
}

