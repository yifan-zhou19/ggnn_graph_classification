package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] SZ = new int[100][100];
		int n;
		int m1;
		int n1;
		int m2;
		int n2;
		int mj;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					SZ[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (int p = 0;p < n;p++)
		{
			for (int q = 0;q < n;q++)
			{
				if (SZ[p][q] == 0)
				{
					n1 = p;
					m1 = q;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto sen1;
				}
			}

		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		sen1:
		for (int x = n - 1;x >= 0;x--)
		{
			for (int y = n - 1;y >= 0;y--)
			{
				if (SZ[x][y] == 0)
				{
					n2 = x;
					m2 = y;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto sen2;
				}
			}

		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		sen2:
		mj = (m2 - m1 - 1) * (n2 - n1 - 1);
			System.out.printf("%d",mj);
		return 0;
	}
}

