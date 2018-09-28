package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int d = 0;
		int[][] shuzu = new int[5000][6];
		for (n = 0;n < 5000;n++)
		{
			for (int a = 0;a < 6;a++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					shuzu[n][a] = Integer.parseInt(tempVar);
				}
			}
			d++;
			if (shuzu[n][0] == 0)
			{
				break;
			}
		}
		int[] shu = new int[5000];
		for (int b = 0;b < d - 1;b++)
		{
			shu[b] = (shuzu[b][3] + 12 - shuzu[b][0]) * 3600;
			shu[b] = shu[b] + shuzu[b][4] * 60 + shuzu[b][5] - shuzu[b][1] * 60 - shuzu[b][2];
		}
		for (int c = 0;c < d - 1;c++)
		{
			System.out.printf("%d\n",shu[c]);
		}
		return 0;
	}
}

