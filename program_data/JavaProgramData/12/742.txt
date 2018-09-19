package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][16];
		int[] b = new int[100];
		int[] c = new int[101];
		int k;
		int i;
		int j;
		int l;
		int m;
		for (i = 1;1;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][1] = Integer.parseInt(tempVar);
			}
			if (a[i][1] == (-1))
			{
				i--;
				break;
			}
			else
			{
				for (j = 2;1;j++)
				{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (a[i][j] == 0)
				{
					j = j - 1;
					break;
				}
				}
			}
			c[i] = j;
		}

		for (k = 1;k <= i;k++)
		{
			for (l = 1;l <= c[k];l++)
			{

				for (m = 1;m <= c[k];m++)
				{
					if (a[k][m] / a[k][l] == 2 && a[k][m] % a[k][l] == 0)
					{
						b[k] = b[k] + 1;
					}
					else
					{
						b[k] = b[k];
					}
				}
			}


			System.out.printf("%d\n",b[k]);
		}
		return 0;

	}
}

