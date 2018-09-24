package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int[] a = new int[26];
		int[] b = new int[26];
		for (i = 1;i < 26;i++)
		{
			b[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		int[] num = new int[26];
		int max;
		num[k] = 1;
		for (i = k - 1;i > 0;i--)
		{
			for (j = k;j > i;j--)
			{
				if (a[j] <= a[i])
				{
					b[j] = num[j];
				}
			}
			max = 0;
			for (j = k;j > i;j--)
			{
				if (b[j] >= max)
				{
					max = b[j];
				}
			}
			num[i] = max + 1;
			for (j = 1;j < 26;j++)
			{
				b[j] = 0;
			}
		}

		int x;
		x = num[1];
		for (i = 1;i <= k;i++)
		{
			if (x <= num[i])
			{
				x = num[i];
			}
		}
		System.out.printf("%d\n",x);
		return 0;
	}

}

