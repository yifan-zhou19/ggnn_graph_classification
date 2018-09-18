package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int tmp;
		int n;
		int sum = 0;
		int p = 0;
		double average = 0;
		double[] b = new double[300];
		double max = 0;
		int[] a = new int[300];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			sum += a[i];
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
			if (a[j] > a[j + 1])
			{
				tmp = a[j + 1];
				a[j + 1] = a[j];
				a[j] = tmp;
			}
			}
		}
		average = (sum * 1.0) / (n * 1.0);
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - average);
		}

		for (i = 0;i < n;i++)
		{
			if (max < b[i])
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				System.out.printf("%d",a[i]);
				p = i;
				break;
			}
		}
		for (i = p + 1;i < n;i++)
		{
			if (b[i] == max)
			{
				System.out.printf(",%d",a[i]);
			}
		}

		return 0;
	}

}

