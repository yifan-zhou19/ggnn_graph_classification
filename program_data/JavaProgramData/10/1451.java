package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i;
		int j;
		int l = 0;
		int[] a = new int[25];
		int[] b = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= k - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		b[k - 1] = 1;
		for (i = k - 2;i >= 0;i--)
		{
			for (j = i + 1;j <= k - 1;j++)
			{
				if (a[i] >= a[j] != 0 && b[i] <= b[j])
				{
					b[i] = b[j] + 1;
				}
			}
				if (b[i] == 0)
				{
					b[i] = 1;
				}
		}
		for (i = 0;i <= k - 2;i++)
		{
			for (j = 0;j <= k - 2 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					l = b[j + 1];
					b[j + 1] = b[j];
					b[j] = l;
				}
			}
		}
		System.out.printf("%d\n",b[k - 1]);
	}

}

