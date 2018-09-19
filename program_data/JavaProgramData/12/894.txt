package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[500][15];
		int i;
		int j;
		int t;
		int number;
		for (i = 0;;i++)
		{
			number = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][0] = Integer.parseInt(tempVar);
			}
			if (a[i][0] == -1)
			{
				break;
			}
			for (j = 1;;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (a[i][j] == 0)
				{
					System.out.printf("%d\n",number);
					break;
				}
				for (t = 0;t < j;t++)
				{
					if (a[i][j] * 2 == a[i][t])
					{
						number++;
						break;
					}
					if (a[i][j] == a[i][t] * 2)
					{
						number++;
					}
				}
			}
		}
		return 0;
	}
}

