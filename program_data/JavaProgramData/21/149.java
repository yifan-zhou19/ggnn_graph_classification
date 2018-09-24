package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] a = new double[300];
		double sum = 0;
		double max = 0;
		double t;
		int i;
		int j;
		int n;
		int jud = 0;
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
				a[i] = Double.parseDouble(tempVar2);
			}
		}
		sum /= n;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(sum - a[i]) > max)
			{
				max = Math.abs(sum - a[i]);
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j],a[j] = a[j + 1],a[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(Math.abs(sum - a[i]) - max) <= 0.0001)
			{
			if (jud == 0)
			{
				jud = 1,System.out.printf("%g",a[i]);
			}
			else
			{
				System.out.printf(",%g",a[i]);
			}
			}
		}
	}

}

