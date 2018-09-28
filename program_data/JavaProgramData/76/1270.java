package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max;
		int min;
		int[] a = new int[20001];
		int n;
		int x;
		int y;
		int j;
		int i;
		int sum = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if (i == 1)
			{
				min = 2 * x;
				max = 2 * y;
			}
			else
			{
				if (min > 2 * x)
				{
					min = 2 * x;
				}
				if (max < 2 * y)
				{
					max = 2 * y;
				}
			}
			for (j = 2 * x;j <= 2 * y;j++)
			{
				a[j] = 1;
			}
		}
		for (i = min;i <= max;i++)
		{
			sum += a[i];
		}
		if (sum == max - min + 1)
		{
			System.out.printf("%d %d",min / 2,max / 2);
		}
		else
		{
			System.out.print("no");
		}
	return 0;
	}
}

