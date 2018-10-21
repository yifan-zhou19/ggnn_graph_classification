package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][17];
		int i;
		int j;
		int k;
		int s;
		int r;
		for (j = 0;j < 100;j++)
		{
			r = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[j][1] = Integer.parseInt(tempVar);
			}
			if (a[j][1] == -1)
			{
				break;
			}
			else
			{
				for (i = 2,s = 1;a[j][i - 1] != 0;i++,s++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[j][i] = Integer.parseInt(tempVar2);
					}
				}
				for (i = 1;i < s;i++)
				{
					for (k = i + 1;k <= s;k++)
					{
						if (a[j][k] == 2 * a[j][i] || a[j][i] == 2 * a[j][k])
						{
							r++;
						}
					}
				}
				System.out.printf("%d\n",r);
			}
		}
		return 0;
	}
}

