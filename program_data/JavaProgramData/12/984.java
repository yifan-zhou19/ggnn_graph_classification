package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[20][16];
		int[] bei = new int[20];
		int j;
		int k;
		int chu;
		int last;
		for (j = 0;j < 20;j++)
		{
			for (k = 0;k < 16;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[j][k] = Integer.parseInt(tempVar);
				}
				if (a[j][k] == 0 || a[j][k] == -1)
				{
					break;
				}
			}
			if (a[j][k] < 0)
			{
				last = j;
				break;
			}
		}
		for (j = 0;j < 20;j++)
		{
			for (k = 0;k < 16;k++)
			{
				for (chu = 0;chu < 16;chu++)
				{
					if ((a[j][chu] == 2 * a[j][k]) && a[j][k] != 0 && a[j][chu] != 0)
					{
						bei[j] = bei[j] + 1;
					}
				}
			}
			if (a[j][0] == -1)
			{
				break;
			}
		}
		for (j = 0;j < last;j++)
		{
			System.out.printf("%d\n",bei[j]);
		}
		return 0;
	}
}

