package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		int l;
		int[][][] a = new int[100][100][100];
		int[] len = new int[100];
		int[] cro = new int[100];
		int[] b = new int[100];
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
				len[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				cro[i] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < len[i];j++)
			{
				for (l = 0;l < cro[i];l++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j][l] = Integer.parseInt(tempVar4);
					}
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < cro[i];j++)
			{
				b[i] += a[i][0][j];
			}
			for (j = 1;j < len[i];j++)
			{
				b[i] += a[i][j][(cro[i] - 1)];
			}
			for (j = 0;j < cro[i] - 1;j++)
			{
				b[i] += a[i][len[i] - 1][j];
			}
			for (j = 1;j < len[i] - 1;j++)
			{
				b[i] += a[i][j][0];
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}
}

