package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m1 = new int[120];
		int[] m2 = new int[120];
		int[][][] a = new int[100][120][120];
		int i;
		int j;
		int k;
		int s = 0;
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
				m1[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m2[i] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < m1[i];j++)
			{
				for (k = 0;k < m2[i];k++)
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
			if (m1[i] == 1)
			{
			for (j = 0;j < m2[i];j++)
			{
				s = s + a[i][0][j];
			}
			}
			else if (m2[i] == 1)
			{
			for (j = 0;j < m1[i];j++)
			{
				s = s + a[i][j][0];
			}
			}
			else
			{
			for (j = 0;j < m2[i] - 1;j++)
			{
				s = s + a[i][0][j];
			}
			for (j = 0;j < m1[i] - 1;j++)
			{
				s = s + a[i][j][m2[i] - 1];
			}
			for (j = m2[i] - 1;j > 0;j--)
			{
				s = s + a[i][m1[i] - 1][j];
			}
			for (j = m1[i] - 1;j > 0;j--)
			{
				s = s + a[i][j][0];
			}
			}
		System.out.printf("%d\n",s);
		s = 0;
		}
		return 0;
	}
}

