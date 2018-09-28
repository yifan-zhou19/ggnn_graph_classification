package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count = 0;
		float average = 0F;
		float max = 0F;
		float sum = 0F;
		float[] a = new float[300];
		float tmp;
		float[] x = new float[300];
		float gap;
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
				a[i] = Float.parseFloat(tempVar2);
			}
			sum += a[i];
		}
		average = sum / n;
		max = Math.abs(a[0] - average);
		for (i = 0;i < n;i++)
		{
			gap = Math.abs(a[i] - average);
			if (gap > max)
			{
				max = gap;
			}
		}
		count = 0;
		for (i = 0;i < n;i++)
		{
			gap = Math.abs(a[i] - average);
			if ((Math.abs(gap - max)) < 0.001)
			{
				x[count++] = a[i];
			}
		}
		for (j = 0;j < count - 1;j++)
		{
			for (i = 0;i < count - j - 1;i++)
			{
				if (x[i] > x[i + 1])
				{
					tmp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = tmp;
				}
			}
		}
		System.out.printf("%.f",x[0]);
		if (count > 1)
		{
			for (i = 1;i < count;i++)
			{
				System.out.printf(",%.f",x[i]);
			}
		}
		return 0;
	}
}

