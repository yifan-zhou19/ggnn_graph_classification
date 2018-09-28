package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] qujian = new int[50000][2];
		int row;
		for (row = 0;row < n;row++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					qujian[row][0] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qujian[row][1] = Integer.parseInt(tempVar3);
				}
		}

		int i;
		int zuo;
		int you;
		for (i = 1;i < n;i++)
		{
			for (row = 0;row < n - i;row++)
			{
				if (qujian[row][0] > qujian[row + 1][0])
				{
					zuo = qujian[row + 1][0];
					you = qujian[row + 1][1];
					qujian[row + 1][0] = qujian[row][0];
					qujian[row + 1][1] = qujian[row][1];
					qujian[row][0] = zuo;
					qujian[row][1] = you;
				}
			}
		}

		int jieguo = 0;
		int p;
		for (row = 1;row < n;row++)
		{
			for (p = 0;p < row;p++)
			{
				if (qujian[p][1] >= qujian[row][0])
				{
					jieguo++;
					break;
				}
			}
		}

		int j;
		int e;
		for (j = 1;j < n;j++)
		{
			for (row = 0;row < n - j;row++)
			{
				if (qujian[row][1] > qujian[row + 1][1])
				{
					e = qujian[row + 1][1];
					qujian[row + 1][1] = qujian[row][1];
					qujian[row][1] = e;
				}
			}
		}

		if (jieguo == n - 1)
		{
			System.out.printf("%d %d",qujian[0][0],qujian[n - 1][1]);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

