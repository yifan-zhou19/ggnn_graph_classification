package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int n;
		int i1 = 0;
		int j1 = 0;
		int i2 = 0;
		int j2 = 0;
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i1 != 0)
			{
				break;
			}
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					i1 = i + 1;
					j1 = j + 1;
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					i2 = i + 1;
					j2 = j + 1;
				}
			}
		}
		System.out.printf("%d",(i2 - i1 - 1) * (j2 - j1 - 1));
	}
}

