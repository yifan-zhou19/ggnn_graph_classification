package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int[][] a = new int[10][10];
	public static int[][] b = new int[10][10];
	public static int c;
	public static int k;
	public static int l;
	public static void f(int n)
	{
		if (n == 0)
		{
			for (j = 1; j <= 9; j++)
			{
				System.out.print(a[j][1]);
				for (l = 2; l <= 9; l++)
				{
					System.out.print(" ");
					System.out.print(a[j][l]);
				}
				System.out.print("\n");
			}
			return;
		}
		for (i = 0; i <= 80 ;i++)
		{
			if (b[i / 9 + 1][i % 9 + 1] != 0)
			{
				c = b[i / 9 + 1][i % 9 + 1];
				a[i / 9 + 2][i % 9 + 2] += c;
				a[i / 9 + 2][i % 9 + 1] += c;
				a[i / 9 + 1][i % 9 + 2] += c;
				a[i / 9][i % 9] += c;
				a[i / 9 + 2][i % 9] += c;
				a[i / 9][i % 9 + 2] += c;
				a[i / 9 + 1][i % 9] += c;
				a[i / 9][i % 9 + 1] += c;
				a[i / 9 + 1][i % 9 + 1] += b[i / 9 + 1][i % 9 + 1];
			}
		}
		for (k = 0; k <= 99; k++)
		{
			b[k / 10][k % 10] = a[k / 10][k % 10];
		}
			f(n - 1);
	}
	public static int Main()
	{
		int d;
		a[5][5] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[5][5] = a[5][5];
		f(d);
		return 0;
	}
}

