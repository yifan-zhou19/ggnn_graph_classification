package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[15];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		int i = 1;
		int k = 0;
		while (a[i - 1] != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			k = k + 1;
			i++;
		}
		int j;
		int n = 0;
		for (i = 0;i <= k - 1;i++)
		{
			for (j = 0;j <= k - 1;j++)
			{
				if (a[i] == 2 * a[j])
				{
					n = n + 1;
				}
			}
		}
		System.out.printf("%d",n);
	}
}

