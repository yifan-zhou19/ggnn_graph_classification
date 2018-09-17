package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[100][15];
		int i;
		int j;
		int n;
		int m;
		int[] a = new int[100];
		int p;
		int[] b = new int[100];
		for (i = 0;;)
		{
			for (j = 0;;)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s[i][j] = Integer.parseInt(tempVar);
				}
				if (s[i][j] == 0)
				{
					a[i] = j + 1;
					i++;
					break;
				}
				else if (s[i][j] == -1)
				{
					break;
				}
				else
				{
					j++;
				}
			}
			if (s[i][j] == -1)
			{
				break;
			}
		}

		for (m = 0;m < i;m++)
		{
			for (n = 0;n < a[m] - 1;n++)
			{
				for (p = 0;p < a[m] - 1;p++)
				{
					if (s[m][p] == 2 * s[m][n])
					{
						b[m]++;
					}
				}
			}
		}

		for (m = 0;m < i;m++)
		{
			System.out.printf("%d\n",b[m]);
		}


	}
}

