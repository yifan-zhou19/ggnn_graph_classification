package <missing>;

public class GlobalMembers
{
	public static int exchange(int[][] num, int p, int q)
	{
		int i;
		int temp;
		if (p >= 0 && p <= 4 && q >= 0 && q <= 4)
		{
			for (i = 0;i < 5;i++)
			{
				temp = num[p][i];
				num[p][i] = num[q][i];
				num[q][i] = temp;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i;
		int p;
		int q;
		int[][] num = new int[5][5];
		int j;
		int pan;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		pan = exchange(num, p, q);
		if (pan == 0)
		{
			System.out.print("error");
			System.out.print("\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				System.out.print(num[i][0]);
				for (j = 1;j < 5;j++)
				{
					System.out.print(" ");
					System.out.print(num[i][j]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

