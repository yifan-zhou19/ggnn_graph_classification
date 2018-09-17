package <missing>;

public class GlobalMembers
{
	/*????????pass?????????????????*/
	public static int Main()
	{
		int x1;
		int y1;
		int[] x = new int[11];
		int[] y = new int[11];
		int i;
		int j;
		int ex;
		int ey;
		void f(int z[11]);
		int g = int w[11];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x[0] = x1;
		y[0] = y1;
		f(x);
		f(y);
		ex = g(x);
		ey = g(y);
		for (i = ex, j = ey;i >= 0, j >= 0;i--, j--) //?????????
		{
			if (i == 0 && j == 0 && x[i] == y[j])
			{
				System.out.print(x[i]);
				System.out.print("\n");
			}
			else if (x[i] == y[j] && x[i - 1] != y[j - 1])
			{
					System.out.print(x[i]);
					System.out.print("\n");
					break;
			}
		}
		return 0;
	}
	public static void f(int[] z) //???????
	{
		int i;
		for (i = 1;i < 11;i++)
		{
			z[i] = z[i - 1] / 2;
		}
	}
	public static int g(int[] w) //????1???
	{
		int i;
		int m;
		for (i = 0;i < 11;i++)
		{
			if (w[i] != 0 && w[i + 1] == 0)
			{
				m = i;
				break;
			}
		}
		return (m);
	}
}

