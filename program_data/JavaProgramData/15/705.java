package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] n = new int[1000][1000];
		int num;
		int i;
		int j;
		int[] p = new int[200];
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			for (j = 0;j < num;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					n[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		int w = 0;
		for (i = 0;i < (num - 1);i++)
		{
			for (j = 0;j < (num - 1);j++)
			{
				if (n[i][j] == 0 && n[i][j + 1] == 0)
				{
					break;
				}
				else if (n[i][j] == 0 && n[i][j + 1] != 0)
				{
					p[w] = j;
					w++;
				}
			}
		}
		for (i = 0;i < w - 1;i = i + 2)
		{
			k = k + (p[i + 1] - p[i] - 1);
		}
		System.out.printf("%d",k);
	}




}

