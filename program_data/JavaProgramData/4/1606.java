package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[100][100];
		int line;
		int row;
		int i;
		int j;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			line = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= row - 1;i++)
		{
			for (j = 0;j <= line-1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0;j <= line-1;j++)
		{
			m = 0;
			n = j;
		do
		{
			System.out.printf("%d\n",num[m][n]);
			m++;
			n--;
		} while (n != -1 && m < row);
		}
		for (i = 1;i <= row - 1;i++)
		{
			m = i;
			n = line-1;
			do
			{
				System.out.printf("%d\n",num[m][n]);
				m++;
				n--;
			} while (n != -1 && m < row);
		}
		return 0;
	}

}

