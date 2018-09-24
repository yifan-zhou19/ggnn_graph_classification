package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int m = n;
		int N = n;
		int M = m;
		while (n > 0)
		{
			if ((M - k) % N == 0 && (M - k) / N >= 1)
			{
				M = M - (M - k) / N - k;
				n--;
			}
			else
			{
				m++;
				M = m;
				n = N;
			}
		}
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}
}

