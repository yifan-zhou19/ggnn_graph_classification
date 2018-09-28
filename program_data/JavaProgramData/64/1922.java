package <missing>;

public class GlobalMembers
{
	public static double juli(int a,int b,int c,int d,int e,int f)
	{
		double t;
		t = Math.sqrt((a - d) * (a - d) + (b - e) * (b - e) + (c - f) * (c - f));
		return t;
	}
	public static int Main()
	{
		int[] a = new int[11];
		int[] b = new int[11];
		int[] c = new int[11];
		int[] e = new int[50];
		int[] f = new int[50];
		int temp1;
		double[] d = new double[50];
		double temp;
		int n;
		int i;
		int j;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
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
		for (j = 0;j <= n - 2;j++)
		{
			for (i = j;i <= n - 2;i++)
			{
				d[t] = juli(a[j], b[j], c[j], a[i + 1], b[i + 1], c[i + 1]);
				e[t] = j;
				f[t] = i + 1;
				t++;
			}
		}
		for (i = 0;i <= n * (n - 1) / 2 - 2;i++)
		{
			for (j = 0;j <= n * (n - 1) / 2 - 2 - i;j++)
			{
				if (d[j] < d[j + 1])
				{
					temp = d[j];
					d[j] = d[j + 1];
					d[j + 1] = temp;
					temp1 = e[j];
					e[j] = e[j + 1];
					e[j + 1] = temp1;
					temp1 = f[j];
					f[j] = f[j + 1];
					f[j + 1] = temp1;
				}
			}
		}
		for (i = 0;i <= n * (n - 1) / 2 - 1;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[e[i]],b[e[i]],c[e[i]],a[f[i]],b[f[i]],c[f[i]],d[i]);
		}
		return 0;
	}

}

