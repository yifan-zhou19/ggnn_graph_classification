package <missing>;

public class GlobalMembers
{
	public static int[][] mem = new int[35][30];
	public static int f(int m,int n)
	{
		int result = 0;
		int i;
		if (mem[m][n] != 0)
		{
			return mem[m][n];
		}
		else if (m == 1 || n == 1)
		{
			return 1;
		}
		else
		{
			for (i = m;i >= 0;i -= n)
			{
				result += f(i, n - 1);
			}
		}
		mem[m][n] = result;
		return result;
	}
	public static int Main()
	{
		int i;
		int n;
		int m;
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(m, n));
			System.out.print("\n");
		}
		return 0;
	}
}

