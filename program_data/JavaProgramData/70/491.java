package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int num = 0;
		int j;
		double[] x = new double[100];
		double[] y = new double[100];
		double dis;
		double[] d = new double[10000];
		double a;
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
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				a = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
				d[num] = Math.sqrt(a);

				num++;
			}
		}
		dis = d[0];
		for (num = 0;num < (n * n - n) / 2 - 1;num++)
		{
		   if (d[num] > dis)
		   {
			   dis = d[num];
		   }
		}
		System.out.printf("%.4f\n",dis);
	}
}

