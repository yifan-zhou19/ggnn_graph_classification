package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[25];
		int[] b = new int[25];
		int i;
		int j;
		int k;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			b[i] = 1;
		}
		for (i = k - 2;i >= 0;i--)
		{
			for (j = i + 1;j <= k - 1;j++)
			{
				if (a[i] >= a[j])
				{
					if (b[j] >= b[i])
					{
						b[i] = b[j] + 1;
					}
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			if (b[i] > b[i + 1])
			{
				j = b[i];
				b[i] = b[i + 1];
				b[i + 1] = j;
			}
		}
		System.out.printf("%d\n",b[k - 1]);
	}
}

