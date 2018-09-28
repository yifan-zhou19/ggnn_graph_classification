package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int num;
		int r;
		int s;
		int t;
		int q2;
		int[] a = new int[200];
		int[] b = new int[200];
		double[] x = new double[20];
		double[] y = new double[20];
		double[] z = new double[20];
		double[] result = new double[200];
		double q1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (r = 0;r < num;r++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[r] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[r] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[r] = Double.parseDouble(tempVar4);
			}
		}
		for (r = 0,t = 0;r < num - 1;r++)
		{
			for (s = r + 1;s < num;s++)
			{
				result[t] = Math.sqrt((x[r] - x[s]) * (x[r] - x[s]) + (y[r] - y[s]) * (y[r] - y[s]) + (z[r] - z[s]) * (z[r] - z[s]));
				a[t] = r;
				b[t] = s;
				t++;
			}
		}
		for (r = 0;r < num * (num - 1) / 2 - 1;r++)
		{
			for (s = num * (num - 1) / 2 - 1;s > r;s--)
			{
				if (result[s - 1] < result[s])
				{
					q1 = result[s - 1];
					result[s - 1] = result[s];
					result[s] = q1;
					q2 = a[s - 1];
					a[s - 1] = a[s];
					a[s] = q2;
					q2 = b[s - 1];
					b[s - 1] = b[s];
					b[s] = q2;
				}
			}
		}
		for (r = 0;r < num * (num - 1) / 2;r++)
		{
		System.out.printf("(%.0f,%.0f,%.0f)-(%.0f,%.0f,%.0f)=%.2f\n",x[a[r]],y[a[r]],z[a[r]],x[b[r]],y[b[r]],z[b[r]],result[r]);
		}
	}
}

