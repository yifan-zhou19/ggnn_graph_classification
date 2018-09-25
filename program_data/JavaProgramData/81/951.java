package <missing>;

public class GlobalMembers
{
	public static int swi(int[][] num, int a, int b)
	{
		int f;
		int k;
		if (a > 4 || b > 4)
		{
			return 0;
		}
		else
		{
			for (k = 0;k < 5;k++)
			{
				f = num[a][k];
				num[a][k] = num[b][k];
				num[b][k] = f;
			}
			return 1;
		}


	}
	public static int Main()
	{
		int[][] NU = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		int c;
		int swi = new int(int num[5][5],int a,int b);

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				NU[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		c = swi(NU, m, n);

		if (c == 0)
		{
			System.out.print("error");
		}
		if (c == 1)
		{
			for (i = 0;i < 5;i++)
			{
				System.out.print(NU[i][0]);
				for (j = 1;j < 5;j++)
				{
					System.out.print(" ");
					System.out.print(NU[i][j]);
				}
				if (j == 5)
				{
					System.out.print("\n");
				}
			}
		}

		return 0;
	}

}

