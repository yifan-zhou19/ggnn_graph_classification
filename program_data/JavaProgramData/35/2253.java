package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[200][200];
		int i;
		int j;
		int m;
		int k;
		int counter = 0;
		int s;
		int n;
		int col;
		int row;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		System.in.read();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (n = 0;n < row;n++)
		{
			m = a[n][0];
			k = 0;
			for (j = 0;j < col;j++)
			{

				if (a[n][j] > m)
				{
					 m = a[n][j];
					 k = j;
				}

			}
			s = a[0][k];
			for (i = 0;i < row;i++)
			{
				if (a[i][k] < s)
				{
					s = a[i][k];
				}
			}
			if (s == m)
			{
				System.out.printf("%d+%d\n",n,k);
				counter++;
			}
		}
		if (counter == 0)
		{
			System.out.print("No\n");
		}

		return 0;
	}
}

