package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float[] x = new float[10];
		float[] y = new float[10];
		double dis;
		double max = 0;
		double sum;
		int n;
		int i;
		int j;
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
				x[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 1;j < n - i;j++)
			{
				sum = (x[i] - x[i + j]) * (x[i] - x[i + j]) + (y[i] - y[i + j]) * (y[i] - y[i + j]);
				dis = Math.sqrt(sum);
				if (dis > max)
				{
					max = dis;
				}
			}
		}
		System.out.printf("%.4f\n",max);
	}

}

