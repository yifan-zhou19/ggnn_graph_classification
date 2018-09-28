package <missing>;

public class GlobalMembers
{
	public static int[] a = {0, 1, 2, 3, 4};
	public static int change(int m,int n)
	{
		int t;
		if (m < 5 && m>-1 && n < 5 && n>-1)
		{
			t = a[m];
			a[m] = a[n];
			a[n] = t;
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[][] num = new int[5][5];
		int m;
		int n;
		for (m = 0;m < 5;m++)
		{
			for (n = 0;n < 5;n++)
			{
				num[m][n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (change(m, n) != 0)
		{
			for (m = 0;m < 5;m++)
			{
				System.out.print(num[a[m]][0]);
				for (n = 1;n < 5;n++)
				{
					System.out.print(" ");
					System.out.print(num[a[m]][n]);
				}
				System.out.print("\n");
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("error");
			System.out.print("\n");
		}
		return 0;
	}
}

