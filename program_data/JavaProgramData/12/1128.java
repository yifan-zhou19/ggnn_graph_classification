package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int count = 0;
		int i;
		int j;
		int k;
		int m;
		for (m = 0;;m++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[m][0] = Integer.parseInt(tempVar);
			}
			if (a[m][0] == -1)
			{
				break;
			}
			else
			{
				for (i = 1;;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead(" ");
					if (tempVar2 != null)
					{
						a[m][i] = Integer.parseInt(tempVar2);
					}
					if (a[m][i] == 0)
					{
						break;
					}
				}
			}
			for (j = 0;j < i;j++)
			{
				for (k = j + 1;k < i;k++)
				{
					if ((a[m][j] == 2 * a[m][k]) || (a[m][j] * 2 == a[m][k]))
					{
						count = count + 1;
					}
				}
			}
			System.out.printf("%d\n",count);
			count = 0;
		}

	return 0;
	}




}

