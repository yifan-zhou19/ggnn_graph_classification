package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] picture = new int[1000][1000];
		int[] hang = new int[1000];
		int i;
		int j;
		int m = 0;
		int mg = 0;
		int l = 0;
		int number;
		for (i = 0;i < n;i++)
		{
			hang[i] = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					picture[i][j] = Integer.parseInt(tempVar2);
				}
				if (picture[i][j] == 0)
				{
					hang[i] = hang[i] + 1;
				}
			}
			if (hang[i] > 2 && m == 0)
			{
				m = i;
				mg = hang[i];
			}
			else if (hang[i] > 2 && m > 0)
			{
				l = i;
			}
		}
		number = (l - m - 1) * (mg - 2);
		System.out.printf("%d",number);

	}


}

