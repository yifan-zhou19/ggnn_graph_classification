package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = 0;
		int sign;
		int[][] a = new int[5][5];
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 0;j < 5;j++)
		{
			if (a[0][j] > max)
			{
				max = a[0][j];
				sign = j;
			}
		}
		for (i = 0;i < 5;i++)
		{
			if (a[i][sign] < max)
			{
				break;
			}
			if (i == 4 && a[i][sign] > max)
			{
				System.out.print("1");
				System.out.print(" ");
				System.out.print(sign + 1);
				System.out.print(" ");
				System.out.print(a[0][sign]);
				return 0;
			}
		}
		max = 0;
		for (j = 0;j < 5;j++)
		{
			if (a[1][j] > max)
			{
				max = a[1][j];
				sign = j;
			}
		}
		for (i = 0;i < 5;i++)
		{
			if (a[i][sign] < max)
			{
				break;
			}
			if (i == 4 && a[i][sign] > max)
			{
				System.out.print("2");
				System.out.print(" ");
				System.out.print(sign + 1);
				System.out.print(" ");
				System.out.print(a[1][sign]);
				return 0;
			}
		}
		max = 0;
		for (j = 0;j < 5;j++)
		{
			if (a[2][j] > max)
			{
				max = a[2][j];
				sign = j;
			}
		}
		for (i = 0;i < 5;i++)
		{
			if (a[i][sign] < max)
			{
				break;
			}
			if (i == 4 && a[i][sign] > max)
			{
				System.out.print("3");
				System.out.print(" ");
				System.out.print(sign + 1);
				System.out.print(" ");
				System.out.print(a[2][sign]);
				return 0;
			}
		}
		max = 0;
		for (j = 0;j < 5;j++)
		{
			if (a[3][j] > max)
			{
				max = a[3][j];
				sign = j;
			}
		}
		for (i = 0;i < 5;i++)
		{
			if (a[i][sign] < max)
			{
				break;
			}
			if (i == 4 && a[i][sign] > max)
			{
				System.out.print("4");
				System.out.print(" ");
				System.out.print(sign + 1);
				System.out.print(" ");
				System.out.print(a[3][sign]);
				return 0;
			}
		}
		max = 0;
		for (j = 0;j < 5;j++)
		{
			if (a[4][j] > max)
			{
				max = a[4][j];
				sign = j;
			}
		}
		for (i = 0;i < 5;i++)
		{
			if (a[i][sign] < max)
			{
				break;
			}
			if (i == 4 && a[i][sign] > max)
			{
				System.out.print("5");
				System.out.print(" ");
				System.out.print(sign + 1);
				System.out.print(" ");
				System.out.print(a[4][sign]);
				return 0;
			}
		}
		System.out.print("not found");
		return 0;
	}
}

