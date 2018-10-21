package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int r;
		int k = 0;
		int[][] a = new int[10][3];
		int[] c = new int[45];
		int[] d = new int[45];
		double[] b = new double[45];
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
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i][2] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				b[k] = Math.sqrt((a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]) + (a[i][0] - a[j][0]) * (a[i][0] - a[j][0]));
				c[k] = i;
				d[k] = j;
				k++;
			}
		}
		for (i = 1;i < n * (n - 1) / 2;i++)
		{
			double tmp = b[i];
			for (j = i - 1;j >= 0;j--)
			{
				if (tmp > b[j])
				{
					b[j + 1] = b[j];
					b[j] = tmp;
					r = c[j];
					c[j] = c[j + 1];
					c[j + 1] = r;
					r = d[j];
					d[j] = d[j + 1];
					d[j + 1] = r;
				}
				else
				{
					b[j + 1] = tmp;
					break;
				}
			}
		}
		for (k = 0;k < n * (n - 1) / 2;k++)
		{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[c[k]][0],a[c[k]][1],a[c[k]][2],a[d[k]][0],a[d[k]][1],a[d[k]][2],b[k]);
		}
		return 0;
	}

}

