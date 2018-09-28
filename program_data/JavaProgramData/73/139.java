package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int k;
		int max = 0;
		int min;
		int flag = 0;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			max = 0;
			for (j = 0; j < 5; j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					m = i;
					k = j;
				}
			}
			min = a[0][k];
			for (int l = 0; l < 5; l++)
			{
				if (a[l][k] < min)
				{
					min = a[l][k];
				}
			}
			if (min == max)
			{
				System.out.print(m + 1);
				System.out.print(" ");
				System.out.print(k + 1);
				System.out.print(" ");
				System.out.print(a[m][k]);
				System.out.print("\n");
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

