package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????               **
	//*?????? 1300012965      **
	//*???2013.11.1              **
	//********************************
	public static int Main()
	{
		int[][] a = new int[6][6];
		int[] max = new int[6];
		int[] min = {1000000, 1000000, 1000000, 1000000, 1000000, 1000000};
		int n;
		int m;
		int count = 0;
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
					if (a[i][j] > max[i])
					{
				max[i] = a[i][j];
					}
			}
		}
		for (int j = 1; j <= 5; j++)
		{
			for (int i = 1; i <= 5; i++)
			{
					if (a[i][j] < min[j])
					{
				min[j] = a[i][j];
					}
			}
		}
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				if (max[i] == min[j])
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print(" ");
					System.out.print(max[i]);
					System.out.print("\n");
					count = 1;
				}
			}
		}
		if (count == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}









		return 0;
	}
}

