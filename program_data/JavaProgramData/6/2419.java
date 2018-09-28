package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int s;
		int[][][] a = new int[100][100][100];
		int[] b = new int[100];
		int[] c = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < b[i];j++)
			{
				for (k = 0;k < c[i];k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j][k] = Integer.parseInt(tempVar4);
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			s = 0;
			if (c[i] > 1)
			{
			for (j = 0;j < c[i];j++)
			{
				s = s + a[i][0][j] + a[i][b[i] - 1][j];
			}
			}
			else
			{
				s = s + a[i][0][0];
			}
			for (j = 1;j < b[i] - 1;j++)
			{
				s = s + a[i][j][0] + a[i][j][c[i] - 1];
			}
			System.out.printf("%d\n",s);
		}
		return 0;
	}
}

