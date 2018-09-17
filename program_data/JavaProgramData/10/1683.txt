package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[25];
		int[] b = new int[25];
		int k;
		int i;
		int j;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = tempVar2;
			}
		}
		for (i = k - 1;i >= 0;i--)
		{
			b[i] = 1;
			for (j = i + 1;j < k;j++)
			{
				if (a[j] <= a[i])
				{
					if (b[j] + 1 > b[i])
					{
						b[i] = b[j] + 1;
					}
				}
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		System.out.printf("%d",max);
	}
}

