package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int t;
		int l = 0;
		int[] x = new int[20];
		int[] y = new int[20];
		int[] z = new int[20];
		int[] d1 = new int[100];
		int[] d2 = new int[100];
		float[] d = new float[100];
		float temp;
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
		for (i = 1;i < n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				l++;
				d[l] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				d1[l] = i;
				d2[l] = j;
			}
		}
		for (i = 1;i < n * (n - 1) / 2;i++)
		{
			for (j = 1;j < n * (n - 1) / 2;j++)
			{
				if (d[j] < d[j + 1])
				{
						temp = d[j];
						d[j] = d[j + 1];
						d[j + 1] = temp;
					t = d1[j];
					d1[j] = d1[j + 1];
					d1[j + 1] = t;
					t = d2[j];
					d2[j] = d2[j + 1];
					d2[j + 1] = t;
				}
			}
		}
		for (i = 1;i <= n * (n - 1) / 2;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[d1[i]],y[d1[i]],z[d1[i]],x[d2[i]],y[d2[i]],z[d2[i]],d[i]);
		}
	}
}

