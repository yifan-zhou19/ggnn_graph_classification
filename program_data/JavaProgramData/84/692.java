package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max;
		int sum;
		int[] a = new int[99];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		max = a[0];
		sum = a[0];
		for (i = 1;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] > max)
			{
				sum = max;
				max = a[i];
			}
			if (max > a[i] && (a[i] > sum))
			{
				sum = a[i];
			}
		}
		if (i <= 99)
		{
			System.out.printf("%d\n%d",max,sum);
		}
		return 0;
	}
}

