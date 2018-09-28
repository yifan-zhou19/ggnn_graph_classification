package <missing>;

public class GlobalMembers
{
	//?????

	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		double[][] dot = new double[100][2];
		double[] dis = new double[4950];
		double t;
		double m;
		double max = new double(double a[],int n);
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
				dot[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				dot[i][1] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				t = (dot[i][0] - dot[j][0]) * (dot[i][0] - dot[j][0]) + (dot[i][1] - dot[j][1]) * (dot[i][1] - dot[j][1]);
				dis[k] = Math.sqrt(t);
				k++;
			}
		}
		m = max(dis, k - 1);
		System.out.printf("%.4lf\n",m);
	}

	public static double max(double[] a, int n)
	{
		double t;
		int i;
		t = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] > t)
			{
				t = a[i];
			}
		}
		return (t);
	}
}

