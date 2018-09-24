package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j = 0;
		int[] b = new int[300];
		double total = 0;
		double average;
		double[] sub = new double[300];
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
			total += a[i];
		}
		average = total / n;
		for (i = 0;i < n;i++)
		{
			sub[i] = Math.abs(a[i] - average);
		}
		for (i = 0;i < n;i++)
		{
			if (sub[i] > max)
			{
				max = sub[i];
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (sub[i] == max)
			{
				b[j] = a[i];
				j += 1;
			}
		}
		if (j == 1)
		{
			System.out.printf("%d",b[0]);
		}
		else
		{
			for (i = 0;i < j - 1;i++)
			{
				System.out.printf("%d,",b[i]);
			}
			System.out.printf("%d",b[j - 1]);
		}
		return 0;
	}





}

