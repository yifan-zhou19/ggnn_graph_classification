package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[][][] a = new int[100][100][100];
		int[][] b = new int[100][2];
		int[] s = new int[100];
		int i;
		int j;
		int l;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i][1] = Integer.parseInt(tempVar3);
			}
			x = b[i][0];
			y = b[i][1];
			s[i] = 0;
			for (j = 0;j < x;j++)
			{
				for (l = 0;l < y;l++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[j][l][i] = Integer.parseInt(tempVar4);
					}
					if (j == 0 || l == 0 || j == x - 1 || l == y - 1)
					{
						s[i] += a[j][l][i];
					}
				}
			}

		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",s[i]);
		}
		return 0;
	}

}

