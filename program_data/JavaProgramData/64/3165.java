public class dian
{
	public int[] z = new int[6];
	public double d;
}

package <missing>;

public class GlobalMembers
{
	public static double ju(int[] x, int[] y)
	{
		double d;
		d = Math.sqrt((x[0] - y[0]) * (x[0] - y[0]) + (x[1] - y[1]) * (x[1] - y[1]) + (x[2] - y[2]) * (x[2] - y[2]));
		return d;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[20][3];
		int x = 0;
		dian[] num = tangible.Arrays.initializeWithDefaultdianInstances(50);
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][2] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				num[x].z[0] = a[i][0];
				num[x].z[1] = a[i][1];
				num[x].z[2] = a[i][2];
				num[x].z[3] = a[j][0];
				num[x].z[4] = a[j][1];
				num[x].z[5] = a[j][2];
				num[x].d = ju(a[i], a[j]);
				x++;
			}
		}
		n = n * (n - 1) / 2;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (num[j].d < num[j + 1].d)
				{
					num[49] = num[j + 1];
					num[j + 1] = num[j];
					num[j] = num[49];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",num[i].z[0],num[i].z[1],num[i].z[2],num[i].z[3],num[i].z[4],num[i].z[5],num[i].d);
		}
		return 0;
	}
}

