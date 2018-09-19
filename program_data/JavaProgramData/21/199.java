package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		double max;
		double s;
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		max = 0;
		s = 0;
		j = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			s = s + a[i];
		}
		p = s / n;
		for (i = 1;i <= n;i++)
		{
			if (Math.abs(p - a[i]) > max)
			{
				max = Math.abs(p - a[i]);
				j = i;
			}
		}
		if (j != 0)
		{
			System.out.printf("%d",a[j]);
		}
		for (i = 1;i <= n;i++)
		{
			if (Math.abs(p - a[i]) == max && i != j)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		return 0;
	}

}

