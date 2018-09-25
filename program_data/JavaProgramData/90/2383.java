package <missing>;

public class GlobalMembers
{
	public static int counter = 0;
	public static int baifang(int m, int n)
	{
		int answer = 0;
		if (m == 0 && n == 0)
		{
			return 1;
		}
		if (m == 0 && n != 0)
		{
			return 1;
		}
		if (m != 0 && n == 0)
		{
			return 0;
		}
		if (n > 0)
		{
			answer += baifang(m, n - 1);
		}
		if (m >= n)
		{
			answer += baifang(m - n, n);
		}
		return answer;
	}
	public static int Main()
	{
		int n;
		int i;
		int N;
		int M;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			counter = 0;
			 M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 counter = baifang(M, N);
			 System.out.print(counter);
			 System.out.print("\n");
		}
			return 0;
	}

}

