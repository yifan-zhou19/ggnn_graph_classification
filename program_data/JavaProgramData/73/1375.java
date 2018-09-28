package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] f = new int[5][5];
		int a;
		int b;
		int c;
		int d;
		int i;
		int j;
		c = 0;
		d = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					f[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				for (a = 0;a < 5;a++)
				{
					for (b = 0;b < 5;b++)
					{
						if (f[i][j] >= f[i][a] != 0 && f[i][j] <= f[b][j])
						{
					c++;
					if (c == 25)
					{
					d = 1;
					System.out.printf("%d %d %d",i + 1,j + 1,f[i][j]);
					break;
					}
						}
						else
						{
							c = 0;
						}
					}
				}
			}
		}
		if (d == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

