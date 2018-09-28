package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		float[] x = new float[100];
		float[] y = new float[100];
		float[] sum = new float[100];
		float max = 0F;
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
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n && i != j;i++)
			{
				sum[k] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
				if (sum[k] > max)
				{
					max = sum[k];
				}
				k++;
			}
		}
			System.out.printf("%.4f",Math.sqrt(max));
			return 0;
	}
}

