package <missing>;

public class GlobalMembers
{
	public static int max(int n, int[] a)
	{
		int max = a[0];
		for (int i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
			max = a[i];
			}
		}
		return max;
	}
	public static int min(int n, int[] a)
	{
		int min = a[0];
		for (int i = 0;i < n;i++)
		{
			if (min > a[i])
			{
			min = a[i];
			}
		}
		return min;
	}

	public static int Main()
	{
		int[][] num0 = new int[5][5];
		int[][] num1 = new int[5][5];
		for (int i = 0;i < 5;i++)
		{
		for (int j = 0;j < 5;j++)
		{
			num0[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num1[j][i] = num0[i][j];
		}
		}
		int flag = 1;
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				if (num0[i][j] == max(5, num0[i]) && num1[j][i] == min(5, num1[j]))
				{
					System.out.print(i + 1);
					System.out.print(' ');
					System.out.print(j + 1);
					System.out.print(' ');
					System.out.print(num0[i][j]);
					System.out.print("\n");
					flag = 0;
					break;
				}
			}
		}
		if (flag != 0)
		{
		System.out.print("not found");
		System.out.print("\n");
		}
		return 0;
	}

}

