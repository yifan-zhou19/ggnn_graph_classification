package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int flag;
		int[] a = new int[300];
		double sum;
		double ave;
		double max;
		double[] b = new double[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum += a[i];
		}
		ave = sum / n;
		for (i = 0;i < n;i++)
		{
			b[i] = ((double)a[i] - ave);
			if (b[i] < 0)
			{
				b[i] = -b[i];
			}

		}
		max = b[0];
		for (i = 1;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		flag = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				if (flag == 0)
				{
					System.out.printf("%d",a[i]);
					flag = 1;
				}
				else
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}
		return 0;
	}


}

