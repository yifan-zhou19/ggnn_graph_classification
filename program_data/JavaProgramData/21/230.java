package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int m;
		int j;
		double aver;
		double[] b = new double[300];
		double max = 0;
		double former;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		aver = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			aver = aver + a[i];
		}
		aver = aver / n;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					m = a[j];
					a[j] = a[j + 1];
					a[j + 1] = m;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - aver);
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				j++;
				if (j == 1)
				{
					System.out.printf("%d",a[i]);
					former = a[i];
				}
				else
				{
					if (a[i] != former)
					{
						System.out.printf(",%d",a[i]);
						former = a[i];
					}
				}
			}
		}
		System.out.print("\n");
	}
}

