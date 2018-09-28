package <missing>;

public class GlobalMembers
{
	public static int getNum(int m, int n)
	{
		if (n == 1 || m == 1 || m == 0)
		{
			return 1;
		}
		if (m < 0)
		{
			return 0;
		}
		if (n != 1 && m > 1)
		{
			return getNum(m, n - 1) + getNum(m - n, n);
		}
	}
	public static int Main()
	{
		int t;
		int M;
		int N;
		int Num;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t >= 1)
		{
			Num = 0;
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			Num = getNum(M, N);
			System.out.print(Num);
			System.out.print("\n");
			t--;
		}
		return 0;
	}
}

