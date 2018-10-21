package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int[] b = new int[300];
		int j;
		int k;
		double sum = 0;
		double aver;
		double max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i = i + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + a[i];
		}
		aver = sum / (double)n;
		max = Math.abs(a[0] - aver);
		j = 0;
		for (i = 1;i < n;i = i + 1)
		{
			if (max < Math.abs(a[i] - aver))
			{
				max = Math.abs(a[i] - aver);
			}
		}
		for (i = 0;i < n;i = i + 1)
		{
			if (Math.abs(a[i] - aver) == max)
			{
				b[j] = a[i];
				j = j + 1;
			}
		}
		k = j;
		for (i = 0;i < k;i = i + 1)
		{
			for (j = i;j < k;j = j + 1)
			{
			if (b[i] > b[j])
			{
				n = b[i];
				b[i] = b[j];
				b[j] = n;
			}
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < j;i = i + 1)
		{
			System.out.printf(",%d",b[i]);
		}
	}

}

