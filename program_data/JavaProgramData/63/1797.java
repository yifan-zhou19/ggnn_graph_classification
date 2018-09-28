package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int m1;
		int n1;
		int m2;
		int n2;
		int i;
		int j;
		int l;
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m1;i++)
		{
			for (int j = 0;j < n1;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m2;i++)
		{
			for (int j = 0;j < n2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < m1;i++)
		{
			for (j = 0;j < n2;j++)
			{
				for (l = 0;l < n1;l++)
				{
				c[i][j] += a[i][l] * b[l][j];
				}
			}
		}
		for (i = 0;i < m1;i++)
		{
			for (j = 0;j < n2;j++)
			{
			if (j < n2 - 1)
			{
			 System.out.print(c[i][j]);
			 System.out.print(" ");
			}
			if (j == n2 - 1)
			{
				System.out.print(c[i][j]);
				System.out.print("\n");
			}
			}
		}
		return 0;
	}

}

