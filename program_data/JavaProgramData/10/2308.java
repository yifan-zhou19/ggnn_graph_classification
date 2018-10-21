package <missing>;

public class GlobalMembers
{
	public static int abc(Object elem1, Object elem2)
	{
	return *(int)elem2 - (int)elem1;
	}
	public static int Main()
	{
		int n;
		int[][] a = new int[2][25];
		int i;
		int j;
		int x;
		int y;
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
				a[0][i] = Integer.parseInt(tempVar2);
			}
		}
		a[1][0] = 1;
		for (i = 1;i < n;i++)
		{
			a[1][i] = 1;
			for (j = 0;j < i;j++)
			{
				if (a[0][i] >= a[0][j] != 0 && a[1][i] <= a[1][j])
				{
					a[1][i] = a[1][j] + 1;
				}
			}
		}
		qsort(a[1],n,4,abc);
		System.out.printf("%d",a[1][0]);

	}
}

