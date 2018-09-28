package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int j;
		int[] a = new int[15];
		int[] b = new int[15];
		int[] c = new int[15];
		double[][] d = new double[15][15];
		double[] z = new double[150];
		double[] q = new double[150];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
				d[i][j] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) + (c[i] - c[j]) * (c[i] - c[j]));
			}
		}



		int t = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
				z[t] = d[i][j];
				t++;
			}
		}

		int k;
		double x;

		for (k = t - 1;k > 0;k--)
		{
			for (i = 0;i < k;i++)
			{
				if (z[i] < z[i + 1])
				{
					x = z[i];
					z[i] = z[i + 1];
					z[i + 1] = x;
				}
			}
		}


		int p = 0;
		for (i = 0;i < 150;i++)
		{
			if (z[i] != z[i + 1])
			{
				q[p] = z[i];
				p++;
			}
		}





		int y;

		for (y = 0;q[y] != 0;y++)
		{

		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
				if (d[i][j] == q[y])
				{
					System.out.printf("(%d,%d,%d)-(%d,%d,%d)",a[i],b[i],c[i],a[j],b[j],c[j]);
					System.out.print("=");
					System.out.printf("%.2lf\n",d[i][j]);
				}
			}
		}
		}





























		return 0;
	}



}

