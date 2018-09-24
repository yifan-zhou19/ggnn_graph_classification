package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int m;
		int temp = 0;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m == 0)
		{
			System.out.print(1);
			return 0;
		}
		a[0][99] = 2;
		for (i = 1 ; i < 100 ; i++)
		{
			temp = 0;
			for (j = 99 ; j >= 0 ; j--)
			{
				temp = a[i - 1][j] + a[i - 1][j] + a[i][j];
				if (temp > 9)
				{
					a[i][j - 1]++;
				}
				a[i][j] = temp % 10;
			}
		}
		int flag = 0;
		for (i = 0 ; i < 100 ; i++)
		{
			if (flag == 1)
			{
				System.out.print(a[m - 1][i]);
			}
			if (a[m - 1][i] != 0 && flag == 0)
			{
				System.out.print(a[m - 1][i]);
				flag = 1;
			}

		}
		return 0;
	}






}

