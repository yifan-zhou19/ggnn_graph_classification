package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[300];
		int j = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		for (k = 0;k <= j;k++)
		{
				if (a[j] == a[k])
				{
					break;
				}
		}
				if (k == j)
				{
					System.out.printf("%d",a[j]);
				}
		for (j = 1;j < n;j++)
		{
			for (k = 0;k <= j;k++)
			{
				if (a[j] == a[k])
				{
					break;
				}
			}
				if (k == j)
				{
					System.out.printf(",%d",a[j]);
				}
		}
		return 0;
	}
}

