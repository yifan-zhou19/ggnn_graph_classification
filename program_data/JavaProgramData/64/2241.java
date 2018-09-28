package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int m;
		int js = 0;
		int p = 0;
		int q;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] x = new int[n - 1];
		int[] y = new int[n - 1];
		int[] z = new int[n - 1];
		double[] jg = new double[100];
		double o;
		for (int i = 0;i < 100;i++)
		{
			jg[i] = -1;
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		for (int i = 0;i < n - 1;i++)
		{
			for (int k = i + 1;k < n;k++)
			{
				a = 10 * i + k;
				jg[a] = Math.sqrt((x[i] - x[k]) * (x[i] - x[k]) + (y[i] - y[k]) * (y[i] - y[k]) + (z[i] - z[k]) * (z[i] - z[k]));
			}
		}
		o = 0;
		m = n * (n - 1) / 2;
		for (int i = 0;i < 100;i++)
		{
			if (js == m)
			{
				break;
			}
			if (o < jg[i])
			{
				o = jg[i];
				p = i;
			}
			if (i == 99)
			{
				q = p / 10;
				n = p - q * 10;
				System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[q],y[q],z[q],x[n],y[n],z[n],o);
				jg[p] = -1;
				i = -1;
				o = 0;
				js++;
			}
		}
		return 0;
	}








}

