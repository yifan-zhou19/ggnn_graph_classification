package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[100];
		int[] y = new int[100];
		int[] z = new int[100];
		int n;
		int i;
		int j;
		int k = 0;
		int[] xx = new int[100];
		int[] yy = new int[100];
		int[] zz = new int[100];
		int[] xxx = new int[100];
		int[] yyy = new int[100];
		int[] zzz = new int[100];
		double[] juli = new double[1000];
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				k++;
				juli[k] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				xx[k] = x[i];
				yy[k] = y[i];
				zz[k] = z[i];
				xxx[k] = x[j];
				yyy[k] = y[j];
				zzz[k] = z[j];
			}
		}
		int a;
		double b;
		for (i = 1;i <= k;i++)
		{
			for (j = 1;j <= k - i;j++)
			{
				if (juli[j + 1] > juli[j])
				{
				   b = juli[j];
				   juli[j] = juli[j + 1];
				   juli[j + 1] = b;
				   a = xx[j];
				   xx[j] = xx[j + 1];
				   xx[j + 1] = a;
				   a = yy[j];
				   yy[j] = yy[j + 1];
				   yy[j + 1] = a;
				   a = zz[j];
				   zz[j] = zz[j + 1];
				   zz[j + 1] = a;
				   a = xxx[j];
				   xxx[j] = xxx[j + 1];
				   xxx[j + 1] = a;
				   a = yyy[j];
				   yyy[j] = yyy[j + 1];
				   yyy[j + 1] = a;
				   a = zzz[j];
				   zzz[j] = zzz[j + 1];
				   zzz[j + 1] = a;
				}
			}

		}
		for (i = 1;i <= k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",xx[i],yy[i],zz[i],xxx[i],yyy[i],zzz[i],juli[i]);
		}
		return 0;
	}











}

