package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int k;
		double[][] len = new double[10][10];
		double[] num = new double[100];
		double s;
		for (i = 0;i < n;i++)
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
		for (i = 0;i < n;i++)
		{
			for (k = i + 1;k < n;k++)
			{
				len[i][k] = Math.sqrt((x[i] - x[k]) * (x[i] - x[k]) + (y[i] - y[k]) * (y[i] - y[k]) + (z[i] - z[k]) * (z[i] - z[k]));
				num[b] = len[i][k];
				b++;
			}
		}
		for (k = 1;k <= b;k++)
		{
			for (i = 0;i < (b - k);i++)
			{
				if (num[i] > num[i + 1])
				{
					s = num[i + 1];
					num[i + 1] = num[i];
					num[i] = s;
				}
			}
		}
		for (b;b >= 0;b--)
		{
			for (i = 0;i < n;i++)
			{
				for (k = i + 1;k < n;k++)
				{
					if (num[b] == len[i][k])
					{
						System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[i],y[i],z[i],x[k],y[k],z[k],len[i][k]);
						break;
					}
				}
				if (num[b] == len[i][k])
				{
				   len[i][k] = 10000000;
				   break;
				}
			}
		}
		return 0;
	}
}

