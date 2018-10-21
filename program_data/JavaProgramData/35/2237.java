package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int a;
		int b;
		int i;
		int j;
		int[] k = new int[8];
		int[] l = new int[8];
		int I = -1;
		int J = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[j][i] = Integer.parseInt(tempVar3);
			}
			}
		}
		for (i = 0;i < b;i++)
		{
		k[i] = sz[i][0];
		}
		for (i = 0;i < a;i++)
		{
		l[i] = sz[0][i];
		}
			for (i = 0;i < b;i++)
			{
				for (j = 0;j < a;j++)
				{
					if (k[i] > sz[i][j])
					{
					k[i] = sz[i][j];
					}
				}
			}

			for (i = 0;i < a;i++)
			{
				for (j = 0;j < b;j++)
				{
					if (l[i] < sz[j][i])
					{
					l[i] = sz[j][i];
					}
				}
			}
	for (i = 0;i < b;i++)
	{
		for (j = 0;j < a;j++)
		{
	if (k[i] == l[j])
	{
		I = i;
	J = j;
	System.out.printf("%d+%d",J,I);
	}
		}
	}
	if (I == -1 && J == -1)
	{
	System.out.print("No");
	}
	return 0;
	}
}

