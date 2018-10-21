package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int j;
		int i;
		int k;
		int[] f = new int[25];
		int[] a = new int[25];
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
			f[i] = 1;
		}
		for (i = k - 2;i >= 0;i--)
		{
			for (j = k - 1;j >= i + 1;j--)
			{
				if (a[i] >= a[j] != 0 && f[i] <= f[j])
				{
					f[i] = f[j] + 1;
				}
			}
		}

			for (j = 0 + 1;j < k;j++)
			{
				if (f[0] < f[j])
				{
					f[0] = f[j];
				}
			}
			System.out.printf("%d",f[0]);

	}

}

