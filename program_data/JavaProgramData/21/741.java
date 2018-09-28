package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int flag1;
		int flag2 = -1;
		double ave;
		double sum = 0.0;
		double max = 0.0;
		double[] b = new double[100];
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
		ave = (double)sum / n;
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - ave);
		if (b[i] > max)
		{
			flag1 = i,max = b[i];
		}
		if (b[i] == max)
		{
			flag2 = i;
		}
		}
		if (flag2 == 1 || flag1 == flag2)
		{
			System.out.printf("%d",a[flag1]);
		}
		else if (a[flag1] - ave < 0)
		{
			System.out.printf("%d,%d",a[flag1],a[flag2]);
		}
		else
		{
			System.out.printf("%d,%d",a[flag2],a[flag1]);
		}
	return 0;
	}
}

