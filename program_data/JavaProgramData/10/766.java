package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[A];
		int i;
		int j;
		int n;
		int[] b = new int[A];
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = n - 1;i >= 0;i--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			b[i] = 1;
			for (j = i - 1;j >= 0;j--)
			{
				if (a[i] >= a[j] != 0 && b[i] < b[j] + 1)
				{
					 b[i] = b[j] + 1;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (max < b[i])
			{
				max = b[i];
			}
		}
		System.out.printf("%d",max);
		return 0;
	}


}

