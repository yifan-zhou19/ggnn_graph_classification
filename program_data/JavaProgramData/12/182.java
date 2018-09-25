package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][16];
		int[] b = new int[100];
		int[] n = new int[100];
		int i;
		int j;
		int k;
		int m = 0;
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][0] = Integer.parseInt(tempVar);
			}
			if (a[i][0] == -1)
			{
				break;
			}
			if (a[i][0] != -1)
			{
				m = m + 1;
				n[i]++;
				for (j = 1;j < 16;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i][j] = Integer.parseInt(tempVar2);
					}
					if (a[i][j] != 0)
					{
						n[i] = n[i] + 1;
					}
					if (a[i][j] == 0)
					{
						break;
					}
				}
			}
		}
		for (i = 0;i < m;i++)
		{
				for (j = 0;j < n[i];j++)
				{
					for (k = 0;k < n[i];k++)
					{
						if (a[i][j] == 2 * a[i][k])
						{
							b[i] = b[i] + 1;
						}
					}
				}

		}
		for (i = 0;i < m;i++)
		{

				System.out.printf("%d\n",b[i]);
		}
	}


}

