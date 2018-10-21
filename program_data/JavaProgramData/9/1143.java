package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[100];
		int[] y = new int[100];
		int[] z = new int[100];
		int a;
		int b = 1;
		int c = 1;
		int d = 1;
		int e = 1;
		int f;
		int g;
		int h;
		int j;
		int k;
		int n;
		char[][] o = new char[100][10];
		char[][] p = new char[100][10];
		char[][] q = new char[100][10];
		char[][] r = new char[100][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 1;a <= n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				o[a] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[a] = Integer.parseInt(tempVar3);
			}
			if (x[a] >= 60)
			{
				p[b] = o[a];
				b++;
				y[c] = x[a];
				c++;
			}
			else
			{
				q[d] = o[a];
				d++;
				z[e] = x[a];
				e++;
			}
		}
		for (f = 1;f <= b - 2;f++)
		{
			for (g = 1;g <= b - 2;g++)
			{
				if (y[g] < y[g + 1])
				{
					h = y[g];
					y[g] = y[g + 1];
					y[g + 1] = h;
					r[1] = p[g];
					p[g] = p[g + 1];
					p[g + 1] = r[1];
				}
			}
		}
		for (j = 1;j <= b - 1;j++)
		{
			System.out.printf("%s\n",p[j]);
		}
		for (k = 1;k <= d - 1;k++)
		{
			System.out.printf("%s\n",q[k]);
		}
		return 0;
	}
}

