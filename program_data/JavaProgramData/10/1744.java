package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[25];
		int[] max = new int[25];
		int max1 = 0;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			max[i] = 1;
		}
		max1 = 1;
		for (i = 1;i <= n - 1;i++)
		{
			for (j = 0;j <= i - 1;j++)
			{
				if ((a[j] >= a[i]) && (max[j] + 1 > max[i]))
				{
					max[i] = max[j] + 1;
				}
				if (max[i] > max1)
				{
					max1 = max[i];
				}
			}
		}
		System.out.printf("%d\n",max1);
	}
}

