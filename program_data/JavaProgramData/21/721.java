package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		double[] b = new double[300];
		int n;
		int i;
		int j;
		double zong = 0;
		double max = 0;
		double ping;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			zong = zong + a[i];
		}
		ping = zong / n;
		for (i = 0;i <= n - 1;i++)
		{
			if (ping - a[i] >= 0)
			{
				b[i] = ping - a[i];
			}
			else
			{
				b[i] = a[i] - ping;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0,j = 0;i <= n - 1;i++)
		{
			if (b[i] == max)
			{
				j++;
				if (j == 1)
				{
					System.out.printf("%d",a[i]);
				}
				else
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}

