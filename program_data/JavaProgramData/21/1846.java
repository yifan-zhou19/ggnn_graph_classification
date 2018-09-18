package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[300];
		int k;
		int num = 0;
		double ave;
		double[] b = new double[300];
		double sum = 0;
		double max = 0;
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
		ave = sum / n;
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - ave);
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				num++;
				if (num == 1)
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
	}
}

