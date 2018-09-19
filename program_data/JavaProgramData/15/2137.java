package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[][] c = new int[1000][1000];
		int count = 0;
		int mark;
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
					c[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			mark = 0;
			for (j = 0;j < n;j++)
			{
				if (c[i][j] == 0 && c[i][j + 1] == 0)
				{
					break;
				}
				else
				{
					if (c[i][j] == 0)
					{
						mark++;
					}
				}
				if (c[i][j] != 0 && mark % 2)
				{
					count++;
				}
			}
		}
		System.out.printf("%d\n",count);
	}
}

