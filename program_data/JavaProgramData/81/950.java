package <missing>;

public class GlobalMembers
{
	public static void swi(int[][] num, int a, int b)
	{
		int f;
		int k;
		int i;
		int j;
		if (a > 4 || b > 4)
		{
			System.out.print("error");
		}
		else
		{
			for (k = 0;k < 5;k++)
			{
				f = num[a][k];
				num[a][k] = num[b][k];
				num[b][k] = f;
			}
			for (i = 0;i < 5;i++)
			{
				System.out.print(num[i][0]);
				for (j = 1;j < 5;j++)
				{
					System.out.print(" ");
					System.out.print(num[i][j]);
				}
				if (j == 5)
				{
					System.out.print("\n");
				}
			}
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
		void swi(int num[5][5],int a,int b);

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				NU[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		swi(NU, m, n);

		return 0;
	}
}

