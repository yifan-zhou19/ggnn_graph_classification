package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][6];
		int[] b = new int[100];
		int i;
		int m;
		int t;
		for (i = 0;i < 100;i++)
		{

				for (m = 0;m < 6;m++)
				{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][m] = Integer.parseInt(tempVar);
				}
				}
				if (a[i][0] == 0 && a[i][1] == 0 && a[i][2] == 0 && a[i][3] == 0 && a[i][4] == 0 && a[i][5] == 0)
				{
					break;
				}
		}

		for (t = 0;t < i;t++)
		{

		b[t] = (12 - a[t][0] - 1) * 3600 + a[t][3] * 3600 + (60 - a[t][1] + a[t][4] - 1) * 60 + 60 - a[t][2] + a[t][5];
		System.out.printf("%d\n",b[t]);
		}
		return 0;

	}

}

