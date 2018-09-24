package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] a = new int[25];
		int i;
		for (i = 0;i <= k - 1;i++)
		{
			if (i == 0)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			else
			{
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
		}
		int[] n = new int[25];
		for (i = 0;i <= 24;i++)
		{
			n[i] = 1;
		}
		n[k - 1] = 1;
		int j;
		int m;
		for (j = k - 2;j >= 0;j--)
		{
			for (m = k - 1;m >= j + 1;m--)
			{

				if (a[m] <= a[j] != 0 && n[m] >= n[j] - 1)
				{
					n[j] = n[m] + 1;
				}
			}
		}
		int max = 0;
		for (i = 0;i < k;i++)
		{
			if (max < n[i])
			{
				max = n[i];
			}
		}
		System.out.printf("%d",max);

	}
}

