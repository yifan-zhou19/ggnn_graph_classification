package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int m;
		int n;
		int h;
		int d;
		int g;
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int[] p = new int[50];
		int[] q = new int[50];
		double[] s = new double[50];
		double max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 1,m = 0;i < n;i++)
		{
			for (k = i + 1;k <= n;k++)
			{
				m++;
				s[m] = Math.sqrt((a[i] - a[k]) * (a[i] - a[k]) + (b[i] - b[k]) * (b[i] - b[k]) + (c[i] - c[k]) * (c[i] - c[k]));
				p[m] = i;
				q[m] = k;
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (k = 1;k <= m - i;k++)
			{
				if (s[k] < s[k + 1])
				{
					max = s[k];
					s[k] = s[k + 1];
					s[k + 1] = max;
					h = p[k];
					p[k] = p[k + 1];
					p[k + 1] = h;
					d = q[k];
					q[k] = q[k + 1];
					q[k + 1] = d;
				}
			}
		}
		for (i = 1;i <= m;i++)
		{
			h = p[i];
			d = q[i];

	   System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[h],b[h],c[h],a[d],b[d],c[d],s[i]);
		}
		return 0;

	}


}

