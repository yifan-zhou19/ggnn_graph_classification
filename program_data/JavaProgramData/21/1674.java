package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[301];
		int sum;
		int max;
		int min;
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
		}
		sum = 0;
		max = a[0];
		min = a[0];
		for (i = 0;i < n;i++)
		{
			sum += a[i];
			if (a[i] > max)
			{
				max = a[i];
			}
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		max *= n;
		min *= n;
		if ((max - sum) > (sum - min))
		{
			System.out.printf("%d",max / n);
		}
		if ((max - sum) < (sum - min))
		{
			System.out.printf("%d",min / n);
		}
		if ((max - sum) == (sum - min))
		{
			System.out.printf("%d,%d",min / n,max / n);
		}
	}
}

