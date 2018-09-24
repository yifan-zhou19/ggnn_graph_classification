package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50002];
		int i;
		int j;
		int n;
		for (i = 2;i <= 50000;i++)
		{
			if (a[i] != 0)
			{
				continue;
			}
			for (j = 2;j <= 50000 / i;j++)
			{
				a[i * j] = 1;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (j = 3;j <= i / 2;j += 2)
			{
				if (a[j] == 0 && a[i - j] == 0)
				{
					break;
				}
			}
			System.out.printf("%d=%d+%d\n",i,j,i - j);
		}
		return 0;
	}
}

