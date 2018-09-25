package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int sum1 = 0;
		int sum2 = 0;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				sum1++;
			}
			else
			{
				if (sum1 > sum2)
				{
					sum2 = sum1;
				}
				sum1 = 0;
			}
			if (i == n - 1 && sum1 > sum2)
			{
					sum2 = sum1;
			}
		}
		System.out.printf("%d",sum2);
		return 0;
	}
}

