package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] x = new int[31];
		int i;
		int r;
		x[0] = 1;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (N > 0)
		{
			r = 0;
			for (i = 0; i <= 30; i++)
			{
				int t = r;
				r = (x[i] * 2 + r) / 10;
				x[i] = (x[i] * 2 + t) % 10;
			}
			N--;
		}
		i = 30;
		while (x[i] == 0)
		{
			i--;
		}
		for (;i >= 0;i--)
		{
			System.out.print(x[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

