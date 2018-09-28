package <missing>;

public class GlobalMembers
{
	public static int[] prime = new int[50002];

	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 2; i <= N; i++)
		{
			prime[i] = 1;
		}
		for (int i = 2; i <= N / 2; i++)
		{
			prime[i * 2] = 0;
		}
		int p = 2;
		while (p * p <= N)
		{
			p = p + 1;
			while (prime[p] == 0)
			{
				p++;
			}
			int t = p * p;
			int s = 2 * p;
			while (t <= N)
			{
				prime[t] = 0;
				t = t + s;
			}
		}
		for (int i = 6;i <= N;i += 2)
		{
			for (int j = 3;j <= N - j;j += 2)
			{
				if (prime[j] == 1 && prime[i - j] == 1)
				{
					System.out.print(i);
					System.out.print("=");
					System.out.print(j);
					System.out.print("+");
					System.out.print(i - j);
					System.out.print("\n");
					break;
				}
			}
		}
	}
}

