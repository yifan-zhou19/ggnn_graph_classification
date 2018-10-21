package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][16];
		int i = 0;
		int j = 0;
		int p = 0;
		int k = 0;
		int num = 0;
		do
		{
			for (j = 0;j < 16;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[p][j] = Integer.parseInt(tempVar);
				}
				if (a[p][j] == 0 || a[p][j] == -1)
				{
					break;
				}
			}
			p++;
		} while (a[p - 1][0] != -1);
	p--;
			for (i = 0;i < p;i++)
			{
				for (j = 0;a[i][j] != 0;j++)
				{
					for (k = 0;a[i][k] != 0;k++)
					{
						if (2 * a[i][k] == a[i][j])
						{
							num++;
						}
					}
				}
				System.out.printf("%d\n",num);
				num = 0;
			}
				return 0;
	}

}

