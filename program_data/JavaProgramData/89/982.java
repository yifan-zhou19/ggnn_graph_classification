package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] ai = new int[n];
		int[] aj = new int[n];
		int c;
		int d;
		for (int i = 0;i < n;i++)
		{
			ai[i] = aj[i] = 0;
		}
		while (true)
		{
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (c == 0 && d == 0)
			{
				break;
			}
			else
			{
				ai[c]++;
				aj[d]++;
			}
		}
		int j;
		for (j = 0;j < n;j++)
		{
			if (ai[j] == 0 && aj[j] == n - 1)
			{
				System.out.print(j);
				System.out.print("\n");
				break;
			}
		}
		if (j == n)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

