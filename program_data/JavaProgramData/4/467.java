package <missing>;

public class GlobalMembers
{
	// ??????.cpp : Defines the entry point for the console application.
	//


	public static void Main(String[] args)
	{
		int m;
		int n;
		int row;
		int col;
		int[][] sz = new int[100][100];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (m = 0;m < row;m++)
		{
			for (n = 0;n < col;n++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[m][n] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;k < col;k++)
		{
			m = 0;
			n = k;
			while (n >= 0 && m != row)
			{
				System.out.printf("%d\n",sz[m][n]);
				m++;
				n--;
			}
		}
		for (k = 1;k < row;k++)
		{
			m = k;
			n = col - 1;
			while (n >= 0 && m != row)
			{
				System.out.printf("%d\n",sz[m][n]);
				m++;
				n--;
			}
		}
	}


}

