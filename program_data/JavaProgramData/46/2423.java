package <missing>;

public class GlobalMembers
{
	public static int[][] A = new int[100][100];
	public static void shuchu1(int a,int b,int c,int d) //a<b&&c<d
	{
		for (int i = c;i <= d;i++)
		{
			System.out.print(A[a][i]);
			System.out.print("\n");
		}
		for (int i = a + 1;i <= b;i++)
		{
			System.out.print(A[i][d]);
			System.out.print("\n");
		}
		for (int i = d - 1;i >= c;i--)
		{
			System.out.print(A[b][i]);
			System.out.print("\n");
		}
		for (int i = b - 1;i >= a + 1;i--)
		{
			System.out.print(A[i][c]);
			System.out.print("\n");
		}
	}
	public static void shuchu2(int a,int b,int c,int d) //a==b&&c<d
	{
		for (int i = c;i <= d;i++)
		{
			System.out.print(A[a][i]);
			System.out.print("\n");
		}

	}
	public static void shuchu3(int a,int b,int c,int d) //c==d&&a<b
	{
		for (int i = c;i <= d;i++)
		{
			System.out.print(A[a][i]);
			System.out.print("\n");
		}
		for (int i = a + 1;i <= b;i++)
		{
			System.out.print(A[i][d]);
			System.out.print("\n");
		}

	}
	public static void shuchu4(int a,int b,int c,int d) //a==b&&c==d
	{
		System.out.print(A[a][c]);
		System.out.print("\n");
	}
	public static int Main()
	{

		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++) //?????????
		{
			for (int j = 0;j < col;j++)
			{
				A[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int a = 0;
		int c = 0;
		int b = row - 1;
		int d = col - 1;
		while (b >= a != 0 && d >= c)
		{
			if (a < b && c < d)
			{
				shuchu1(a, b, c, d);
			}
			if (a == b && c < d)
			{
				shuchu2(a, b, c, d);
			}
			if (c == d && a < b)
			{
				shuchu3(a, b, c, d);
			}
			if (a == b && c == d)
			{
				shuchu4(a, b, c, d);
			}
			a++;
			b--;
			c++;
			d--;
		}

		return 0; //????

	}
}

