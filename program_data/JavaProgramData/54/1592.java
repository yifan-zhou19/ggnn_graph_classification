package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int K;
	public static void Take()
	{
		int i;
		int j;
		int h;
		for (i = 1;i < 7000000;i++)
		{
			h = i;
			for (j = 0;j < N;j++)
			{
				if (h % (N - 1) == 0)
				{
					h = h * N / (N - 1) + K;
				}
				else
				{
					break;
				}
			}
			if (j == N)
			{
				System.out.print(h);
				System.out.print("\n");
				break;
			}
		}
	}
	public static int Main()
	{
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		K = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Take();
		return 0;
	}
}

