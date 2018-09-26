package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] list = new int[n];

		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				list[i] = Integer.parseInt(tempVar2);
			}
		}

		for (j = n - 2;j >= n - 3;j--)
		{
			for (k = 0;k <= j;k++)
			{
				if (list[k] > list[k + 1])
				{
					list[k] = list[k] + list[k + 1];
					list[k + 1] = list[k] - list[k + 1];
					list[k] = list[k] - list[k + 1];
				}
			}
		}
		System.out.printf("%d\n%d",list[n - 1],list[n - 2]);

		return 0;
	}

}

