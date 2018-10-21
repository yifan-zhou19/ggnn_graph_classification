package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[22];
		int i;
		int g;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			g = Integer.parseInt(tempVar);
		}
		for (j = 0;j < g;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n;i++)
			{
				if ((i == 0) || (i == 1))
				{
					a[i] = 1;
				}
				if (i > 1)
				{
					a[i] = a[i - 1] + a[i - 2];
				}
			}
			if (j == 0)
			{
				System.out.printf("%d",a[n - 1]);
			}
			else if (j != 0)
			{
				System.out.printf("\n%d",a[n - 1]);
			}
		}
		return 0;
	}

}

