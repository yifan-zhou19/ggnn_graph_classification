package <missing>;

public class GlobalMembers
{
	public static int search(int x,int y,int z)
	{
		int s = 0;
		int i;
		if (y > 1)
		{
			for (i = z;i <= x / y;i++)
			{
				s += search(x - i, y - 1, i);
			}
		}
		else
		{
			s = 1;
		}
		return s;
	}

	public static int Main()
	{
		int t;
		int M;
		int N;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(search(M, N, 0));
			System.out.print("\n");
		}
		return 0;
	}
}

