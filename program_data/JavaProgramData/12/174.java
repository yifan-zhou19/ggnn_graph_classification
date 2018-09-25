package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int t = 0;
		int i;
		int j;
		int k;
		int num;
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[t][i] = Integer.parseInt(tempVar);
			}
			if (a[t][i] == 0)
			{
				t++;
			}
		else if (a[t][i] == -1)
		{
			break;
		}
		}

	for (k = 0;k < t;k++)
	{
		num = 0;
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				if (a[k][j] == 2 * a[k][i] && a[k][i] != 0)
				{
					num++;
				}
			}
		}
		System.out.printf("%d\n",num);
	}
		return 0;
	}

}

