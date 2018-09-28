package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int outcome;
		int i;
		int j;
		int m;
		int n;
		int m1;
		int n1;
		int exchange = new int(int b[6][6], int m1, int n1);

		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}

		outcome = exchange(a, m, n);
		if (outcome == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0; i < 5; i++)
			{
				for (j = 0; j < 4; j++)
				{
					System.out.printf("%d",a[i][j]);
					System.out.print(" ");
				}
				System.out.printf("%d",a[i][4]);
				System.out.print("\n");
			}
		}
		return 0;
	}

	public static int exchange(int[][] b, int m1, int n1)
	{
		int i;
		int[] c = new int[6];
		if (m1 < 0 || m1>4 || n1 < 0 || n1 > 4)
		{
			return 0;
		}
		else
		{
			for (i = 0; i < 5; i++)
			{
				c[i] = b[m1][i];
				b[m1][i] = b[n1][i];
				b[n1][i] = c[i];
			}
			return 1;
		}
	}
}

