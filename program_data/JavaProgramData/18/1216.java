package <missing>;

public class GlobalMembers
{
	//????HW8_02.cxx
	//?????(1100019007)
	//???2012-11-18
	//????????????

	public static int[][] arr = new int[100][100];
	public static void solve(int n)
	{
		arrayin(n);
		System.out.print(down_cast(n));
		System.out.print("\n");
	}
	public static void arrayin(int n)
	{
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				arr[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
	}
	public static int down_cast(int n)
	{
		if (n == 1)
		{
			return 0;
		}
		int min;
		int res;
		for (int i = 0;i < n;i++)
		{
			min = 65535;
			for (int j = 0;j < n;j++)
			{
				if (arr[i][j] < min)
				{
					min = arr[i][j];
				}
			}
			for (int j = 0;j < n;j++)
			{
				arr[i][j] -= min;
			}
		} //???
		for (int i = 0;i < n;i++)
		{
			min = 65535;
			for (int j = 0;j < n;j++)
			{
				if (arr[j][i] < min)
				{
					min = arr[j][i];
				}
			}
			for (int j = 0;j < n;j++)
			{
				arr[j][i] -= min;
			}
		} //???
		res = arr[1][1];
		for (int i = 2;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				arr[i - 1][j] = arr[i][j];
			}
		}
		for (int i = 2;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				arr[j][i - 1] = arr[j][i];
			}
		}
		//matrix_out(n);
		return res + down_cast(n - 1); //????
	}
	public static void matrix_out(int n)
	{
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	public static void Main(String[] args)
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			solve(n);
		}
	}

}

