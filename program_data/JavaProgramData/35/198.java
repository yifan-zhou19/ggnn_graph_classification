package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] a = new int[m][n];
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[][] b = new int[m][n];
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				b[i][j] = 0;
			}
		}
		int t = 0;
		for (int i = 0; i < m; i++)
		{
			t = 0;
			for (int j = 1; j < n; j++)
			{
				if (a[i][j] > a[i][t])
				{
					b[i][t]++;
					t = j;
				}
				else
				{
					b[i][j]++;
				}
			}
		}
		for (int j = 0; j < n; j++)
		{
			t = 0;
			for (int i = 1; i < m; i++)
			{
				if (a[i][j] < a[t][j])
				{
					b[t][j]++;
					t = i;
				}
				else
				{
					b[i][j]++;
				}
			}
		}

		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (b[i][j] == 0)
				{
					System.out.printf("%d+%d\n", i, j);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loop1;
				}
			}
		}
		System.out.print("No");
		System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		loop1:
		return 0;
	}

}

