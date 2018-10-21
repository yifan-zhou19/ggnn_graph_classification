package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int[][] a = new int[20][6];
	int t;
	int i;
	int j;
	for (i = 0;i < 20;i++)
	{
		for (j = 0;j < 6;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
		}

		if (a[i][0] == 0 && a[i][1] == 0 && a[i][2] == 0 && a[i][3] == 0 && a[i][4] == 0 && a[i][5] == 0)
		{
		break;
		}
		else
		{
			t = (12 + a[i][3]) * 3600 + a[i][4] * 60 + a[i][5] - a[i][0] * 3600 - a[i][1] * 60 - a[i][2];
			System.out.printf("%d\n",t);
		}
	}
	return 0;
	}
}

