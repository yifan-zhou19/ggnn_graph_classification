package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int[] a = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d", a[0]);
		for (j = 2;j <= n;j++)
		{
			for (m = 1;m <= j - 1;m++)
			{
				if (a[j - 1] == a[m - 1])
				{
					break;
				}
			}
			if (m == j)
			{
				System.out.printf(" %d", a[j - 1]);
			}
		}
		return 0;
	}
}

