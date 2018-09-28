package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] num = new double[300];
		double[] a = new double[300];
		int i;
		int c = 0;
		double max = 0;
		double t;
		double ping = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Double.parseDouble(tempVar);
		}

		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Double.parseDouble(tempVar2);
			}
		}
		for (i = 0;i < t;i++)
		{
			ping = ping + num[i];
		}
		ping = ping / t;
		for (i = 0;i < t;i++)
		{
			a[i] = Math.abs(num[i] - ping);
		}
		for (i = 0;i < t;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		for (i = 0;i < t;i++)
		{
			if (a[i] == max)
			{
				c++;
				if (c == 1)
				{
					System.out.printf("%.0f",num[i]);
				}
				else
				{
					System.out.printf(",%.0f",num[i]);
				}
			}
		}

	}
}

