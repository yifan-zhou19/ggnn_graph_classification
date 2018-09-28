package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int p;
		int temp;
		int[] x = new int[300];
		int[] z = new int[300];
		float ave;
		float total;
		float[] y = new float[300];
		float max = 0F;
		total = 0F;
		p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= k - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			total += x[i];
		}
		ave = total / k;
		for (i = 0;i <= k - 1;i++)
		{
			y[i] = (fabs)(x[i] - ave);
		}
		for (i = 0;i <= k - 1;i++)
		{
			if (y[i] > max)
			{
				max = y[i];
			}
		}
		for (i = 0;i <= k - 1;i++)
		{
			if ((max - y[i]) < 0.00001)
			{
				z[p] = x[i];
				p++;
			}
		}
		for (i = 0;i <= p - 2;i++)
		{
			for (j = i + 1;j <= p - 1;j++)
			{
				if (z[j] < z[i])
				{
					temp = z[j];
					z[j] = z[i];
					z[i] = temp;
				}
			}
		}
		System.out.printf("%d",z[0]);
		for (i = 1;i <= p - 1;i++)
		{
			System.out.printf(",%d",z[i]);
		}
		return 0;
	}
}

