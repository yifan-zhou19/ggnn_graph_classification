package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int i1;
		int j1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			j = Integer.parseInt(tempVar2);
		}
		for (i1 = 1;i1 <= i;i1++)
		{
			for (j1 = 1;j1 <= j;j1++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i1][j1] = Integer.parseInt(tempVar3);
				}
			}
		}
		j1 = 1;
		i1 = 1;
		System.out.printf("%d",a[1][1]);
		while (j1 != j || i1 != i)
		{
			i1 = i1 + 1;
			j1 = j1 - 1;
			if (j1 == 0)
			{
				j1 = i1;
				i1 = 1;
			}
			if (j1 > j || i1 > i)
			{
				continue;
			}
			System.out.printf("\n%d",a[i1][j1]);
		}
		return 0;
	}
}

