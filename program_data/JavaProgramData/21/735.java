package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		double average;
		double sum = 0.0;
		double max;
		int[] a = new int[305];
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
		average = sum / n;
		max = Math.abs(a[0] - average);
	   // printf("%lf  %lf",average,max);
		for (i = 1;i < n;i++)
		{
			if (Math.abs(a[i] - average) > max)
			{
				max = Math.abs(a[i] - average);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (max - Math.abs(a[i] - average) < 1e-6)
			{
				System.out.printf("%d",a[i]);
			break;
			}
		}
		for (i++;i < n;i++)
		{

			if (max - Math.abs(a[i] - average) < (1e-6))
			{
				System.out.printf(",%d",a[i]);
			}
		}
		return 0;
	}

}

