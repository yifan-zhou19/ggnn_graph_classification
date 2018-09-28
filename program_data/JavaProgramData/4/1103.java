package <missing>;

public class GlobalMembers
{
	public static void out(int sum, int row, int col, int[] a) //????????????????
	{
		int i; //i???,sum-i???????
		if (sum <= col - 1) //??
		{
			for (i = 0;sum - i >= 0 && i <= row - 1;i++)
			{
				System.out.print((a[i] + sum - i));
				System.out.print("\n");
			}
		}
		else
		{
			for (i = sum - (col - 1);sum - i >= 0 && i <= row - 1;i++)
			{
				System.out.print((a[i] + sum - i));
				System.out.print("\n");
			}
		}
	}
	public static int Main()
	{
	int c;
	int r;
	c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[][] a = new int[200][200];
	for (int i = 0;i < c;i++)
	{
		for (int j = 0;j < r;j++)
		{
			*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
		}
	}
	for (int sum = 0;sum <= c + r - 2;sum++)
	{
		out(sum, c, r, a);
	}
	return 0;
	}
}

